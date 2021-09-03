package com.practice.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserWithTestNG {
	
	@BeforeTest
	public void getSetup() {
		
	}
	
	@Test
	@Parameters("browser")
	public void getTest(String browser) {
		new CrossBrowserTesting().getDriver(browser);
	}
	
	@AfterTest
	public void tearDown() {
		
	}

}
