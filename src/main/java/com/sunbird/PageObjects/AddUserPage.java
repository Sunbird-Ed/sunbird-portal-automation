package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddUserPage {

	@FindBy(how=How.XPATH,using="//img[@alt='Add user']")
	private WebElement addUserPlusIcon;

	@FindBy(how=How.XPATH,using="//input[@name='name']")
	private WebElement enterName;

	@FindBy(how=How.XPATH,using="//button[contains(text(),' Add user ')]")
	private WebElement addUserButtonInCreation;

	@FindBy(how=How.XPATH,using="//*[contains(text(),'added successfully')]")
	private WebElement assertAddedToastrMsg;

	@FindBy(how=How.XPATH,using="//button[contains(text(),' Change user ')]")
	private WebElement changeUser;

	@FindBy(how=How.XPATH,using="//div[contains(text(),' Add user')]")
	private WebElement assertAddUserLabel;

	@FindBy(how=How.XPATH,using="//input[@type='checkbox']")
	private WebElement checkBox;

	@FindBy(how=How.XPATH,using="//button[contains(text(),' Continue ')]")
	private WebElement continueBtn;

	@FindBy(how=How.XPATH,using="//div[contains(text(),'Add another user')]")
	private WebElement assertAddAnotherUserButtonInAddUserPage;

	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter your name']//following::p")
	private WebElement assertDisplayedTextBelowNameField;

	@FindBy(how=How.XPATH,using="//button[contains(text(),' Cancel')]")
	private WebElement assertCancelButtonInAddUserPage;

	public void addPlusIcon() {
		UtilityFunctions.waitToBeClickableAndClick(addUserPlusIcon);
		Listeners.addLogs("clicked on addUserPlusIcon");
	}

	public void enterName(String userName) {
UtilityFunctions.waitForVisibilityOfWebElement(enterName);
		UtilityFunctions.waitToBeClickableAndSendKeys(enterName, userName);
		Listeners.addLogs("entered userName");

	}

	public void addButtonInCretion() {
		UtilityFunctions.waitToBeClickableAndClick(addUserButtonInCreation);
		Listeners.addLogs("clicked on addUserPlusIcon");
	}

	public void changeUserBtn() {
		UtilityFunctions.waitToBeClickableAndClick(changeUser);
		Listeners.addLogs("clicked on changeUser");
	}

	public void assertAddedUserToastr() {
		UtilityFunctions.waitForVisibilityOfWebElement(assertAddedToastrMsg);
		Listeners.addLogs("assertAddedToastrMsg validated");
	UtilityFunctions.waitForElementToDisappear(assertAddedToastrMsg);
	}

	public void checkBox() {
		UtilityFunctions.waitForElementAndClickable(checkBox);
		Listeners.addLogs("clicked on checkBox");
	}
	public void continueBtn() {
		UtilityFunctions.waitToBeClickableAndClick(continueBtn);
		Listeners.addLogs("clicked on continueBtn");
	}

	public String VerifyAddUserButtonDisplay() {
		UtilityFunctions.waitForElementIsVisible(assertAddAnotherUserButtonInAddUserPage);
		String getActualText = UtilityFunctions.getTextFromElement(assertAddAnotherUserButtonInAddUserPage);
		return getActualText;
	}

	public String assertAddUserLabel() {
		UtilityFunctions.waitForElementIsVisible(assertAddUserLabel);
		String getActualText = UtilityFunctions.getTextFromElement(assertAddUserLabel);
		return getActualText;

	}

	public String assertNameTextField() throws InterruptedException {
		String getActualText = UtilityFunctions.getAttributeValue(enterName, "placeholder");
		return getActualText;
	}



	public String assertDisplayedTextBelowNameField() throws InterruptedException {

		String getActualText = UtilityFunctions.getTextFromElement(assertDisplayedTextBelowNameField);
		return getActualText;
	}



	public void assertCancelButtonInAddUserPage() {
		UtilityFunctions.waitForElementIsVisible(assertCancelButtonInAddUserPage);
		UtilityFunctions.validatIsElementPresent(assertCancelButtonInAddUserPage,"Cancel button is not displayed");
		Listeners.addLogs("Cancel button is displayed");
	}



	public void assertAddUserButtonInAddUserPage() throws InterruptedException {
		UtilityFunctions.scrollDownUsingPixelValue();
		UtilityFunctions.validatIsElementNotPresent(addUserButtonInCreation);
		Listeners.addLogs("Add user button is disabled");

	}

}
