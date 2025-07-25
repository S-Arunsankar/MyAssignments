package week3_july24;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("accept-choices")).click();
		
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert al = driver.switchTo().alert();
		
		al.sendKeys("arunsankar");
		
		al.accept();
		
		boolean display = driver.findElement(By.id("demo")).isDisplayed();
		
		System.out.println(display);
		
		
		
		
				

	}

}
