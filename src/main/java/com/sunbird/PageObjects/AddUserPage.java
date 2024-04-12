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

	@FindBy(how=How.XPATH,using="//input[@type='checkbox']")
	private WebElement checkBox;

	@FindBy(how=How.XPATH,using="//button[contains(text(),' Continue ')]")
	private WebElement continueBtn;

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
}
