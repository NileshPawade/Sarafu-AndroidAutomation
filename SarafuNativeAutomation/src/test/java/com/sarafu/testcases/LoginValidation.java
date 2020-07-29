package com.sarafu.testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sarafu.base.TestBase;
import com.sarafu.pages.HomePage;
import com.sarafu.pages.LoginPage;

import io.appium.java_client.functions.ExpectedCondition;

public class LoginValidation extends TestBase {

	public LoginValidation() {
		super();
	}

	HomePage home;
	LoginPage loginpage;
	
	@Test
	public void LoginValidationWithValidandInvalidData() throws MalformedURLException, InterruptedException
	{
		initialisation();
		
		try {
			home = new HomePage();
			wait.until(ExpectedConditions.elementToBeClickable(home.getIngiaTab()));
			home.getIngiaTab().click();
			loginpage=new LoginPage();
			wait.until(ExpectedConditions.elementToBeClickable(loginpage.getCountryListTab()));
			loginpage.getCountryListTab().click();
			wait.until(ExpectedConditions.visibilityOf(loginpage.getSearchCountry()));
			loginpage.getSearchCountry().sendKeys("Tanzania");
			wait.until(ExpectedConditions.elementToBeClickable(loginpage.getResultCountry()));
			loginpage.getResultCountry().click();
			wait.until(ExpectedConditions.visibilityOf(loginpage.getUserName()));
			loginpage.getUserName().sendKeys("710100021");
			wait.until(ExpectedConditions.visibilityOf(loginpage.getPassword()));
			loginpage.getPassword().sendKeys("12345");
			loginpage.getSignIn().click();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}
