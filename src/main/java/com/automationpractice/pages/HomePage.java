package com.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//a[@class='button']")
	WebElement signupBtn;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public LoginPage clickOnLoginBtn() {
		signupBtn.click();
		return new LoginPage();
	}

}
