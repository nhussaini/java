package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nasrullah Hussaini\\Downloads\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		 
		 Select select = new Select(driver.findElement(By.id("Form_submitForm_Country")));
		 select.selectByVisibleText("Afghanistan");

	}

}
