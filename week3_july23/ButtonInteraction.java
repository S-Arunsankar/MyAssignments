package week3_july23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class ButtonInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://leafground.com/button.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		boolean buttondisplay = driver.findElement(By.name("j_idt88:j_idt92")).isDisplayed();
		
		System.out.println(buttondisplay);
		
		Point location = driver.findElement(By.name("j_idt88:j_idt94")).getLocation();
		
		System.out.println(location);
		
		String color = driver.findElement(By.name("j_idt88:j_idt96")).getCssValue("background-color");
		
		System.out.println(color);
		
		Dimension Size = driver.findElement(By.name("j_idt88:j_idt98")).getSize();
		
		System.out.println(Size);
		
		driver.findElement(By.name("j_idt88:j_idt90")).click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String actualtitle = "Dashboard";
		
		Assert.assertEquals(actualtitle, title);
		
		System.out.println("title matched");
		
		driver.close();
	}

}
