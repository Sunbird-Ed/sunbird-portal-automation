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

	@FindBy(how=How.XPATH,using="//*[contains(text(),'Tags')]")
	private WebElement clickTagsOptions;

	@FindBy(how=How.XPATH,using="//*[contains(text(),'My discussion')]")
	private WebElement myDisussionOption;

	@FindBy(how=How.XPATH,using="//*[@id='recent-post']")
	private WebElement recentPost;

	@FindBy(how=How.XPATH,using="//*[@id='best-post']")
	private WebElement bestPost;

	@FindBy(how=How.XPATH,using="//*[@id='saved-post']")
	private WebElement savedPost;

	@FindBy(how=How.XPATH,using="//*[@id='upvoted-post']")
	private WebElement upvotedPost;

	@FindBy(how=How.XPATH,using="//*[@id='downvoted-post']")
	private WebElement downVotedPost;

	@FindBy(how=How.XPATH,using="//*[contains(text(),' Add activity ')]")
	private WebElement addActivity;

	@FindBy(how=How.XPATH,using="//*[@title='Course']")
	private WebElement courseActivity;

	@FindBy(how=How.XPATH,using="//input[@id='search-for-content-group']")
	private WebElement searchContentInActivityTextBox;

	@FindBy(how=How.XPATH,using="//input[@id='search-for-content-group']//following::button[1]")
	private WebElement searchIconInActivity;

	@FindBy(how=How.XPATH,using="//span[contains(text(),'Add to group')]")
	private WebElement addToGroup;

	@FindBy(how=How.XPATH,using="//div[@class='sb--card__meta']")
	private WebElement contentCard;

	@FindBy(how=How.XPATH,using="//strong[contains(text(),'Activity added successfully')]")
	private WebElement assertActivityAddedToastrMsg;

	@FindBy(how=How.XPATH,using="//div[@class='sb--card__info']")
	private WebElement assertAddedActivity;


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
UtilityFunctions.waitForElementIsVisible(closeIconInMyGroupsClick);
		UtilityFunctions.waitForElementAndClickable(closeIconInMyGroupsClick);
	}

public void enableDiscussion() {
	UtilityFunctions.waitForElementAndClickable(enableDiscussions);
	Listeners.addLogs("click on enableDiscussions");
}
	public String assertEnableDiscussionToastr() {
		UtilityFunctions.waitForVisibilityOfWebElement(assertEnableDiscssionToastrMsg);
		String actualText=UtilityFunctions.getTextFromElement(assertEnableDiscssionToastrMsg);
		Listeners.addLogs("assertEnableDiscssionToastrMsg validated");
		return actualText;
	}
	public void waitEnableDiscussionToastrMsgDisappear() {
		UtilityFunctions.waitForElementToDisappear(assertEnableDiscssionToastrMsg);
	}
	public void forumIcon() {
		UtilityFunctions.waitForElementAndClickable(forumIcon);
		Listeners.addLogs("click on forumIcon");
	}
	public void assertAllOptionInsideForumIconPage()
	{
		UtilityFunctions.waitForElementIsVisible(generalDiscussion);
		UtilityFunctions.validatIsElementPresent(generalDiscussion,"Failed for load generalDiscussion ");
		UtilityFunctions.waitForElementAndClickable(clickTagsOptions);
		UtilityFunctions.waitForElementAndClickable(myDisussionOption);
		UtilityFunctions.validatIsElementPresent(recentPost,"Failed for load recentPost");
		UtilityFunctions.validatIsElementPresent(bestPost,"Failed for load bestPost");
		UtilityFunctions.validatIsElementPresent(savedPost,"Failed for load savedPost");
		UtilityFunctions.validatIsElementPresent(upvotedPost,"Failed for load upvotedPost");
		UtilityFunctions.validatIsElementPresent(downVotedPost,"Failed for load downVotedPost");
	}
	public void generalDisussionCard() {
		UtilityFunctions.waitForElementIsVisible(generalDiscussion);
		UtilityFunctions.waitForElementAndClickable(generalDiscussion);
		Listeners.addLogs("click on generalDiscussion");
	}
	public void startCreating() {
		UtilityFunctions.waitForElementIsVisible(startDiscussion);
		UtilityFunctions.waitForElementAndClickable(startDiscussion);
		Listeners.addLogs("click on startDiscussion");
	}
	public void enterTopicName(String randomTopicName) throws InterruptedException {
		UtilityFunctions.waitForElementIsVisible(enterDisussionTopicName);
		enterDisussionTopicName.clear();
		UtilityFunctions.waitToBeClickableAndSendKeys(enterDisussionTopicName, randomTopicName);
		Listeners.addLogs("Entered topicName");

	}
	public void enterTopicDescription(String randomTopicDes) throws InterruptedException {
		UtilityFunctions.waitForElementIsVisible(enterDisussionTopicDescription);
		enterDisussionTopicDescription.clear();
		UtilityFunctions.waitToBeClickableAndSendKeys(enterDisussionTopicDescription, randomTopicDes);
		Listeners.addLogs("Entered topicDescription");

	}
	public void enterTags(String randomTopicTags) throws InterruptedException {
		UtilityFunctions.waitToBeClickableAndSendKeys(enterTags, randomTopicTags);
		UtilityFunctions.pressEnterKeyOnWebElement(enterTags);
		Listeners.addLogs("Entered tags");

	}
	public void submitButton() {
		UtilityFunctions.waitForElementAndClickable(submitInDisussionForum);
		Listeners.addLogs("click on submitInDisussionForum");
	}
	public void clickTopicKababMenu() {
		UtilityFunctions.waitForVisibilityOfWebElement(kebabMenuInGeneralDiscusion);
		UtilityFunctions.waitForElementAndClickable(kebabMenuInGeneralDiscusion);
		Listeners.addLogs("click on kebabMenuInGeneralDiscusion");
	}
	public void editTopicIcon() {
		UtilityFunctions.waitForElementAndClickable(editTopic);
		Listeners.addLogs("click on editTopic");
	}
	public void updateTopicButton() {
		UtilityFunctions.waitForElementAndClickable(updateButtonInTopic);
		Listeners.addLogs("click on editTopic");
	}
	public void deleteTopic() {
		UtilityFunctions.waitForElementAndClickable(deleteTopic);
		Listeners.addLogs("click on deleteTopic");
	}
	public void closeIconInForum() {
		UtilityFunctions.waitForElementAndClickable(closeIcon);
		Listeners.addLogs("click on closeIcon");
	}
public void assertCloseIcon()
{
	UtilityFunctions.waitForElementIsVisible(closeIcon);
	UtilityFunctions.validatIsElementPresent(closeIcon,"close icon not displayed");

}
	public void tags() {
		UtilityFunctions.waitForElementAndClickable(clickTagsOptions);
		Listeners.addLogs("click on clickTagsOptions");
	}
	public void myDisussionOption() {
		UtilityFunctions.waitForElementAndClickable(myDisussionOption);
		Listeners.addLogs("click on myDisussionOption");
	}

	public void addActivity() {
		UtilityFunctions.waitForElementAndClickable(addActivity);
		Listeners.addLogs("click on addActivity");
	}
	public void courseActivity() {
		UtilityFunctions.waitForElementAndClickable(courseActivity);
		Listeners.addLogs("click on courseActivity");
	}
	public void enterContentActivityNameAndSearch(String content) throws InterruptedException {
		UtilityFunctions.waitToBeClickableAndSendKeys(searchContentInActivityTextBox, content);
		Listeners.addLogs("entered searchContentInActivityTextBox");
		UtilityFunctions.waitForElementAndClickable(searchIconInActivity);

	}
	public void addToGroup() {
		UtilityFunctions.mouseHoverOnElement(contentCard);
		UtilityFunctions.waitForElementAndClickable(addToGroup);
		Listeners.addLogs("click on addToGroup");
	}
	public String assertActivityAddedToastrMsg() {
		UtilityFunctions.waitForVisibilityOfWebElement(assertActivityAddedToastrMsg);
		String actualText=UtilityFunctions.getTextFromElement(assertActivityAddedToastrMsg);
		Listeners.addLogs("assertActivityAddedToastrMsg validated");
		UtilityFunctions.waitForElementToDisappear(assertActivityAddedToastrMsg);
		return actualText;
	}
	public void assertAddedActivity() {
		UtilityFunctions.waitForVisibilityOfWebElement(assertAddedActivity);
	UtilityFunctions.validatIsElementPresent(assertAddedActivity,"Added activity not displayed");
	}
}
