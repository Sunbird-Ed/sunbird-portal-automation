package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GroupsPage {

	@FindBy(how=How.XPATH,using="//*[contains(text(),' Create group ')][@type='button']")
	private WebElement createGroup;

	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter group name']")
	private WebElement enterGroupName;

	@FindBy(how=How.XPATH,using="//textarea[@formcontrolname='description']")
	private WebElement enterGroupDesception;

	@FindBy(how=How.XPATH,using="//input[@type='checkbox']")
	private WebElement termsCheckBokInCreateGroup;

	@FindBy(how=How.XPATH,using="//input[@type='checkbox']//following::button[contains(text(),' Create group ')]")
	private WebElement clickCreateGroupButtonInPopup;

	@FindBy(how=How.XPATH,using="//strong[contains(text(),'Group created successfully')]")
	private WebElement assertGroupCreationToastrMsg;

	@FindBy(how=How.XPATH,using="//div[@class='sb--card__info']//preceding::div[@title='AutomationBenJim'][1]")
	private WebElement logicToClickGroupsCreated;

	@FindBy(how=How.XPATH,using="//div[@id='group-actions']")
	private WebElement groupKababMenu;

	@FindBy(how=How.XPATH,using="//div[contains(text(),'Enable discussions')]")
	private WebElement enableDiscussions;

	@FindBy(how=How.XPATH,using="//strong[contains(text(),'Enabled discussion forum successfully')]")
	private WebElement assertEnableDiscssionToastrMsg;

	@FindBy(how=How.XPATH,using="//button[@title='Forum']")
	private WebElement forumIcon;

	@FindBy(how=How.XPATH,using="//div[contains(text(),'Disable discussions')]")
	private WebElement disableDiscussion;

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Disable discussions')]")
	private WebElement disableDisussionInPopup;

	@FindBy(how=How.XPATH,using="//strong[contains(text(),'Disabled discussion forum successfully')]")
	private WebElement assertDisableDiscussionToastrMsg;

	@FindBy(how=How.XPATH,using="//div[contains(text(),'General Discussion')]")
	private WebElement generalDiscussion;

	@FindBy(how=How.XPATH,using="//button[@id='start-discussion']")
	private WebElement startDiscussion;

	@FindBy(how=How.XPATH,using="//input[@formcontrolname='question']")
	private WebElement enterDisussionTopicName;

	@FindBy(how=How.XPATH,using="//textarea[@formcontrolname='description']")
	private WebElement enterDisussionTopicDescription;

	@FindBy(how=How.XPATH,using="//input[@formcontrolname='item']")
	private WebElement enterTags;

	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	private WebElement submitInDisussionForum;

	@FindBy(how=How.XPATH,using="//div[@id='group-actions']")
	private WebElement kebabMenuInGeneralDiscusion;

	@FindBy(how=How.XPATH,using="//div[@id='edit-topic']")
	private WebElement editTopic;

	@FindBy(how=How.XPATH,using="//div[@id='delete-topic']")
	private WebElement deleteTopic;

	@FindBy(how=How.XPATH,using="//div[contains(text(),'No Data')]")
	private WebElement assertNoDataAfterTopicDelete;

	@FindBy(how=How.XPATH,using="//button[@id='update-topic-popup']")
	private WebElement updateButtonInTopic;

	@FindBy(how=How.XPATH,using="//button[@id='close-discussion-forum']")
	private WebElement closeIcon;

	@FindBy(how=How.XPATH,using="//*[@class='icon-svg icon-svg--xs icon-close']")
	private WebElement closeIconInMyGroupsClick;

	public void createGroup() {
		UtilityFunctions.waitForElementAndClickable(createGroup);
		Listeners.addLogs("click on createGroup");
	}
	public void enterGroupName(String randomGroupName) throws InterruptedException {
		UtilityFunctions.waitToBeClickableAndSendKeys(enterGroupName, randomGroupName);

	}
	public void enterGroupDesc(String randomGroupDesc) throws InterruptedException {
		UtilityFunctions.waitToBeClickableAndSendKeys(enterGroupDesception, randomGroupDesc);

	}
	public void termsCheckBox() {
		UtilityFunctions.waitForElementAndClickable(termsCheckBokInCreateGroup);
		Listeners.addLogs("click on termsCheckBokInCreateGroup");
	}
	public void createGroupButtnInPopup() {
		UtilityFunctions.waitForElementAndClickable(clickCreateGroupButtonInPopup);
		Listeners.addLogs("click on clickCreateGroupButtonInPopup");
	}
	public String assertGroupCreatedToastrMsg() {
		UtilityFunctions.waitForVisibilityOfWebElement(assertGroupCreationToastrMsg);
		String actualText=UtilityFunctions.getTextFromElement(assertGroupCreationToastrMsg);
		Listeners.addLogs("assertGroupCreationToastrMsg validated");
		return actualText;
	}
	public void waitGroupCreatedToastrMsgDisappear() {
		UtilityFunctions.waitForElementToDisappear(assertGroupCreationToastrMsg);
	}
	public void groupKababMenu() {
		UtilityFunctions.waitForElementAndClickable(groupKababMenu);
		Listeners.addLogs("click on groupKababMenu");
	}

	public void assertGroupKababMenu()
	{
		UtilityFunctions.waitForElementIsVisible(groupKababMenu);
		UtilityFunctions.validatIsElementPresent(groupKababMenu,"Failed for load groupKababMenu Page");
	}
	public void closeIconInMyGroupClick()
	{
		UtilityFunctions.waitForElementAndClickable(closeIconInMyGroupsClick);
	}
}


