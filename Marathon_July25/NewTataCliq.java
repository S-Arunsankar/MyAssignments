package Marathon_July25;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class NewTataCliq {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.tatacliq.com/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[@id='optInText']")).click();
		
		Actions act = new Actions(driver);
		
		WebElement hover = driver.findElement(By.xpath("//div[text()='Brands']"));
		
		act.moveToElement(hover).perform();
		
		WebElement nexthover = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		
		act.moveToElement(nexthover).perform();
		
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		
		driver.findElement(By.className("SelectBoxDesktop__base")).click();

		Thread.sleep(3000);
		
		WebElement setnew = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		
		Select arrivals = new Select(setnew);
		
		arrivals.selectByVisibleText("New Arrivals");
		
		driver.findElement(By.xpath("(//div[@class='FilterDesktop__newFilCheckbox'])[1]")).click();
		
		Thread.sleep(5000);
		
		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
		
			
		System.out.println("Total number of products: " +prices.size());
		
		List<String> newprice = new ArrayList<String>();
		
		for (int i = 0; i < prices.size(); i++) {
		    String priceText = prices.get(i).getText().replaceAll("[^0-9]", "");
		    newprice.add(priceText);
		    System.out.println((i + 1) + ". " + priceText);
		}
		
		
		driver.findElement(By.className("ProductModule__dummyDiv")).click();
		
		Set<String> nextwindow =driver.getWindowHandles();

		List<String> newWindow = new ArrayList<String>(nextwindow);

		driver.switchTo().window(newWindow.get(1));
		
		String secprice = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3")).getText().replaceAll("[^0-9]", "");
			
		System.out.println("second price: "+secprice);
		
//		driver.switchTo().window(newWindow.get(0));
		
		String checkpri= newprice.get(0);
		
		if(checkpri.equals(secprice)) {
			System.out.println("price is matched");
		}else {
			System.out.println("price is not matched");
		}
		
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		
		String count = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();

		System.out.println("number of items: " +count);
		
		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		
		Thread.sleep(5000);
		
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("./Data/cart.png");
		
		FileUtils.copyFile(source, destination);
		
		driver.quit();
	}

}
