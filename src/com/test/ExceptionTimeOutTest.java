package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void test1() {
		String x="100A";
		Integer.parseInt(x);
	}

}
