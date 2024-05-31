package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.HomeTabPage;
import com.sunbird.PageObjects.ReviewPage;
import org.openqa.selenium.support.PageFactory;

public class HomeTabPageActions extends BaseTestConfig {

public static void validateContinueLearningSection() throws Exception {
HomeTabPage homeTabPage = PageFactory.initElements(driver, HomeTabPage.class);
homeTabPage.validateContinueLearningSection();

		}
	public static void validateBrowseBySubjectSection() throws Exception {
		HomeTabPage homeTabPage = PageFactory.initElements(driver, HomeTabPage.class);
		homeTabPage.clickContentInBrowseBySubjects();
		homeTabPage.asserContentIsDisplayed();

	}
	public static void validateBrowseByCategoriesSection() throws Exception {
		HomeTabPage homeTabPage = PageFactory.initElements(driver, HomeTabPage.class);
		homeTabPage.clickContentInBrowseByCategories();
		homeTabPage.asserContentIsDisplayed();

	}
	public static void validateRecentlyPublishedSection() throws Exception {
		HomeTabPage homeTabPage = PageFactory.initElements(driver, HomeTabPage.class);
		homeTabPage.validateContentInRecentlyPublishedSection();
	}
	public static void ValidateGuestHomePageBMG() throws Exception {
		HomeTabPage homeTabPage = PageFactory.initElements(driver, HomeTabPage.class);

		String actualMsg = homeTabPage.guestUserBoardValue();
		UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.guestUserBoardValue, "Board value is not displayed");
		Listeners.addLogs("Board is displayed ");

		String actualMsg1 = homeTabPage.guestUserMediumValue();
		UtilityFunctions.stringValueComparision(actualMsg1, SunbirdConstants.guestUserMediumValue, "Medium value is not displayed");
		Listeners.addLogs("Medium is displayed ");

		String actualMsg2 = homeTabPage.guestUserGradeValue();
		UtilityFunctions.stringValueComparision(actualMsg2, SunbirdConstants.guestUserGradeValue, "Grade value is not displayed");
		Listeners.addLogs("Grade is displayed ");
	}

	public static void ValidateLoginUserHomePageBMG() throws Exception {
		HomeTabPage homeTabPage = PageFactory.initElements(driver, HomeTabPage.class);

		String actualMsg = homeTabPage.loginUserBoardValue();
		UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.loginUserBoardValue, "Board value is not displayed");
		Listeners.addLogs("Board is displayed ");
		String actualMsg1 = homeTabPage.guestUserMediumValue();
		UtilityFunctions.stringValueComparision(actualMsg1, SunbirdConstants.guestUserMediumValue, "Medium value is not displayed");
		Listeners.addLogs("Medium is displayed ");
		String actualMsg2 = homeTabPage.loginUserGradeValue();
		UtilityFunctions.stringValueComparision(actualMsg2, SunbirdConstants.guestUserGradeValue, "Grade value is not displayed");
		Listeners.addLogs("Grade is displayed ");
	}
}
