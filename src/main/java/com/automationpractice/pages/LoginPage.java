package com.automationpractice.pages;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(xpath = "//span[contains(text(),'Log in')]")
	WebElement loginLink;

	@FindBy(xpath = "//input[@type=\"text\"]")
	WebElement email;

	@FindBy(xpath = "//input[@type=\"password\"]")
	WebElement passwrd;

	@FindBy(xpath = "(//span[contains(text(),'Sign in')])[1]")
	WebElement signinBtn;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public LandingPage login() throws InterruptedException {
		Thread.sleep(10000);
		loginLink.click();
		email.sendKeys("dhakeparag3@gmail.com");
		passwrd.sendKeys("Test@123");
		signinBtn.click();
		return new LandingPage();
	}

}
