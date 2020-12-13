package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nasrullah Hussaini\\Downloads\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();//Initially the window is not maxizmized, so use this code
		 driver.manage().deleteAllCookies();//deletes all cookies
		 
		 driver.get("https://www.spicejet.com/");
		 Actions action = new Actions(driver);
		 action.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.linkText("Travel Agent Login")).click(); 
	}

}
