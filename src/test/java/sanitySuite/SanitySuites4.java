package sanitySuite;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageActions.*;
import org.testng.annotations.Test;

public class SanitySuites4 extends BaseTestConfig
{

	@Test(description = "create Group")
	public void createGroup() throws Exception {
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
		String fetchGroupName= GroupsPageActions.enterGroupNameAndDesc();
		GroupsPageActions.assertGroupCreatedToastrMessage();
		GroupsPageActions.clickCreatedGroupCard(fetchGroupName);
		GroupsPageActions.assertGroupKababMenuIcon();
	}

	@Test(description = "validate all the option inside the forum icon page")
	public void validateAllOptionsInsideForumIcon() throws Exception {
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
		String fetchGroupName= GroupsPageActions.enterGroupNameAndDesc();
		GroupsPageActions.assertGroupCreatedToastrMessage();
		GroupsPageActions.clickCreatedGroupCard(fetchGroupName);
		GroupsPageActions.assertGroupKababMenuIcon();
		GroupsPageActions.clickGroupKababMenu();
		GroupsPageActions.clickEnableDiscusison();
		GroupsPageActions.assertEnableDisussionToastrMsg();
		UtilityFunctions.MoveByOffSet(50, 100);
		GroupsPageActions.clickForumIcon();
		GroupsPageActions.assertAllOptionInsideForum();
	}

	@Test(description = "The creator of the post/topic should be able to edit/delete the below fields on the post.")
	public void userAbleToCreateTopicAndEditAndDelete() throws Exception {

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
		String fetchGroupName= GroupsPageActions.enterGroupNameAndDesc();
		GroupsPageActions.assertGroupCreatedToastrMessage();
		GroupsPageActions.clickCreatedGroupCard(fetchGroupName);
		GroupsPageActions.assertGroupKababMenuIcon();
		GroupsPageActions.clickGroupKababMenu();
		GroupsPageActions.clickEnableDiscusison();
		GroupsPageActions.assertEnableDisussionToastrMsg();
		UtilityFunctions.MoveByOffSet(50, 100);
		GroupsPageActions.clickForumIcon();
		GroupsPageActions.clickGeneralDiscussionCard();
		GroupsPageActions.clickStartCreating();
		String topicName=GroupsPageActions.enterTopicNameandDescrption("Create");
		GroupsPageActions.clickCreatedTopic(topicName);
		GroupsPageActions.kababMenuInTopic();
		GroupsPageActions.editTopic();
		String updatedTopicName=GroupsPageActions.enterTopicNameandDescrption("Update");
		GroupsPageActions.clickCreatedTopic(updatedTopicName);
		GroupsPageActions.kababMenuInTopic();
		GroupsPageActions.deleteTopic();
		UtilityFunctions.acceptAlert();
	}

	@Test(description = "The close option should be displayed on the below pages when the user opens the discussion forum ")
	public void closeButtonInDisussionForum() throws Exception {

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
		String fetchGroupName= GroupsPageActions.enterGroupNameAndDesc();
		GroupsPageActions.assertGroupCreatedToastrMessage();
		GroupsPageActions.clickCreatedGroupCard(fetchGroupName);
		GroupsPageActions.assertGroupKababMenuIcon();
		GroupsPageActions.clickGroupKababMenu();
		GroupsPageActions.clickEnableDiscusison();
		GroupsPageActions.assertEnableDisussionToastrMsg();
		UtilityFunctions.MoveByOffSet(50, 100);
		GroupsPageActions.clickForumIcon();
		GroupsPageActions.clickCloseIcon();
		GroupsPageActions.clickForumIcon();
		GroupsPageActions.assertCloseIcon();
		GroupsPageActions.clickTags();
		GroupsPageActions.assertCloseIcon();
		GroupsPageActions.clickMyDisussionOption();
		GroupsPageActions.assertCloseIcon();

	}
	@Test(description = "Verify user able to searchQrCodeInGetPage")
	public void searchQrCodeInGetPage() throws Exception {
		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		String currentUrl = driver.getCurrentUrl();
		driver.get(currentUrl+"/get");
		GetPageActions.enterQrCode(sunbird_config.getSunbidConfigPropertyValue("TextbookQrCode"));
		GetPageActions.clickSearhIcon();
		GetPageActions.assertContentDisplayed();

	}
	@Test(description = "Verify guest user is able to get Login Popup while join the course \n")
	public void loginPopupShouldDisplayForGuestUserDuringCourseEnroll() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		DashboardPageActions.clickCourseTab();
		DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("Course"));
		BatchPageActions.clickJoinCourse();
		LoginPageActions.clickLoginInPopup();
		LoginPageActions.LoginForJoinCourse(sunbird_config.getSunbidConfigPropertyValue("PUBLIC_USER"),sunbird_config.getSunbidConfigPropertyValue("PUBLIC_PASSWORD"));
		BatchPageActions.assertJoinCourse();
		BatchPageActions.assertShareIcon();
	}

	@Test(description = "User should be able to apply Difficult,QuestionType,BMCS filter")
	public void ApplyAllFilterAndEditQuestionInAddQuestionPage() throws Exception {

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
		QuestionSetPageActions.clickAdvanceFilter();
		QuestionSetPageActions.selectDifficultLevel();
		QuestionSetPageActions.selectQuestionType();
		QuestionSetPageActions.selectBoard();
		QuestionSetPageActions.selectMedium();
		QuestionSetPageActions.selectClass();
		QuestionSetPageActions.selectSubject();
		QuestionSetPageActions.clickEditIconInQuestion();
		QuestionSetPageActions.clickNextBtnInQuestionPage();
		QuestionSetPageActions.enterTitleName();
		QuestionSetPageActions.clickSubmitInQuestionPage();
		QuestionSetPageActions.clkNextButtonInQuestionPage();
		QuestionSetPageActions.enterQuestionSetTitle();
		QuestionSetPageActions.clkAddButtonInQuestionTitlePage();
		ResourcePageActions.saveAndCloseIcon();
		ResourcePageActions.clickPreivewIcon();
		UtilityFunctions.switchFrameUsingName();
		ResourcePageActions.assertContentInPreviewPlayer();
	}
	@Test(description = "verify different framework values in courseType")
	public void verifyFrameworksInCourseType() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.assertWorkspace();
		DashboardPageActions.clickOnWorkSpace();
		WorkspaceDashboardPageActions.clickCourse();
		CoursePageActions.verifyFrameworkInCourseTypeDropDown();
		BookPageActions.BMCDropdownSelectionSection2();

	}


	@Test(description = "User should be able to search and consume the published content.\n")
	public void verifyThatUserIsAbleToSearchAndConsumeThePublishedContent() throws Exception {

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
		ReviewPageActions.reviewAndPublishContent(resourceName,"Upload");
		DashboardPageActions.logOut();

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
		BookPageActions.assertContentIsSavedToastrMsg();
		BookPageActions.waitContentIsSavedToastToDisapper();
		BookPageActions.addResourceInLibrarySection(resourceName);
		BookPageActions.submitAndSendForReview();
		DashboardPageActions.logOut();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.clickOnWorkSpace();
		ReviewPageActions.reviewAndPublishContent(createdContent, "Book");
		DashboardPageActions.logOut();

		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("PUBLIC_USER"),
				sunbird_config.getSunbidConfigPropertyValue("PUBLIC_PASSWORD"));
		DashboardPageActions.searchContentAndClickOnContentCard(createdContent);
		ConsumptionPageActions.consumePDF();
		ConsumptionPageActions.giveRating(3);
	}

	@Test(description = "Users view observations as tiles")
	public void validateObservationListsInObservationTab() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickOnObservationTab();
		ObservationPageActions.assertObservationCount();
		ObservationPageActions.clickOnObservationCard();
		ObservationPageActions.assertObservationDetails();
	}
	@Test(description = "Post uploading and saving, content resides in all my bucket .")
	public void verifyUploadContentInAllMyContent() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.assertWorkspace();
		DashboardPageActions.clickOnWorkSpace();
		UploadPageActions.uploadContent("MP4");
		UploadPageActions.clickEditDetails();
		String uploadContentName = UploadPageActions.sendUploadContentForReview();
		UploadPageActions.clickCloseIcon();
		UploadPageActions.clickCloseCrossIcon();
		UtilityFunctions.switchToDefaultContentFrame();
		WorkspaceDashboardPageActions.clickAllMyContent();
		AllMyContentPageActions.enterContentInSearchBox(uploadContentName);
		AllMyContentPageActions.clickFirstCard();
		UtilityFunctions.switchFrameOnIndex(0);
		UploadPageActions.assertEditDetails();
	}

/* Sprint 2*/
	@Test(description = "The Digital textbooks, Courses, and TV Classes tabs should have the same filters")
	public void verifyFilterIsSameInDigitalAndCourseAndTVClassTabs() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickDigitalTextbookTab();
		DashBoardFiltersPageActions.verifyAllFilter();
		DashboardPageActions.clickCourseTab();
		DashBoardFiltersPageActions.verifyAllFilter();
		DashboardPageActions.clickOnTVClasses();
		DashBoardFiltersPageActions.verifyAllFilter();

	}
	@Test(description = "User should be able to see all the questions created by him/herself by turning on My question toggle button along with edit")
	public void toogleMyQuestionFilterAndValidateQuestions() throws Exception {

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
		QuestionSetPageActions.clickAdvanceFilter();
		QuestionSetPageActions.selectMyQuestionFilter();
		QuestionSetPageActions.assertDeleteIcon();
		QuestionSetPageActions.clickEditIconInQuestion();
		QuestionSetPageActions.clickNextBtnInQuestionPage();
		QuestionSetPageActions.enterTitleName();
		QuestionSetPageActions.clickSubmitInQuestionPage();
		QuestionSetPageActions.clkNextButtonInQuestionPage();
		QuestionSetPageActions.enterQuestionSetTitle();
		QuestionSetPageActions.clkAddButtonInQuestionTitlePage();
		ResourcePageActions.saveAndCloseIcon();
		ResourcePageActions.clickPreivewIcon();
		UtilityFunctions.switchFrameUsingName();
		ResourcePageActions.assertContentInPreviewPlayer();
	}
	@Test(description = "User should be able to bundle the question along with immediate feedback and shuffle question")
	public void bundleTheQuestionWithImmediateFeedBackAndShuffle() throws Exception {

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
		QuestionSetPageActions.clickAddMoreQuestionButton();
		QuestionSetPageActions.searchByQuestionTitle("FTB");
		QuestionSetPageActions.selectFirstQuestionInList();
		QuestionSetPageActions.clkNextButtonInQuestionPage();
		QuestionSetPageActions.enterQuestionSetTitle();
		QuestionSetPageActions.clickImmediateFeedback();
		QuestionSetPageActions.clickShuffleQuestions();


	}
}

