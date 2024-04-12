package sanitySuite;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageActions.*;
import org.testng.annotations.Test;

public class SanitySuite5 extends BaseTestConfig  {

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
    @Test(description = "Turn toggle on/off for the shuffle and show immediate feedback in question set page")
    public void showimmediatefeedback() throws Exception {

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
                QuestionSetPageActions.clkAddButtonInQuestionTitlePage();
        ResourcePageActions.saveAndCloseIcon();
        ResourcePageActions.resourceSendForReview();

    }

    @Test(description = "User should be displayed with the Last updated date and time (24 hours IST format) above the “Total enrolments”")
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
    }

    @Test(description = "User should be able to add course content as activity to the group succssfully.")
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

    }
    @Test(description = " Reviewer rejects the TV lesson type content it should  be available under Drafts bucket for creator ")
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


    }
}
