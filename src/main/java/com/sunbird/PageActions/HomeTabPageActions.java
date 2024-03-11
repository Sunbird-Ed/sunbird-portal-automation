package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
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
}
