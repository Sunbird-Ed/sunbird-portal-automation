package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PublishedPage {

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Download Course QR Code')]")
	private WebElement downloadCourseQRCode;

	@FindBy(how=How.XPATH,using="//div[@class='content']")
	private WebElement clickFirstContent;

	@FindBy(how=How.XPATH,using="//i[@class='icon large trash']")
	private WebElement deleteButton;

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Yes')]")
	private WebElement clickYes;

	@FindBy(how=How.XPATH,using="//strong[contains(text(),'Content deleted successfully')]")
	private WebElement contentDeleteToastrMsg;

	@FindBy(how=How.XPATH,using="//div[contains(text(),'Submit one of your drafts for review. Content is published only after a review')]")
	private WebElement assertMsg;

	public void downloadCourseQRCodeBtn() {
		UtilityFunctions.waitToBeClickableAndClick(downloadCourseQRCode);
		Listeners.addLogs("clicked on downloadCourseQRCode");
	}
	public void firstContent() {
		UtilityFunctions.waitToBeClickableAndClick(clickFirstContent);
		Listeners.addLogs("clicked on clickFirstContent");
	}
	public void verifyFirstContentInPublishedSection() {
		UtilityFunctions.waitForElementIsVisible(clickFirstContent);
		UtilityFunctions.validatIsElementPresent(clickFirstContent,"Content not displayed");
		Listeners.addLogs("verified FirstContent");
	}
	public void deleteContent() {
		UtilityFunctions.waitToBeClickableAndClick(deleteButton);
		Listeners.addLogs("Clicked on deleted button");
	}

	public void clickYesonConfirmDeletePopup() throws InterruptedException {
		UtilityFunctions.fluenWait(clickYes, 2);
		UtilityFunctions.waitForVisibilityOfWebElement(clickYes);
		UtilityFunctions.waitToBeClickableAndClick(clickYes);
		Listeners.addLogs("clicked on Yes on delete pop-up");

	}
	public void waitForContentDeletedToastrMsgDisAppear()
	{
		UtilityFunctions.waitForElementToDisappear(contentDeleteToastrMsg);
	}

	public void assertDeletedContentMsg() {
		UtilityFunctions.getTextFromElement(contentDeleteToastrMsg);
		UtilityFunctions.fluenWait(contentDeleteToastrMsg, 2);
		UtilityFunctions.waitForVisibilityOfWebElement(contentDeleteToastrMsg);
		String actual = UtilityFunctions.getTextFromElement(contentDeleteToastrMsg);
		System.out.println(actual);
		UtilityFunctions.stringValueComparision(actual, SunbirdConstants.contentDeletedToastrMsg, "Content deleted toastr message is not available");

	}
	public void assertNoContentMsg() {
		UtilityFunctions.fluenWait(assertMsg, 2);
		UtilityFunctions.waitForVisibilityOfWebElement(assertMsg);
		UtilityFunctions.validatIsElementPresent(assertMsg, "Content not deleted");
	}
}
