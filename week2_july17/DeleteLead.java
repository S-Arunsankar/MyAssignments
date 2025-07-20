package week2_july17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.name("id")).sendKeys("10060");
		
		driver.findElement(By.xpath("//button[@id=\"ext-gen334\"]")).click();
		
		driver.findElement(By.xpath("//a[text()='10060']")).click();
		
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.name("id")).sendKeys("10060");
		
		driver.findElement(By.xpath("//button[@id=\"ext-gen334\"]")).click();
		
		String status = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		
		System.out.print(status);
		
		if( status.equals("No records to display")) {
			
			System.out.print("Record deleted successfully");
		}else {
			System.out.print("Record not deleted succesfully");
			
		}
		
		driver.close();
		
		
		
		
	}

}
