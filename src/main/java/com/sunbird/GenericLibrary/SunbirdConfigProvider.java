package com.sunbird.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class SunbirdConfigProvider extends BaseTestConfig {

    Properties sunbirdConfigPro;

    /*Creates object and loads the Config properties file */
    public SunbirdConfigProvider() throws Exception {

        FileInputStream fis2 = new FileInputStream(UtilityFunctions.getProperyFilePath());
        sunbirdConfigPro = new Properties();
        sunbirdConfigPro.load(fis2);

    }
    /* Method returns the keyValue in properties file based on KeyName Parameter */
    public String getSunbidConfigPropertyValue(String keyName) {

        return sunbirdConfigPro.getProperty(keyName);
    }
  /*  public void writeDataIntoPropertyFile(String keyName, String keyValue) throws IOException {
        sunbirdConfigPro.setProperty(keyName,keyValue);

        sunbirdConfigPro.store(new FileWriter(System.getProperty("user.dir") + "//Config//SunbirdStaging.Properties"),"Javatpoint Properties Example");
    }*/
}
