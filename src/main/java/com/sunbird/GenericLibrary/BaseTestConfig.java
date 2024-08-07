package com.sunbird.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.sunbird.ReportLibrary.ExtendReportGenerator;
import org.testng.annotations.BeforeTest;

public class BaseTestConfig {

    public static WebDriver driver;
    public static SunbirdConfigProvider sunbird_config;
    public static WriteSunbirdConfigProvider writesunbird_config;
    Properties pro;
    public static ExtendReportGenerator reporter;


    //Loads sunbirdConfi properties object
    @BeforeClass
    public void loadFrameworkConfigs() throws Exception {

        sunbird_config = new SunbirdConfigProvider();
        writesunbird_config = new WriteSunbirdConfigProvider();
    }


    /* @Author = Raju
    /* Close the browser once the execution of each testscript  */
    @AfterMethod
    public void CloseBrowser() {

        driver.close();
    }


    /* This method will execute before each @Test method and here we are loding config file properties and Browser launch ,
      navigate to application URL */
    @BeforeMethod
    public void LaunchBrowser() throws Exception {

        String path = System.getProperty("user.dir") + "//Config//SunbirdConfig.Properties";
        FileInputStream fis = new FileInputStream(path);
        pro = new Properties();
        pro.load(fis);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        String Env = pro.getProperty("EnvironmentSetup");
        if (Env.equalsIgnoreCase("STAGING")) {

            driver.get(pro.getProperty("StagingURL"));

        } else if (Env.equalsIgnoreCase("PREPROD")) {

            driver.get(pro.getProperty("PreProdURL"));
        } else if (Env.equalsIgnoreCase("Prod")) {

            driver.get(pro.getProperty("ProdURL"));
        }
        else if (Env.equalsIgnoreCase("OCI")) {

            driver.get(pro.getProperty("OCIURL"));
        }


    }




}
