package org.web.automation.datagenerator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataGenerator {
	
	@DataProvider(name="Excel")
	public static Object[][] testDataGenerator() throws IOException
	{
		FileInputStream file=new FileInputStream("./TestData/TestData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		
		
		
		int rows= sheet.getPhysicalNumberOfRows();
		Object[][] testdata= new Object[rows][];
		
		for (int i=0;i<rows;i++)
		{
			XSSFRow row= sheet.getRow(i);
			XSSFCell  username=row.getCell(0);
			XSSFCell  password=row.getCell(1);
			testdata[i][0]= username.getStringCellValue();
			testdata[i][1]= password.getStringCellValue();
			
		}
		return testdata;
		
		
	}

}
