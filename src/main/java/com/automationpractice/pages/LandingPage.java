package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automationpractice.base.TestBase;

public class LandingPage extends TestBase {

	@FindBy(xpath = "//input[@type=\"text\"]")
	WebElement name;

	public LandingPage() {
		PageFactory.initElements(driver, this);
	}

	public void productdetails() throws InterruptedException {

		String s = driver.getTitle();
		System.out.println(s);
	}

}
