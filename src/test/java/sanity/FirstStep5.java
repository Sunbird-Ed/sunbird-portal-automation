package sanity;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageActions.*;
import org.testng.annotations.Test;

public class FirstStep5 extends BaseTestConfig {

/*
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
*/

/*
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

    }*/

   /* @Test(description = "Create Book with DifferentResourceType")
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
        BookPageActions.addDifferentResourceTypeInLibrarySection("Collection");
        BookPageActions.clickSaveAsDrafts();


    }*/

    /*@Test(description = "Create course with DifferentResourceType")
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
*/
//    @Test(description = "Generate QrCode",groups= {"Creation"})
//    public void downloadQRCode() throws Exception {
//
//        OnBoardingActions.RolePoup();
//        OnBoardingActions.BMCPopup();
//        OnBoardingActions.LocationPopup();
//        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
//                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
//        DashboardPageActions.clickUserProfileIcon();
//        DashboardPageActions.assertWorkspace();
//        DashboardPageActions.clickOnWorkSpace();
//        WorkspaceDashboardPageActions.clickBook();
//        String createdContent = BookPageActions.createBookPopup("getdoid");
//        String des=BookPageActions.section1("getdescription");
//        BookPageActions.BMCDropdownSelectionSection2();
//        BookPageActions.Section3();
//        BookPageActions.aseertContentIsSavedToastrMsg();
//        BookPageActions.waitContentIsSavedToastToDisapper();
//        BookPageActions.generateQrCode("2");
//        BookPageActions.downloadQrCode();
//        BookPageActions.generateQrCode("245");
//        BookPageActions.downloadQrCode();
//        BookPageActions.addResourceFromLibrary();
//        BookPageActions.submitAndSendForReview();
//
//    }


//    @Test(description = "The Course mentor who has content creator and course mentor role  should be able to create the open batch for the courses ")
//    public void createOpenBatchesForCourse() throws Exception {
//
//        OnBoardingActions.RolePoup();
//        OnBoardingActions.BMCPopup();
//        OnBoardingActions.LocationPopup();
//
////        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
////                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
////        DashboardPageActions.clickUserProfileIcon();
////        DashboardPageActions.assertWorkspace();
////        DashboardPageActions.clickOnWorkSpace();
////        WorkspaceDashboardPageActions.clickCourse();
////        String createdContent = CoursePageActions.createCourseSection1("getdoid");
////        BookPageActions.BMCDropdownSelectionSection2();
////        BookPageActions.Section3();
////        BookPageActions.assertContentIsSavedToastrMsg();
////        BookPageActions.waitContentIsSavedToastToDisapper();
////        BookPageActions.addResourceFromLibrary();
////        BookPageActions.submitAndSendForReview();
////        DashboardPageActions.logOut();
////        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
////                sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
////        DashboardPageActions.clickUserProfileIcon();
////        DashboardPageActions.clickOnWorkSpace();
////        ReviewPageActions.reviewAndPublishContent(createdContent, "Course");
////        DashboardPageActions.logOut();
//        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
//                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
//        DashboardPageActions.clickCourseTab();
//        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("AlreadyCreatedBatch"));
//                    BatchPageActions.batchCreationShouldNotDisplay();
//
//    }


//    @Test(description = "The creator of the post/topic should be able to edit/delete the below fields on the post.")
//    public void userAbleToCreateTopicAndEditAndDelete() throws Exception {
//
//        OnBoardingActions.RolePoup();
//        OnBoardingActions.BMCPopup();
//        OnBoardingActions.LocationPopup();
//        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
//                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
//        DashboardPageActions.clickUserProfileIcon();
//        DashboardPageActions.assertWorkspace();
//        DashboardPageActions.clickOnMyGroups();
//        GroupsPageActions.clickCloseCrossIcon();
//        GroupsPageActions.clickCreateGroup();
//       String fetchGroupName= GroupsPageActions.enterGroupNameAndDesc();
//        GroupsPageActions.assertGroupCreatedToastrMessage();
//        GroupsPageActions.clickCreatedGroupCard(fetchGroupName);
//GroupsPageActions.assertGroupKababMenuIcon();
//GroupsPageActions.clickGroupKababMenu();
//GroupsPageActions.clickEnableDiscusison();
//GroupsPageActions.assertEnableDisussionToastrMsg();
//        UtilityFunctions.MoveByOffSet(50, 100);
//GroupsPageActions.clickForumIcon();
//GroupsPageActions.clickGeneralDiscussionCard();
//GroupsPageActions.clickStartCreating();
//String topicName=GroupsPageActions.enterTopicNameandDescrption("Create");
//GroupsPageActions.clickCreatedTopic(topicName);
//GroupsPageActions.kababMenuInTopic();
//GroupsPageActions.editTopic();
//String updatedTopicName=GroupsPageActions.enterTopicNameandDescrption("Update");
//        GroupsPageActions.clickCreatedTopic(updatedTopicName);
//        GroupsPageActions.kababMenuInTopic();
//        GroupsPageActions.deleteTopic();
//UtilityFunctions.acceptAlert();
//    }


//    @Test(description = "User should be able to apply Difficult,QuestionType,BMCS filter")
//    public void ApplyAllFilterAndEditQuestionInAddQuestionPage() throws Exception {
//
//        OnBoardingActions.RolePoup();
//        OnBoardingActions.BMCPopup();
//        OnBoardingActions.LocationPopup();
//        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
//                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
//        DashboardPageActions.clickUserProfileIcon();
//        DashboardPageActions.clickOnWorkSpace();
//        WorkspaceDashboardPageActions.clickResource();
//        String createdContent = ResourcePageActions.createResourcePopup("getContentName");
//        QuestionSetPageActions.clickAddQuestionSetIcon();
//        QuestionSetPageActions.clickAdvanceFilter();
//QuestionSetPageActions.selectDifficultLevel();
//QuestionSetPageActions.selectQuestionType();
//QuestionSetPageActions.selectBoard();
//QuestionSetPageActions.selectMedium();
//QuestionSetPageActions.selectClass();
//QuestionSetPageActions.selectSubject();
//        QuestionSetPageActions.clickEditIconInQuestion();
//        QuestionSetPageActions.clickNextBtnInQuestionPage();
//        QuestionSetPageActions.enterTitleName();
//        QuestionSetPageActions.clickSubmitInQuestionPage();
//        QuestionSetPageActions.clkNextButtonInQuestionPage();
//        QuestionSetPageActions.enterQuestionSetTitle();
//        QuestionSetPageActions.clkAddButtonInQuestionTitlePage();
//        ResourcePageActions.saveAndCloseIcon();
//        ResourcePageActions.clickPreivewIcon();
//        UtilityFunctions.switchFrameUsingName();
//        ResourcePageActions.assertContentInPreviewPlayer();
//    }


    @Test()
    public void createResourceAndPublish() throws Exception {

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
        ReviewPageActions.reviewAndPublishContent(createdContent, "Resource");
    }
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
    @Test(description = "User should be able to unenroll from the open courses,Join course button should be displayed")
    public void unEnrollFromCourse() throws Exception {
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
        BatchPageActions.assertProfileShareToastrMessage();
        BatchPageActions.waitProfileShareTostrToDisapper();
        BatchPageActions.clickLeaveCourse();
        BatchPageActions.clickLeaveCourseInUnEnrollPopup();
        BatchPageActions.assertJoinCourse();

    }
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
