package Marathon_July25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OrderingMobile {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://dev209663.service-now.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		
		driver.findElement(By.id("user_password")).sendKeys("qy/Q6A=vOM3x");
		
		driver.findElement(By.id("sysverb_login")).click();

		driver.findElement(By.className("sn-polaris-tab can-animate polaris-enabled")).click();
		
		driver.findElement(By.className("menu-item-row highlighted-menu-item-row")).click();
	}

}
