package com.sunbird.GenericLibrary;

import java.io.FileInputStream;
import java.util.Properties;

public class SunbirdConfigProvider  {

	Properties sunbirdConfigPro;

	/*Creates object and loads the Config properties file */
	public SunbirdConfigProvider() throws Exception {

		String path = System.getProperty("user.dir") + "//Config//Sunbird.Properties";

		FileInputStream fis = new FileInputStream(path);
		sunbirdConfigPro = new Properties();
		sunbirdConfigPro.load(fis);

	}

/* Method returns the keyValue in properties file based on KeyName Parameter */
	public String getSunbidConfigPropertyValue(String keyName)
	{

		return sunbirdConfigPro.getProperty(keyName);
	}


}
