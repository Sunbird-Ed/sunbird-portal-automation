package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.BookPage;
import com.sunbird.PageObjects.CoursePage;
import org.openqa.selenium.support.PageFactory;


public class CoursePageActions extends BaseTestConfig {



	public static String createCourseSection1(String getContentType) throws Exception {
		CoursePage coursePage = PageFactory.initElements(driver, CoursePage.class);
		BookPage bookPage = PageFactory.initElements(driver, BookPage.class);

		String courseName = UtilityFunctions.generateRandomName("automationCourse");
		coursePage.enterCourseTitleName(courseName);

		String description = UtilityFunctions.generateRandomName("autoDescription");
		bookPage.enterDesciption(description);

		String keyword = UtilityFunctions.generateRandomName("autoKeyword");
		coursePage.enterCourseKeywords(keyword);


		coursePage.clickCourseType();
		coursePage.selectCourseTypeValue();
		coursePage.clicksubjectCoveredDropdown();
		coursePage.selectSubjectCoveredvalue();

		if (getContentType.equalsIgnoreCase("getContentName")) {
			return courseName;
		} else {

			return UtilityFunctions.generate_Do_id();

		}


	}



	public static void BMCDropdownSelectionSection2() throws InterruptedException {
		Thread.sleep(5000);
		BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
				bookPage.clickBoardDropdown();
		bookPage.selectBoardValue();
		bookPage.clickMediumDropdown();
		bookPage.selectMediumValue();
		Thread.sleep(2000);
		bookPage.clickClassDropdown();
		Thread.sleep(2000);
		bookPage.selectClassValue();
		bookPage.clickSubjectDropdown();
		bookPage.selectSubjectValue();
		}


		public static void Section3() throws InterruptedException {
			BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
			bookPage.enterCopyRightYear("2024");
			Thread.sleep(5000);
			bookPage.clickSaveAsDraft();
			Thread.sleep(5000);
		}



	public static void addResourceFromLibrary()
	{
		BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
		bookPage.clikAddChild();
		bookPage.clickAddFromLibraryBtn();
		bookPage.searchContentInLibrary("sdf");
		bookPage.selectButtonInLibrary();
		bookPage.addContentInLibrary();
		bookPage.clickBackBtnFromLibrarysection();
	}
	
	public static void submitAndSendForReview()
	{
		BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
		bookPage.clickSubmitbtn();
		bookPage.clickTermsAndConditions();
		bookPage.clickSubmitButtonInSendForReview();

		String actualMsg = bookPage.assertSendForReviewTostrMsg();
		UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.contentSentForReview, "Failed to send the content for review");

	}
	public static void assertSendForReviewToastrMsg()
	{
		BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
		 String actualMsg = bookPage.assertSendForReviewTostrMsg();
	        UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.contentSentForReview, "Failed to send the content for review");

	}
}
