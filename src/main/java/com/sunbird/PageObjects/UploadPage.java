package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
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
	String getActualText=	UtilityFunctions.getTextFromElement(contentUploadToastrMsg);
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
}