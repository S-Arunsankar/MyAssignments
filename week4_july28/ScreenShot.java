package week4_july28;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://leafground.com/window.xhtml");
		
		driver.manage().window().maximize();
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("./ImageData/homepage.png");
		
		FileUtils.copyFile(source, destination);

	}

}
