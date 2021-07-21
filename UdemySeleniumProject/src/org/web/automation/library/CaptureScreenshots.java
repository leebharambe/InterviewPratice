package org.web.automation.library;

import java.io.File;

import org.jboss.netty.util.internal.SystemPropertyUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshots {
	
	public static void takescreenshots(WebDriver driver,String name)
	{
		try
		{
			TakesScreenshot screenshot= (TakesScreenshot)driver;
			File f= screenshot.getScreenshotAs(OutputType.FILE);
		}
		catch(Exception e)
		{
			System.out.println("exception in screnshot ");			
			e.printStackTrace();
			
		}
		
	}

}
