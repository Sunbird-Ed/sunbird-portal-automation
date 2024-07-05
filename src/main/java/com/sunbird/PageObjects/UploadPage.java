package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UploadPage {

    @FindBy(how = How.XPATH, using = "//span[text()='Upload Content']")
    private WebElement uploadcontent;

    @FindBy(how = How.XPATH, using = "//*[@id='_selectPrimaryCategory']")
    private WebElement contentTypeDropDown;

    @FindBy(how = How.XPATH, using = "//option[@data-value='eTextbook']")
    private WebElement eTextbook;

    @FindBy(how = How.XPATH, using = "//*[@id='browseButton']//input")
    private WebElement browserbutton;

    @FindBy(how = How.XPATH, using = "//strong[contains(text(),'content uploaded successfully!')]")
    private WebElement contentUploadToastrMsg;

    @FindBy(how = How.XPATH, using = "//span[text()='Save']")
    private WebElement saveButton;

    @FindBy(how = How.XPATH, using = "//button[text()='Close']")
    private WebElement closeButton;
    

	@FindBy(how=How.XPATH,using="//i[@class='send icon']")
	private WebElement sendforreview;

    @FindBy(how=How.XPATH,using="//div[contains(@id,'app-icon')]")
    private WebElement clickOnAddImage;
	
	@FindBy(how=How.XPATH,using="//a[text()='All image']")
	private WebElement clickOnAllImage;
	
	@FindBy(how=How.XPATH,using="//input[@id='searchAllImageAssets']//following::img[2]")
	private WebElement selectImageFromAllImage;
    
	@FindBy(how=How.XPATH,using="//button[text()='Select']")
	private WebElement selectButton;
	
	@FindBy(how=How.XPATH,using="//input[@id='name']")
	private WebElement TitleNameInSendForReview;
	
	@FindBy(how=How.XPATH,using="//div[text()='Select Board/Syllabus']")
	private WebElement clickBoardDropdown;
	
	@FindBy(how=How.XPATH,using="//div[text()='Select Board/Syllabus']//following::div[2]")
   private WebElement boardSelected;
	
	
	@FindBy(how=How.XPATH,using="//div[text()='Select Medium']")
	private WebElement clickMedium;
	
	@FindBy(how=How.XPATH,using="//div[text()='Select Medium']//following::div[2]")
	private WebElement mediumSelected;
	
	@FindBy(how=How.XPATH,using="//div[text()='Select Class']")
	private WebElement selectClass;
	
	@FindBy(how=How.XPATH,using="//div[text()='Select Class']//following::div[2]")
	private WebElement classSelected;
	
	@FindBy(how=How.XPATH,using="//div[text()='Select Subject']")
	private WebElement clickSubjectDropDown;
	
	@FindBy(how=How.XPATH,using="//div[text()='Select Subject']//following::div[2]")
    private WebElement subjectSelected;
	
	@FindBy(how=How.XPATH,using="//input[@id='copyrightYear']")
	private WebElement copyright;
	
	@FindBy(how=How.XPATH,using="//button[@class='ui blue button ']")
	private WebElement savebuttonSendReivew;

    @FindBy(how=How.XPATH,using="//span[@ng-if='showEditMeta']")
    private WebElement editDetails;

    @FindBy(how = How.XPATH, using = "//div[@id='closeButton']")
    private WebElement crossCloseEditorIcon;

    @FindBy(how = How.XPATH, using = "//Input[@placeholder='https://']")
    private WebElement enterURLLink;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Upload')]")
    private WebElement uploadBtnInUploadEditor;

    @FindBy(how = How.XPATH, using = "//div[@class='icon-box popup-item']//following::i[@class='upload icon custom-icon']")
    private WebElement replaceAndUpload;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Copy')]")
    private WebElement clickcopy;

    @FindBy(how = How.XPATH, using = "//div[@id='closeButton']")
    private WebElement editorCloseIcon;

    @FindBy(how = How.XPATH, using = "//div[@class='icon-box popup-item']//following::i[@class='download icon custom-icon']")
    private WebElement clickDownloadPreview;
    @FindBy(how = How.XPATH, using = "//strong[contains(text(),'Content download started!')]")
    private WebElement contentDownloadStartedMsg;

    @FindBy(how = How.XPATH, using = "//div[@id='reviewButton']//following::i[@class='dropdown icon']")
    private WebElement limitedSharingDropDown;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Limited sharing')]")
    private WebElement limitedSharing;

    public void uploadContentInWorkspace() {

        UtilityFunctions.waitToBeClickableAndClick(uploadcontent);
        Listeners.addLogs("clicked on uploadContent");

    }

    public void contentTypeDroddown() {

        UtilityFunctions.waitToBeClickableAndClick(contentTypeDropDown);
        Listeners.addLogs("Clicked contentType");

    }

    public void selectETextbookValue() {

        UtilityFunctions.waitToBeClickableAndClick(eTextbook);
        Listeners.addLogs("Selected ETextbook");

    }

    public void clickBrowseButton(String filePath) {

        UtilityFunctions.uploadSendKeys(browserbutton, filePath);
        Listeners.addLogs("Clicked on browseButton ");

    }

    public String assertUploadContentMsgs() {
        UtilityFunctions.waitForVisibilityOfWebElement(contentUploadToastrMsg);
        String getActualText = UtilityFunctions.getTextFromElement(contentUploadToastrMsg);
        return getActualText;
    }

    public void assertUploadContentMsg() {
        UtilityFunctions.getTextFromElement(contentUploadToastrMsg);

        UtilityFunctions.waitForVisibilityOfWebElement(contentUploadToastrMsg);
        String actual = UtilityFunctions.getTextFromElement(contentUploadToastrMsg);
        System.out.println(actual);

        UtilityFunctions.stringValueComparision("Failed to upload the content", actual, SunbirdConstants.contentUploadToastrMsg);
    }

    public void clickSave() {

        UtilityFunctions.waitToBeClickableAndClick(saveButton);
        Listeners.addLogs("Clicked on Save ");

    }

    public void clickClose() {

        UtilityFunctions.waitToBeClickableAndClick(closeButton);
        Listeners.addLogs("Clicked on close ");

    }
    
    public void clickSendForReviewButton() {

        UtilityFunctions.waitToBeClickableAndClick(sendforreview);
        Listeners.addLogs("Clicked on sendforreview ");

    }
    
    public void clickAddImage() {

        UtilityFunctions.waitToBeClickableAndClick(clickOnAddImage);
        Listeners.addLogs("Clicked on AddImageIcon ");

    }
    
    public void clickAllImageTab() {

        UtilityFunctions.waitToBeClickableAndClick(clickOnAllImage);
        Listeners.addLogs("Clicked on AllImageTab ");

    }
    
    public void selectImage() {

        UtilityFunctions.waitToBeClickableAndClick(selectImageFromAllImage);
        Listeners.addLogs("select image");

    }
    
    public void clearTitleAndEnterTitleName(String titleName) {
    	TitleNameInSendForReview.clear();
    	
        UtilityFunctions.waitToBeClickableAndSendKeys(TitleNameInSendForReview,titleName);
        Listeners.addLogs("Enter Title");

    }    
    public void clickSelectButton() {
    	   	
 	    
        UtilityFunctions.waitToBeClickableAndClick(selectButton);
        Listeners.addLogs("Clicked on select button ");

    }
    public void clickBoardDropDown() {

    	
    	UtilityFunctions.scrollInToviewUsingJavaScript(clickBoardDropdown);
        UtilityFunctions.waitToBeClickableAndClick(clickBoardDropdown);
        Listeners.addLogs("Clicked on board dropdown ");

    }
    
    public void selectBoardValue() {

        UtilityFunctions.waitToBeClickableAndClick(boardSelected);
        Listeners.addLogs("select board value ");

    }
    
    public void clickMediumDropdown() {

        UtilityFunctions.waitToBeClickableAndClick(clickMedium);
        Listeners.addLogs("Clicked on dropdown ");

    }
    
    public void selectMediumDropdown() {

        UtilityFunctions.waitToBeClickableAndClick(mediumSelected);
        Listeners.addLogs("Clicked on dropdown ");

    }
    
    
    public void clickClassDropDown() {

        UtilityFunctions.waitToBeClickableAndClick(selectClass);
        Listeners.addLogs("Clicked on dropdown class ");

    }
    public void selectClassDropdown() {

        UtilityFunctions.waitToBeClickableAndClick(classSelected);
        Listeners.addLogs("select class value ");

    }
    public void clickSubjectDropdown() {

        UtilityFunctions.waitToBeClickableAndClick(clickSubjectDropDown);
        Listeners.addLogs("clickSubjectDropDown");

    }
    public void selectSubjectDropdown() {

        UtilityFunctions.waitToBeClickableAndClick(subjectSelected);
        Listeners.addLogs("Clicked on subjectSelected");

    }
   
    public void enterCopyRight(String yearValue) {

    	UtilityFunctions.scrollInToviewUsingJavaScript(copyright);
        copyright.clear();
        UtilityFunctions.waitToBeClickableAndSendKeys(copyright, yearValue);
        Listeners.addLogs("entered copywright");

    }
    public void clickSaveButtonSendForReivew() {

        UtilityFunctions.waitToBeClickableAndClick(savebuttonSendReivew);
        Listeners.addLogs("Clicked on savebutton");

    }
    public void editDetails() {

        UtilityFunctions.waitToBeClickableAndClick(editDetails);
        Listeners.addLogs("Clicked on editDetails ");

    }
    public void closeCrossIcon() {

        UtilityFunctions.waitForElementAndClickable(crossCloseEditorIcon);
        Listeners.addLogs("Clicked on crossCloseEditorIcon ");

    }
    public void assertEditDetails()
    {
        UtilityFunctions.waitForElementIsVisible(editDetails);
        UtilityFunctions.validatIsElementPresent(editDetails,"Edit details not displayed");
    }
    public void waitForContentUploadToastrMsgDisAppear()
    {
        UtilityFunctions.waitForElementToDisappear(contentUploadToastrMsg);
    }

    public void enterURLLink(String link) {
        UtilityFunctions.waitToBeClickableAndSendKeys(enterURLLink,link);
        Listeners.addLogs("entered URL Link");

    }
    public void uploadBtnInEditor() {

        UtilityFunctions.waitForElementAndClickable(uploadBtnInUploadEditor);
        Listeners.addLogs("clicked on uploadBtnInUploadEditor");

    }
    public void recontentTypeDroddown() {
        UtilityFunctions.fluenWait(contentTypeDropDown, 10);
        UtilityFunctions.waitForElementIsVisible(contentTypeDropDown);
        UtilityFunctions.clickUsingJavaScriptExecutor(contentTypeDropDown);
        //    UtilityFunctions.waitToBeClickableAndClick(contentTypeDropDown);
        Listeners.addLogs("Clicked contentType");

    }
    public void clickReplaceandUpload() {
        UtilityFunctions.waitForElementIsVisible(replaceAndUpload);
        UtilityFunctions.clickUsingJavaScriptExecutor(replaceAndUpload);
        Listeners.addLogs("clicked on uploadBtnInUploadEditor");
    }
    public void clickcopy() {
        UtilityFunctions.waitForElementAndClickable(clickcopy);
        Listeners.addLogs("clicked on copy button");
    }
    public void clickCloseEditorIcon() {

        UtilityFunctions.waitForElementAndClickable(editorCloseIcon);
        Listeners.addLogs("editor closed");

    }
    public void clickDownloadPreview() {
        UtilityFunctions.waitForElementAndClickable(clickDownloadPreview);
        Listeners.addLogs("clicked on download button");
    }
    public void assertContentDowloadedMsg() {
        UtilityFunctions.getTextFromElement(contentDownloadStartedMsg);
        UtilityFunctions.fluenWait(contentDownloadStartedMsg, 2);
        UtilityFunctions.waitForVisibilityOfWebElement(contentDownloadStartedMsg);
        String actual = UtilityFunctions.getTextFromElement(contentDownloadStartedMsg);
        System.out.println(actual);
        UtilityFunctions.stringValueComparision(actual, SunbirdConstants.contentDownloadStartedMsg, "Content not downloaded");

    }
    public void clickLimitedSharing() {
        UtilityFunctions.waitForElementAndClickable(limitedSharing);
        Listeners.addLogs("Clicked Limited Sahring");

    }
    public void clickLimitedSharingDropDown() {
        UtilityFunctions.waitForElementAndClickable(limitedSharingDropDown);
        Listeners.addLogs("Clicked Limited Sharing");

    }
    public void assertUploadContent() {
        UtilityFunctions.validatIsElementPresent(uploadcontent, "Upload Content option is not displayed");
    }
}