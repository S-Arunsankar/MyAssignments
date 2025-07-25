package week3_july24;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(2);
		
		driver.switchTo().frame("frame2");
		
		driver.findElement(By.id("Click")).click();
		
		String text = driver.findElement(By.xpath("(//button[@id='Click'])[1]")).getText();
		
		System.out.println(text);
		
	}

}
