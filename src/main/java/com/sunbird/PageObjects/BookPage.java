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
    @FindBy(how=How.XPATH,using="//label[contains(text(),'Medium(s)')]//following::ul")
    private WebElement clickMedium2;
	
	@FindBy(how=How.XPATH,using="//li[text()='Select Medium']//following::li[2]")
	private WebElement mediumSelected;

    @FindBy(how=How.XPATH,using="//label[contains(text(),'Medium(s)')]//following::label[1]")
    private WebElement mediumSelectAll;
	
	@FindBy(how=How.XPATH,using="//li[text()='Select Class']")
	private WebElement clickClass;
	
	@FindBy(how=How.XPATH,using="//li[text()='Select Class']//following::li[3]")
	private WebElement classSelected;
    @FindBy(how=How.XPATH,using="//li[text()='Select Class']//following::li[1]")
    private WebElement classSelectAll;

	@FindBy(how=How.XPATH,using="//li[text()='Select Subject']")
	private WebElement clickSubject;
	
	@FindBy(how=How.XPATH,using="//li[text()='Select Subject']//following::li[2]")
	private WebElement subjectSelected;

    @FindBy(how=How.XPATH,using="//li[text()='Select Subject']//following::li[1]")
    private WebElement subjectSelectAll;
	
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
    @FindBy(how=How.XPATH,using="//div[contains(@class,'radio-btn-checkbox')]")
    private List<WebElement> radioButton;

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

    @FindBy(how=How.XPATH,using="//span[contains(text(),'Update folder metadata using csv file')]")
    private WebElement assertUpdateFolderOption;

    @FindBy(how=How.XPATH,using="//span[contains(text(),'Create folders using csv file')]")
    private WebElement assertCreateFolderOption;

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

    @FindBy(how=How.XPATH,using="//button[contains(text(),'Add Sibling')]")
    private WebElement AddSibling;

    @FindBy(how=How.XPATH,using="//div[@data-title='Add collaborator']")
    private WebElement addCollobratorIcon;

    @FindBy(how=How.XPATH,using="//*[@class='icon plus']")
    private List<WebElement> addCollobratorSelectionIcon;

    @FindBy(how=How.XPATH,using="//button[contains(text(),'Done')]")
    private WebElement doneBtnInAddCollobrator;

    @FindBy(how=How.XPATH,using="//strong[contains(text(),'Collaborators updated successfully')]")
    private WebElement assertAddedCollobratorToastrMsg;

    @FindBy(how=How.XPATH,using="//*[contains(text(),'Manage Collaborators')]")
    private WebElement manageCollobratorsTab;

    @FindBy(how=How.XPATH,using="//*[contains(text(),' Remove ')]")
    private WebElement assertRemoveAndClickRemove;

    @FindBy(how=How.XPATH,using="//span[contains(text(),'English,Tamil')]")
    private WebElement assertMultipleMedium;

    @FindBy(how=How.XPATH,using="//span[contains(text(),'Class 1')]")
    private WebElement assertMultipleClass1;

    @FindBy(how=How.XPATH,using="//span[contains(text(),'Class 2')]")
    private WebElement assertMultipleClass2;

    @FindBy(how=How.XPATH,using="//div[starts-with(@class,'sbcard')]")
    private List<WebElement> BookTagnameinEditor;

    @FindBy(how=How.XPATH,using="//div[contains(text(),'Showing (100) most relevant content')]")
    private WebElement showing100ContentMsg;

    @FindBy(how=How.XPATH,using="//span[contains(text(),'TextBook Unit 1')]")
    private WebElement bookElement;
    @FindBy(how=How.XPATH,using="(//span[@id='contextMenu'])[2]")
    private WebElement menuClick;
    @FindBy(how = How.XPATH, using ="//span[contains(text(),'TextBook Unit 1')]//following::span/div[@id='delete']")
    private WebElement nodeDelete;
    @FindBy(how=How.XPATH,using="//button[contains(text(),'Yes')]")
    private WebElement clickYes;

    @FindBy(how=How.XPATH,using="(//span[@class='fancytree-title'])[3]")
    private WebElement clickAddedContent;

    @FindBy(how=How.XPATH,using="//input[@aria-label='Input the keyword and PRESS enter']")
    private WebElement relKeyWord;

    @FindBy(how=How.XPATH,using="//input[@placeholder='Name of the content']")
    private WebElement relContentName;

    @FindBy(how=How.XPATH,using="//input[@type='checkbox']//following::label[contains(text(),'Track in collection')]")
    private WebElement enableTrackInCOllection;

    @FindBy(how=How.XPATH,using="//input[contains(@placeholder,'Search')]")
    private WebElement searchCollaborator;

    @FindBy(how=How.XPATH,using="//i[@aria-label='close']")
    private WebElement closeCollaborator;

    @FindBy(how=How.XPATH,using="//strong[contains(text(),'No Results Found')]")
    private WebElement noResultFoundMsg;

    @FindBy(how=How.XPATH,using="//li[contains(@class,'searchResult')]")
    private WebElement selectCollaborator;

    @FindBy(how=How.XPATH,using="//*[contains(text(),'Add Collaborators')]")
    private WebElement addCollaboratorTab;

    @FindBy(how=How.XPATH,using="//div[contains(text(),'No collaborators found for this content')]")
    private WebElement noCollaboratorsAdded;

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
    public void clickMediumDropdown2() {
        UtilityFunctions.waitToBeClickableAndClick(clickMedium2);
        Listeners.addLogs("clickMedium");
    }
       public void selectMediumValue() {
      	 UtilityFunctions.waitToBeClickableAndClick(mediumSelected);
           Listeners.addLogs("mediumSelected");
      }
    public void mediumSelectAll() {
        UtilityFunctions.waitToBeClickableAndClick(mediumSelectAll);
        Listeners.addLogs("mediumSelectAll");
    }
       public void clickClassDropdown() {
        	 UtilityFunctions.waitToBeClickableAndClick(clickClass);
             Listeners.addLogs("clickClass");
        }
         public void selectClassValue() {
        	 UtilityFunctions.waitToBeClickableAndClick(classSelected);
             Listeners.addLogs("classSelected");
        }
    public void classSelectAll() {
        UtilityFunctions.waitToBeClickableAndClick(classSelectAll);
        Listeners.addLogs("classSelectAll");
    }
         public void clickSubjectDropdown() {
        	 UtilityFunctions.waitToBeClickableAndClick(clickSubject);
             Listeners.addLogs("clickSubject");
        }
         public void selectSubjectValue() {
        	 UtilityFunctions.waitToBeClickableAndClick(subjectSelected);
             Listeners.addLogs("subjectSelected");
        }
    public void subjectSelectAll() {
        UtilityFunctions.waitToBeClickableAndClick(subjectSelectAll);
        Listeners.addLogs("subjectSelectAll");
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
    public void clickRadioButton(int i) {
        UtilityFunctions.waitToBeClickableAndClick(radioButton.get(i));

    }
         public void addContentInLibrary() {
        	 UtilityFunctions.waitToBeClickableAndClick(addContent);
             Listeners.addLogs("addContent");
        }
         
         public void clickBackBtnFromLibrarysection() {
           //  UtilityFunctions.waitForElementAndClickable(contentFromLibrayBackButton);
UtilityFunctions.waitForVisibilityOfWebElement(contentFromLibrayBackButton);
             UtilityFunctions.clickUsingJavaScriptExecutor(contentFromLibrayBackButton);
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
    public void addCollobratorIcon() {
        UtilityFunctions.waitForElementUsingForLoopAndAssert(addCollobratorIcon,5);
        UtilityFunctions.waitToBeClickableAndClick(addCollobratorIcon);
        Listeners.addLogs("Clicked on addCollobratorIcon");
    }
    public void selectCollobrator() {
        UtilityFunctions.waitForElementUsingForLoopAndAssert(addCollobratorSelectionIcon.get(2),4);
        UtilityFunctions.waitForElementAndClickable(addCollobratorSelectionIcon.get(2));
        Listeners.addLogs("Clicked on addCollobratorSelectionIcon");
    }
    public void doneBtnInAddCollobrator() {
        UtilityFunctions.scrollInToviewUsingJavaScript(doneBtnInAddCollobrator);
                UtilityFunctions.waitToBeClickableAndClick(doneBtnInAddCollobrator);
        Listeners.addLogs("Clicked on doneBtnInAddCollobrator");
    }
    public String AddedCollobratorToastrMsg() {
        UtilityFunctions.waitForVisibilityOfWebElement(assertAddedCollobratorToastrMsg);
        String getActualText = UtilityFunctions.getTextFromElement(assertAddedCollobratorToastrMsg);
        UtilityFunctions.waitForElementToDisappear(assertAddedCollobratorToastrMsg);
        return getActualText;
    }
    public void manageCollobratorTab() {
        UtilityFunctions.waitToBeClickableAndClick(manageCollobratorsTab);
        Listeners.addLogs("Clicked on manageCollobratorsTab");
    }
    public void assertAddedCollobratorInManageTab() throws InterruptedException {
        UtilityFunctions.waitForVisibilityOfWebElement(assertRemoveAndClickRemove);
        UtilityFunctions.validatIsElementPresent(assertRemoveAndClickRemove,"Collobrator didn't add");

    }
    public void assertMultipleTaggedMediumAndClass() throws InterruptedException {
        UtilityFunctions.waitForVisibilityOfWebElement(assertMultipleMedium);
        UtilityFunctions.validatIsElementPresent(assertMultipleMedium,"assertMultipleMedium not displayed");
        UtilityFunctions.validatIsElementPresent(assertMultipleClass1,"assertMultipleClass1 not displayed");
        UtilityFunctions.validatIsElementPresent(assertMultipleClass2,"assertMultipleClass2 not displayed");
Listeners.addLogs("Validated multiple tagged medium and class");
    }

    public void assertThreeDotsMenu() {
        UtilityFunctions.waitForVisibilityOfWebElement(verticalEllipsisMenu);
        UtilityFunctions.validatIsElementPresent(verticalEllipsisMenu,"3 Dots Menu is not displayed");

    }
    public void clickThreeDotsMenu() {
        UtilityFunctions.waitToBeClickableAndClick(verticalEllipsisMenu);

    }
    public void assetCreateFoldersOption() {
        UtilityFunctions.waitForVisibilityOfWebElement(assertCreateFolderOption);
        UtilityFunctions.validatIsElementPresent(assertCreateFolderOption, "Create Folder Option is not displayed");
    }

    public void assertDownloadFoldersAsCSVOption() {
        UtilityFunctions.waitForVisibilityOfWebElement(downloadfolderAsCSVFile);
        UtilityFunctions.validatIsElementPresent(downloadfolderAsCSVFile, "Downaload Folder as CSV Option is not displayed");

    }

    public void assertUpdateFolderOption() {
        UtilityFunctions.waitForVisibilityOfWebElement(assertUpdateFolderOption);
        UtilityFunctions.validatIsElementPresent(assertUpdateFolderOption, "Update Folder as CSV Option is not displayed");

    }

    public void assertAddCollaboratorButton() {
        UtilityFunctions.waitForVisibilityOfWebElement(addCollobratorIcon);
        UtilityFunctions.validatIsElementPresent(addCollobratorIcon, "Collaboration Option is not displayed");

    }
    public void assertGenerateQRCodeOption() {
        UtilityFunctions.waitForVisibilityOfWebElement(clickGenerateQRCodeBtn);
        UtilityFunctions.validatIsElementPresent(clickGenerateQRCodeBtn, "Generate QR code Option is not displayed");

    }

    public void assertDownloadQRCodeOption() {
        UtilityFunctions.waitForVisibilityOfWebElement(DownloadQRCode);
        UtilityFunctions.validatIsElementPresent(DownloadQRCode, "Download QR code Option is not displayed");

    }

    public void assertSaveAsDrafts() {
        UtilityFunctions.waitForVisibilityOfWebElement(SaveAsDraft);
        //	boolean status=SaveAsDraft.isEnabled();

        UtilityFunctions.validatIsElementPresent(SaveAsDraft, "Save As Drafts Option is not displayed");

    }

    public void assertBackButton() {
        UtilityFunctions.waitForVisibilityOfWebElement(backButtonInEditor);
        UtilityFunctions.validatIsElementPresent(backButtonInEditor, "Back button is not displayed");

    }

    public void assertAddSiblingOption() {
        UtilityFunctions.waitForVisibilityOfWebElement(AddSibling);
        UtilityFunctions.validatIsElementPresent(AddSibling, "Add Sibling is not displayed");

    }
    public void clickAddSibling() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(AddSibling);
        Listeners.addLogs("Clicked on Add Sibling");

    }
    public void assertAddChild() {
        UtilityFunctions.waitForVisibilityOfWebElement(AddChild);
        UtilityFunctions.validatIsElementPresent(AddChild, "Add Child is not displayed");

    }

    public void assertAddFromLibrary() {
        UtilityFunctions.waitForVisibilityOfWebElement(addFromLibraryButton);
        UtilityFunctions.validatIsElementPresent(addFromLibraryButton, "Add From library is not displayed");

    }

    public void assertShowing100ContentsMessage() {
        UtilityFunctions.waitForVisibilityOfWebElement(showing100ContentMsg);
        UtilityFunctions.validatIsElementPresent(showing100ContentMsg, "Showing (100) most relevant content is not displayed");

    }
    public int getBookElementSize() {
        int totalCount=UtilityFunctions.getSizeOfWebElement(BookTagnameinEditor);
        return totalCount;
    }
    public void editNodeName(String nodeName) {
        UtilityFunctions.waitToBeClickableAndSendKeys(bookname, nodeName);
        Listeners.addLogs("Node name edited");

    }
    public void clickMenu() throws InterruptedException {
         UtilityFunctions.waitToBeClickableAndClick(bookElement);
        UtilityFunctions.mouseHoverOnElement(menuClick);
        Listeners.addLogs("Clicked on Menu");

    }
    public void deleteNode() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(nodeDelete);

    }
    public void clickYesInThePopUp() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(clickYes);

    }
    public void assertDeletedNode() {
        UtilityFunctions.validatIsElementNotPresent(bookElement);
        Listeners.addLogs("NOde is deleted successfully");

    }
    public void clickAddedContent() {
        UtilityFunctions.waitToBeClickableAndClick(clickAddedContent);

    }

    public void assertAndUpdateNameOfTheContent(String randomContentName) {
        UtilityFunctions.scrollInToviewUsingJavaScript(relContentName);
        UtilityFunctions.waitToBeClickableAndSendKeys(relContentName, randomContentName);

    }
    public void assertAndUpdateKeywords(String randomKeywordName) {
        UtilityFunctions.waitToBeClickableAndSendKeys(relKeyWord, randomKeywordName);
        UtilityFunctions.pressEnterKeyOnWebElement(relKeyWord);

    }
    public void assertAndEnableTrackInCOllection() {
        UtilityFunctions.scrollInToviewUsingJavaScript(enableTrackInCOllection);
        UtilityFunctions.waitToBeClickableAndClick(enableTrackInCOllection);
    }
    public void searchCollaborator(String collaboratorName) {
        UtilityFunctions.waitToBeClickableAndSendKeys(searchCollaborator, collaboratorName);
        Listeners.addLogs("Searched Collaborator");

    }
    public void clickCloseCollaborator() {
        UtilityFunctions.waitToBeClickableAndClick(closeCollaborator);


    }
    public void noResultFound() {
        UtilityFunctions.validatIsElementPresent(noResultFoundMsg, "Collaborator found");
        Listeners.addLogs("Invalid Collaborator");

    }
    public void selectCollaborator() {
        UtilityFunctions.waitForElementIsVisible(selectCollaborator);
        UtilityFunctions.waitForElementAndClickable(selectCollaborator);
        Listeners.addLogs("Selected Collaborator");
    }

    public void collaboratorNotePresent() {
        UtilityFunctions.validatIsElementNotPresent(assertRemoveAndClickRemove);
        Listeners.addLogs("Collaborators are not Present");

    }
    public void addCollaboratorTab() {
        UtilityFunctions.waitForElementAndClickable(addCollaboratorTab);
        Listeners.addLogs("Clicked on Add COllaborator Tab");

    }

    public void assertCollaborator() {
        UtilityFunctions.validatIsElementPresent(selectCollaborator,"Collaborator Not deleted successfully");
        Listeners.addLogs("Collaborator available in All Collaborators Tab");

    }
    public void removeCollaborator() {
        UtilityFunctions.waitToBeClickableAndClick(assertRemoveAndClickRemove);
        Listeners.addLogs("Collaborator Removed");

    }
    public void noCollaboratorsAddedText() {
        UtilityFunctions.validatIsElementPresent(noCollaboratorsAdded, "Collaborator Not deleted successfully");
        Listeners.addLogs("No collaborators found for this content");

    }

}
