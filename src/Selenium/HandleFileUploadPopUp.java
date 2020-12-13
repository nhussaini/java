package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nasrullah Hussaini\\Downloads\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://html.com/input-type-file/");
		 driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\Nasrullah Hussaini\\Desktop\\Roshanfekran.pdf");
		 

	}

}
