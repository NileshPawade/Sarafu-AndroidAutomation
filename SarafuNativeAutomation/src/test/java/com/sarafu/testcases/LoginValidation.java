package com.sarafu.testcases;

import java.net.MalformedURLException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sarafu.base.TestBase;
import com.sarafu.pages.HomePage;
import com.sarafu.pages.LoginPage;
import com.sarafu.utilities.Helpers;
import com.sarafu.utilities.LoggerHelper;

import io.appium.java_client.functions.ExpectedCondition;

public class LoginValidation extends TestBase {

	public LoginValidation() {
		super();
	}

	HomePage home;
	LoginPage loginpage;
	private final static Logger log = LoggerHelper.getLogger(LoginValidation.class);

	
	@Test
	public void LoginValidationWithValidandInvalidData() throws MalformedURLException, InterruptedException
	{
		initialisation();
		
		try {
			home = new HomePage();
			Helpers.waitTillElementClickable(home.getIngiaTab(),"Signin button");
			
			home.getIngiaTab().click();
			log.info("Clicked on Sign in to continue");
			loginpage=new LoginPage();
			Helpers.waitTillElementClickable(loginpage.getCountryListTab(),"Country list button");
			
			log.info("Navigated to Sign in Page");
			loginpage.getCountryListTab().click();
			Helpers.waitTillElementVisible(loginpage.getSearchCountry(),"Country List");
			
			log.info("Clicked on country list");
			loginpage.getSearchCountry().sendKeys("Tanzania");
			log.info("Searching for specific country");
			Helpers.waitTillElementClickable(loginpage.getResultCountry(), "country Name");
			
			loginpage.getResultCountry().click();
			log.info("Selected searched country from list");
			Helpers.waitTillElementVisible(loginpage.getUserName(),"UserName ");
			
			loginpage.getUserName().sendKeys("710100021");
			log.info("Username Value inserted");
			Helpers.waitTillElementVisible(loginpage.getPassword(),"Password");
			
			loginpage.getPassword().sendKeys("12345");
			log.info("password value inserted");
			loginpage.getSignIn().click();
			log.info("Clicked on sign in button");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}
