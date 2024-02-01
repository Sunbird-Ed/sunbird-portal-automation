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
         
         public void searchContentInLibrary(String resourceName) {

              UtilityFunctions.waitToBeClickableAndSendKeys(searchContentFromLibrary, resourceName);
              Listeners.addLogs("entered resourceName");

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
        	 UtilityFunctions.waitToBeClickableAndClick(contentFromLibrayBackButton);
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

}
