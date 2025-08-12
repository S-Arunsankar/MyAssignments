package week4_july29;

import java.util.List;

//import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckingTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.leafground.com/table.xhtml");
		
		List<WebElement> tableData = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr/td[2]"));
	
		System.out.println("no of data: " +tableData.size());
		for(int i=0; i<tableData.size(); i++) {
			String columnvalue = tableData.get(i).getText();
			System.out.println(i+1 +". " +columnvalue);
			}
	}

}
