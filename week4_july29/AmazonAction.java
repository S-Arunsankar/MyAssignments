package week4_july29;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonAction {

	public static void main(String[] args) throws IOException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.co.uk/");
		
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		
		driver.findElement(By.id("sp-cc-accept")).click();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus 9 pro");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		String firstprice= driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		
		System.out.println("Price of the First product: " +firstprice);
		
		String rating = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
		
		System.out.println("number of customer ratings: " +rating);
		
		driver.findElement(By.xpath("(//div[@class='a-row a-color-secondary']//following::h2)[1]")).click();
		
		File Source = driver.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("./Data/firstproduct.png");
		
		FileUtils.copyFile(Source, destination);
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
		driver.findElement(By.xpath("//div[@id='attach-warranty-pane']//ancestor::div[@class='a-section attach-warranty-button-row']//input")).click();
		
		driver.findElement(By.xpath("//span[@id='sw-gtc']/span")).click();
		
		String cart = driver.findElement(By.id("sc-subtotal-label-activecart")).getText();
		
		System.out.println(cart);
		
		String expectedcart = "Subtotal (1 item):";

		if(cart.equals(expectedcart)) {
			System.out.println("Subtotal is verified");
		}else {
		System.out.println("subtotal is not same");
		}
		
		
		driver.close();
	}

}
