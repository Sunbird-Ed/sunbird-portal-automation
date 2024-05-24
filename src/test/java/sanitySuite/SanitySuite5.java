package sanitySuite;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageActions.*;
import org.testng.annotations.Test;

import java.io.File;

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

    @Test(description = "The user should be displayed with Disable Discussions option in the group details page and clicking on the same the group admin should be displayed with a pop-up.")
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
    }

/*Week3*/
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

    }
    @Test(description = "User should be able to see the correct ordering for class, medium, subjec")
    public void verifyCorrectOrderingForClassMediumSubect() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickDigitalTextbookTab();
        DashBoardFiltersPageActions.assertOrderOfMediumClassSubjectFiltres();

    }
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
    @Test(description = "Join the discussion forum option should be shown in course content details page")
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
    }

    @Test(description = "content should load as per the published user type filter")
    public void contentShouldLoadAsPerPublishedUserTypeInDigitalTextbookTab() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickDigitalTextbookTab();
        DashBoardFiltersPageActions.clickPublishedFilter();
        DashBoardFiltersPageActions.selectPublishedType("Teacher");
        DashBoardFiltersPageActions.assertContentDisplayed();
        DashBoardFiltersPageActions.clickResetButton();
        DashBoardFiltersPageActions.clickPublishedFilter();
        DashBoardFiltersPageActions.selectPublishedType("Student");
        DashBoardFiltersPageActions.assertContentDisplayed();
        DashBoardFiltersPageActions.clickResetButton();
        DashBoardFiltersPageActions.clickPublishedFilter();
        DashBoardFiltersPageActions.selectPublishedType("Other");
        DashBoardFiltersPageActions.assertContentDisplayed();
        DashBoardFiltersPageActions.clickResetButton();

    }


    @Test(description = "User should be able to add the collaborator on draft book")
    public void addCollobratorToDraftBook() throws Exception {
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
        BookPageActions.clickBackButtonInEditor();
        AllMyContentPageActions.enterContentInSearchBox(createdContent);
        DraftsPageActions.clickFirstCard();
        BookPageActions.clickCollobratorIcon();
        BookPageActions.selectTheCollobratorFromlist();
        BookPageActions.clickDoneBtnInCollobrator();
        BookPageActions.assertAddedCollobratorToastrMsg();
        BookPageActions.clickCollobratorIcon();
        BookPageActions.clickManageCollobratorTab();
        BookPageActions.assertAddedCollobratorInManageTabs();

    }
    @Test(description = "The user should be able to download the csv file in published section")
    public void downloadCourseQRCodeInPublishedSection() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.assertWorkspace();
        DashboardPageActions.clickOnWorkSpace();
        WorkspaceDashboardPageActions.clickPublishedBucket();
        PublishedPageActions.clickDownloadCourseQrCode();
        File file=UtilityFunctions.getLatestDownloadedFile(UtilityFunctions.getSystemDownloadPath());
        String fileName=file.getName();
        String splitedName = fileName.split("\\.")[1];
        UtilityFunctions.stringValueComparision(splitedName,"csv","file not downloaded");

    }

    @Test(description = "User able to validate guestname,role,location and BMC details in profile")
    public void validateGuestNameAndRoleAndBMCAndLocationDetailsInProfile() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnProfileOption();
        ProfilePageActions.assertGuestName();
        ProfilePageActions.assertRole();
        ProfilePageActions.assertDistrictAndStateWithEditBtn();
        ProfilePageActions.assertBMCWithEditBtn();
    }
    @Test(description = "observation tab should be disappears if user changes to any other role from HT & official role from profile")
    public void ChangeToDifferentRoleInProfileFromSchoolHeadAndValidateObservationTab() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnProfileForLoginUser();
        UtilityFunctions.scrollUpUsingPixelValue();
        ProfilePageActions.clickEditButtonLocationDetails();
        ProfilePageActions.clickRoleDropdown();
        ProfilePageActions.selectRoleType("Teacher");
        OnBoardingActions.submitButtonInLocationPopup();
        UtilityFunctions.threadSleep(5000);
        UtilityFunctions.scrollUpUsingPixelValue();
        ProfilePageActions.clickBackButtonInProfilePage();
        DashboardPageActions.assertObservationTabNotDisplay();
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnProfileForLoginUser();
        UtilityFunctions.scrollUpUsingPixelValue();
        ProfilePageActions.clickEditButtonLocationDetails();
        ProfilePageActions.clickRoleDropdown();
        ProfilePageActions.selectRoleType("SchoolHead");
        ProfilePageActions.clickSubRoleDropdown();
        ProfilePageActions.selectSubRoleType("HM");
        OnBoardingActions.submitButtonInLocationPopup();
        UtilityFunctions.threadSleep(5000);
        UtilityFunctions.scrollUpUsingPixelValue();
        ProfilePageActions.clickBackButtonInProfilePage();
        DashboardPageActions.clickOnObservationTab();
    }
    @Test(description = "Verify that multiple tagged M/C book can be get displayed post searching in digital textbook tab")
    public void verifyMultipleMediumAndClassTaggedInBook() throws Exception {
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
        BookPageActions.selectMultipleBMCDropdownSelectionSection2();
        UtilityFunctions.scrollUpUsingPixelValue();
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
        ReviewPageActions.reviewAndPublishContent(createdContent, "Book");
        DashboardPageActions.logOut();

        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickDigitalTextbookTab();
        DashboardPageActions.searchContentAndClickOnContentCard(createdContent);
        BookPageActions.assertMultipleTaggedMediumAndClass();
    }
    @Test(description = "user should be able to apply the any filters  and verify if the course is getting displayed.")
    public void ApplyAnyFilterInCourseTabAndVerifyContentiIsDisplayed() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickCourseTab();
        DashBoardFiltersPageActions.clickPublishedFilter();
        DashBoardFiltersPageActions.selectPublishedType("Teacher");
        DashBoardFiltersPageActions.assertContentDisplayed();
        DashBoardFiltersPageActions.clickResetButton();
        DashBoardFiltersPageActions.clickPublishedFilter();
        DashBoardFiltersPageActions.selectPublishedType("Student");
        DashBoardFiltersPageActions.assertContentDisplayed();
        DashBoardFiltersPageActions.clickResetButton();
    }

    @Test(description = "User should be able to select block/cluster/school value for User during onboarding")
    public void userAbleToSelectStateBlockClusterAndSchoolInLocationPopupForNewUser() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("New_User"), sunbird_config.getSunbidConfigPropertyValue("New_PWD"));
        OnBoardingActions.BMCPopup();
        OnBoardingActions.RolePoup();
        OnBoardingActions.selectStateAndDistrict();
        OnBoardingActions.blockSelection();
        OnBoardingActions.schoolSelection();
        OnBoardingActions.submitButtonInLocationPopup();

    }
    @Test(description = "User should be able to merge the custodian account")
    public void mergeCustodianAccount() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnMergeAccount();
        MergeAccountPageActions.clickMergeInMergePopup();
        LoginPageActions.LoginForJoinCourse(sunbird_config.getSunbidConfigPropertyValue("Merge_New_User"), sunbird_config.getSunbidConfigPropertyValue("Merge_Pwd"));
        MergeAccountPageActions.assertMergedAccountSuccessMsg();
    }

    @Test(description = "Sunbird Logo should be displayed before login and after login")
    public void verifySunbirdLogo() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        DashboardPageActions.assertSunbirdLogo();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.assertSunbirdLogo();

    }


    @Test(description = " The user should be displayed with Toast message It is the Last Attempt left when user clicks on the assessment on the Last attempt.")
    public void verifyNumberOfMaximumAttemptsWhenCourseAssesmentAddedToCourse () throws Exception {

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
        BookPageActions.addResourceInLibrarySection(sunbird_config.getSunbidConfigPropertyValue("CourseAssessment"));
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
        UtilityFunctions.threadSleep(4000);
        UtilityFunctions.switchFrameUsingName();
        ConsumptionPageActions.clickNextButtonInQuestionSetCon();
        ConsumptionPageActions.clickSubmitButtonPlayer();
        UtilityFunctions.switchToDefaultContentFrame();
        ConsumptionPageActions.giveRatingAndAssertToastrMsg(3);
        ConsumptionPageActions.assertLastAttemptToastrMsg();
        UtilityFunctions.backButtonInBrowser();
        ConsumptionPageActions.clickContentInTOC();
        ConsumptionPageActions.assertLastAttemptPopup();
        ConsumptionPageActions.clickOnOkButtonInLastAttemptPopup();
        UtilityFunctions.threadSleep(4000);
        UtilityFunctions.switchFrameUsingName();
        ConsumptionPageActions.clickNextButtonInQuestionSetCon();
        ConsumptionPageActions.clickSubmitButtonPlayer();
        UtilityFunctions.switchToDefaultContentFrame();
        ConsumptionPageActions.giveRatingAndAssertToastrMsg(3);
        UtilityFunctions.backButtonInBrowser();
        ConsumptionPageActions.clickContentInTOC();
        ConsumptionPageActions.assertMaximumNoOfAttemptExcededToastrMsg();
    }

    @Test(description = "user should be able to search for TV lesson type content")
    public void searchTVLessonTypeContent() throws Exception {

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
        DashboardPageActions.logOut();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickOnTVClasses();
        DashboardPageActions.searchContentAndClickOnContentCard(createdContent);
    }

    @Test(description = "Admin should be able to do the draft book and sendForReview")
    public void AdminCanEditTheDraftBookInAllTextbookAndSendForReview() throws Exception {
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
        BookPageActions.clickBackButtonInEditor();
        DashboardPageActions.logOut();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("TN_ORGADMIN"),
                sunbird_config.getSunbidConfigPropertyValue("TN_ORGADMIN_PWD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnWorkSpace();
        WorkspaceDashboardPageActions.clickAllTextBookOption();
        AllMyContentPageActions.enterContentInSearchBox(createdContent);
        AllMyContentPageActions.clickFirstCard();
        BookPageActions.addResourceInLibrarySection("Mp4");
        BookPageActions.clickSaveAsDrafts();
        BookPageActions.submitAndSendForReview();
        DashboardPageActions.logOut();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnWorkSpace();
        ReviewPageActions.reviewAndPublishContent(createdContent, "Book");

    }
    @Test(description = "The creator should be able to create a certificate template ")
    public void CreateCertificateTemplateAndAttachCertificateToCourse() throws Exception {

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

        CertificatePageActions.clickAddCertificate();
        UtilityFunctions.scrollDownUsingPixelValue();
        CertificatePageActions.clickAddCertificatePlusIcon();
        CertificatePageActions.clickIssueCertificateDropdown();
        CertificatePageActions.selectAllValueInIssueCertificate();
        CertificatePageActions.clickCreateTemplate();
        String title=CertificatePageActions.enterCertificateTitle();
        String stateName=CertificatePageActions.enterStateName();
        CertificatePageActions.uploadStateLogoImg();
        CertificatePageActions.uploadSignatureImg();
        CertificatePageActions.enterDesignations();
        CertificatePageActions.selectLayoutTemplate();
        CertificatePageActions.clickCheckBox();
        CertificatePageActions.clickSaveTemplate();
        CertificatePageActions.assertCertificateAddedTostrMsg();
        CertificatePageActions.clickCloseDialogBox();
        UtilityFunctions.threadSleep(4000);
        UtilityFunctions.scrollUpUsingPixelValue();
        UtilityFunctions.scrollUpUsingPixelValue();
        UtilityFunctions.scrollUpUsingPixelValue();
        CertificatePageActions.clickIssueCertificateDropdown();
        CertificatePageActions.selectAllValueInIssueCertificate();
        UtilityFunctions.threadSleep(2000);
        UtilityFunctions.scrollDownUsingPixelValue();
        CertificatePageActions.clickRefreshBtn();
        UtilityFunctions.threadSleep(4000);
        CertificatePageActions.chooseTemplateAndClickPreview();
        UtilityFunctions.threadSleep(1000);
        CertificatePageActions.selectTemplateInPreviewPopup();
        CertificatePageActions.clickCheckBox();
        UtilityFunctions.scrollDownUsingPixelValue();
        UtilityFunctions.scrollDownUsingPixelValue();
        CertificatePageActions.clickAddCertificateForCreation();
        CertificatePageActions.assertCertificateAddedTostrMsg();
        UtilityFunctions.scrollUpUsingPixelValue();
        UtilityFunctions.scrollUpUsingPixelValue();
        CertificatePageActions.assertCertificateAddedImg();


    }


    @Test(description = "upload PDF")
    public void UploadPDFcontent() throws Exception {
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
    }
    @Test(description = "upload Mp4")
    public void UploadMP4content() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.assertWorkspace();
        DashboardPageActions.clickOnWorkSpace();
        UploadPageActions.uploadContent("MP4");
        UploadPageActions.clickSendForReview();
        String resourceName = UploadPageActions.sendUploadContentForReview();
        UtilityFunctions.switchToDefaultContentFrame();
        DashboardPageActions.logOut();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnWorkSpace();
        ReviewPageActions.reviewAndPublishContent(resourceName, "Upload");
        DashboardPageActions.logOut();
    }
    @Test(description = "upload HTML")
    public void UploadHTMLcontent() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.assertWorkspace();
        DashboardPageActions.clickOnWorkSpace();
        UploadPageActions.uploadContent("HTML");
        UploadPageActions.clickSendForReview();
        String resourceName = UploadPageActions.sendUploadContentForReview();
        UtilityFunctions.switchToDefaultContentFrame();
        DashboardPageActions.logOut();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnWorkSpace();
        ReviewPageActions.reviewAndPublishContent(resourceName, "Upload");
        DashboardPageActions.logOut();
    }
    @Test(description = "upload WEBM")
    public void UploadWEBMcontent() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.assertWorkspace();
        DashboardPageActions.clickOnWorkSpace();
        UploadPageActions.uploadContent("WEBM");
        UploadPageActions.clickSendForReview();
        String resourceName = UploadPageActions.sendUploadContentForReview();
        UtilityFunctions.switchToDefaultContentFrame();
        DashboardPageActions.logOut();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnWorkSpace();
        ReviewPageActions.reviewAndPublishContent(resourceName, "Upload");
        DashboardPageActions.logOut();
    }

    @Test(description = "upload H5P")
    public void UploadH5pcontent() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.assertWorkspace();
        DashboardPageActions.clickOnWorkSpace();
        UploadPageActions.uploadContent("H5P");
        UploadPageActions.clickSendForReview();
        String resourceName = UploadPageActions.sendUploadContentForReview();
        UtilityFunctions.switchToDefaultContentFrame();
        DashboardPageActions.logOut();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnWorkSpace();
        ReviewPageActions.reviewAndPublishContent(resourceName, "Upload");
        DashboardPageActions.logOut();
    }
    @Test(description = "upload EPUB")
    public void UploadEPUBcontent() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.assertWorkspace();
        DashboardPageActions.clickOnWorkSpace();
        UploadPageActions.uploadContent("EPUB");
        UploadPageActions.clickSendForReview();
        String resourceName = UploadPageActions.sendUploadContentForReview();
        UtilityFunctions.switchToDefaultContentFrame();
        DashboardPageActions.logOut();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnWorkSpace();
        ReviewPageActions.reviewAndPublishContent(resourceName, "Upload");
        DashboardPageActions.logOut();
    }

    @Test(description = "upload Youtube")
    public void UploadYouTubecontent() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.assertWorkspace();
        DashboardPageActions.clickOnWorkSpace();
        String link=sunbird_config.getSunbidConfigPropertyValue("YOUTUBE");
        UploadPageActions.uploadYoutube(link);
        UploadPageActions.clickSendForReview();
        String resourceName = UploadPageActions.sendUploadContentForReview();
        UtilityFunctions.switchToDefaultContentFrame();
        DashboardPageActions.logOut();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnWorkSpace();
        ReviewPageActions.reviewAndPublishContent(resourceName, "Upload");
        DashboardPageActions.logOut();
    }

}
