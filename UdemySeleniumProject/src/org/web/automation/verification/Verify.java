package org.web.automation.verification;

import org.openqa.selenium.WebDriver;

public class Verify {
	
	public static boolean validateURL(WebDriver driver, String expected)
	
	{
		boolean result=false;
		if (driver.getCurrentUrl().equalsIgnoreCase(expected))
		{
			result= true;
		}
		return result;
	}

}
