package week4_july29;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webtable {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://erail.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//p[text()='Consent']")).click();
		
		Thread.sleep(3000);
		
//		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("txtStationFrom")).clear();
				
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");
		
		driver.findElement(By.xpath("//div[text()='Mgr Chennai Ctr']")).click();
		
		driver.findElement(By.id("txtStationTo")).clear();
		
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU");
		
		driver.findElement(By.xpath("//div[text()='Madurai Jn']")).click();
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		List<WebElement> trains =driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tbody/tr/td[2]"));
		
		System.out.println("Total no.of trains: " +trains.size());
		
		Set<String> uniquename = new HashSet<String>();
		Set<String> duplicatename = new HashSet<String>();
		
		
		
		for(int i=0; i<trains.size(); i++) {
//			String names = trains.get(i).getText();
//			System.out.println(i+1 +"." +names);
			
			
			String name = trains.get(i).getText().trim();
			
			if(!uniquename.add(name)) {
				duplicatename.add(name);
			}
			System.out.println(i+1 +"." +name);
			}
			if(!duplicatename.isEmpty()) {
				System.out.println("Duplicate name found");
				for(String duplicate:duplicatename) {
					System.out.println(duplicate);
				}
				
			}
			System.out.println("No duplicate names found");
		}	

	}

