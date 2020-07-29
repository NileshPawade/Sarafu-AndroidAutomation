package com.sarafu.utilities;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sarafu.base.TestBase;
import com.sarafu.testcases.LoginValidation;

public class Helpers extends TestBase {
	
	private final static Logger log = LoggerHelper.getLogger(Helpers.class);
	public Helpers() {
		super();
	}

	public static void waitTillElementVisible(WebElement element, String elementName)
	{
		try {
		wait.until(ExpectedConditions.visibilityOf(element));
		log.info("Waited till "+ elementName+" is visible ");
		}
		catch(Exception e)
		{
			log.error(e.getMessage());
			
		}
	}
	public static void waitTillElementClickable(WebElement element, String elementName)
	{
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("Waited till "+ elementName+" is visible ");
			}
			catch(Exception e)
			{
				log.error(e.getMessage());
				
			}
	}
	public static void waitTillElementSelectable(WebElement element, String elementName)
	{
		try {
			wait.until(ExpectedConditions.elementToBeSelected(element));
			log.info("Waited till "+ elementName+" is visible ");
			}
			catch(Exception e)
			{
				log.error(e.getMessage());
				
			}
		
	}
	
	public static void typeInsideInputBox(WebElement element)
	{
		
	}
	
	public static void clickOnElement(WebElement element)
	{
		
	}
	
	
}
