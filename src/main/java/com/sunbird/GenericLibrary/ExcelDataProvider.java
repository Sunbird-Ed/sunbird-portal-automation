package com.sunbird.GenericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.aventstack.extentreports.ExtentTest;

public class ExcelDataProvider extends BaseTestConfig {
	static ExtentTest test;
	Workbook wb;
	FileInputStream fis;
	FileOutputStream outFile;
	String data = "";
	String path = "";

	public ExcelDataProvider() throws Exception {

		
		String path = System.getProperty("user.dir") + "\\Config\\Config.Properties";
		FileInputStream fis = new FileInputStream(path);
		pro = new Properties();
		pro.load(fis);
		String Env=pro.getProperty("EnvironmentSetup");

		
		if(Env.equalsIgnoreCase("STAGING")) {
			
			
			data = STAGTESTDATA;
				
			}
		else if(Env.equalsIgnoreCase("PREPROD")) {
				
			data = PREPRODTESTDATA;
			}
			
			else if(Env.equalsIgnoreCase("Prod")) {
				
				data = PRODTESTDATA;
			}
		
		
	

		path = System.getProperty("user.dir") + data;
		FileInputStream fis2 = new FileInputStream(path);
		wb = WorkbookFactory.create(fis2);

	}

	public String getExcelData(String sheetname, int row, int cell) {

		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();

	}
	

   

}
