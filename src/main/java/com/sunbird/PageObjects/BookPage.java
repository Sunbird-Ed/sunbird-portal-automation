package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class BookPage {
  
	@FindBy(how=How.XPATH,using="//input[@placeholder='Name']")
	private WebElement bookname;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Start creating')]")
	private WebElement startCreating;

    @FindBy(how=How.XPATH,using="//textarea[@placeholder='Description']")
    private WebElement description;

    @FindBy(how=How.XPATH,using="//input[@aria-label='Input the keyword and press enter']")
    private WebElement keyWords;

    @FindBy(how=How.XPATH,using="//label[@for='dialcode-required_yes']")
    private WebElement yesQRCodeRequiredCheckbox;

    @FindBy(how=How.XPATH,using="//input[@placeholder='Enter code here']")
    private WebElement enterQrCode;

    @FindBy(how=How.XPATH,using="//i[@class='large blue check circle icon']")
    private WebElement qrCodeBlueTickIcon;

    @FindBy(how=How.XPATH,using="//i[contains(@class,'green check icon')]")
    private WebElement assertGreenCheckIcon;

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Board')]//following::select[@id='sb-dropdown']")
	private WebElement clickBoardDropDown;
	
	@FindBy(how=How.XPATH,using="//label[contains(text(),'Board')]//following::select[@id='sb-dropdown']//following::option")
	private WebElement boardSelected;
	
	@FindBy(how=How.XPATH,using="//li[text()='Select Medium']")
	private WebElement clickMedium;
	
	@FindBy(how=How.XPATH,using="//li[text()='Select Medium']//following::li[2]")
	private WebElement mediumSelected;
	
	@FindBy(how=How.XPATH,using="//li[text()='Select Class']")
	private WebElement clickClass;
	
	@FindBy(how=How.XPATH,using="//li[text()='Select Class']//following::li[3]")
	private WebElement classSelected;
	
	@FindBy(how=How.XPATH,using="//li[text()='Select Subject']")
	private WebElement clickSubject;
	
	@FindBy(how=How.XPATH,using="//li[text()='Select Subject']//following::li[2]")
	private WebElement subjectSelected;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Copyright Year']")
	private WebElement copyright;
	
	@FindBy(how=How.XPATH,using="//button[text()=' Save as Draft ']")
	private WebElement SaveAsDraft;
	
	@FindBy(how=How.XPATH,using="//button[text()=' Add Child ']")
	private WebElement AddChild;
	
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Add from library')]")
	private WebElement addFromLibraryButton;
	@FindBy(how=How.XPATH,using="//input[@id='searchInputField']")
	private WebElement searchContentFromLibrary;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Select content')]")
	private WebElement selectButton;
	@FindBy(how=How.XPATH,using="//button[@id='addResource']")
	private WebElement addContent;
	
	@FindBy(how=How.XPATH,using="//i[contains(@class,'arrow left icon')]")
	private WebElement contentFromLibrayBackButton;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Send for Review')]")
	private WebElement submitForreviewButton;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'I agree that by submitting / publishing this Content,')]")
	private WebElement termsAndConditionCheckbox;
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Accepting Terms & Conditions')]//following::button")
	private WebElement submitButtonInSendReview;
	
	@FindBy(how=How.XPATH,using="//strong[contains(text(),'Content is sent for review')]")
	private WebElement assertSendForReviewToastrMsg;

    @FindBy(how=How.XPATH,using="//i[@Class='icon caret down']")
    private WebElement qrCodeDropdown;

    @FindBy(how=How.XPATH,using="//*[contains(text(),'QR Code ')]//following::span[contains(text(),'Generate')]")
    private WebElement clickGenerateQRCodeBtn;

    @FindBy(how=How.XPATH,using="//input[@inputmode='numeric']")
    private WebElement NoOfQRCode;

    @FindBy(how=How.XPATH,using="//button[text()='Request']")
    private WebElement RequestButton;

    @FindBy(how=How.XPATH,using="//strong[contains(text(),'QR code generated.')]")
    private WebElement assertGeneratedQRCodeToastrMsg;

    @FindBy(how=How.XPATH,using="//*[@class='icon download']")
    private WebElement DownloadQRCode;

    @FindBy(how=How.XPATH,using="//strong[contains(text(),'QR codes downloaded')]")
    private WebElement assertDownloadQRCodeToastrMsg;

    @FindBy(how=How.XPATH,using="//i[@class='icon ellipsis vertical h-1']")
    private WebElement verticalEllipsisMenu;

    @FindBy(how=How.XPATH,using="//span[contains(text(),' Download folders as csv file')]")
    private WebElement downloadfolderAsCSVFile;

    @FindBy(how=How.XPATH,using="//span[@id='removeNodeIcon']//preceding::span[1]")
    private WebElement childUnitClick;

    @FindBy(how=How.XPATH,using="//button[@title='Copy']")
    private WebElement clickCopy;

    @FindBy(how=How.XPATH,using="//strong[contains(text(),'Content successfully copied')]")
    private WebElement assertCopyToastrMsg;

    @FindBy(how=How.XPATH,using="//strong[contains(text(),'Content is added to the folder')]")
    private WebElement assertContentAddedToFolderToastrMSg;

    @FindBy(how=How.XPATH,using="//strong[contains(text(),'Content is saved')]")
    private WebElement assertContentSavedToastMsg;

    @FindBy(how=How.XPATH,using="//button[contains(text(),'Copy as course')]")
    private WebElement copyAsCourse;

    @FindBy(how=How.XPATH,using="//label[@for='checkbox']")
    private WebElement selectAllInCopyAsCourse;

    @FindBy(how=How.XPATH,using="//button[contains(text(),'Create')] ")
    private WebElement clickCreateInCopyAscourse;

    @FindBy(how=How.XPATH,using="//button[@aria-label='back']")
    private WebElement backButtonInEditor;

    public void enterBookName(String randomBookName) throws InterruptedException {

                      UtilityFunctions.waitToBeClickableAndSendKeys(bookname, randomBookName);
					       

    }
    public void clickStartCreateButton() {
    	 UtilityFunctions.waitToBeClickableAndClick(startCreating);
         Listeners.addLogs("Clicked on startcreating");
    }

    public void clickBoardDropdown() {

        UtilityFunctions.scrollDownUsingPixelValue();
      //  UtilityFunctions.scrollDownUsingPixelValue();

      //  UtilityFunctions.waitForVisibilityOfWebElement(clickBoardDropDown);
       UtilityFunctions.scrollInToviewUsingJavaScript(clickBoardDropDown);
   	 UtilityFunctions.waitToBeClickableAndClick(clickBoardDropDown);
        Listeners.addLogs("clickBoardDropDown");
   }
    public void selectBoardValue() {
   	 UtilityFunctions.waitToBeClickableAndClick(boardSelected);
        Listeners.addLogs("boardSelected");
   }
    
    public void clickMediumDropdown() {
      	 UtilityFunctions.waitToBeClickableAndClick(clickMedium);
           Listeners.addLogs("clickMedium");
      }
       public void selectMediumValue() {
      	 UtilityFunctions.waitToBeClickableAndClick(mediumSelected);
           Listeners.addLogs("mediumSelected");
      }
       
       public void clickClassDropdown() {
        	 UtilityFunctions.waitToBeClickableAndClick(clickClass);
             Listeners.addLogs("clickClass");
        }
         public void selectClassValue() {
        	 UtilityFunctions.waitToBeClickableAndClick(classSelected);
             Listeners.addLogs("classSelected");
        }
         
         public void clickSubjectDropdown() {
        	 UtilityFunctions.waitToBeClickableAndClick(clickSubject);
             Listeners.addLogs("clickSubject");
        }
         public void selectSubjectValue() {
        	 UtilityFunctions.waitToBeClickableAndClick(subjectSelected);
             Listeners.addLogs("subjectSelected");
        }
         
         public void enterCopyRightYear(String yearValue) {

         	UtilityFunctions.scrollInToviewUsingJavaScript(copyright);
             UtilityFunctions.waitToBeClickableAndSendKeys(copyright, yearValue);
             Listeners.addLogs("entered copywright");

         }

         public void assertSaveAsDraft()
         {

             UtilityFunctions.waitForVisibilityOfWebElement(SaveAsDraft);
         }

         public void clickSaveAsDraft() {
        	 UtilityFunctions.waitToBeClickableAndClick(SaveAsDraft);
             Listeners.addLogs("SaveAsDraft");
        }
         public void clikAddChild() {
        	 UtilityFunctions.waitToBeClickableAndClick(AddChild);
             Listeners.addLogs("AddChild");
        }
         
         
         public void clickAddFromLibraryBtn() {
        	 UtilityFunctions.waitToBeClickableAndClick(addFromLibraryButton);
             Listeners.addLogs("addFromLibraryButton");
        }
         
         public void searchContentInLibrary(String resourceName) throws InterruptedException {

              UtilityFunctions.waitToBeClickableAndSendKeys(searchContentFromLibrary, resourceName);
              Listeners.addLogs("entered resourceName");
             UtilityFunctions.pressEnterKeyOnWebElement(searchContentFromLibrary);
Thread.sleep(3000);
          }
         
         public void selectButtonInLibrary() {
        	 UtilityFunctions.waitToBeClickableAndClick(selectButton);
             Listeners.addLogs("selectButton");
        }
         
         public void addContentInLibrary() {
        	 UtilityFunctions.waitToBeClickableAndClick(addContent);
             Listeners.addLogs("addContent");
        }
         
         public void clickBackBtnFromLibrarysection() {
             UtilityFunctions.waitForElementAndClickable(contentFromLibrayBackButton);
             Listeners.addLogs("contentFromLibrayBackButton");
        }
         
         public void clickSubmitbtn() {
        	 UtilityFunctions.waitToBeClickableAndClick(submitForreviewButton);
             Listeners.addLogs("clicked submitForreviewButton");
        }
         public void clickTermsAndConditions() {
       	 UtilityFunctions.waitToBeClickableAndClick(termsAndConditionCheckbox);
         Listeners.addLogs("clicked termsAndConditionCheckbox");
    }
         public void clickSubmitButtonInSendForReview() {
        	 UtilityFunctions.waitToBeClickableAndClick(submitButtonInSendReview);
             Listeners.addLogs("clicked on submitButtonInSendReview");
        }
         
         public String assertSendForReviewTostrMsg() {
             UtilityFunctions.waitForVisibilityOfWebElement(assertSendForReviewToastrMsg);
             String getActualText = UtilityFunctions.getTextFromElement(assertSendForReviewToastrMsg);
             return getActualText;
         }

    public void enterDesciption(String randomDescriptionName) throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndSendKeys(description, randomDescriptionName);

    }
    public void enterKeywords(String randomKeywordName) throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndSendKeys(keyWords, randomKeywordName);
UtilityFunctions.pressEnterKeyOnWebElement(keyWords);
    }
    public void clickyesQRCodeRequiredCheckbox() throws InterruptedException {
        UtilityFunctions.scrollInToviewUsingJavaScript(yesQRCodeRequiredCheckbox);
        UtilityFunctions.waitToBeClickableAndClick(yesQRCodeRequiredCheckbox);

    }

    public void enterQrCode(String dialCodeValue) throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndSendKeys(enterQrCode, dialCodeValue);

    }
    public void clickqrCodeBlueTickIcon() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(qrCodeBlueTickIcon);

    }
    public void assertGreenTickIcon() throws InterruptedException {
        UtilityFunctions.scrollUpUsingPixelValue();
UtilityFunctions.waitForVisibilityOfWebElement(assertGreenCheckIcon);
        UtilityFunctions.validatIsElementPresent(assertGreenCheckIcon,"Entered QRCode is not valid");

    }

    public void clickQrCodeDropdown()
    {
        UtilityFunctions.waitToBeClickableAndClick(qrCodeDropdown);
Listeners.addLogs("clicked on QRCodeDropdown");
    }
    public void clickGenerateQrCode()
    {

        UtilityFunctions.waitToBeClickableAndClick(clickGenerateQRCodeBtn);
        Listeners.addLogs("clicked on GenerateQRCode");

    }
    public void enterQrCodeValue(String qrCodesize) throws InterruptedException {

        UtilityFunctions.waitForElementIsVisible(NoOfQRCode);
        NoOfQRCode.click();
        NoOfQRCode.clear();
        UtilityFunctions.waitToBeClickableAndSendKeys(NoOfQRCode, qrCodesize);
        Listeners.addLogs("Entered qrcode size and clicked on request");

    }
    public void clkRequestBtn()
    {
        UtilityFunctions.waitToBeClickableAndClick(RequestButton);
    }

    public String assertGenerateQrCodeToastrMsg() {
        UtilityFunctions.waitForVisibilityOfWebElement(assertGeneratedQRCodeToastrMsg);
        String getActualText = UtilityFunctions.getTextFromElement(assertGeneratedQRCodeToastrMsg);
        return getActualText;
    }

    public void clkDownloadQrCode()
    {
        UtilityFunctions.waitToBeClickableAndClick(DownloadQRCode);
    }
    public String assertDownloadQrCodeToastrMsg() {
        UtilityFunctions.waitForVisibilityOfWebElement(assertDownloadQRCodeToastrMsg);
        String getActualText = UtilityFunctions.getTextFromElement(assertDownloadQRCodeToastrMsg);
        return getActualText;
    }

    public void clickVerticalEllipsisMenuIcon()
    {

        UtilityFunctions.waitForElementAndClickable(verticalEllipsisMenu);
        Listeners.addLogs("clicked on verticalEllipsis menu");

    }

    public void clickDownloadAsCSVFile()
    {

        UtilityFunctions.waitForElementAndClickable(downloadfolderAsCSVFile);
        Listeners.addLogs("clicked on downloadFolderasCSV file");

    }
    public void childUnitClick()
    {

        UtilityFunctions.waitToBeClickableAndClick(childUnitClick);
        Listeners.addLogs("clicked on childUnit");

    }
    public void pressEnterKeyOnSearchTxtbox()
    {

        UtilityFunctions.pressEnterKeyOnWebElement(searchContentFromLibrary);
    }
    public void copyButton()
    {

        UtilityFunctions.waitForElementAndClickable(clickCopy);
        Listeners.addLogs("clicked on copy button");

    }
    public String assertCopyToastrMsg() {
        UtilityFunctions.waitForVisibilityOfWebElement(assertCopyToastrMsg);
        String getActualText = UtilityFunctions.getTextFromElement(assertCopyToastrMsg);
        return getActualText;
    }

    public void waitGenerateQRCodeToastrToDisappear() {
        UtilityFunctions.waitForElementToDisappear(assertGeneratedQRCodeToastrMsg);

    }
    public void waitDownloadQRCodeToastrToDisappear() {
        UtilityFunctions.waitForElementToDisappear(assertDownloadQRCodeToastrMsg);

    }

    public String assertContentAddedFolderToastrMsg() {
        UtilityFunctions.waitForVisibilityOfWebElement(assertContentAddedToFolderToastrMSg);
        String getActualText = UtilityFunctions.getTextFromElement(assertContentAddedToFolderToastrMSg);
        return getActualText;
    }
    public void waitContentAddedToFolderToastrToDisappear() {
        UtilityFunctions.waitForElementToDisappear(assertContentAddedToFolderToastrMSg);

    }
    public String assertContentSavedToastMsg() {
        UtilityFunctions.waitForVisibilityOfWebElement(assertContentSavedToastMsg);
        String getActualText = UtilityFunctions.getTextFromElement(assertContentSavedToastMsg);
        return getActualText;
    }
    public void waitContentIsSavedToastrToDisappear() {
        UtilityFunctions.waitForElementToDisappear(assertContentSavedToastMsg);

    }
    public void waitCopyToastrMsg() {
        UtilityFunctions.waitForElementToDisappear(assertCopyToastrMsg);

    }
    public void copyAsCourse()
    {
        UtilityFunctions.waitForElementAndClickable(copyAsCourse);
        Listeners.addLogs("clicked on copyAsCourse");
    }
    public void selectAllBtn()
    {
        UtilityFunctions.waitForElementAndClickable(selectAllInCopyAsCourse);
        Listeners.addLogs("clicked on selectAllInCopyAsCourse");
    }
    public void createButtonIncopyascourse()
    {
        UtilityFunctions.waitForElementAndClickable(clickCreateInCopyAscourse);
        Listeners.addLogs("click on createInCopyAscourse");

    }
    public void backButtonEditor()
    {
        UtilityFunctions.waitForElementAndClickable(backButtonInEditor);
        Listeners.addLogs("click on backButtonInEditor");

    }
}
