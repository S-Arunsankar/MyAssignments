package week2_july16;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/");
//		Demosalesmanager
//		crmsfa
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("Learnselenium");
		
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		driver.findElement(By.id("numberEmployees")).sendKeys(String.valueOf(20));
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String actualtitle=driver.getTitle();
		
		String expectedtitle = "Account Details | opentaps CRM";
		
		Assert.assertEquals(actualtitle, expectedtitle);
		
		System.out.println("Test completed");
		
		driver.findElement(By.linkText("Deactivate Account")).click();
		
		driver.switchTo().alert().accept();
		
		driver.close();
		
		
	}

}
