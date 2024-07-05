package com.sunbird.PageActions;

import org.openqa.selenium.support.PageFactory;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.DashboardPage;
import com.sunbird.PageObjects.HelpPage;

public class HelpPageActions extends BaseTestConfig {
	
	public static void assertFAQSection() throws InterruptedException {
		HelpPage helpPage = PageFactory.initElements(driver, HelpPage.class);
		
		helpPage.assertFAQ();
		helpPage.ClickOnFAQ();
		helpPage.ClickYesButton();
			
		String actualMsg1 = helpPage.assertYesClickedFeedback();
		UtilityFunctions.stringValueComparision(actualMsg1, SunbirdConstants.assertYesClickedFeedback, "Feedback is not displayed");
		Listeners.addLogs("Feedback is displayed ");
			
		}
	//Verify Report Other Issue button in help page
	public static void VerifyReportOtherIssue() {
		HelpPage helpPage = PageFactory.initElements(driver, HelpPage.class);
		helpPage.reportOtherIssueButton();
	}
	//Verify Course and Certificate Category
	public static void ClickOnCourseAndCertificateCategory() {
		HelpPage helpPage = PageFactory.initElements(driver, HelpPage.class);
		helpPage.courseAndCertificateCategory();

	}
	//Verify FAQ of Course and Certificate Category
	public static void assertFAQInCourseCategory() {
		HelpPage helpPage = PageFactory.initElements(driver, HelpPage.class);
		String actualMsg1 = helpPage.FAQInCourseCategory();
		UtilityFunctions.stringValueComparision(actualMsg1, SunbirdConstants.FAQInCourseCategory, "Course progress FAQ is not displayed");
		Listeners.addLogs("Course progress FAQ is displayed ");
	}
	//Verify FAQ of Course and Certificate Category in Kannada language
	public static void assertCourseProgressFAQInKannadaLanguage() {
		HelpPage helpPage = PageFactory.initElements(driver, HelpPage.class);
		//	UtilityFunctions.scrollUpUsingPixelValue();
		String actualMsg1 = helpPage.courseProgressFAQInKannadaLanguage();
		UtilityFunctions.stringValueComparision(actualMsg1, SunbirdConstants.courseProgressFAQInKannadaLanguage, "Course progress FAQ is not displayed in Kannada");
		Listeners.addLogs("Course progress FAQ is displayed in Kannada");
	}

	public static void ClickReportOtherIssue() {
		HelpPage helpPage = PageFactory.initElements(driver, HelpPage.class);
		helpPage.ClickReportOtherIssue();

	}

	public static void clickOnSelectCategory() {
		HelpPage helpPage = PageFactory.initElements(driver, HelpPage.class);
		helpPage.selectCategory();

	}

	public static void selectCategoryFromDropdown() {
		HelpPage helpPage = PageFactory.initElements(driver, HelpPage.class);
		helpPage.selectCategoryFromDropdown();

	}

	public static void clickOnSelectSubCategory() {
		HelpPage helpPage = PageFactory.initElements(driver, HelpPage.class);
		helpPage.selectSubCategory();

	}

	public static void selectSubCategoryFromDropdown() {
		HelpPage helpPage = PageFactory.initElements(driver, HelpPage.class);
		helpPage.selectSubCategoryFromDropdown();

	}

	public static void enterTextInTellUsMoreTextField() {
		HelpPage helpPage = PageFactory.initElements(driver, HelpPage.class);
		helpPage.enterTextInTellUsMoreTextField("Content Quality");
	}

	public static void clickOnSubmitFeedbackBtn() {
		HelpPage helpPage = PageFactory.initElements(driver, HelpPage.class);
		helpPage.submitFeedbackBtn();

	}

	public static void validateFeedbackToaster() {
		HelpPage helpPage = PageFactory.initElements(driver, HelpPage.class);
		String actualMsg1 = helpPage.feedbackToaster();
		UtilityFunctions.stringValueComparision(actualMsg1, SunbirdConstants.FeedbackToaster, "Feedback Toaster is not displayed");
		Listeners.addLogs("Feedback Toaster is displayed ");

	}
	//Verify the organization of the Help page
	public static void validateHelpPage() {
		HelpPage helpPage = PageFactory.initElements(driver, HelpPage.class);
		helpPage.selectCategorySection();
		helpPage.videosInHelpPage();
		helpPage.assertFAQ();

	}

	public static void assertDebugMode() {
		HelpPage helpPage = PageFactory.initElements(driver, HelpPage.class);
		helpPage.assertDebugMode();

	}

	public static void clickOnDebugMode() {
		HelpPage helpPage = PageFactory.initElements(driver, HelpPage.class);
		helpPage.clickOnDebugMode();

	}

	public static void clickOnEnableDebugMode() {
		HelpPage helpPage = PageFactory.initElements(driver, HelpPage.class);
		helpPage.enableDebugMode();

	}

	public static void validateDebugModeToaster() {
		HelpPage helpPage = PageFactory.initElements(driver, HelpPage.class);
		String actualMsg1 = helpPage.debugModeToaster();
		UtilityFunctions.stringValueComparision(actualMsg1, SunbirdConstants.debugModeToaster, "Debug mode Toaster is not displayed");
		Listeners.addLogs("Debug mode Toaster is displayed ");

	}
	public static void assertDebugModeTextAfterEnabled() {
		HelpPage helpPage = PageFactory.initElements(driver, HelpPage.class);
		String actualMsg1 = helpPage.debugModeTextAfterEnabled();
		UtilityFunctions.stringValueComparision(actualMsg1, SunbirdConstants.debugModeTextAfterEnabled, "Debug mode Toaster is not displayed");
		Listeners.addLogs("Debug mode Toaster is displayed ");

	}

}
