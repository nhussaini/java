package Selenium;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nasrullah Hussaini\\Downloads\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.get("http://www.google.com");
		 
		 //take screenshot and store as a file format
		// File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 //now copy the screenshot to desired location using copyfile method
		 //FileUtils.copyFile(src, new File("C:\\Users\\Nasrullah Hussaini\\eclipse-workspace\\JavaQuestions\\src\\Selenium\\google.png"));

	}

}
