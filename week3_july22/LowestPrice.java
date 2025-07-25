package week3_july22;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LowestPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.amazon.co.uk/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.className("a-button-text")).click();
		
		driver.findElement(By.id("sp-cc-accept")).click();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> priceElements = driver.findElements(By.className("a-price-whole"));
		
		int pricenum = priceElements.size();
		
		System.out.println("check the values " +pricenum);
		
	
		List<Integer> prices = new ArrayList<Integer>();
		
		for(int i=0; i<priceElements.size(); i++) {
			String pri = priceElements.get(i).getText().replaceAll("[^0-9]", "");
//			System.out.println(pri);
			if(!pri.isEmpty()) {
				prices.add(Integer.parseInt(pri));
			}
			
		}
		
		System.out.print(prices);
		Collections.sort(prices);
//		System.out.println(prices);
		System.out.println("Lowest prices of the mobile " +prices.get(0));
	}
}

			