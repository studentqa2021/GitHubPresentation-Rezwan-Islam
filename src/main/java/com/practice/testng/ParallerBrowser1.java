package com.practice.testng;

import org.testng.annotations.Test;

public class ParallerBrowser1 {
	
	@Test
	public void getTest() {
		
		new CrossBrowserTesting().getDriver("chrome");
	}

}
