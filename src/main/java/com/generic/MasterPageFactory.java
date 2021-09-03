package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="(//*[contains(text(),'Accept all cookies')])[2]")
	private WebElement acceptCookiesBtn;
	
	@FindBy(xpath = "(//*[@class='css-18xug1d-ButtonLink-Button-ButtonLinkWithIcon et03gpj0'])[4]")
	private WebElement signinbtn;
	
	@FindBy(xpath="(//*[contains(text(),'Sign in')])[7]")
	private WebElement signinbtn2;
	
	@FindBy(xpath="//*[@name='email']")
	private WebElement email;
	
	@FindBy(xpath="//*[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="(//*[@class='css-18xug1d-ButtonLink-Button-ButtonLinkWithIcon et03gpj0'])[5]")
	private WebElement myZoopla;
	
	@FindBy(xpath="(//*[@class='esdwd6d0 css-wxwl91-StyledLink-Link e33dvwd0'])[5]")
	private WebElement signoutbtn;
	
	public WebElement getSignoutbtn() {
		return signoutbtn;
	}

	public WebElement getMyZoopla() {
		return myZoopla;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getSigninbtn2() {
		return signinbtn2;
	}

	public WebElement getSigninbtn() {
		return signinbtn;
	}

	public WebElement getAcceptCookiesBtn() {
		return acceptCookiesBtn;
	}

}
