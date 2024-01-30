package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.ReviewPage;
import com.sunbird.PageObjects.UploadPage;



import org.openqa.selenium.support.PageFactory;


public class UploadPageActions extends BaseTestConfig {

    static UploadPage uploadPage = PageFactory.initElements(driver, UploadPage.class);
	static ReviewPage reviewPage = PageFactory.initElements(driver, ReviewPage.class);

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

    public static String sendUploadContentForReview() throws InterruptedException {
                   uploadPage.clickSendForReviewButton();
                   uploadPage.clickAddImage();
                   uploadPage.clickAllImageTab();
                   uploadPage.selectImage();                  
                   uploadPage.clickSelectButton();
                   String titleName=UtilityFunctions.generateRandomName("automationUpload");
                                  uploadPage.clearTitleAndEnterTitleName(titleName);                   
                   uploadPage.clickBoardDropDown();
                   uploadPage.selectBoardValue();
                   uploadPage.clickMediumDropdown();
                   uploadPage.selectMediumDropdown();
                   uploadPage.clickClassDropDown();
                   uploadPage.selectClassDropdown();
                   uploadPage.clickSubjectDropdown();
                   uploadPage.selectSubjectDropdown();
                   uploadPage.enterCopyRight("2024");
                   uploadPage.clickSaveButtonSendForReivew();
                   driver.switchTo().defaultContent();
                        WorkspaceDashboardPageActions.assertDrafts();
return titleName;
    }

    
    public static void pubishUploadContent(String contentName) throws InterruptedException
    {
    	reviewPage.upForReviewBucket();
		reviewPage.clickSearchBar(contentName);
		reviewPage.clickOnSearch();
		Thread.sleep(5000);
		reviewPage.selectContentForReview();
		Thread.sleep(1000);
		reviewPage.scrollDownTillPublish();
		reviewPage.clickOnPublish();

		
    }
}