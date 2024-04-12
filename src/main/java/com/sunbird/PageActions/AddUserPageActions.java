package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.AddUserPage;
import com.sunbird.PageObjects.GetPage;
import org.openqa.selenium.support.PageFactory;


public class AddUserPageActions extends BaseTestConfig {

	public static void clickAddPlusIcon()
	{
		AddUserPage addUserPage = PageFactory.initElements(driver, AddUserPage.class);
		addUserPage.addPlusIcon();
	}

	public static String enterName() throws Exception {
		AddUserPage addUserPage = PageFactory.initElements(driver, AddUserPage.class);
		String name = UtilityFunctions.generateRandomName("A");
		addUserPage.enterName(name);
		return name;
	}

	public static void addUserBtnInCreation()
	{
		AddUserPage addUserPage = PageFactory.initElements(driver, AddUserPage.class);
		addUserPage.addButtonInCretion();
	}
	public static void assertAddedUserToastrMsg()
	{		AddUserPage addUserPage = PageFactory.initElements(driver, AddUserPage.class);
addUserPage.assertAddedUserToastr();

	}
	public static void clickChangeUser()
	{
		AddUserPage addUserPage = PageFactory.initElements(driver, AddUserPage.class);
		addUserPage.changeUserBtn();
	}

	public static void clickOnCreatedUser(String name) throws InterruptedException {
		String createdName = SunbirdConstants.XPATH_CONTAINS + name + SunbirdConstants.XPATH_CONAINSCLOSEBRACKET;
		UtilityFunctions.findElementAndClick(createdName);

	}
	public static void checkBoxClick()
	{
		AddUserPage addUserPage = PageFactory.initElements(driver, AddUserPage.class);
		addUserPage.checkBox();
	}
	public static void clickContinue()
	{
		AddUserPage addUserPage = PageFactory.initElements(driver, AddUserPage.class);
		addUserPage.continueBtn();
	}
}