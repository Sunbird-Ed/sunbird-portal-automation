package sanity;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageActions.*;
import org.testng.annotations.Test;

public class FirstStep4 extends BaseTestConfig {


/*
	@Test(description = "consumeMp4")
	public void consumeMp4() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();

		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CUSTODIAN_Usr"),
				sunbird_config.getSunbidConfigPropertyValue("CUSTODIAN_PWD"));

		DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("Textbook"));
		ConsumptionPageActions.consumeMp4();
		ConsumptionPageActions.giveRating(3);
	}
*/

/*

	@Test(description = "user should be able to switch to created user")
	public void AddUserAndSwitch() throws Exception {
		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("ADD_USER"),
				sunbird_config.getSunbidConfigPropertyValue("ADD_PWD"));
		DashboardPageActions.clickUserProfileIcon();
		AddUserPageActions.clickAddPlusIcon();
String creadtedUserName=AddUserPageActions.enterName();
AddUserPageActions.addUserBtnInCreation();
AddUserPageActions.assertAddedUserToastrMsg();
AddUserPageActions.clickOnCreatedUser(creadtedUserName);
AddUserPageActions.clickChangeUser();
AddUserPageActions.checkBoxClick();
AddUserPageActions.clickContinue();
		OnBoardingActions.RolePoup();
		OnBoardingActions.LocationPopupForSwitchUser();

	}
*/

/*	@Test(description = "User should be displayed with the Last updated date and time (24 hours IST format) above the “Total enrolments”")
	public void verifyLastUpdatedDateAndTimeInBatchViewDashboard() throws Exception {

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
		DashboardPageActions.clickCourseTab();
		DashboardPageActions.searchContentAndClickOnContentCard(createdContent);
		BatchPageActions.clickBatchCreationBtn();
		BatchPageActions.enterBatchNameandDescription();
		BatchPageActions.clickIssueCertificateNo();
		BatchPageActions.startDate(UtilityFunctions.getTodayDate("MM/dd/yyyy"));
		BatchPageActions.endDate(3);
		BatchPageActions.enrollmentEndDate(2);
		BatchPageActions.clickTermsCheckBoxAndSubmit();
		BatchPageActions.assertBatchTostrMsg();
		UtilityFunctions.refreshPage();
		BatchPageActions.clickViewCourseDashboard();
		Thread.sleep(1000);
		BatchPageActions.clickBatchDropdown();
		BatchPageActions.selectBatchNameInDropdown();
BatchPageActions.assertLastUpdateDateAndTimeInViewDashboard();
	}*/

	/*@Test(description = "User should be able to add course content as activity to the group succssfully.")
	public void AddCourseActivityInsideGroup() throws Exception {
		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.assertWorkspace();
		DashboardPageActions.clickOnMyGroups();
		GroupsPageActions.clickCloseCrossIcon();
		GroupsPageActions.clickCreateGroup();
		String fetchGroupName = GroupsPageActions.enterGroupNameAndDesc();
		GroupsPageActions.assertGroupCreatedToastrMessage();
		GroupsPageActions.clickCreatedGroupCard(fetchGroupName);
		GroupsPageActions.assertGroupKababMenuIcon();
		GroupsPageActions.clickOnAddActivity();
		GroupsPageActions.selectCourseActivity();
		GroupsPageActions.enterContentNameInActivity("Course");
		GroupsPageActions.clickAddToGroup();
		GroupsPageActions.assertActivityAddedToastrMsg();
		GroupsPageActions.assertAddedActivty();

	}*/

	/*@Test(description = " Reviewer rejects the TV lesson type content it should  be available under Drafts bucket for creator ")
	public void RejectTVLessonTypeContent() throws Exception {
		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.clickOnWorkSpace();
		WorkspaceDashboardPageActions.clickResource();
		String createdContent = ResourcePageActions.createResourcePopup("getContentName");
		ResourcePageActions.addTriangleShape();
		ResourcePageActions.addText();
		ResourcePageActions.addNewSlide();
		ResourcePageActions.saveAndCloseIcon();
		ResourcePageActions.resourceSendForReview();
		DashboardPageActions.logOut();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.clickOnWorkSpace();
		ReviewPageActions.reviewAndRejectContent(createdContent, "Resource");
		DashboardPageActions.logOut();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.clickOnWorkSpace();
		WorkspaceDashboardPageActions.assertDrafts();
		AllMyContentPageActions.enterContentInSearchBox(createdContent);
		DraftsPageActions.clickFirstCard();


	}*/

	/*	@Test(description = "The user should be displayed with Disable Discussions option in the group details page and clicking on the same the group admin should be displayed with a pop-up.")
		public void disableDiscussionForumAndItsMessageInPopup() throws Exception {
			OnBoardingActions.RolePoup();
			OnBoardingActions.BMCPopup();
			OnBoardingActions.LocationPopup();
			LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
					sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
			DashboardPageActions.clickUserProfileIcon();
			DashboardPageActions.assertWorkspace();
			DashboardPageActions.clickOnMyGroups();
			GroupsPageActions.clickCloseCrossIcon();
			GroupsPageActions.clickCreateGroup();
			String fetchGroupName = GroupsPageActions.enterGroupNameAndDesc();
			GroupsPageActions.assertGroupCreatedToastrMessage();
			GroupsPageActions.clickCreatedGroupCard(fetchGroupName);
			GroupsPageActions.assertGroupKababMenuIcon();
			GroupsPageActions.clickGroupKababMenu();
			GroupsPageActions.clickEnableDiscusison();
			GroupsPageActions.assertEnableDisussionToastrMsg();
			UtilityFunctions.MoveByOffSet(50, 100);
			GroupsPageActions.clickForumIcon();
			GroupsPageActions.assertAllOptionInsideForum();
			GroupsPageActions.clickCloseIcon();
			GroupsPageActions.clickGroupKababMenu();
	GroupsPageActions.clickDisableDiscusison();
			GroupsPageActions.assertMessagesInDisableDiscussionsPopup();
	GroupsPageActions.clickDisableDiscussionInPopup();
	GroupsPageActions.assertDisableDisussionToastrMsg();
	GroupsPageActions.assertForumIconNotDisplayed();
		}*/
/*
	@Test(description = ".User should be able to click on the view all and close button for the My courses section")
	public void validateDetailsInCourseCardInMyCourseSection() throws Exception {
		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickCourseTab();
		CourseTabPageActions.clickViewAll();
		CourseTabPageActions.assertAllDetailsOnCourseCard();
		CourseTabPageActions.clickCloseBtn();
		CourseTabPageActions.clickViewAll();

	}*/


/*	@Test(description = "User should be able to see the correct ordering for class, medium, subjec")
	public void verifyCorrectOrderingForClassMediumSubect() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickDigitalTextbookTab();
		DashBoardFiltersPageActions.assertOrderOfMediumClassSubjectFiltres();

	}*/

/*	@Test(description = "Verify that the timer is displayed post Join Course ")
	public void validateTimerIsDisplayedForBatch() throws Exception {

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
		DashboardPageActions.clickCourseTab();
		DashboardPageActions.searchContentAndClickOnContentCard(createdContent);
		BatchPageActions.clickBatchCreationBtn();
		BatchPageActions.enterBatchNameandDescription();
		BatchPageActions.clickIssueCertificateNo();
		BatchPageActions.startDate(UtilityFunctions.getTodayDate("MM/dd/yyyy"));
		BatchPageActions.endDate(2);
		BatchPageActions.enrollmentEndDate(1);
		BatchPageActions.clickTermsCheckBoxAndSubmit();
		BatchPageActions.assertBatchTostrMsg();
		DashboardPageActions.logOut();

		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("PUBLIC_USER"),
				sunbird_config.getSunbidConfigPropertyValue("PUBLIC_PASSWORD"));
		DashboardPageActions.clickCourseTab();
		DashboardPageActions.searchContentAndClickOnContentCard(createdContent);
		BatchPageActions.clickJoinCourse();
		BatchPageActions.validateAttributesInConsentPopup();
		BatchPageActions.clickTermsCheckInConsentPopup();
		BatchPageActions.clickShareBtn();
		BatchPageActions.assertBatchEndTimeStamp();
	}*/


/*	@Test(description = "Join the discussion forum option should be shown in course content details page")
	public void verifyDiscussionForumSectionInCourseContentDetailsPage() throws Exception {

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
		DashboardPageActions.clickCourseTab();
		DashboardPageActions.searchContentAndClickOnContentCard(createdContent);
		BatchPageActions.clickBatchCreationBtn();
		BatchPageActions.enterBatchNameandDescription();
		BatchPageActions.clickIssueCertificateNo();
		BatchPageActions.clickEnableDisussionYes();
		BatchPageActions.startDate(UtilityFunctions.getTodayDate("MM/dd/yyyy"));
		BatchPageActions.endDate(3);
		BatchPageActions.enrollmentEndDate(2);
		BatchPageActions.clickTermsCheckBoxAndSubmit();
		BatchPageActions.assertBatchTostrMsg();
		DashboardPageActions.logOut();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("PUBLIC_USER"),
				sunbird_config.getSunbidConfigPropertyValue("PUBLIC_PASSWORD"));
		DashboardPageActions.clickCourseTab();
		DashboardPageActions.searchContentAndClickOnContentCard(createdContent);
		BatchPageActions.clickJoinCourse();
		BatchPageActions.validateAttributesInConsentPopup();
		BatchPageActions.clickTermsCheckInConsentPopup();
		BatchPageActions.clickShareBtn();
		GroupsPageActions.clickForumIcon();
		GroupsPageActions.assertAllOptionInsideForum();
	}*/

	@Test(description = "The user should be displayed with the kebab menu in the course progress section once course is consumed with 100%")
	public void syncProgressNowForCourse() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.assertWorkspace();
		DashboardPageActions.clickOnWorkSpace();
		UploadPageActions.uploadContent("PDF");
		UploadPageActions.clickSendForReview();
		String resourceName = UploadPageActions.sendUploadContentForReview();
		UtilityFunctions.switchToDefaultContentFrame();
		DashboardPageActions.logOut();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.clickOnWorkSpace();
		ReviewPageActions.reviewAndPublishContent(resourceName, "Upload");
		DashboardPageActions.logOut();
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
		BookPageActions.addResourceInLibrarySection(resourceName);
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
		DashboardPageActions.clickCourseTab();
		DashboardPageActions.searchContentAndClickOnContentCard(createdContent);
		BatchPageActions.clickBatchCreationBtn();
		BatchPageActions.enterBatchNameandDescription();
		BatchPageActions.clickIssueCertificateNo();
		BatchPageActions.startDate(UtilityFunctions.getTodayDate("MM/dd/yyyy"));
		BatchPageActions.endDate(2);
		BatchPageActions.enrollmentEndDate(1);
		BatchPageActions.clickTermsCheckBoxAndSubmit();
		BatchPageActions.assertBatchTostrMsg();
		DashboardPageActions.logOut();

		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("PUBLIC_USER"),
				sunbird_config.getSunbidConfigPropertyValue("PUBLIC_PASSWORD"));
		DashboardPageActions.clickCourseTab();
		DashboardPageActions.searchContentAndClickOnContentCard(createdContent);
		BatchPageActions.clickJoinCourse();
		BatchPageActions.validateAttributesInConsentPopup();
		BatchPageActions.clickTermsCheckInConsentPopup();
		BatchPageActions.clickShareBtn();
		BatchPageActions.assertBatchEndTimeStamp();
		BatchPageActions.clickStartLearning();
		ConsumptionPageActions.consumePDF();
		ConsumptionPageActions.giveRating(3);
		ConsumptionPageActions.assertCourseSuccesfullYCompletedPopupMsg();
		ConsumptionPageActions.clickCloseIconInCourseCompletePopup();
		UtilityFunctions.backButtonInBrowser();
		ConsumptionPageActions.clickSyncProgressNow();
		BatchPageActions.assertSyncNowProgressToastrMSg();
	}

}