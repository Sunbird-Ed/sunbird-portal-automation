package regression;

import com.sunbird.GenericLibrary.BaseTestConfig;
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



}
