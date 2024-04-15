package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.GroupsPage;
import org.openqa.selenium.support.PageFactory;

public class GroupsPageActions extends BaseTestConfig  {

	public static void clickCreateGroup() throws Exception {
		GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
groupPage.createGroup();
	}

	public static String enterGroupNameAndDesc() throws Exception {
		GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
		String groupName = UtilityFunctions.generateRandomName("autoGroup");
		String groupDesc = UtilityFunctions.generateRandomName("autoGroupDesc");
		groupPage.enterGroupName(groupName);
		groupPage.enterGroupDesc(groupDesc);
		groupPage.termsCheckBox();
		groupPage.createGroupButtnInPopup();
		return groupName;
	}
	public static void assertGroupCreatedToastrMessage()
	{
		GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
		String actualtxt=groupPage.assertGroupCreatedToastrMsg();
		UtilityFunctions.stringValueComparision(actualtxt, SunbirdConstants.groupCreationToastrMsg,"Failed to create groups");
		groupPage.waitGroupCreatedToastrMsgDisappear();
	}
public static void clickCreatedGroupCard(String createdGroupName) throws InterruptedException {
String groupsCardXpath=SunbirdConstants.xpathGroup1+createdGroupName+SunbirdConstants.xpathGrooup2;
UtilityFunctions.findElementAndClick(groupsCardXpath);

}

public static void clickGroupKababMenu()
{
	GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
groupPage.groupKababMenu();
}
	public static void assertGroupKababMenuIcon()
	{
		GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
		groupPage.assertGroupKababMenu();
	}

	public static void clickCloseCrossIcon()
	{
		GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
		groupPage.closeIconInMyGroupClick();
	}
	public static void clickEnableDiscusison()
	{
		GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
		groupPage.enableDiscussion();
	}
	public static void assertEnableDisussionToastrMsg()
	{
		GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
		String actualtxt=groupPage.assertEnableDiscussionToastr();
		UtilityFunctions.stringValueComparision(actualtxt,SunbirdConstants.enableDisussionToastrMsg,"enableDisussionToastrMsg not displayed ");
		groupPage.waitEnableDiscussionToastrMsgDisappear();
	}
	public static void clickForumIcon()
	{
		GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
		groupPage.forumIcon();
	}
	public static void assertForumIconNotDisplayed()
	{
		GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
		groupPage.validateForumIconShouldNotDisplay();
	}
	public static void assertAllOptionInsideForum()
	{
		GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
		groupPage.assertAllOptionInsideForumIconPage();
	}

	public static void clickGeneralDiscussionCard()
	{
		GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
groupPage.generalDisussionCard();
	}
	public static void clickStartCreating()
	{
		GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
		groupPage.startCreating();
	}
	public static String enterTopicNameandDescrption(String creationType) throws InterruptedException {
		GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
		String topicName = UtilityFunctions.generateRandomName("autoTopic");
		String topicDesc = UtilityFunctions.generateRandomName("autoDescTopic");
		String topicTags = UtilityFunctions.generateRandomName("autoTags");

		groupPage.enterTopicName(topicName);
		groupPage.enterTopicDescription(topicDesc);
		groupPage.enterTags(topicTags);


		switch(creationType){
			case "Update":
				groupPage.updateTopicButton();
				break;
			default:
				groupPage.submitButton();
		}

		return topicName;
	}
public static void clickCreatedTopic(String topicName) throws InterruptedException {
	String createdTopicName = SunbirdConstants.XPATH_CONTAINS + topicName + SunbirdConstants.XPATH_CONAINSCLOSEBRACKET;
	Thread.sleep(6000);
	UtilityFunctions.findElementAndClick(createdTopicName);

}
	public static void kababMenuInTopic()
	{
		GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
		groupPage.clickTopicKababMenu();
	}
	public static void editTopic()
	{
		GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
		groupPage.editTopicIcon();
	}
	public static void deleteTopic()
	{
		GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
		groupPage.deleteTopic();
	}
	public static void clickCloseIcon()
	{
		GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
		groupPage.closeIconInForum();
	}
	public static void assertCloseIcon()
	{
		GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
groupPage.assertCloseIcon();
	}
	public static void clickTags()
	{
		GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
		groupPage.tags();
	}
	public static void clickMyDisussionOption()
	{
		GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
		groupPage.myDisussionOption();
	}

	public static void clickOnAddActivity()
	{
		GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
		groupPage.addActivity();
	}
	public static void selectCourseActivity()
	{
		GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
		groupPage.courseActivity();
	}
	public static void enterContentNameInActivity(String contentName) throws InterruptedException {
		GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
		groupPage.enterContentActivityNameAndSearch(contentName);
	}
	public static void clickAddToGroup()
	{
		GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
		groupPage.addToGroup();
	}
	public static void assertActivityAddedToastrMsg()
	{
		GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
	String actual=groupPage.assertActivityAddedToastrMsg();
	UtilityFunctions.stringValueComparision(actual,SunbirdConstants.activityAddedToastrMsg,"Activity added Toastrmsg not displayed");
	}
	public static void assertAddedActivty()
	{
		GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
groupPage.assertAddedActivity();
	}
	public static void clickDisableDiscusison()
	{
		GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
		groupPage.disableDiscussion();
	}
	public static void clickDisableDiscussionInPopup()
	{
		GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
		groupPage.disableDiscussionsInPopup();
	}
	public static void assertDisableDisussionToastrMsg()
	{
		GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
		String actualtxt=groupPage.assertDisableDiscussionToastr();
		UtilityFunctions.stringValueComparision(actualtxt,SunbirdConstants.disableDisussionToastrMsg,"Disabled discussion forum Msg not displayed ");

	}
	public static void assertMessagesInDisableDiscussionsPopup()
	{
		GroupsPage groupPage = PageFactory.initElements(driver, GroupsPage.class);
		groupPage.assertMessagesinDisableDiscussionPopup();
	}
}