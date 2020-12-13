package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nasrullah Hussaini\\Downloads\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		 //Difference between get() and navigate().to()?
		 //Both are used to launch the url but navigate().to() is used to launch the external url
		 
		 driver.get("http://www.google.com");
		 
		 driver.navigate().to("http://www.amazon.com");
		 
		 //back and forward simulation
		 driver.navigate().back();
		 
		 Thread.sleep(2000);
		 
		 driver.navigate().forward();
		 
		 Thread.sleep(2000);
		 
		 driver.navigate().back();
		 
		 //how to simulate the refresh button/refresh a page
		 driver.navigate().refresh();

	}

}
