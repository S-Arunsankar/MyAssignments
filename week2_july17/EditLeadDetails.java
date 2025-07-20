package week2_july17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EditLeadDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_companyName\"]")).sendKeys("TestLeaf");
		
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstName\"]")).sendKeys("Arun");
		
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_lastName\"]")).sendKeys("sankar");
		
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstNameLocal\"]")).sendKeys("jeeva");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Non IT");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Lead for Non IT students");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sankarun18@gmail.com");
		
		WebElement Country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		
		Select selcountry = new Select(Country);
		
		selcountry.selectByVisibleText("American Samoa");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Check students before starting training");
		
		driver.findElement(By.name("submitButton")).click();
		
		String actualtitle = driver.getTitle();
		
		String expectedtitle = "View Lead | opentaps CRM";
		
		Assert.assertEquals(actualtitle, expectedtitle);
		
		System.out.print(actualtitle);
		
		driver.close();
		
		
	}

}
