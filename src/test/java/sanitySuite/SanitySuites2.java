package sanitySuite;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageActions.*;
import org.testng.annotations.Test;

public class SanitySuites2 extends BaseTestConfig {


	@Test(description = "User able to see sections in HomePage")
	public void VerifyHomePageSection() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickHomeTab();
		HomeTabPageActions.validateContinueLearningSection();
		HomeTabPageActions.validateBrowseBySubjectSection();
		HomeTabPageActions.validateBrowseByCategoriesSection();
		HomeTabPageActions.validateRecentlyPublishedSection();
	}

	@Test(description = "createCollectionAndVerify")
	public void createCollectionAndVerify() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.assertWorkspace();
		DashboardPageActions.clickOnWorkSpace();
		WorkspaceDashboardPageActions.clickCollection();
		String createdContent = CollectionPageActions.createCollectionPopupSection1("Content Playlist","getdoid");
		BookPageActions.BMCDropdownSelectionSection2();
		BookPageActions.Section3();
		BookPageActions.addResourceFromLibrary();
		BookPageActions.submitAndSendForReview();
		DashboardPageActions.logOut();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.clickOnWorkSpace();
		ReviewPageActions.reviewAndPublishContent(createdContent, "Collection");

	}

	@Test(description = "Create Book with DifferentResourceType")
	public void createBookwithDifferentResourceType() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.assertWorkspace();
		DashboardPageActions.clickOnWorkSpace();
		WorkspaceDashboardPageActions.clickBook();
		String createdContent = BookPageActions.createBookPopup("getdoid");
		String des = BookPageActions.section1("getdescription");
		BookPageActions.BMCDropdownSelectionSection2();
		BookPageActions.Section3();
		BookPageActions.clickAddChild();
		BookPageActions.addDifferentResourceTypeInLibrarySection("Resource");
		BookPageActions.clickOnAddChildLeftSectionUnit();
		BookPageActions.addDifferentResourceTypeInLibrarySection("Collection");
		BookPageActions.clickSaveAsDrafts();
	}

	@Test(description = "Create course with DifferentResourceType")
	public void CreateCourseWithAllResourceType() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.assertWorkspace();
		DashboardPageActions.clickOnWorkSpace();
		WorkspaceDashboardPageActions.clickCourse();
		String createdContent = CoursePageActions.createCourseSection1("getdoid");
		BookPageActions.BMCDropdownSelectionSection2();
		BookPageActions.Section3();
		BookPageActions.clickAddChild();
		BookPageActions.addDifferentResourceTypeInLibrarySection("Resource");
		BookPageActions.clickOnAddChildLeftSectionUnit();
		BookPageActions.addDifferentResourceTypeInLibrarySection("Collection");
		BookPageActions.addDifferentResourceTypeInLibrarySection("Youtube");
		BookPageActions.addDifferentResourceTypeInLibrarySection("Pdf");
		BookPageActions.addDifferentResourceTypeInLibrarySection("Epub");
		BookPageActions.addDifferentResourceTypeInLibrarySection("h5p");
		BookPageActions.addDifferentResourceTypeInLibrarySection("Courses");
		BookPageActions.clickSaveAsDrafts();


	}

	@Test(description = "Select questions from pick question page and SendForReview")
	public void selectQuestionFromQuestionSetPage() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.clickOnWorkSpace();
		WorkspaceDashboardPageActions.clickResource();
		String createdContent = ResourcePageActions.createResourcePopup("getContentName");
		QuestionSetPageActions.clickAddQuestionSetIcon();

		QuestionSetPageActions.selectFirstQuestionInList();
		QuestionSetPageActions.clkNextButtonInQuestionPage();
		QuestionSetPageActions.enterQuestionSetTitle();
		QuestionSetPageActions.clkAddButtonInQuestionTitlePage();
		ResourcePageActions.saveAndCloseIcon();
		ResourcePageActions.resourceSendForReview();

	}


	@Test(description = "Content creator should have created atleast one content and sent for review")
	public void createContentAndSendForReview() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.assertWorkspace();
		DashboardPageActions.clickOnWorkSpace();
		WorkspaceDashboardPageActions.clickBook();
		String createdContent = BookPageActions.createBookPopup("getdoid");
		String des=BookPageActions.section1("getdescription");

		BookPageActions.BMCDropdownSelectionSection2();
		BookPageActions.Section3();
		BookPageActions.addResourceFromLibrary();
		BookPageActions.submitAndSendForReview();
		DashboardPageActions.logOut();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.clickOnWorkSpace();
		ReviewPageActions.reviewAndPublishContent(createdContent, "Book");

	}
	@Test(description = "Verify that if the book creator is able to copy a book")
	public void creatorAbleToCopyBook() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickDigitalTextbookTab();
		DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("Textbook"));
		BookPageActions.clickCopyButton();
		BookPageActions.assertCopyToastrMsg();
		BookPageActions.BMCDropdownSelectionSection2();
		BookPageActions.clickSaveAsDrafts();


	}

@Test(description = "Verify that if the course creator is able to copy a course.\n")
	public void userAbleToCopyTheCourse() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickCourseTab();
		DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("Course"));
		BookPageActions.clickCopyButton();
		BookPageActions.assertCopyToastrMsg();
	CoursePageActions.subjectCoveredDropdown();
		BookPageActions.BMCDropdownSelectionSection2();
		BookPageActions.clickSaveAsDrafts();

	}
	@Test(description = "Turn toggle on/off for the shuffle and show immediate feedback in question set page")
	public void turnOnAndOffImmediateFeedbackAndShuffleQuestions() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.clickOnWorkSpace();
		WorkspaceDashboardPageActions.clickResource();
		String createdContent = ResourcePageActions.createResourcePopup("getContentName");
		QuestionSetPageActions.clickAddQuestionSetIcon();
		QuestionSetPageActions.selectFirstQuestionInList();
		QuestionSetPageActions.clkNextButtonInQuestionPage();
		QuestionSetPageActions.enterQuestionSetTitle();
		QuestionSetPageActions.clickImmediateFeedback();
		QuestionSetPageActions.clickShuffleQuestions();
		QuestionSetPageActions.clkAddButtonInQuestionTitlePage();
		ResourcePageActions.saveAndCloseIcon();
		ResourcePageActions.resourceSendForReview();

	}
	}

