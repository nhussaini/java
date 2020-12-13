package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
	
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nasrullah Hussaini\\Downloads\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		 
		 //1.xpath
		 //absolute xpath should not be used
		 //only relative xpath should be used
//		 driver.findElement(By.xpath("//input[@id='Form_submitForm_FirstName']")).sendKeys("Nasrullah");
//		 driver.findElement(By.xpath("//input[@id='Form_submitForm_LastName']")).sendKeys("Hussaini");
		 
		 //2.id
//		 driver.findElement(By.id("Form_submitForm_FirstName")).sendKeys("Nasrullah");
//		 driver.findElement(By.id("Form_submitForm_LastName")).sendKeys("Hussaini");
		 
		 //3.name
		 driver.findElement(By.name("FirstName")).sendKeys("Nasrullah");
		 
		 //4.linkText
		 //driver.findElement(By.linkText("Contact Sales")).click();
		 
		 //5.partialLinkText: not useful
		 //driver.findElement(By.partialLinkText(partialLinkText)).click();
		 
		 //6.cssSelector
		 //if id is there, cssSelector will be #id
		 //if class is there,cssSelector will be .class
		 driver.findElement(By.cssSelector("#Form_submitForm_LastName")).sendKeys("hussaini");
		 
		 //7.className
		 //driver.findElement(By.className("")).click();
		 
		 
		 //which locatoer to use? id has the highest priority.then xpath and name.
		 // For links, first priority is linkText, if there is id, id should be used

	}

}
