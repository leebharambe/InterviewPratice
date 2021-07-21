package org.web.automation.library;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class PropertyReader {
	
	public static String applicationConfigReader(String key)
	{
		try
		{
			File f=new File("./ConfigurationFiles/ApplicationConfiguration.properties");
			FileReader fr = new FileReader(f);
			Properties prop = new Properties();
			prop.load(fr);
			//return prop.get(key).toString();
			return prop.getProperty(key);
			
			
		}
		
		catch (Exception e)
		{
			System.out.println("config reader exception");
			return null;
		}

   }
	
	public static String elementLocatorReader(String key)
	{
		try
		{
			File f=new File("./ConfigurationFiles/Locaters.properties");
			FileReader fr = new FileReader(f);
			Properties prop = new Properties();
			prop.load(fr);
			return prop.get(key).toString();
		}
		
		catch (Exception e)
		{
			System.out.println("elementlocater reader exception");
			return null;
		}

   }
}
