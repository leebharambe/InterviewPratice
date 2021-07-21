package org.web.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.web.automation.library.PropertyReader;
import org.web.automation.pages.Registration;

    public class InitiateDriver {
	
	public WebDriver driver; 
	public Registration registration;
	
	@BeforeMethod
	public void startBrowser()
	        {
		if (PropertyReader.applicationConfigReader("BrowserName").equalsIgnoreCase("Chrome"))
				{
			System.setProperty("webdriver.chrome.driver","F:\\Study Material\\SeleniumPractice\\src\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			
			
				}
		
		else if(PropertyReader.applicationConfigReader("BrowserName").equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "F:\\Study Material\\SeleniumPractice\\src\\Drivers\\geckodriver.exe");
		
		//System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		    driver=new FirefoxDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Study Material\\SeleniumPractice\\src\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(PropertyReader.applicationConfigReader("Apllication_URL"));
		
		registration= new Registration(driver);
		
	        }
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.close();
	}
	
    
	
   
}
