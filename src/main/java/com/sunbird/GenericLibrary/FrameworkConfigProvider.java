package com.sunbird.GenericLibrary;

import java.io.FileInputStream;
import java.util.Properties;

public class FrameworkConfigProvider extends BaseTestConfig {

	Properties sunbirdConfigPro;
	public FrameworkConfigProvider() throws Exception {

		String path = System.getProperty("user.dir") + "//Config//FrameworkConfig.Properties";

		FileInputStream fis = new FileInputStream(path);
		sunbirdConfigPro = new Properties();
		sunbirdConfigPro.load(fis);

	}


	public String getSunbidConfigPropertyValue(String keyName)
	{
		return sunbirdConfigPro.getProperty(keyName);
	}


}
