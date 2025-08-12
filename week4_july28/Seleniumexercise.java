package week4_july28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Seleniumexercise{
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://leafground.com/window.xhtml");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("j_idt88:j_idt95")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		
		Boolean windows = wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		
		System.out.println(windows);
		
		

}
	
	
}