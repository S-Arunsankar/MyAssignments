package week2_july16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CreateLead {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arun");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sankar");
		
		WebElement Sel= driver.findElement(By.id("createLeadForm_dataSourceId"));

		Select selectOption = new Select(Sel);
		
		selectOption.selectByValue("LEAD_COLDCALL");
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Senior Engineer");
		
		driver.findElement(By.name("submitButton")).click();
		
		String actual_title=driver.getTitle();
		
		String expected_title = "View Lead | opentaps CRM";
		
		Assert.assertEquals(actual_title, expected_title);
		 
		System.out.println("Test Completed");
		
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		
		driver.close();
	}

}
