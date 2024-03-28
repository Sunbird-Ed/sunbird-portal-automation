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
}

