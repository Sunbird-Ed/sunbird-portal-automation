package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.ConsumptionPage;
import com.sunbird.PageObjects.WorkspaceDashboardPage;
import org.openqa.selenium.UnableToSetCookieException;
import org.openqa.selenium.support.PageFactory;


public class ConsumptionPageActions extends BaseTestConfig {

    /*  get the PDFPage Count and consume the content */
    public static void consumePDF() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        int totalPage = consumptionPage.getPDFTotalCount();

        try {
            for (int i = 0; i <= totalPage; i++) {
                consumptionPage.clickOnNextIcon();
            }
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }

    /* give ratings after the consumption */
    public static void giveRating(int a) throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.giveRatingStars(a);
        consumptionPage.tellusMorecheckbox();
        consumptionPage.clickSubmitRatingPopup();
        String actual = consumptionPage.assertThankYouToastrMsg();
        UtilityFunctions.stringValueComparision(actual, SunbirdConstants.thankYouRatingToastrMsg, "Failed on Rating the content");
    }

    /* consume the Mp4 content */
    public static void consumeMp4() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);

        //   String txtBookName= sunbird_config.getSunbidConfigPropertyValue("Textbook_Name");

        // String generatedXpath=  UtilityFunctions.generateXpathUsingContainsWithKeyNameValue(txtBookName);
        // UtilityFunctions.findElementAndClick(generatedXpath);

        Thread.sleep(7000);
        String mp4Name = sunbird_config.getSunbidConfigPropertyValue("MP4_Consume");

        String generatedXpath = UtilityFunctions.generateXpathUsingAttributeNameAndKeynameValue(SunbirdConstants.title, mp4Name);
        UtilityFunctions.findElementAndClick(generatedXpath);



    }

}
	
