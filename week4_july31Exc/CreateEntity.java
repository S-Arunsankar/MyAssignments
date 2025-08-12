package week4_july31Exc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CreateEntity extends BaseClass {

	@Test
	public void CreatelegalEntity() throws InterruptedException {
		
		
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		 Thread.sleep(3000);
	     driver.findElement(By.xpath("//lightning-button[@class='slds-button slds-p-horizontal--small']")).click();
	     driver.findElement(By.xpath("//span[text()='All Apps']")).click();
	  
	     Actions act = new Actions(driver);
	     WebElement scroll = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
	     
	     act.scrollToElement(scroll).perform();
	     
	     driver.findElement(By.xpath("//p[text()='Legal Entities']")).click();
	     
	     driver.findElement(By.xpath("//a[@class='forceActionLink']")).click();
	     driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Leaf");
	     driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Testleaf");
	     driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
//	     driver.findElement(By.xpath("(//lightning-base-combobox[@class='slds-combobox_container'])[3]")).click();
	     
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	     WebElement scrollNew = wait.until(ExpectedConditions.elementToBeClickable(
	         By.xpath("//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value']")));
	     ((JavascriptExecutor) driver).executeScript("arguments[0].click();", scrollNew);
	     
	     
	     System.out.println("status Selected");
	     
	     
	    
	     driver.findElement(By.xpath("(//span[@class='slds-media__body'])[2]")).click();
	     
	     
	     System.out.println("clicked active");
	     
	     driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
	     
//	     driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
	     
	     driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).isDisplayed();
	     
	    String LegalName =  driver.findElement(By.xpath("//slot[@name='outputField']//lightning-formatted-text")).getText();
	    
	    System.out.println("LegalName :" +LegalName);
	}
}
