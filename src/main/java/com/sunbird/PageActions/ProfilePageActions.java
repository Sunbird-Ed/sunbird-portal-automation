package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageObjects.GetPage;
import com.sunbird.PageObjects.ProfilePage;
import org.openqa.selenium.support.PageFactory;


public class ProfilePageActions extends BaseTestConfig {


	public static void assertGuestName() throws Exception {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.verifyGuestName();

	}
	public static void assertRole() throws Exception {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.verifyRoleName();

	}
	public static void assertDistrictAndStateWithEditBtn() throws Exception {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.verifyLocationDetailsWithEditBtn();

	}
	public static void assertBMCWithEditBtn() throws Exception {
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		profilePage.verifyBMCDetailsWithEditBtn();

	}

}