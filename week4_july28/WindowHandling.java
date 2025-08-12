package week4_july28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ChromeOptions options = new ChromeOptions();
	options.addArguments("guest");
	
	ChromeDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.linkText("Merge Contacts")).click();
	driver.findElement(By.xpath("//input[@id='partyIdFrom']/following::img[1]")).click();
	
	Set<String> contactwindow =driver.getWindowHandles();
	
	List<String> childwindow = new ArrayList<String>(contactwindow);
	
	
		driver.switchTo().window(childwindow.get(1));
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();		
	
	
	driver.switchTo().window(childwindow.get(0));
	
	
	driver.findElement(By.xpath("//input[@id='partyIdTo']/following::img")).click();
	
	Set<String> contactwindow1 =driver.getWindowHandles();
	
	List<String> childwindow1 = new ArrayList<String>(contactwindow1);
	
	
		driver.switchTo().window(childwindow1.get(1));
		driver.findElement(By.xpath("(//a[@class='linktext'])[5]")).click();
		
		driver.switchTo().window(childwindow1.get(0));
		
		driver.findElement(By.className("buttonDangerous")).click();
		
		driver.switchTo().alert().accept();
		
		String actual = driver.getTitle();
		
		System.out.println(actual);
		
		String expected = "View Contact | opentaps CRM";
		
		if(actual.equals(expected)) {
			System.out.println("Title is matched");
		}else {
			System.out.println("title is not match");
		}
	
	}

}
