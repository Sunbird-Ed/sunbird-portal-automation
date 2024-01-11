package com.sunbird.GenericLibrary;

import java.io.FileInputStream;
import java.util.Properties;

import com.aventstack.extentreports.markuputils.ExtentColor;

public class FrameworkConfigProvider extends BaseTestConfig {

	Properties frameworkPro;
	public FrameworkConfigProvider() throws Exception {

		String path = System.getProperty("user.dir") + "\\Config\\FrameworkConfig.Properties";

		FileInputStream fis = new FileInputStream(path);
		frameworkPro = new Properties();
		frameworkPro.load(fis);

	}

	public String getFrameworkValue()
	{
		
	return	frameworkPro.getProperty("Framework");
	}
	
	public String getFramework(String frameworkName)
	{
		return frameworkPro.getProperty(frameworkName);
	}


}
