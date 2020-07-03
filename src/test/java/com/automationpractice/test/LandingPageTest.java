package com.automationpractice.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpractice.base.TestBase;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.LandingPage;
import com.automationpractice.pages.LoginPage;

public class LandingPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	LandingPage landingPage;

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();

		loginPage = new LoginPage();
		landingPage = new LandingPage();
		homePage = new HomePage();
		loginPage = homePage.clickOnLoginBtn();
		landingPage = loginPage.login();

	}

	@Test
	public void productDeatils() throws InterruptedException {
		landingPage.productdetails();

	}

	 @AfterMethod
	 public void teardown() {
	 driver.quit();
	 }

}
