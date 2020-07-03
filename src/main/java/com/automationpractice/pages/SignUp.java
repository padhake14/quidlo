package com.automationpractice.pages;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automationpractice.base.TestBase;

public class SignUp extends TestBase {

	@FindBy(xpath = "//input[@type=\"text\"]")
	WebElement email;

	@FindBy(xpath = "//input[@type=\"password\"]")
	WebElement passwrd;

	@FindBy(xpath = "(//span[contains(text(),'Sign in')])[1]")
	WebElement signinBtn;

	@FindBy(xpath = "//span[@class=\"Input-style__errormessage___3J-OX\"]")
	WebElement validationMessage;

	public SignUp() {
		PageFactory.initElements(driver, this);
	}

	public void fillform() throws InterruptedException {
		email.sendKeys("ds");
		passwrd.sendKeys("Tes");

	}

	public String validation() {
		return validationMessage.getText();
	}

}
