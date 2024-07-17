package sanitySuite;
import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageActions.*;
import org.testng.annotations.Test;

import java.io.File;

public class SanitySuite extends BaseTestConfig {

    @Test()
    public void CreateResourceAndPublish() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnWorkSpace();
        WorkspaceDashboardPageActions.clickResource();
        String createdContent = ResourcePageActions.createResourcePopup("getContentName");
        UtilityFunctions.threadSleep(6000);
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

    @Test(description = "Content creator should be able to send course for review ")
    public void CreateCourseAndVerify() throws Exception {

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

    }

    @Test(description = "Create Book with unit")
    public void CreateBookWithMoreUnit() throws Exception {

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
        BookPageActions.addResourceFromLibrary();
        BookPageActions.submitAndSendForReview();
    }

    @Test(description = "verify TVLesson in ResourceEditPage")
    public void TvLessonOptionInResourceSendForReview() throws Exception {
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
    }

    @Test(description = "Add child in Course")
    public void AddChildInCourse() throws Exception {

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
    }

    @Test(description = "Generate QrCode")
    public void GenerateQrCode() throws Exception {
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
        BookPageActions.generateQrCode("2");
        BookPageActions.downloadQrCode();
        BookPageActions.addResourceFromLibrary();
        BookPageActions.submitAndSendForReview();

    }

    @Test(description = "Book creator should be able to downlaod the ToC in the CSV file format")
    public void VerifyTOCDownloadedInCSVFormat() throws Exception {

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
        BookPageActions.addResourceFromLibrary();
        BookPageActions.downloadFolderAsCSVFile();
    }

    @Test(description = "Generate QrCode")
    public void DownloadBulkQRCode() throws Exception {
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
        BookPageActions.generateQrCode("2");
        BookPageActions.downloadQrCode();
        BookPageActions.generateQrCode("245");
        BookPageActions.downloadQrCode();
        BookPageActions.addResourceFromLibrary();
        BookPageActions.submitAndSendForReview();

    }

    @Test(description = "User shoule be able to search the particular course by Keyword")
    public void SearchCourseByKeyword() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.assertWorkspace();
        DashboardPageActions.clickOnWorkSpace();
        WorkspaceDashboardPageActions.clickCourse();
        String createdContent = CoursePageActions.createCourseSection1("getKeyword");
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
    @Test(description = "createCollectionAndVerify")
    public void CreateCollectionAndVerify() throws Exception {

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
        BookPageActions.assertContentIsSavedToastrMsg();
        BookPageActions.waitContentIsSavedToastToDisapper();
        BookPageActions.addResourceFromLibrary();
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
    public void CreateBookwithDifferentResourceType() throws Exception {

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
        BookPageActions.addDifferentResourceTypeInLibrarySection("Collections");
        BookPageActions.clickOnAddChildLeftSectionUnit();
        BookPageActions.addDifferentResourceTypeInLibrarySection("Resource");
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
        BookPageActions.assertContentIsSavedToastrMsg();
        BookPageActions.waitContentIsSavedToastToDisapper();
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
    public void SelectQuestionFromQuestionSetPage() throws Exception {

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
    public void CreateContentAndSendForReview() throws Exception {

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

    }
    @Test(description = "Verify that if the book creator is able to copy a book")
    public void CreatorAbleToCopyBook() throws Exception {

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

    @Test(description = "Verify that if the course creator is able to copy a course.\n")
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
    @Test(description = " User should be able to search the question successfully")
    public void UserAbleToSearchQuestionInResource() throws Exception {

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
        QuestionSetPageActions.searchByQuestionTitle("MCQ");
        QuestionSetPageActions.assertQuestionDisplayedBasedonText();

    }

    @Test(description = "User should be able to add the questions successfully and preview the same.")
    public void UserAbleToSearchQuestionAndPreviewInResource() throws Exception {

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
        QuestionSetPageActions.searchByQuestionTitle(sunbird_config.getSunbidConfigPropertyValue("QuestionSearch"));
        QuestionSetPageActions.selectFirstQuestionInList();
        QuestionSetPageActions.clkNextButtonInQuestionPage();
        QuestionSetPageActions.enterQuestionSetTitle();
        QuestionSetPageActions.clkAddButtonInQuestionTitlePage();
        ResourcePageActions.saveAndCloseIcon();
        ResourcePageActions.clickPreivewIcon();
        UtilityFunctions.switchFrameUsingName();
        ResourcePageActions.assertContentInPreviewPlayer();
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

    @Test(description = "The Course mentor who has content creator and course mentor role  should be able to create the open batch for the courses ")
    public void CreateOpenBatchesForCourse() throws Exception {

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
    }

    @Test(description = "The create Batch option should not be displayed to the user when there is an open batch already created.")
    public void CreateBatchOptionShouldNotDisplayIfBatchIsAlreadyCreated() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();

        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickCourseTab();
        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("AlreadyCreatedBatch"));
        BatchPageActions.batchCreationShouldNotDisplay();

    }


    @Test(description = "Verify that the timer is displayed post Join Course ")
    public void ValidateTimerIsDisplayedForBatch() throws Exception {

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
    }

    @Test(description = "User should be asked to provide the user consent while enrolling to a course nd below fields are displayed on the consent pop-up.")
    public void ValidateFieldsInConsentPopupWhileEnroll() throws Exception {

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
    }

    @Test(description = "User should be able to unenroll from the open courses,Join course button should be displayed")
    public void UnEnrollFromCourse() throws Exception {
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
    @Test(description = "On clicking the Course card, the user should be displayed with a toast message saying there are no open batches available ")
    public void ValidateNoOpenBatchAvailableToastrMsg() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("PUBLIC_USER"),
                sunbird_config.getSunbidConfigPropertyValue("PUBLIC_PASSWORD"));
        DashboardPageActions.clickCourseTab();
        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("ExpiredBatch"));
        BatchPageActions.assertNoOpenBatchToasrtMsg();

    }
    @Test(description = "creator is able to create course using textbook and is able to send the course for review.")
    public void CopyBookAsCourseAndSendForReview() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickCourseTab();
        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("CopyBookAsCourse"));
        BookPageActions.copyAsCourse();
        BookPageActions.selectAllInCopyAscourse();
        BookPageActions.clickOnCreateBtnInCopyAsCourse();
        BookPageActions.assertCopyToastrMsg();
        BookPageActions.waitCopyToastrMsgDisAppear();
        CoursePageActions.subjectCoveredDropdown();
        BookPageActions.BMCDropdownSelectionSection2();
        BookPageActions.Section3();
        BookPageActions.assertContentIsSavedToastrMsg();
        BookPageActions.waitContentIsSavedToastToDisapper();
        BookPageActions.addResourceFromLibrary();
        BookPageActions.submitAndSendForReview();

    }

    @Test(description = "Verify that user is able copy the question")
    public void UserAbleToCopyQuestion() throws Exception {

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
        QuestionSetPageActions.clickCopyQuestionIcon();
        QuestionSetPageActions.clickNextBtnInQuestionPage();
        QuestionSetPageActions.clickSubmitInQuestionPage();
        QuestionSetPageActions.clkNextButtonInQuestionPage();
        QuestionSetPageActions.enterQuestionSetTitle();
        QuestionSetPageActions.clkAddButtonInQuestionTitlePage();
        ResourcePageActions.saveAndCloseIcon();
        ResourcePageActions.clickPreivewIcon();
        UtilityFunctions.switchFrameUsingName();
        ResourcePageActions.assertContentInPreviewPlayer();
    }
    @Test(description = "User should able to edit the question")
    public void UserAbleToEditQuestionInAddQuestionPage() throws Exception {

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

    @Test(description = "User should able to delete the question")
    public void UserAbleToDeleteQuestionInQuestionPage() throws Exception {

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
        String questName= QuestionSetPageActions.fetchFirstQuestionName();
        QuestionSetPageActions.searchByQuestionTitle(questName);
        int beforeDeleteCount=QuestionSetPageActions.getTotalQuestionCount();
        QuestionSetPageActions.clickDeleteIconInQuestion();
        QuestionSetPageActions.deleteConfimation();
        int afterDeleteCount=QuestionSetPageActions.getTotalQuestionCount();
        int finalcount=beforeDeleteCount-1;
        UtilityFunctions.numberValueComparision(afterDeleteCount,finalcount,"Failed to delete question");
    }

    @Test(description = "Verify user able to searchBookViaNameAndDOIDAndQRCodeValue")
    public void SearchBookViaNameAndDOIDAndQRCodeValue() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickDigitalTextbookTab();
        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("Textbook"));
        UtilityFunctions.backButtonInBrowser();
        DashboardPageActions.clickDigitalTextbookTab();
        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("BookName"));
        UtilityFunctions.backButtonInBrowser();
        DashboardPageActions.clickDigitalTextbookTab();
        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("TextbookQrCode"));
        UtilityFunctions.backButtonInBrowser();
    }

    @Test(description = "Create Book with all ResourceType")
    public void CreateBookwithAllResourceType() throws Exception {

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
        BookPageActions.addDifferentResourceTypeInLibrarySection("Collections");
        BookPageActions.clickOnAddChildLeftSectionUnit();
        BookPageActions.addDifferentResourceTypeInLibrarySection("Resource");
        BookPageActions.addDifferentResourceTypeInLibrarySection("Youtube");
        BookPageActions.addDifferentResourceTypeInLibrarySection("Pdf");
        BookPageActions.addDifferentResourceTypeInLibrarySection("Epub");
        BookPageActions.addDifferentResourceTypeInLibrarySection("h5p");
        BookPageActions.addDifferentResourceTypeInLibrarySection("Courses");
        BookPageActions.clickSaveAsDrafts();
    }


    @Test(description = "User should be able to create the group succssfully")
    public void CreateGroup() throws Exception {
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
    }

    @Test(description = "validate all the option inside the forum icon page")
    public void ValidateAllOptionsInsideForumIcon() throws Exception {
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
    }

    @Test(description = "The creator of the post/topic should be able to edit/delete the below fields on the post.")
    public void UserAbleToCreateTopicAndEditAndDelete() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("PUBLIC_USER"),
                sunbird_config.getSunbidConfigPropertyValue("PUBLIC_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
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
        GroupsPageActions.clickGeneralDiscussionCard();
        GroupsPageActions.clickStartCreating();
        String topicName = GroupsPageActions.enterTopicNameandDescrption("Create");
        GroupsPageActions.clickCreatedTopic(topicName);
        GroupsPageActions.kababMenuInTopic();
        GroupsPageActions.editTopic();
        String updatedTopicName = GroupsPageActions.enterTopicNameandDescrption("Update");
        GroupsPageActions.clickCreatedTopic(updatedTopicName);
        GroupsPageActions.kababMenuInTopic();
        GroupsPageActions.deleteTopic();
        UtilityFunctions.acceptAlert();
    }

    @Test(description = "The close option should be displayed on the below pages when the user opens the discussion forum ")
    public void CloseButtonInDisussionForum() throws Exception {

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
        GroupsPageActions.clickCloseIcon();
        GroupsPageActions.clickForumIcon();
        GroupsPageActions.assertCloseIcon();
        GroupsPageActions.clickTags();
        GroupsPageActions.assertCloseIcon();
        GroupsPageActions.clickMyDisussionOption();
        GroupsPageActions.assertCloseIcon();

    }

    @Test(description = "Verify user able to searchQrCodeInGetPage")
    public void SearchQrCodeInGetPage() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        String currentUrl = driver.getCurrentUrl();
        driver.get(currentUrl + "/get");
        GetPageActions.enterQrCode(sunbird_config.getSunbidConfigPropertyValue("TextbookQrCode"));
        GetPageActions.clickSearhIcon();
        GetPageActions.assertContentDisplayed();

    }

    @Test(description = "Verify guest user is able to get Login Popup while join the course \n")
    public void LoginPopupShouldDisplayForGuestUserDuringCourseEnroll() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        DashboardPageActions.clickCourseTab();
        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("Course"));
        BatchPageActions.clickJoinCourse();
        LoginPageActions.clickLoginInPopup();
        LoginPageActions.LoginForJoinCourse(sunbird_config.getSunbidConfigPropertyValue("PUBLIC_USER"), sunbird_config.getSunbidConfigPropertyValue("PUBLIC_PASSWORD"));
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
    public void VerifyFrameworksInCourseType() throws Exception {

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
    public void VerifyThatUserIsAbleToSearchAndConsumeThePublishedContent() throws Exception {

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
        WorkspaceDashboardPageActions.clickBook();
        String createdContent = BookPageActions.createBookPopup("getdoid");
        String des = BookPageActions.section1("getdescription");
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
    public void ValidateObservationListsInObservationTab() throws Exception {

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
    public void VerifyUploadContentInAllMyContent() throws Exception {

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
    @Test(description = "User can play all content type in full screen mode")
    public void ConsumContentInFullScreen() throws Exception {

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
        WorkspaceDashboardPageActions.clickBook();
        String createdContent = BookPageActions.createBookPopup("getdoid");
        String des = BookPageActions.section1("getdescription");
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
        UtilityFunctions.scrollUpUsingPixelValue();
        ConsumptionPageActions.clickFullScreen();
        ConsumptionPageActions.consumePDF();

    }

    /* Sprint 2*/
    @Test(description = "The Digital textbooks, Courses, and TV Classes tabs should have the same filters")
    public void VerifyFilterIsSameInDigitalAndCourseAndTVClassTabs() throws Exception {

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
    public void ToogleMyQuestionFilterAndValidateQuestions() throws Exception {

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
    public void BundleTheQuestionWithImmediateFeedBackAndShuffle() throws Exception {

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

    @Test(description = "User should be able to create a Question Set by filling all the mandatory details in the root node")
    public void UserAbleToCreateMCQQuestionSetByFillingRootNode() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();

        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.assertWorkspace();
        DashboardPageActions.clickOnWorkSpace();
        WorkspaceDashboardPageActions.clickOnQuestionSet();
        String createdContent = CreateQuestionSetPageActions.fillQuestionSetSection1("getdoid");
        CreateQuestionSetPageActions.BMCDropdownSelectionSection2();
        CreateQuestionSetPageActions.selectAudienceType();
        CreateQuestionSetPageActions.setMaxTime("5", "10");
        BookPageActions.clickSaveAsDrafts();
        BookPageActions.assertContentIsSavedToastrMsg();
        BookPageActions.waitContentIsSavedToastToDisapper();
        BookPageActions.clickAddChild();
        CreateQuestionSetPageActions.fillSectionDetails();
        BookPageActions.clickSaveAsDrafts();
        BookPageActions.waitContentIsSavedToastToDisapper();
        CreateQuestionSetPageActions.clickCreateNew();
        CreateQuestionSetPageActions.clickMcqTemplate();
        CreateQuestionSetPageActions.clickNextBtn();
        CreateQuestionSetPageActions.questParagraph();
        CreateQuestionSetPageActions.optionParagraph();
        CreateQuestionSetPageActions.optionParagraph2();
        CreateQuestionSetPageActions.clickCorrectAnswers();
        String title = CreateQuestionSetPageActions.questionTitle();
        CreateQuestionSetPageActions.clickSave();
        CreateQuestionSetPageActions.assertQuestionCreatedToastrMsg();
        BookPageActions.submitAndSendForReview();
    }

    @Test(description = "User should be able to Create Subjective QuestionSet ByFillingRootNode")
    public void CreateSubjectiveQuestionSetByFillingRootNode() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();

        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.assertWorkspace();
        DashboardPageActions.clickOnWorkSpace();
        WorkspaceDashboardPageActions.clickOnQuestionSet();
        String createdContent = CreateQuestionSetPageActions.fillQuestionSetSection1("getdoid");
        CreateQuestionSetPageActions.BMCDropdownSelectionSection2();
        CreateQuestionSetPageActions.selectAudienceType();
        CreateQuestionSetPageActions.setMaxTime("5", "10");
        BookPageActions.clickSaveAsDrafts();
        BookPageActions.assertContentIsSavedToastrMsg();
        BookPageActions.waitContentIsSavedToastToDisapper();
        BookPageActions.clickAddChild();
        CreateQuestionSetPageActions.fillSectionDetails();
        BookPageActions.clickSaveAsDrafts();
        BookPageActions.waitContentIsSavedToastToDisapper();
        CreateQuestionSetPageActions.clickCreateNew();
        CreateQuestionSetPageActions.clickSubjectiveTemplate();
        CreateQuestionSetPageActions.clickNextBtn();
        CreateQuestionSetPageActions.questParagraph();
        CreateQuestionSetPageActions.optionParagraph();
        String title = CreateQuestionSetPageActions.questionTitle();
        CreateQuestionSetPageActions.questionMarks("10");
        CreateQuestionSetPageActions.clickSave();
        CreateQuestionSetPageActions.assertQuestionCreatedToastrMsg();
        BookPageActions.submitAndSendForReview();
    }

    @Test()
    public void CreateMCAandFTBandMCQInResource() throws Exception {

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
        QuestionSetPageActions.createQuestionbutton();
        QuestionSetPageActions.selectMTF();
        QuestionSetPageActions.switchToRichFrameEditor();
        QuestionSetPageActions.enterQuestionInsideTextBox("Arrange Following Matches");
        UtilityFunctions.switchToDefaultContentFrame();
        QuestionSetPageActions.switchToParentFrame();
        QuestionSetPageActions.enterAllQuestionAndAnswerForMTF();
        UtilityFunctions.switchToDefaultContentFrame();
        QuestionSetPageActions.switchToParentFrame();
        QuestionSetPageActions.clickRefreshIcon();
        UtilityFunctions.switchToDefaultContentFrame();
        QuestionSetPageActions.switchToParentFrame();
        QuestionSetPageActions.clickNextBtnInQuestionPage();
        QuestionSetPageActions.selectBMCInQuestionCreationPage();
        QuestionSetPageActions.selectEasyLevelInQuestionCreationPage();
        QuestionSetPageActions.saveAndCreateButton();
        //  Thread.sleep(4000);

        QuestionSetPageActions.selectMCQ();
        Thread.sleep(4000);
        QuestionSetPageActions.switchToRichFrameEditor();
        Thread.sleep(4000);
        QuestionSetPageActions.enterMCQQuestionInsideTextBox("Multiple Choice Questions");
        UtilityFunctions.switchToDefaultContentFrame();
        QuestionSetPageActions.switchToParentFrame();
        QuestionSetPageActions.enterAllQuestAndAsnwerInMCQ();
        UtilityFunctions.switchToDefaultContentFrame();
        QuestionSetPageActions.switchToParentFrame();
        QuestionSetPageActions.clickRefreshIcon();
        UtilityFunctions.switchToDefaultContentFrame();
        QuestionSetPageActions.switchToParentFrame();
        QuestionSetPageActions.clickNextBtnInQuestionPage();
        QuestionSetPageActions.saveAndCreateButton();

        QuestionSetPageActions.selectFTB();
        Thread.sleep(4000);
        QuestionSetPageActions.switchToRichFrameEditor();
        Thread.sleep(4000);
        QuestionSetPageActions.enterQuestionInsideTextBox("Life is [[Beautiful]]");
        UtilityFunctions.switchToDefaultContentFrame();
        QuestionSetPageActions.switchToParentFrame();
        QuestionSetPageActions.clickRefreshIcon();
        UtilityFunctions.switchToDefaultContentFrame();
        QuestionSetPageActions.switchToParentFrame();
        QuestionSetPageActions.clickNextBtnInQuestionPage();
        QuestionSetPageActions.clickSubmitInQuestionPage();
        QuestionSetPageActions.clkNextButtonInQuestionPage();
        QuestionSetPageActions.enterQuestionSetTitle();
        QuestionSetPageActions.clkAddButtonInQuestionTitlePage();
        Thread.sleep(4000);
        ResourcePageActions.saveAndCloseIcon();
        ResourcePageActions.clickPreivewIcon();
        UtilityFunctions.switchFrameUsingName();
        QuestionSetPageActions.nextIconPreview();
        QuestionSetPageActions.nextButtonInPreivewPlayer();
        QuestionSetPageActions.nextIconPreview();
        QuestionSetPageActions.nextButtonInPreivewPlayer();
        QuestionSetPageActions.nextIconPreview();
        QuestionSetPageActions.nextButtonInPreivewPlayer();


    }


    @Test(description = "Post enabling user should be able to see the forum icon in dashboard page")
    public void ForumIconInViewCourseDashboardInBatch() throws Exception {

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
        UtilityFunctions.refreshPage();
        BatchPageActions.clickViewCourseDashboard();
        Thread.sleep(1000);
        BatchPageActions.clickBatchDropdown();
        BatchPageActions.selectBatchNameInDropdown();
        GroupsPageActions.clickForumIcon();
        GroupsPageActions.assertCloseIcon();
    }
    @Test(description = "Verify that the book creator is able to generate the bulk QR codes for the draft book")
    public void DownloadBulkQRcodeForDraftBook() throws Exception {

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
        BookPageActions.generateQrCode("2");
        BookPageActions.downloadQrCode();
        BookPageActions.generateQrCode("245");
        BookPageActions.downloadQrCode();
    }


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
    public void Showimmediatefeedback() throws Exception {

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
    public void VerifyLastUpdatedDateAndTimeInBatchViewDashboard() throws Exception {

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
    public void DisableDiscussionForumAndItsMessageInPopup() throws Exception {
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
    public void ValidateDetailsInCourseCardInMyCourseSection() throws Exception {
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
    public void VerifyCorrectOrderingForClassMediumSubect() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickDigitalTextbookTab();
        DashBoardFiltersPageActions.assertOrderOfMediumClassSubjectFiltres();

    }
    @Test(description = "The user should be displayed with the kebab menu in the course progress section once course is consumed with 100%")
    public void SyncProgressNowForCourse() throws Exception {
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
    public void VerifyDiscussionForumSectionInCourseContentDetailsPage() throws Exception {

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
    public void ContentShouldLoadAsPerPublishedUserTypeInDigitalTextbookTab() throws Exception {

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
    public void AddCollobratorToDraftBook() throws Exception {
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
    @Test(description = "The user should be able to  the csv file in published section")
    public void DownloadCourseQRCodeInPublishedSection() throws Exception {
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
    public void ValidateGuestNameAndRoleAndBMCAndLocationDetailsInProfile() throws Exception {
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
    public void VerifyMultipleMediumAndClassTaggedInBook() throws Exception {
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
    public void UserAbleToSelectStateBlockClusterAndSchoolInLocationPopupForNewUser() throws Exception {
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
    public void MergeCustodianAccount() throws Exception {
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
    public void VerifySunbirdLogo() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        DashboardPageActions.assertSunbirdLogo();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.assertSunbirdLogo();

    }


    @Test(description = " The user should be displayed with Toast message It is the Last Attempt left when user clicks on the assessment on the Last attempt.")
    public void VerifyNumberOfMaximumAttemptsWhenCourseAssesmentAddedToCourse () throws Exception {

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
    public void SearchTVLessonTypeContent() throws Exception {

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
    @Test(description="Verify Submit Details button and My details Section in Profile")
    public void FillSubmitDetailsFormInProfile() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("New_User1"),
                sunbird_config.getSunbidConfigPropertyValue("New_PWD1"));
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
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnProfileForLoginUser();
        ProfilePageActions.verifySubmitDetails();
        ProfilePageActions.clickOnSubmitDetails();
        ProfilePageActions.clickOnTenantDropDown();
        ProfilePageActions.selectTenantFromDropDown();
        ProfilePageActions.selectCheckBoxFromTeacherForm();
        ProfilePageActions.clickOnSubmitButtonInTeacherForm();
        ProfilePageActions.assertToasterMsgOfTeacherForm();
        ProfilePageActions.clickOnOkButtonInAlertMsgOfTeacherForm();
        ProfilePageActions.validateMyDetailsLabel();
    }

}





