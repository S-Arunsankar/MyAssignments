package week2_july16;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);

		

		driver.findElement(By.id("email")).sendKeys("Arun");
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();

		
		driver.findElement(By.name("firstname")).sendKeys("Arun");
		
		driver.findElement(By.name("lastname")).sendKeys("sankar");
		
		WebElement dob = driver.findElement(By.id("day"));
		
		Select selectdob = new Select(dob);
		
		selectdob.selectByValue("15");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select selectmonth = new Select(month);
		
		selectmonth.selectByValue("8");
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select selectyear = new Select(year);
		
		selectyear.selectByValue("2020");
		
		WebElement button = driver.findElement(By.id("sex"));
		
		button.click();
		
		driver.findElement(By.name("reg_email__")).sendKeys("7876655453");
		
		driver.findElement(By.id("password_step_input")).sendKeys("qweasdzxc");
		
		driver.findElement(By.name("websubmit")).click();
		
		

	}
}

