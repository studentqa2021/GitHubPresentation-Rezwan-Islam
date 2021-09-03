package com.smoke.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.generic.DriverManager;
import com.generic.ZooplaLogin;

public class ZooplaLoginExecution {
	static WebDriver driver;
	static ExtentReports extent;
	ExtentTest test;

	@BeforeTest
	public void getSetup() {
		ExtentSparkReporter reporter = new ExtentSparkReporter("target/ZooplaLoginTestResult.html");
		reporter.config().setDocumentTitle("Testng Automation");
		reporter.config().setReportName("Smoke test");
		reporter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Company ", "SMART TECH");
		extent.setSystemInfo("Testing environment ", "QA");
		extent.setSystemInfo("Team ", "QA");
		extent.setSystemInfo("Tester Name: ", System.getProperty("user.name"));
		driver = new DriverManager().getDriver();
		//extent.flush();
	}
	
	@Test
	public void loginTest() {
		new ZooplaLogin().getLogin(driver);
	}

	@AfterTest
	public void tearDown() {
		//driver.quit();	
		extent.flush();
	}
	
}
