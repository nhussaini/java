package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nasrullah Hussaini\\Downloads\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();//Initially the window is not maxizmized, so use this code
		 driver.manage().deleteAllCookies();//deletes all cookies
		 
		 driver.get("https://jqueryui.com/droppable/");
		 driver.switchTo().frame(0);//switch to frame if it exists
		 
		 Actions action = new Actions(driver);
		 
		 action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']")))
		 .moveToElement(driver.findElement(By.xpath("//div[@id='droppable']")))
		 .release()
		 .build()
		 .perform();
		 

	}

}
