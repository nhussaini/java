package com.test;
// if one method is dependent on another method,
//we use dependsOnMethods. If the method on which
//other methods depend fail, those other methods will be skipped.
import org.testng.annotations.Test;

public class TestNgFeatures {
	
	@Test
	public void loginTest() {
		System.out.println("Login Test");
		//int i = 9/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void HomePageTest() {
		System.out.println("Home Page Test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void SearchPageTest() {
		System.out.println("search page");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void regPageTest() {
		System.out.println("Reg page");
	}

}
