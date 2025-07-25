package Marathon_July25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonBags {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.amazon.co.uk/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.className("a-button-text")).click();
		
		driver.findElement(By.id("sp-cc-accept")).click();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for Boys");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		String totalResults = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']/span")).getText();
		
		String Remain=driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']")).getText();
		
		System.out.println(totalResults + Remain);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'])[5]")).click();
		
		driver.findElement(By.xpath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'])[5]")).click();
		
		driver.findElement(By.id("a-autoid-0-announce")).click();
		
		driver.findElement(By.xpath("//a[text()='Newest arrivals']")).click();
		
		String bagName = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[2]")).getText();
		
		String bagPrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		
		
		System.out.println("Name of the Bag: " +bagName);
		System.out.println("Price of the Bag: " +bagPrice);


	}

}
