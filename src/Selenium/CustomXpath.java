package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nasrullah Hussaini\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		//driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Java");
		//driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("Java");
		//driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("Java");
		
		//dynamic id:input
		//id = test_123
		//id = test_456
		//id = test_789
		//driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("Test");
		//driver.findElement(By.xpath("//input[starts_with(@id,'test_')]")).sendKeys("Test");
		
		//id = 1234_test_t
		//id = 1235_test_t
		//id = 1236_test_t
		
		//driver.findElement(By.xpath("//input[ends_with(@id,'_test_t')]")).sendKeys("Test");
		
		//For links: custom xpath:
		driver.findElement(By.xpath("//a[contains(text(),'register')]")).click();
	}

}
