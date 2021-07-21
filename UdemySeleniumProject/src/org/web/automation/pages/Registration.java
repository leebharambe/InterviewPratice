package org.web.automation.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.web.automation.base.InitiateDriver;
import org.web.automation.library.PageActions;
import org.web.automation.library.PropertyReader;



public class Registration extends InitiateDriver {
	
	WebDriver driver =null;
	PageActions action;
	
	public Registration(WebDriver driver)
	{
		this.driver=driver;
		action=new PageActions(driver);
	}
	
	public void enterUsername()
	{
		try
		{
		//action.enterDataIntoTextbox(driver.findElement(By.xpath(PropertyReader.elementLocatorReader("registration_page_username_textbox_name"))),PropertyReader.applicationConfigReader("Application_Username") );
		action.enterDataIntoTextbox(driver.findElement(By.xpath(PropertyReader.elementLocatorReader("registration_page_username_textbox_name"))), PropertyReader.applicationConfigReader("Application_Username"));
		
		//driver.findElement(By.xpath("//input[@name='fld_username']")).sendKeys("test");
		}
		catch(Exception e)
		{
			System.out.println("*********Exception while enter Username*******");
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	public void enterEmail(String email) throws IOException 
	{
		//driver.findElement(By.xpath(PropertyReader.elementLocatorReader("registration_page_email_textbox_name"))).sendKeys(PropertyReader.applicationConfigReader("registration_page_email"));
		//driver.findElement(By.xpath(PropertyReader.elementLocatorReader("registration_page_email_textbox_name"))).sendKeys(email);
		
		action.enterDataIntoTextbox(driver.findElement(By.xpath(PropertyReader.elementLocatorReader("registration_page_email_textbox_name"))), email);
	}
	
	public void enterPassword() throws IOException
	{
		driver.findElement(By.xpath(PropertyReader.elementLocatorReader("registration_page_password_textbox_name"))).sendKeys(PropertyReader.applicationConfigReader("Application_Password"));
	}

}
