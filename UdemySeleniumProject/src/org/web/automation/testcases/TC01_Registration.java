package org.web.automation.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.web.automation.base.InitiateDriver;
import org.web.automation.datagenerator.DataGenerator;
import org.web.automation.library.CaptureScreenshots;
import org.web.automation.verification.Verify;

public class TC01_Registration extends InitiateDriver{
	
	@Test(dataProvider="Excel",dataProviderClass=DataGenerator.class)
	public void TC01(String email,String url)
	{
		
		try {
			registration.enterUsername();
			registration.enterEmail(email);
			registration.enterPassword();
			
			SoftAssert s = new SoftAssert(); 
			s.assertEquals("abc", "xyz");
			if (Verify.validateURL(driver, url))
			{
				System.out.println("Url is correct");
			}
			else
			{
				System.out.println("Url is not as per expected");
			}
			
			CaptureScreenshots.takescreenshots(driver, "RegistrationPage");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
	}
	
//	@DataProvider(name="Static")
//	public Object[][] testDataGenerator()
//	{
//		Object data[][]={{"abc@gmail.com","RegistrationPage"},{"xyz@gmail.com","RegistrationPage"}};
//		return data;
//	}
	
	
	
//	@DataProvider(name="Excel")
//	public static Object[][] testDataGenerator() throws IOException
//	{
//		FileInputStream file =new FileInputStream("./TestData/TestData.xlsx");
//		XSSFWorkbook workbook=new XSSFWorkbook(file);
//		XSSFSheet loginsheet=workbook.getSheet("Sheet1");
//		int numberofData= loginsheet.getPhysicalNumberOfRows();
//		Object[][] testData=new Object[numberofData][2];
//		
//		for (int i=0;i<numberofData;i++)
//		{
//			XSSFRow row=loginsheet.getRow(i);
//			XSSFCell username=row.getCell(0);
//			XSSFCell password=row.getCell(1);
//			testData[i][0]=username.getStringCellValue();
//			testData[i][1]=password.getStringCellValue();
//			
//		}
//		
//		return testData;
//	}
	
	
	
	

}
