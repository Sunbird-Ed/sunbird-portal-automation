package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.BookPage;
import com.sunbird.PageObjects.CoursePage;
import org.openqa.selenium.support.PageFactory;


public class CoursePageActions extends BaseTestConfig {


/* hanlde course editor section1 and return the content name or doid based on parameter */
	public static String createCourseSection1(String getContentType) throws Exception {
		CoursePage coursePage = PageFactory.initElements(driver, CoursePage.class);
		BookPage bookPage = PageFactory.initElements(driver, BookPage.class);

		String courseName = UtilityFunctions.generateRandomName("automationCourse");
		coursePage.enterCourseTitleName(courseName);

		String description = UtilityFunctions.generateRandomName("autoDescription");
		bookPage.enterDesciption(description);

		UtilityFunctions.scrollDownUsingPixelValue();
		String keyword = UtilityFunctions.generateRandomName("autoCourseKeyword");
		coursePage.enterCourseKeywords(keyword);


		coursePage.clickCourseType();
		coursePage.selectCourseTypeValue();
		coursePage.clicksubjectCoveredDropdown();
		coursePage.selectSubjectCoveredvalue();

		if (getContentType.equalsIgnoreCase("getContentName")) {
			return courseName;
		}
		if (getContentType.equalsIgnoreCase("getKeyword")) {
			return keyword;
		}
		else {
			return UtilityFunctions.generate_Do_id();

		}


	}


	/* Selects BMC dropdown in Course editor */
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

/* click on saveAs drafts*/
		public static void Section3() throws InterruptedException {
			BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
			bookPage.enterCopyRightYear("2024");
			Thread.sleep(5000);
			bookPage.clickSaveAsDraft();
			Thread.sleep(5000);
		}


/* add resource from Library section */
	public static void addResourceFromLibrary() throws InterruptedException {
		BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
		bookPage.clikAddChild();
		bookPage.clickAddFromLibraryBtn();
		bookPage.searchContentInLibrary("sdf");
		bookPage.selectButtonInLibrary();
		bookPage.addContentInLibrary();
		bookPage.clickBackBtnFromLibrarysection();
	}

	/* will click on submit and sendforreview */
	public static void submitAndSendForReview()
	{
		BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
		bookPage.clickSubmitbtn();
		bookPage.clickTermsAndConditions();
		bookPage.clickSubmitButtonInSendForReview();

		String actualMsg = bookPage.assertSendForReviewTostrMsg();
		UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.contentSentForReview, "Failed to send the content for review");

	}

	/* Validate the SendForReview toastrMsg */
	public static void assertSendForReviewToastrMsg()
	{
		BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
		 String actualMsg = bookPage.assertSendForReviewTostrMsg();
	        UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.contentSentForReview, "Failed to send the content for review");

	}

	public static void subjectCoveredDropdown() throws InterruptedException {
		CoursePage coursePage = PageFactory.initElements(driver, CoursePage.class);
coursePage.clicksubjectCoveredDropdown();
coursePage.selectSubjectCoveredvalue();
	}

	public static void verifyFrameworkInCourseTypeDropDown() throws Exception {
		CoursePage coursePage = PageFactory.initElements(driver, CoursePage.class);
		BookPage bookPage = PageFactory.initElements(driver, BookPage.class);

		String courseName = UtilityFunctions.generateRandomName("automationCourse");
		coursePage.enterCourseTitleName(courseName);

		String description = UtilityFunctions.generateRandomName("autoDescription");
		bookPage.enterDesciption(description);

		String keyword = UtilityFunctions.generateRandomName("autoCourseKeyword");
		coursePage.enterCourseKeywords(keyword);

		coursePage.clickCourseType();
		coursePage.selectCourseK2TypeValue();



	}

}
