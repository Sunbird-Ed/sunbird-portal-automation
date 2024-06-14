package com.sunbird.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;

public class HelpPage {
	
	 @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Faq(s)')]")
	    private WebElement faqSection;
	 
	 @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Faq(s)')]//following::div[2]")
	    private WebElement clickfaq;
	 
	 @FindBy(how = How.XPATH, using = "//button[@id='btn-yes']")
	    private WebElement clickYesButtonOfFAQ;
	 
	 @FindBy(how = How.XPATH, using = "//legend[@id='yes-clicked']")
	    private WebElement assertYesClicked;

	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Select category')]//following::section//following::button")
	private WebElement VerifyReportOtherIssueButton;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Course & certificates')]")
	private WebElement ClickOnCourseAndCertificateCategory;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'My profile does not reflect my course progress correctly')]")
	private WebElement assertFAQInCourseCategory;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'ನನ್ನ ಪ್ರೊಫೈಲ್ ನನ್ನ ಕೋರ್ಸಿನ ಪ್ರಗತಿಯನ್ನು ಸರಿಯಾಗಿ ತೋರಿಸುತ್ತಿಲ್ಲ')]")
	private WebElement assertCourseProgressFAQInKannadaLanguage;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Select Category')]")
	private WebElement clickOnSelectCategory;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Select Category')]//following::span[1]")
	private WebElement selectCategoryFromDropdown;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Select Subcategory')]")
	private WebElement clickOnSelectSubCategory;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Select Subcategory')]//following::span[1]")
	private WebElement selectSubCategoryFromDropdown;

	@FindBy(how = How.XPATH, using = "//textarea[@id='details']")
	private WebElement enterTextInTellUsMoreTextField;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Submit feedback')]")
	private WebElement clickOnSubmitFeedbackBtn;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Thanks for your feedback.')]")
	private WebElement assertFeedbackToaster;

	@FindBy(how = How.XPATH, using = "//section")
	private WebElement assertSelectCategorySection;

	@FindBy(how = How.XPATH, using = "(//img[@alt='Play Sample Video']")
	private WebElement assertVideos;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Developer options')]")
	private WebElement assertDebugMode;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Developer options')]//following::span")
	private WebElement clickOnDebugMode;

	@FindBy(how = How.XPATH, using = "//span[@class='slider round']")
	private WebElement clickOnEnableDebugMode;


	public void assertFAQ() {
		UtilityFunctions.waitForElementIsVisible(faqSection);
	    Listeners.addLogs("FAQs section is displayed");

	}
	
	public void ClickOnFAQ() {
		UtilityFunctions.waitForElementIsVisible(clickfaq);
		UtilityFunctions.waitToBeClickableAndClick(clickfaq);
	    Listeners.addLogs("Clicked on FAQ");
	}
	
	public void ClickYesButton() {
		UtilityFunctions.scrollDownUsingPixelValue();
	    UtilityFunctions.waitToBeClickableAndClick(clickYesButtonOfFAQ);
	    Listeners.addLogs("Yes Button Clicked");

	}
	
	public String assertYesClickedFeedback() {
	    UtilityFunctions.waitForVisibilityOfWebElement(assertYesClicked);
	    String getActualText = UtilityFunctions.getTextFromElement(assertYesClicked);
	    return getActualText;
	}
	public void reportOtherIssueButton() {
		UtilityFunctions.waitForElementIsVisible(VerifyReportOtherIssueButton);
		Listeners.addLogs("Report Other Issue button is displayed");

	}

	public void courseAndCertificateCategory() {
		UtilityFunctions.waitForElementIsVisible(ClickOnCourseAndCertificateCategory);
		UtilityFunctions.waitToBeClickableAndClick(ClickOnCourseAndCertificateCategory);
		Listeners.addLogs("Clicked on Course and Certificates FAQ");

	}

	public String FAQInCourseCategory() {
		UtilityFunctions.waitForVisibilityOfWebElement(assertFAQInCourseCategory);
		String getActualText = UtilityFunctions.getTextFromElement(assertFAQInCourseCategory);
		return getActualText;
	}

	public String courseProgressFAQInKannadaLanguage() {
		UtilityFunctions.waitForVisibilityOfWebElement(assertCourseProgressFAQInKannadaLanguage);
		String getActualText = UtilityFunctions.getTextFromElement(assertCourseProgressFAQInKannadaLanguage);
		return getActualText;
	}

	public void ClickReportOtherIssue() {
		UtilityFunctions.waitForElementIsVisible(VerifyReportOtherIssueButton);
		UtilityFunctions.waitToBeClickableAndClick(VerifyReportOtherIssueButton);
		Listeners.addLogs("Clicked on Report Other Issue button");

	}

	public void selectCategory() {
		UtilityFunctions.waitForElementIsVisible(clickOnSelectCategory);
		UtilityFunctions.waitToBeClickableAndClick(clickOnSelectCategory);
		Listeners.addLogs("Clicked on Select Category");

	}
	public void selectCategoryFromDropdown() {
		UtilityFunctions.waitForElementIsVisible(selectCategoryFromDropdown);
		UtilityFunctions.waitToBeClickableAndClick(selectCategoryFromDropdown);
		Listeners.addLogs("Selected Category from Dropdown");

	}

	public void selectSubCategory() {
		UtilityFunctions.waitForElementIsVisible(clickOnSelectSubCategory);
		UtilityFunctions.waitToBeClickableAndClick(clickOnSelectSubCategory);
		Listeners.addLogs("Clicked on Select Sub Category");

	}

	public void selectSubCategoryFromDropdown() {
		UtilityFunctions.waitForElementIsVisible(selectSubCategoryFromDropdown);
		UtilityFunctions.waitToBeClickableAndClick(selectSubCategoryFromDropdown);
		Listeners.addLogs("Selected Sub Category from Dropdown");

	}

	public void enterTextInTellUsMoreTextField(String contentName) {
		UtilityFunctions.waitForVisibilityOfWebElement(enterTextInTellUsMoreTextField);
		UtilityFunctions.waitToBeClickableAndSendKeys(enterTextInTellUsMoreTextField,contentName);
		Listeners.addLogs("Clicked on Tell Us More Text field and entered text ");

	}

	public void submitFeedbackBtn() {
		UtilityFunctions.waitForElementIsVisible(clickOnSubmitFeedbackBtn);
		UtilityFunctions.waitToBeClickableAndClick(clickOnSubmitFeedbackBtn);
		Listeners.addLogs("Clicked on Submit Feedback button");

	}

	public String feedbackToaster() {
		UtilityFunctions.waitForVisibilityOfWebElement(assertFeedbackToaster);
		String getActualText = UtilityFunctions.getTextFromElement(assertFeedbackToaster);
		return getActualText;
	}

	public void selectCategorySection() {
		UtilityFunctions.waitForElementIsVisible(assertSelectCategorySection);
		UtilityFunctions.validatIsElementPresent(assertSelectCategorySection, "Select Category Section is not displayed");
		Listeners.addLogs("Select Category Section is displayed");

	}

	public void videosInHelpPage() {
		UtilityFunctions.waitForElementIsVisible(assertVideos);
		Listeners.addLogs("Videos section is displayed");

	}

	public void assertDebugMode() {
		UtilityFunctions.waitForElementIsVisible(assertDebugMode);
		Listeners.addLogs("Debug Mode is displayed");

	}

	public void clickOnDebugMode() {
		UtilityFunctions.waitToBeClickableAndClick(clickOnDebugMode);
		Listeners.addLogs("Clicked on Debug Mode");

	}

	public void enableDebugMode() {
		UtilityFunctions.waitToBeClickableAndClick(clickOnEnableDebugMode);
		Listeners.addLogs("Debug Mode is enabled");

	}



}
