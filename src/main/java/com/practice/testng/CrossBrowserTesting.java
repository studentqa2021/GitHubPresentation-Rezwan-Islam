package com.practice.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CrossBrowserTesting {

	public void getDriver(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			WebDriver chromeDriver = new ChromeDriver();
			chromeDriver.manage().window().maximize();
			chromeDriver.navigate().to("https://www.amazon.com/");
			chromeDriver.quit();
			System.out.println("Browser opened = "+browser);
		}
		else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
			WebDriver ieDriver = new InternetExplorerDriver();
			ieDriver.manage().window().maximize();
			ieDriver.navigate().to("http://automationpractice.com/");
			System.out.println("Browser opened = "+browser);
		}
		else {
			System.out.println("Not found any browser");
		}
		
	}

	public static void main(String[] args) {
		new CrossBrowserTesting().getDriver("chrome");
	}
}
