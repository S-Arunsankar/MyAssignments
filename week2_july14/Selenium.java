package week2_july14;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class Selenium {

	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arun");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sankar");
		
		WebElement Sel= driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select selectOption = new Select(Sel);
		
		selectOption.selectByValue("LEAD_COLDCALL");
		
		
		
		
		
	}

}
