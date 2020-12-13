package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nasrullah Hussaini\\Downloads\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 //Dynamic wait
		 
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 driver.get("https://www.freecrm.com");
		 driver.findElement(By.xpath("//a[contains(.,'Log In')]")).click();
		// driver.findElement(By.linkText("Pricing")).click();
		 
		 driver.findElement(By.name("email")).sendKeys("nasrullah_hussaini@yahoo.com");
		 driver.findElement(By.name("password")).sendKeys("Afghanistan1*");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		 Thread.sleep(2000);
		 //In case if there is a frame tag, how to switch to that frame
		 //driver.switchTo.frame("nameOfFrame");
		 driver.findElement(By.xpath("//a[contains(.,'Contacts')]")).click();

	}

}
