package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.UploadPage;
import org.openqa.selenium.support.PageFactory;


public class UploadPageActions extends BaseTestConfig {

    static UploadPage uploadPage = PageFactory.initElements(driver, UploadPage.class);

    public static void clickUploadInWorkspace() throws InterruptedException {
        uploadPage.uploadContentInWorkspace();
    }

    public static void clickcontentTypeDroddown() throws InterruptedException {
        uploadPage.contentTypeDroddown();

    }

    public static void uploadContent(String uploadFileType) throws InterruptedException {

        uploadPage.uploadContentInWorkspace();
        UtilityFunctions.switchFrameOnIndex(0);
        uploadPage.contentTypeDroddown();
        uploadPage.selectETextbookValue();

        String filepath = System.getProperty("user.dir") + sunbird_config.getSunbidConfigPropertyValue(uploadFileType);
        uploadPage.clickBrowseButton(filepath);
        //	uploadPage.assertUploadContentMsg();
        String actualMsg = uploadPage.assertUploadContentMsgs();
        UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.contentUploadToastrMsg, "Failed to upload the content");

        uploadPage.clickSave();
        uploadPage.clickClose();
    }

    public static void sendUploadContentForReview() throws InterruptedException {


    }

}