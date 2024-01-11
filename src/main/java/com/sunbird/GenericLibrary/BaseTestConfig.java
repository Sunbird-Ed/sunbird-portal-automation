package com.sunbird.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.sunbird.ReportLibrary.ExtendReportGenerator;







public class BaseTestConfig implements Sunbird_ConstantData {
	
	public static WebDriver driver;
	public static ExcelDataProvider excel;
	public static FrameworkConfigProvider sunbird_config;
	Properties pro;                                                              
	public static ExtendReportGenerator reporter;

	
	@BeforeClass
	public void loadFrameworkConfigs() throws Exception {

		sunbird_config =new FrameworkConfigProvider();
	}
	
	
	/* @Author = Raju 
	/* Close the browser once the execution of each testscript  */
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}
	
	
	/* This method will execute before each @Test method and here we are loding config file properties and Browser launch , 
	  navigate to application URL */
	@BeforeMethod
	public void LaunchBrowser() throws IOException {
		
		String path = System.getProperty("user.dir") + "//Config//Config.Properties";
		FileInputStream fis = new FileInputStream(path);
		pro = new Properties();
		pro.load(fis);
		

			System.setProperty(CHROME_KEY,CHROME_VAl);
	    driver=new ChromeDriver();
	 driver.manage().window().maximize();
String Env=pro.getProperty("EnvironmentSetup");


if(Env.equalsIgnoreCase("STAGING")) {
		
	
	  driver.get(STAGING_URL);
		
	}
else if(Env.equalsIgnoreCase("PREPROD")) {
		
	 driver.get(PREPROD_URL);
	}
	
	else if(Env.equalsIgnoreCase("Prod")) {
		
		 driver.get(PROD_URL);
	}
	
	
	}

}
