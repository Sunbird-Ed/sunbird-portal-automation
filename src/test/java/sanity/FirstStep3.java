package sanity;

import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageActions.*;
import com.sunbird.PageObjects.HomeTabPage;
import org.testng.annotations.Test;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageActions.OnBoardingActions;

import java.io.File;

public class FirstStep3 extends BaseTestConfig {

	/*@Test(description = "Verify that the Book creator is able to add the courses to the nodes by searching the course name, do_id from add from library page")
	public void BookCreatorAbleToAddCourseIntoTextbookUsingCourseNameAndDoIDFromAddLibrarySection() throws Exception {

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
		BookPageActions.assertContentIsSavedToastrMsg();
		BookPageActions.waitContentIsSavedToastToDisapper();
		BookPageActions.clickAddChild();
		BookPageActions.addDifferentResourceTypeInLibrarySection("Course");
		BookPageActions.clickOnAddChildLeftSectionUnit();
		BookPageActions.addDifferentResourceTypeInLibrarySection(sunbird_config.getSunbidConfigPropertyValue("CourseDOIDwithoutCertificate"));
		BookPageActions.clickSaveAsDrafts();
	}*/
	/*@Test(description = "User should be able to edit the publsihed textbook")
	public void UserAbleToEditPublishedTextBookAndRePublishTextBook() throws Exception {

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
		BookPageActions.assertContentIsSavedToastrMsg();
		BookPageActions.waitContentIsSavedToastToDisapper();
		BookPageActions.addResourceInLibrarySection("Mp4");
		BookPageActions.submitAndSendForReview();
		DashboardPageActions.logOut();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.clickOnWorkSpace();
		ReviewPageActions.reviewAndPublishContent(createdContent, "Book");
		DashboardPageActions.logOut();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.assertWorkspace();
		DashboardPageActions.clickOnWorkSpace();
		WorkspaceDashboardPageActions.clickPublishedBucket();
		AllMyContentPageActions.enterContentInSearchBox(createdContent);
		PublishedPageActions.clickFirstCard();
		UtilityFunctions.scrollDownUsingPixelValue();
		UtilityFunctions.scrollDownUsingPixelValue();
		BookPageActions.selectMultipleBMCDropdownSelectionSection2();
		BookPageActions.Section3();
		BookPageActions.assertContentIsSavedToastrMsg();
		BookPageActions.waitContentIsSavedToastToDisapper();
		BookPageActions.submitAndSendForReview();
		DashboardPageActions.logOut();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.clickOnWorkSpace();
		ReviewPageActions.reviewAndPublishContent(createdContent, "Book");
	}*/

	/*@Test(description = "Verify that if the book creator is able to copy a book")
	public void CreatorAbleToCopyThePublishedBook() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickDigitalTextbookTab();
		DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("Textbook"));
		BookPageActions.clickCopyButton();
		BookPageActions.assertCopyToastrMsg();
		BookPageActions.waitCopyToastrMsgDisAppear();
		BookPageActions.BMCDropdownSelectionSection2();
		BookPageActions.clickSaveAsDrafts();
	}*/

	/*@Test(description = "Verify creator is able to fill the details in the root node and click on save as draft button")
	public void FillDetailsInRootNodeForCollectionAndSaveAsDraft() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.assertWorkspace();
		DashboardPageActions.clickOnWorkSpace();
		WorkspaceDashboardPageActions.clickCollection();
		String createdContent = CollectionPageActions.createCollectionPopupSection1("Content Playlist", "getdoid");
		BookPageActions.BMCDropdownSelectionSection2();
		BookPageActions.Section3();
		BookPageActions.assertContentIsSavedToastrMsg();
		BookPageActions.waitContentIsSavedToastToDisapper();

	}*/

	/*@Test(description = "Verify that the user with Admin role should be able to see All Textbook option in Workspace")
	public void UserWithAdminRoleAbleToSeeAllTextBookOptionInWorkspace() throws Exception {
		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
			LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("TN_ORGADMIN"),
				sunbird_config.getSunbidConfigPropertyValue("TN_ORGADMIN_PWD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.clickOnWorkSpace();
		WorkspaceDashboardPageActions.clickAllTextBookOption();
		AllMyContentPageActions.clickFirstCard();
	}*/

	@Test(description = "Verify user is able to edit the published course")
	public void userAbleToEditPublishedCourseAndRePublishCourse() throws Exception {

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
		BookPageActions.assertContentIsSavedToastrMsg();
		BookPageActions.waitContentIsSavedToastToDisapper();
		BookPageActions.addResourceFromLibrary();
		BookPageActions.submitAndSendForReview();
		DashboardPageActions.logOut();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.clickOnWorkSpace();
		ReviewPageActions.reviewAndPublishContent(createdContent, "Course");
		DashboardPageActions.logOut();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.assertWorkspace();
		DashboardPageActions.clickOnWorkSpace();
		WorkspaceDashboardPageActions.clickPublishedBucket();
		AllMyContentPageActions.enterContentInSearchBox(createdContent);
		PublishedPageActions.clickFirstCard();
		UtilityFunctions.scrollDownUsingPixelValue();
		UtilityFunctions.scrollDownUsingPixelValue();
		BookPageActions.selectMultipleBMCDropdownSelectionSection2();
		BookPageActions.Section3();
		BookPageActions.assertContentIsSavedToastrMsg();
		BookPageActions.waitContentIsSavedToastToDisapper();
		BookPageActions.submitAndSendForReview();
		DashboardPageActions.logOut();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.clickOnWorkSpace();
		ReviewPageActions.reviewAndPublishContent(createdContent, "Course");
		DashboardPageActions.logOut();

	}

	@Test(description = "Verify user is able to copy the course to a new course")
	public void UserAbleToCopyTheCourse() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickCourseTab();
		DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("Course"));
		BookPageActions.clickCopyButton();
		BookPageActions.assertCopyToastrMsg();
		BookPageActions.waitCopyToastrMsgDisAppear();
		CoursePageActions.subjectCoveredDropdown();
		BookPageActions.BMCDropdownSelectionSection2();
		BookPageActions.clickSaveAsDrafts();

	}
	@Test(description = "Verify user is able to add textbook to the course ")
	public void UserAbleToAddTextBookToCouseInAddFromLibrarySection() throws Exception {

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
		BookPageActions.assertContentIsSavedToastrMsg();
		BookPageActions.waitContentIsSavedToastToDisapper();
		BookPageActions.addResourceInLibrarySection(sunbird_config.getSunbidConfigPropertyValue("Textbook"));
		BookPageActions.submitAndSendForReview();
		DashboardPageActions.logOut();

	}

	@Test(description = "Verify that the Book creator is able to add the courses to the nodes by searching the course name, do_id from add from library page")
	public void BookCreatorAbleToAddCourseIntoTextbookUsingCourseNameAndDoIDFromAddLibrarySection() throws Exception {

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
		BookPageActions.assertContentIsSavedToastrMsg();
		BookPageActions.waitContentIsSavedToastToDisapper();
		BookPageActions.clickAddChild();
		BookPageActions.addDifferentResourceTypeInLibrarySection("Course");
		BookPageActions.clickOnAddChildLeftSectionUnit();
		BookPageActions.addDifferentResourceTypeInLibrarySection(sunbird_config.getSunbidConfigPropertyValue("CourseDOIDwithoutCertificate"));
		BookPageActions.clickSaveAsDrafts();
	}

	@Test(description = "User should be able to edit the publsihed textbook")
	public void UserAbleToEditPublishedTextBookAndRePublishTextBook() throws Exception {

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
		BookPageActions.assertContentIsSavedToastrMsg();
		BookPageActions.waitContentIsSavedToastToDisapper();
		BookPageActions.addResourceInLibrarySection("Mp4");
		BookPageActions.submitAndSendForReview();
		DashboardPageActions.logOut();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.clickOnWorkSpace();
		ReviewPageActions.reviewAndPublishContent(createdContent, "Book");
		DashboardPageActions.logOut();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.assertWorkspace();
		DashboardPageActions.clickOnWorkSpace();
		WorkspaceDashboardPageActions.clickPublishedBucket();
		AllMyContentPageActions.enterContentInSearchBox(createdContent);
		PublishedPageActions.clickFirstCard();
		UtilityFunctions.scrollDownUsingPixelValue();
		UtilityFunctions.scrollDownUsingPixelValue();
		BookPageActions.selectMultipleBMCDropdownSelectionSection2();
		BookPageActions.Section3();
		BookPageActions.assertContentIsSavedToastrMsg();
		BookPageActions.waitContentIsSavedToastToDisapper();
		BookPageActions.submitAndSendForReview();
		DashboardPageActions.logOut();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.clickOnWorkSpace();
		ReviewPageActions.reviewAndPublishContent(createdContent, "Book");
	}

	@Test(description = "Verify that if the book creator is able to copy a book")
	public void CreatorAbleToCopyThePublishedBook() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickDigitalTextbookTab();
		DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("Textbook"));
		BookPageActions.clickCopyButton();
		BookPageActions.assertCopyToastrMsg();
		BookPageActions.waitCopyToastrMsgDisAppear();
		BookPageActions.BMCDropdownSelectionSection2();
		BookPageActions.clickSaveAsDrafts();
	}
	@Test(description = "Verify creator is able to fill the details in the root node and click on save as draft button")
	public void FillDetailsInRootNodeForCollectionAndSaveAsDraft() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.assertWorkspace();
		DashboardPageActions.clickOnWorkSpace();
		WorkspaceDashboardPageActions.clickCollection();
		String createdContent = CollectionPageActions.createCollectionPopupSection1("Content Playlist", "getdoid");
		BookPageActions.BMCDropdownSelectionSection2();
		BookPageActions.Section3();
		BookPageActions.assertContentIsSavedToastrMsg();
		BookPageActions.waitContentIsSavedToastToDisapper();

	}
	@Test(description = "Verify that the user with Admin role should be able to see All Textbook option in Workspace")
	public void UserWithAdminRoleAbleToSeeAllTextBookOptionInWorkspace() throws Exception {
		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("TN_ORGADMIN"),
				sunbird_config.getSunbidConfigPropertyValue("TN_ORGADMIN_PWD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.clickOnWorkSpace();
		WorkspaceDashboardPageActions.clickAllTextBookOption();
		AllMyContentPageActions.clickFirstCard();
	}
}