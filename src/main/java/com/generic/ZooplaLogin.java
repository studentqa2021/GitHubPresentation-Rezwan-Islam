package com.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.Screenshot;

public class ZooplaLogin {
	WebDriver driver;
	WebElement element;
	WebDriverWait wait;
	public void getLogin(WebDriver driver) {
		MasterPageFactory mpf = new MasterPageFactory(driver);
		
//		if(new MasterPageFactory(driver).getAcceptCookiesBtn().isDisplayed()) {
//			Highlighter.addColor(driver, mpf.getAcceptCookiesBtn());
////			wait = new WebDriverWait(driver, 30);
////		    wait.until(ExpectedConditions.elementToBeClickable(mpf.getAcceptCookiesBtn()));
//			
//			
//			Screenshot.getScreenShot(driver, "Accept all cookies option");
//			
//			driver.switchTo().alert().accept();
//			//mpf.getAcceptCookiesBtn().click();
//		}
		
		Highlighter.addColor(driver, mpf.getSigninbtn());
		mpf.getSigninbtn().click();
		
		Highlighter.addColor(driver, mpf.getEmail());
		mpf.getEmail().sendKeys(BaseConfig.getConfigValue("username"));
		Highlighter.addColor(driver, mpf.getPassword());
		mpf.getPassword().sendKeys(BaseConfig.getConfigValue("password"));
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(mpf.getSigninbtn2()));
		Screenshot.getScreenShot(driver, "Login Page");
		
		mpf.getSigninbtn2().click();
		
		wait.until(ExpectedConditions.elementToBeClickable(mpf.getMyZoopla()));
		Actions ac = new Actions(driver);
		ac.moveToElement(mpf.getMyZoopla()).build().perform();
		Highlighter.addColor(driver, mpf.getMyZoopla());
		
		if(mpf.getSignoutbtn().isDisplayed()) {
			System.out.println("Login succesful!");
			Assert.assertTrue(mpf.getSignoutbtn().isDisplayed(), "Zoopla login test passed!");
		}else {
			System.out.println("Login failed!");
			Assert.assertTrue(mpf.getSignoutbtn().isDisplayed(), "Zoopla login test failed!");
		}
		
		Screenshot.getScreenShot(driver, "Homepage after Login");
	
	}
	
}
