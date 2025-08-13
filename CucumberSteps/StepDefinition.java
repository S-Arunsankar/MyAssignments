package CucumberSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{


	@When("Enter the username")
	public void enter_the_username() {
		 driver.findElement(By.id("username")).sendKeys("udaya18udai318@agentforce.com");
	}
	@When("Enter the password")
	public void enter_the_password() {
		driver.findElement(By.id("password")).sendKeys("Sales@123");
	}
	@Then("Click the login button")
	public void click_the_login_button()  {
		 driver.findElement(By.id("Login")).click();
		
	}

	@When("Click the Account tab")
	public void click_the_account_tab() throws InterruptedException {

	
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//one-app-nav-bar-item-root[@class='navItem slds-context-bar__item slds-shrink-none'])[2]")).click();
	
}
	@When("Click the New Account button")
	public void click_the_new_account_button() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='forceActionLink']")).click();
		Thread.sleep(3000);
	}
	@When("Enter the Account Name")
	public void enter_the_account_name() {
		 driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Testleaf");
	   
	}
	@When("Select the ownership")
	public void select_the_ownership() {
		
//		Actions act = new Actions(driver);
		
		WebElement scroll = driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value'])[3]"));
		driver.executeScript("arguments[0].click()", scroll);
		
//		 driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value'])[3]")).click();
		   driver.findElement(By.xpath("//span[text()='Public']")).click();
	   
	}
	@Then("click the save button")
	public void click_the_save_button() {
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
	  
	
	}
	
	@And ("Verify the account name")
	public void Verify_the_account_name() {
	String name = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();
		
		String expName = "Testleaf";
		
		if(name.equalsIgnoreCase(expName)) {
			System.out.println("Verified Account Name is: " +name);
		}else {
			System.out.println("Account name is not same");
		}
	}
	
}
