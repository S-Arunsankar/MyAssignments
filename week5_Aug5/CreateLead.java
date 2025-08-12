package week5_Aug5;




import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;



public class CreateLead extends BaseClass {

	@BeforeTest
	public void setvalues() {
	filename = "CreateLead";
	}

@Test(dataProvider="fetchData")
		
	public void creationLead(String companyName, String Firstname, String Lastname){
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(Firstname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lastname);
		driver.findElement(By.name("submitButton")).click();
}
}






