package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.BatchPage;
import com.sunbird.PageObjects.BookPage;
import com.sunbird.PageObjects.GroupsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
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
public static void clickCreatedGroupCard(String createdGroupName)
{
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

}