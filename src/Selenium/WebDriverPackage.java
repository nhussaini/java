package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverPackage {

	public static void main(String[] args) {
		//1. FF browser
		//geckodriver
		
		
		// System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nasrullah Hussaini\\Downloads\\geckodriver.exe");
		// WebDriver driver= new FirefoxDriver();
		 
		 //2.google chrome browser
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nasrullah Hussaini\\Downloads\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://www.google.com");
		 String title = driver.getTitle(); //gets the title of the website
		 System.out.println(title);
		 
		 if(title.equals("Google")) {
			 System.out.println("correct title");
		 }else {
			 System.out.println("Incorrect title");
		 }
		 System.out.println(driver.getCurrentUrl());
		 
		 driver.quit();//to quit the browser
		

	}

}
