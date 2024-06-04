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

    /* click on contentype dropdown */
    public static void clickcontentTypeDroddown() throws InterruptedException {
        uploadPage.contentTypeDroddown();

    }

    /* upload the content by taking the filePath */
    public static void uploadContent(String uploadFileType) throws InterruptedException {
        UploadPage uploadPage = PageFactory.initElements(driver, UploadPage.class);

        uploadPage.uploadContentInWorkspace();
        UtilityFunctions.switchFrameOnIndex(0);
        uploadPage.contentTypeDroddown();
        uploadPage.selectETextbookValue();

        String filepath = System.getProperty("user.dir") + sunbird_config.getSunbidConfigPropertyValue(uploadFileType);
        uploadPage.clickBrowseButton(filepath);
        //	uploadPage.assertUploadContentMsg();
        String actualMsg = uploadPage.assertUploadContentMsgs();
        UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.contentUploadToastrMsg, "Failed to upload the content");
uploadPage.waitForContentUploadToastrMsgDisAppear();
        uploadPage.clickSave();
        uploadPage.clickClose();
        
    }

    /* fill all the details and Select BMC in uploadSendForReview form */
    public static String sendUploadContentForReview() throws InterruptedException {
        UploadPage uploadPage = PageFactory.initElements(driver, UploadPage.class);

        //uploadPage.clickSendForReviewButton();
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


//        uploadPage.clickClose();
//        driver.switchTo().defaultContent();
                       // WorkspaceDashboardPageActions.assertDrafts();
return titleName;
    }



    public static void clickEditDetails() throws InterruptedException
    {
        UploadPage uploadPage = PageFactory.initElements(driver, UploadPage.class);
uploadPage.editDetails();
    }
    public static void clickSendForReview() throws InterruptedException
    {
        UploadPage uploadPage = PageFactory.initElements(driver, UploadPage.class);
        uploadPage.clickSendForReviewButton();
    }
    public static void clickCloseIcon() throws InterruptedException
    {
        UploadPage uploadPage = PageFactory.initElements(driver, UploadPage.class);
        uploadPage.clickClose();
    }
    public static void clickCloseCrossIcon() throws InterruptedException
    {
        UploadPage uploadPage = PageFactory.initElements(driver, UploadPage.class);
        uploadPage.closeCrossIcon();
    }
    public static void assertEditDetails() throws InterruptedException
    {
        UploadPage uploadPage = PageFactory.initElements(driver, UploadPage.class);
        uploadPage.assertEditDetails();
    }
    /* upload the content by taking the filePath */
    public static void uploadYoutube(String youtubeLink) throws InterruptedException {
        UploadPage uploadPage = PageFactory.initElements(driver, UploadPage.class);

        uploadPage.uploadContentInWorkspace();
        UtilityFunctions.switchFrameOnIndex(0);
        uploadPage.contentTypeDroddown();
        uploadPage.selectETextbookValue();
uploadPage.enterURLLink(youtubeLink);
      uploadPage.uploadBtnInEditor();
        String actualMsg = uploadPage.assertUploadContentMsgs();
        UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.contentUploadToastrMsg, "Failed to upload the content");
        uploadPage.waitForContentUploadToastrMsgDisAppear();
        uploadPage.clickSave();
        uploadPage.clickClose();

    }

    public static void clickReplaceAndUpload() throws InterruptedException
    {
        UploadPage uploadPage = PageFactory.initElements(driver, UploadPage.class);
        uploadPage.clickReplaceandUpload();
    }
    public static void reUploadContent(String uploadFileType) throws InterruptedException {

        UploadPage uploadPage = PageFactory.initElements(driver, UploadPage.class);
        uploadPage.recontentTypeDroddown();
        uploadPage.selectETextbookValue();
        String filepath = System.getProperty("user.dir") + sunbird_config.getSunbidConfigPropertyValue(uploadFileType);
        uploadPage.clickBrowseButton(filepath);
        String actualMsg = uploadPage.assertUploadContentMsgs();
        UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.contentUploadToastrMsg, "Failed to upload the content");
        uploadPage.waitForContentUploadToastrMsgDisAppear();
        uploadPage.clickSave();
        uploadPage.clickClose();
    }
    public static void clickCopyButton() {
        UploadPage uploadPage = PageFactory.initElements(driver, UploadPage.class);
        uploadPage.clickcopy();
    }
    public static void closeEditor() {
        UploadPage uploadPage = PageFactory.initElements(driver, UploadPage.class);
        uploadPage.clickCloseEditorIcon();

    }
    public static void clickDownloadButtonInPrveiewPage() throws InterruptedException {
        UploadPage uploadPage = PageFactory.initElements(driver, UploadPage.class);
        uploadPage.clickDownloadPreview();
        UtilityFunctions.threadSleep(2000);
        uploadPage.assertContentDowloadedMsg();
        //    uploadPage.waitForDownloadedMsgDisAppear();
    }
    public static void clickLimitedSharing() {
        UploadPage uploadPage = PageFactory.initElements(driver, UploadPage.class);
        uploadPage.clickLimitedSharingDropDown();
        uploadPage.clickLimitedSharing();
    }
}