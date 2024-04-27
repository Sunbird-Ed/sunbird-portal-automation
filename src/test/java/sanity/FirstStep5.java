package sanity;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageActions.*;
import com.sunbird.PageObjects.DashboardPage;
import com.sunbird.PageObjects.ObservationPage;
import com.sunbird.PageObjects.QuestionSetPage;
import org.apache.poi.ss.formula.functions.T;
import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.testng.annotations.Test;

public class FirstStep5 extends BaseTestConfig {



   /* @Test()
    public void createMCAandFTBandMCQInResource() throws Exception {

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
*/

   /* @Test(description = "Post enabling user should be able to see the forum icon in dashboard page")
    public void forumIconInViewCourseDashboardInBatch() throws Exception {

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
*/



  /* @Test(description = "User can play all content type in full screen mode")
   public void consumContentInFullScreen() throws Exception {

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

   }*/

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