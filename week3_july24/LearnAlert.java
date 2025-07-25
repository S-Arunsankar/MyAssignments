package week3_july24;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[7]")).click();
		
		
		//confirmation dialog
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[9]")).click();
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		
		//Confirm the dialog
		Alert confirm = driver.switchTo().alert();
		
		String text = confirm.getText();
		
		System.out.println(text);
		
		confirm.accept();
		
		
		

	}

}
