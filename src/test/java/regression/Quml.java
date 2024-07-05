package regression;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageActions.*;
import org.testng.annotations.Test;

public class Quml extends BaseTestConfig {


    @Test(description = "User should be able to see values when click on summary type dropdown")
    public void UserAbleToSeeDropDownValuesOfSummaryTypeField() throws Exception {
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
        CreateQuestionSetPageActions.selectSummaryType();
        CreateQuestionSetPageActions.validateDropDownValuesOfCompleteSummaryType();
        CreateQuestionSetPageActions.validateDropDownValuesOfDurationSummaryType();
        CreateQuestionSetPageActions.validateDropDownValuesOfScoreSummaryType();
        CreateQuestionSetPageActions.validateDropDownValuesOfScoreAndDurationSummaryType();
    }

    @Test(description = "user should able to create only main section under question set")
    public void VerifyAbleToCreateOnlyMainSectionUnderQuestionSet() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
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
        CreateQuestionSetPageActions.assertAddChildButtonDisabled();
    }

    @Test(description = "Creator should able to add images to question, answer and solution field for MCQ type question")
    public void UserAbleToCreateSubjectiveQuestionWithImageInQuestionAnswerAndSolution() throws Exception {
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
        CreateQuestionSetPageActions.addImageToQuestionField();
        CreateQuestionSetPageActions.uploadImageInQuestion();
        CreateQuestionSetPageActions.addImageToAnswerField();
        CreateQuestionSetPageActions.uploadImageInQuestion();
        CreateQuestionSetPageActions.clickOnChooseTypeDropDownInSolutionField();
        CreateQuestionSetPageActions.selectTextAndImageType();
        CreateQuestionSetPageActions.addImageToSolutionField();
        CreateQuestionSetPageActions.uploadImageInQuestion();
        String title = CreateQuestionSetPageActions.questionTitle();
        CreateQuestionSetPageActions.questionMarks("10");
        CreateQuestionSetPageActions.clickSave();
    }

    @Test(description = "Creator should able to add images to question, Options and solution field for MCQ type question")
    public void userAbleToCreateMCQQuestionWithImageInQuestionOptionAndSolution() throws Exception {
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
        CreateQuestionSetPageActions.addImageToQuestionField();
        CreateQuestionSetPageActions.uploadImageInQuestion();
        CreateQuestionSetPageActions.addImageToOptionField1();
        CreateQuestionSetPageActions.uploadImageInOptionField1();
        CreateQuestionSetPageActions.addImageToOptionField2();
        CreateQuestionSetPageActions.uploadImageInOptionField2();
        CreateQuestionSetPageActions.clickOnChooseTypeDropDownInSolutionField();
        CreateQuestionSetPageActions.selectTextAndImageType();
        CreateQuestionSetPageActions.addImageToSolutionField();
        CreateQuestionSetPageActions.uploadImageInQuestion();
        CreateQuestionSetPageActions.clickCorrectAnswers();
        String title = CreateQuestionSetPageActions.questionTitle();
        CreateQuestionSetPageActions.clickSave();
    }

    @Test(description = "Creator should be able to create subjective type Questions with solution as video")
    public void UserAbleToCreateSubjectiveQuestionWithVideoInSolutionField() throws Exception {
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
        CreateQuestionSetPageActions.clickOnChooseTypeDropDownInSolutionField();
        CreateQuestionSetPageActions.selectVideoTypeInSolutionField();
        CreateQuestionSetPageActions.uploadVideoToSolutionField();
        String title = CreateQuestionSetPageActions.questionTitle();
        CreateQuestionSetPageActions.questionMarks("10");
        CreateQuestionSetPageActions.clickSave();
    }


    @Test(description = "user should click on Replay button in end page it should go to instruction page")
    public void UserClicksOnReplayButtonThenItsTakesToInstructionPage() throws Exception {
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
        UtilityFunctions.scrollDownUsingPixelValue();
        String instruction = CreateQuestionSetPageActions.instructionSection();
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
        CreateQuestionSetPageActions.clickPreviewButton();
        CreateQuestionSetPageActions.clickOnNextButton(3);
        CreateQuestionSetPageActions.clickOnReplyButton();
        CreateQuestionSetPageActions.assertInstructionText(instruction);
    }

    @Test(description = "user should able to see all text and field in questionset section page")
    public void VerifyAllTheTextFieldIsDisplayInQuestionsetSectionPage() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
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
        CreateQuestionSetPageActions.verifyQuestionSetSectionPage();
    }

    @Test(description = "Creator should be able to add Questions from Library")
    public void CreatorIsAbleToAddQuestionsFromLibrary() throws Exception {
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
        BookPageActions.clickAddFromLibraryBtn();
        CreateQuestionSetPageActions.clickOnResetButton();
        String questionname = CreateQuestionSetPageActions.selectFirstQuestionFromAddFromlibarary();
        CreateQuestionSetPageActions.addQuestionButton();
        CreateQuestionSetPageActions.assertAddedQuestionNameWebElementAsString(questionname);
    }

    @Test(description = "Reviewer should able to reject the Question Set")
    public void ReviewerShouldAbleToRejectTheQuestionSet() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.assertWorkspace();
        DashboardPageActions.clickOnWorkSpace();
        WorkspaceDashboardPageActions.clickOnQuestionSet();
        String createdquestionsetdoid = CreateQuestionSetPageActions.fillQuestionSetSection1("getdoid");
        CreateQuestionSetPageActions.BMCDropdownSelectionSection2();
        CreateQuestionSetPageActions.selectAudienceType();
        CreateQuestionSetPageActions.setMaxTime("5", "10");
        BookPageActions.clickSaveAsDrafts();
        BookPageActions.assertContentIsSavedToastrMsg();
        BookPageActions.waitContentIsSavedToastToDisapper();
        BookPageActions.clickAddChild();
        BookPageActions.clickAddFromLibraryBtn();
        CreateQuestionSetPageActions.clickOnResetButton();
        String questionname = CreateQuestionSetPageActions.selectFirstQuestionFromAddFromlibarary();
        CreateQuestionSetPageActions.addQuestionButton();
        BookPageActions.submitAndSendForReview();
         DashboardPageActions.logOut();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnWorkSpace();
        ReviewPageActions.reviewAndRejectContent(createdquestionsetdoid, "Questionset");
    }
    @Test(description = "Reviewer should able to Publish the Question Set")
    public void ReviewerShouldAbleToPublishTheQuestionSet() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.assertWorkspace();
        DashboardPageActions.clickOnWorkSpace();
        WorkspaceDashboardPageActions.clickOnQuestionSet();
        String createdquestionsetdoid = CreateQuestionSetPageActions.fillQuestionSetSection1("getdoid");
        CreateQuestionSetPageActions.BMCDropdownSelectionSection2();
        CreateQuestionSetPageActions.selectAudienceType();
        CreateQuestionSetPageActions.setMaxTime("5", "10");
        BookPageActions.clickSaveAsDrafts();
        BookPageActions.assertContentIsSavedToastrMsg();
        BookPageActions.waitContentIsSavedToastToDisapper();
        BookPageActions.clickAddChild();
        BookPageActions.clickAddFromLibraryBtn();
        CreateQuestionSetPageActions.clickOnResetButton();
        String questionname= CreateQuestionSetPageActions.selectFirstQuestionFromAddFromlibarary();
        CreateQuestionSetPageActions.addQuestionButton();
        BookPageActions.submitAndSendForReview();
        DashboardPageActions.logOut();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnWorkSpace();
        ReviewPageActions.reviewAndPublishContent(createdquestionsetdoid,"Questionset");
    }
    @Test(description = "Creator should able to search with questionset do id and name in All my content section and up for review section")
    public void CreatorAbleToSearchWithDoidAndQuestiosetNameInAllMyContentAndUpForReviewSection() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.assertWorkspace();
        DashboardPageActions.clickOnWorkSpace();
        WorkspaceDashboardPageActions.clickOnQuestionSet();
        String createdQuestionsetName = CreateQuestionSetPageActions.fillQuestionSetSection1("getContentName");
        String createdQuestionsetDoId = UtilityFunctions.generate_Do_id();
        CreateQuestionSetPageActions.BMCDropdownSelectionSection2();
        CreateQuestionSetPageActions.selectAudienceType();
        CreateQuestionSetPageActions.setMaxTime("5", "10");
        BookPageActions.clickSaveAsDrafts();
        BookPageActions.assertContentIsSavedToastrMsg();
        BookPageActions.waitContentIsSavedToastToDisapper();
        BookPageActions.clickAddChild();
        BookPageActions.clickAddFromLibraryBtn();
        CreateQuestionSetPageActions.clickOnResetButton();
        String questionname= CreateQuestionSetPageActions.selectFirstQuestionFromAddFromlibarary();
        CreateQuestionSetPageActions.addQuestionButton();
        BookPageActions.submitAndSendForReview();
        AllMyContentPageActions.enterContentInSearchBox(createdQuestionsetName);
        CreateQuestionSetPageActions.getAndAssertQuestionName(createdQuestionsetName);
        WorkspaceDashboardPageActions.clickAllMyContent();
        AllMyContentPageActions.enterContentInSearchBox(createdQuestionsetDoId);
        CreateQuestionSetPageActions.getAndAssertQuestionName(createdQuestionsetName);
        DashboardPageActions.logOut();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnWorkSpace();
        WorkspaceDashboardPageActions.upForReviewSelection();
        AllMyContentPageActions.enterContentInSearchBox(createdQuestionsetName);
        CreateQuestionSetPageActions.getAndAssertQuestionName(createdQuestionsetName);
        WorkspaceDashboardPageActions.upForReviewSelection();
        AllMyContentPageActions.enterContentInSearchBox(createdQuestionsetDoId);
        CreateQuestionSetPageActions.getAndAssertQuestionName(createdQuestionsetName);
    }
    @Test(description = "MCQ type question should support three layout during creation")
    public void ValidateGridVerticalHorizontalLayouInPreviewPlayertWhileCreatingQuestion() throws Exception {
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
        CreateQuestionSetPageActions.selectGridLayout();
        CreateQuestionSetPageActions.optionParagraph();
        CreateQuestionSetPageActions.optionParagraph2();
        CreateQuestionSetPageActions.clickOnAddOption(2);
        CreateQuestionSetPageActions.optionParagraph3();
        CreateQuestionSetPageActions.optionParagraph4();
        CreateQuestionSetPageActions.clickCorrectAnswers();
        String title = CreateQuestionSetPageActions.questionTitle();
        CreateQuestionSetPageActions.clickPreviewButton();
        CreateQuestionSetPageActions.assertGridLayout();
        CreateQuestionSetPageActions.clickOnEditButton();
        CreateQuestionSetPageActions.selectVerticalLayout();
        CreateQuestionSetPageActions.clickPreviewButton();
        CreateQuestionSetPageActions.assertVerticalLayout();
        CreateQuestionSetPageActions.clickOnEditButton();
        CreateQuestionSetPageActions.selectHorizontalLayout();
        CreateQuestionSetPageActions.clickPreviewButton();
        CreateQuestionSetPageActions.assertHorizontalLayout();
    }


    @Test(description = "Try again and view solution button should displayed on the questionset preview if show feed back is enabled in the section node for the created MCQ question on providing the incorrect answer.")
    public void UserShouldGetTryAgainAndSolutionInPopupWhileProvidingWrongAnswer() throws Exception {
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
        CreateQuestionSetPageActions.enableFeedbackOption();
        CreateQuestionSetPageActions.enableSolutionOption();
        BookPageActions.clickSaveAsDrafts();
        BookPageActions.waitContentIsSavedToastToDisapper();
        CreateQuestionSetPageActions.clickCreateNew();
        CreateQuestionSetPageActions.clickMcqTemplate();
        CreateQuestionSetPageActions.clickNextBtn();
        CreateQuestionSetPageActions.questParagraph();
        CreateQuestionSetPageActions.optionParagraph();
        CreateQuestionSetPageActions.optionParagraph2();
        UtilityFunctions.scrollDownUsingPixelValue();
        CreateQuestionSetPageActions.clickOnChooseTypeDropDownInSolutionField();
        CreateQuestionSetPageActions.selectTextAndImageType();
        CreateQuestionSetPageActions.solutionParagraph();
        CreateQuestionSetPageActions.clickCorrectAnswers();
        String title = CreateQuestionSetPageActions.questionTitle();
        CreateQuestionSetPageActions.clickSave();
        CreateQuestionSetPageActions.assertQuestionCreatedToastrMsg();
        CreateQuestionSetPageActions.clickPreviewButton();
        CreateQuestionSetPageActions.clickOnNextButton(2);
        CreateQuestionSetPageActions.selectWrongAnswer();
        CreateQuestionSetPageActions.clickOnNextButton(1);
        CreateQuestionSetPageActions.assertFeedbackPopUp();
        CreateQuestionSetPageActions.assertSolutionButton();
    }

    @Test(description = "Creator should be able to create Question and answer with Bold Text for MCQ and subjective questions")
    public void CreateQuestionAndAnswerWithBoldTextForMCQAndSubjectiveQuestion() throws Exception {
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
        Thread.sleep(2000);
        CreateQuestionSetPageActions.clickCreateNew();
        CreateQuestionSetPageActions.clickMcqTemplate();
        CreateQuestionSetPageActions.clickNextBtn();
        String BoldTextFromMCQQuestion=CreateQuestionSetPageActions.selectBoldFontQuestion();
        CreateQuestionSetPageActions.selectBoldFontOption1();
        CreateQuestionSetPageActions.selectBoldFontOption2();
        CreateQuestionSetPageActions.clickCorrectAnswers();
        String title = CreateQuestionSetPageActions.questionTitle();
        CreateQuestionSetPageActions.clickPreviewButton();
        CreateQuestionSetPageActions.assertMCQBoldText(BoldTextFromMCQQuestion);
        CreateQuestionSetPageActions.clickOnEditButton();
        CreateQuestionSetPageActions.clickSave();
        CreateQuestionSetPageActions.assertQuestionCreatedToastrMsg();
        CreateQuestionSetPageActions.selectSection();
        CreateQuestionSetPageActions.clickCreateNew();
        CreateQuestionSetPageActions.clickSubjectiveTemplate();
        CreateQuestionSetPageActions.clickNextBtn();
        String BoldTextFromSubjectiveQuestion=CreateQuestionSetPageActions.selectBoldFontQuestion();
        CreateQuestionSetPageActions.selectBoldFontAnswer();
        String title2 = CreateQuestionSetPageActions.questionTitle();
        CreateQuestionSetPageActions.questionMarks("10");
        CreateQuestionSetPageActions.clickPreviewButton();
        CreateQuestionSetPageActions.assertMCQSubjectiveText(BoldTextFromSubjectiveQuestion);
    }
    @Test(description = "Creator should able to preview the MCQ Question by selecting multiple options and User is not able to select more than 2 options if we provide 2 correct option while creating question")
    public void CreatorShouldAbleToCreateMCQQuestionBySelectingMultipleOptions() throws Exception {
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
        BookPageActions.waitContentIsSavedToastToDisapper();
        CreateQuestionSetPageActions.clickCreateNew();
        CreateQuestionSetPageActions.clickMcqTemplate();
        CreateQuestionSetPageActions.clickNextBtn();
        CreateQuestionSetPageActions.questParagraph();
        CreateQuestionSetPageActions.optionParagraph();
        CreateQuestionSetPageActions.optionParagraph2();
        CreateQuestionSetPageActions.clickOnAddOption(2);
        CreateQuestionSetPageActions.optionParagraph3();
        CreateQuestionSetPageActions.optionParagraph4();
        CreateQuestionSetPageActions.clickCorrectAnswers();
        CreateQuestionSetPageActions.clickCorrectAnswers2();
        String title = CreateQuestionSetPageActions.questionTitle();
        CreateQuestionSetPageActions.clickPreviewButton();
        CreateQuestionSetPageActions.selectMultipleOption1();
        CreateQuestionSetPageActions.selectMultipleOption2();
        CreateQuestionSetPageActions.assertOptionIsDisabled();
    }

    @Test(description = "Creator should able to send the Questionset for review after creating MCQ questions with multiple options and able to publish it ")
    public void CreatorShouldSendForReviewForMCQQuestionOfMultipleOptionsAndPublishit() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.assertWorkspace();
        DashboardPageActions.clickOnWorkSpace();
        WorkspaceDashboardPageActions.clickOnQuestionSet();
        String createdquestionsetdoid = CreateQuestionSetPageActions.fillQuestionSetSection1("getdoid");
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
        CreateQuestionSetPageActions.clickOnAddOption(2);
        CreateQuestionSetPageActions.optionParagraph3();
        CreateQuestionSetPageActions.optionParagraph4();
        CreateQuestionSetPageActions.clickCorrectAnswers();
        CreateQuestionSetPageActions.clickCorrectAnswers2();
        String title = CreateQuestionSetPageActions.questionTitle();
        CreateQuestionSetPageActions.clickSave();
        CreateQuestionSetPageActions.assertQuestionCreatedToastrMsg();
        BookPageActions.submitAndSendForReview();
        DashboardPageActions.logOut();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnWorkSpace();
        ReviewPageActions.reviewAndPublishContent(createdquestionsetdoid,"Questionset");
    }
    @Test(description = "Creator should able to send the Questionset for review after creating MCQ questions with multiple options and able to reject it ")
    public void CreatorShouldSendForReviewForMCQQuestionOfMultipleOptionsAndRejectIt() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.assertWorkspace();
        DashboardPageActions.clickOnWorkSpace();
        WorkspaceDashboardPageActions.clickOnQuestionSet();
        String createdquestionsetdoid = CreateQuestionSetPageActions.fillQuestionSetSection1("getdoid");
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
        CreateQuestionSetPageActions.clickOnAddOption(2);
        CreateQuestionSetPageActions.optionParagraph3();
        CreateQuestionSetPageActions.optionParagraph4();
        CreateQuestionSetPageActions.clickCorrectAnswers();
        CreateQuestionSetPageActions.clickCorrectAnswers2();
        String title = CreateQuestionSetPageActions.questionTitle();
        CreateQuestionSetPageActions.clickSave();
        CreateQuestionSetPageActions.assertQuestionCreatedToastrMsg();
        BookPageActions.submitAndSendForReview();
        DashboardPageActions.logOut();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnWorkSpace();
        ReviewPageActions.reviewAndRejectContent(createdquestionsetdoid, "Questionset");
    }

    @Test(description = "User should be able to shuffle the questions within the section")
    public void UserIsAbleToShuffleQuestionsWithInSectionWhenShuffleIsEnabled() throws Exception {
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
        String FetchQuestionName = CreateQuestionSetPageActions.questMCQParagraph();
        CreateQuestionSetPageActions.optionParagraph();
        CreateQuestionSetPageActions.optionParagraph2();
        CreateQuestionSetPageActions.clickCorrectAnswers();
        CreateQuestionSetPageActions.questionMCQTitle();
        CreateQuestionSetPageActions.clickSave();
        CreateQuestionSetPageActions.assertQuestionCreatedToastrMsg();
        CreateQuestionSetPageActions.selectSection();
        CreateQuestionSetPageActions.clickCreateNew();
        CreateQuestionSetPageActions.clickSubjectiveTemplate();
        CreateQuestionSetPageActions.clickNextBtn();
        CreateQuestionSetPageActions.questSubjParagraph();
        CreateQuestionSetPageActions.optionParagraph();
        CreateQuestionSetPageActions.questionSubjectiveTitle();
        CreateQuestionSetPageActions.questionMarks("10");
        CreateQuestionSetPageActions.clickSave();
        CreateQuestionSetPageActions.assertQuestionCreatedToastrMsg();
        BookPageActions.clickSaveAsDrafts();
        CreateQuestionSetPageActions.selectSection();
        CreateQuestionSetPageActions.clickPreviewButton();
        CreateQuestionSetPageActions.clickOnNextButton(2);
        CreateQuestionSetPageActions.assertFirstQuestionName(FetchQuestionName);
        CreateQuestionSetPageActions.clickOnNextButton(2);
        CreateQuestionSetPageActions.clickOnReplyButton();
        CreateQuestionSetPageActions.clickOnNextButton(2);
        CreateQuestionSetPageActions.assertShuffleQuestion(FetchQuestionName);
    }
    @Test(description = "Answer button should getting displayed on preview for individual MCQ question")
    public void AnswerIconisDisplayedOnceClickTheCorrectOptionWhilePreviewingTheMCQQuestion() throws Exception {
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
        CreateQuestionSetPageActions.enableFeedbackOption();
        CreateQuestionSetPageActions.enableSolutionOption();
        BookPageActions.clickSaveAsDrafts();
        BookPageActions.waitContentIsSavedToastToDisapper();
        CreateQuestionSetPageActions.clickCreateNew();
        CreateQuestionSetPageActions.clickMcqTemplate();
        CreateQuestionSetPageActions.clickNextBtn();
        CreateQuestionSetPageActions.questMCQParagraph();
        CreateQuestionSetPageActions.optionParagraph();
        CreateQuestionSetPageActions.optionParagraph2();
        UtilityFunctions.scrollDownUsingPixelValue();
        CreateQuestionSetPageActions.clickOnChooseTypeDropDownInSolutionField();
        CreateQuestionSetPageActions.selectTextAndImageType();
        CreateQuestionSetPageActions.solutionParagraph();
        CreateQuestionSetPageActions.clickCorrectAnswers();
        CreateQuestionSetPageActions.questionSubjectiveTitle();
        CreateQuestionSetPageActions.clickPreviewButton();
        CreateQuestionSetPageActions.selectOption();
        CreateQuestionSetPageActions.assertAnswerIcon();
    }

    @Test(description = "user should be able to click on the Copy button and should get success popup for questionset")
    public void UserIsAbleToClickOnCopyButtonAndGetSuccessPopup() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("QS"));
        QuestionSetPageActions.clickCopyButton();
        QuestionSetPageActions.assertQuestionsetCopyToastrMsg();
    }
    @Test(description = "Reviewer should be able to Publish the question set which is max questions selected")
    public void ReviewerAbleToPublishQuestionsetBySelectingMaxQuestionInSection() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.assertWorkspace();
        DashboardPageActions.clickOnWorkSpace();
        WorkspaceDashboardPageActions.clickOnQuestionSet();
        String createdquestionsetdoid = CreateQuestionSetPageActions.fillQuestionSetSection1("getdoid");
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
        CreateQuestionSetPageActions.questMCQParagraph();
        CreateQuestionSetPageActions.optionParagraph();
        CreateQuestionSetPageActions.optionParagraph2();
        CreateQuestionSetPageActions.clickCorrectAnswers();
        CreateQuestionSetPageActions.questionMCQTitle();
        CreateQuestionSetPageActions.clickSave();
        CreateQuestionSetPageActions.assertQuestionCreatedToastrMsg();
        CreateQuestionSetPageActions.clickOnSection();
        CreateQuestionSetPageActions.clickCreateNew();
        CreateQuestionSetPageActions.clickSubjectiveTemplate();
        CreateQuestionSetPageActions.clickNextBtn();
        CreateQuestionSetPageActions.questSubjParagraph();
        CreateQuestionSetPageActions.optionParagraph();
        CreateQuestionSetPageActions.questionSubjectiveTitle();
        CreateQuestionSetPageActions.questionMarks("10");
        CreateQuestionSetPageActions.clickSave();
        CreateQuestionSetPageActions.assertQuestionCreatedToastrMsg();
        CreateQuestionSetPageActions.clickOnSection();
        String Maxquestionvalue=QuestionSetPageActions.selectMaxQuestion();
        CreateQuestionSetPageActions.clickPreviewButton();
        CreateQuestionSetPageActions.assertMaxQuestionInPreview(Maxquestionvalue);
        CreateQuestionSetPageActions.clickOnPreviewCloseIcon();
        BookPageActions.submitAndSendForReview();
        DashboardPageActions.logOut();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnWorkSpace();
        ReviewPageActions.reviewAndPublishContent(createdquestionsetdoid,"Questionset");
    }
    @Test(description = "Reviewer should be able reject the question set which is max questions selected")
    public void ReviewerAbleToRejectQuestionsetBySelectingMaxQuestionInSection() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.assertWorkspace();
        DashboardPageActions.clickOnWorkSpace();
        WorkspaceDashboardPageActions.clickOnQuestionSet();
        String createdquestionsetdoid = CreateQuestionSetPageActions.fillQuestionSetSection1("getdoid");
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
        CreateQuestionSetPageActions.questMCQParagraph();
        CreateQuestionSetPageActions.optionParagraph();
        CreateQuestionSetPageActions.optionParagraph2();
        CreateQuestionSetPageActions.clickCorrectAnswers();
        CreateQuestionSetPageActions.questionMCQTitle();
        CreateQuestionSetPageActions.clickSave();
        CreateQuestionSetPageActions.assertQuestionCreatedToastrMsg();
        CreateQuestionSetPageActions.clickOnSection();
        CreateQuestionSetPageActions.clickCreateNew();
        CreateQuestionSetPageActions.clickSubjectiveTemplate();
        CreateQuestionSetPageActions.clickNextBtn();
        CreateQuestionSetPageActions.questSubjParagraph();
        CreateQuestionSetPageActions.optionParagraph();
        CreateQuestionSetPageActions.questionSubjectiveTitle();
        CreateQuestionSetPageActions.questionMarks("10");
        CreateQuestionSetPageActions.clickSave();
        CreateQuestionSetPageActions.assertQuestionCreatedToastrMsg();
        CreateQuestionSetPageActions.clickOnSection();
        String Maxquestionvalue = QuestionSetPageActions.selectMaxQuestion();
        CreateQuestionSetPageActions.clickPreviewButton();
        CreateQuestionSetPageActions.assertMaxQuestionInPreview(Maxquestionvalue);
        CreateQuestionSetPageActions.clickOnPreviewCloseIcon();
        BookPageActions.submitAndSendForReview();
        DashboardPageActions.logOut();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnWorkSpace();
        ReviewPageActions.reviewAndRejectContent(createdquestionsetdoid,"Questionset");
    }

    @Test(description = "user should first land on root node instruction page and progress bar should point to \"i\" on portal")
    public void ProgressBarPointToIWhenLandOnTheRootNodeInstructionPage() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("QS"));
        QuestionSetPageActions.assertProgressBariIcon();
    }
    @Test(description = "Reviewer should be able to publish the Question set having Multiple choice Questions with video in Solution field.")
    public void ReviewerAbleToPublishQuestionsethavingMCQWithVideoInSolutionField() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.assertWorkspace();
        DashboardPageActions.clickOnWorkSpace();
        WorkspaceDashboardPageActions.clickOnQuestionSet();
        String createdquestionsetdoid = CreateQuestionSetPageActions.fillQuestionSetSection1("getdoid");
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
        CreateQuestionSetPageActions.questMCQParagraph();
        CreateQuestionSetPageActions.optionParagraph();
        CreateQuestionSetPageActions.optionParagraph2();
        CreateQuestionSetPageActions.clickOnChooseTypeDropDownInSolutionField();
        CreateQuestionSetPageActions.selectVideoTypeInSolutionField();
        CreateQuestionSetPageActions.uploadVideoToSolutionField();
        CreateQuestionSetPageActions.clickCorrectAnswers();
        CreateQuestionSetPageActions.questionMCQTitle();
        CreateQuestionSetPageActions.clickSave();
        CreateQuestionSetPageActions.assertQuestionCreatedToastrMsg();
        BookPageActions.submitAndSendForReview();
        DashboardPageActions.logOut();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnWorkSpace();
        ReviewPageActions.reviewAndPublishContent(createdquestionsetdoid,"Questionset");
    }

    @Test(description = "creator is able to preview the MCQ and subjective Question in Landscape mode by default,")
    public void CreatorIsAbleToPreviewMCQANDSubjectiveQuestionInlandscapeModeByDefault() throws Exception {
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
        CreateQuestionSetPageActions.questMCQParagraph();
        CreateQuestionSetPageActions.optionParagraph();
        CreateQuestionSetPageActions.optionParagraph2();
        CreateQuestionSetPageActions.clickCorrectAnswers();
        CreateQuestionSetPageActions.questionMCQTitle();
        CreateQuestionSetPageActions.clickPreviewButton();
        CreateQuestionSetPageActions.assertMCQPlayInLandscapeModeByDefault();
        CreateQuestionSetPageActions.clickOnEditButton();
        CreateQuestionSetPageActions.clickSave();
        CreateQuestionSetPageActions.assertQuestionCreatedToastrMsg();
        CreateQuestionSetPageActions.selectSection();
        CreateQuestionSetPageActions.clickCreateNew();
        CreateQuestionSetPageActions.clickSubjectiveTemplate();
        CreateQuestionSetPageActions.clickNextBtn();
        CreateQuestionSetPageActions.questSubjParagraph();
        CreateQuestionSetPageActions.optionParagraph();
        CreateQuestionSetPageActions.questionSubjectiveTitle();
        CreateQuestionSetPageActions.questionMarks("10");
        CreateQuestionSetPageActions.clickPreviewButton();
        CreateQuestionSetPageActions.assertSubjectivePlayInLandscapeModeByDefault();
        CreateQuestionSetPageActions.clickOnEditButton();
        CreateQuestionSetPageActions.clickSave();
        CreateQuestionSetPageActions.assertQuestionCreatedToastrMsg();

    }
}
