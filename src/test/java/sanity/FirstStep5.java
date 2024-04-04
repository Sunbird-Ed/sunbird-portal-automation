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

 /*   @Test(description = "User should be able to Create Subjective QuestionSet ByFillingRootNode")
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
              String title= CreateQuestionSetPageActions.questionTitle();
CreateQuestionSetPageActions.questionMarks("10");
      CreateQuestionSetPageActions.clickSave();
      CreateQuestionSetPageActions.assertQuestionCreatedToastrMsg();
      BookPageActions.submitAndSendForReview();
    }*/
/*@Test()
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


    */

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

    @Test(description = "User should be able to create a Question Set by filling all the mandatory details in the root node")
    public void userAbleToCreateMCQQuestionSetByFillingRootNode() throws Exception {

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
        String title= CreateQuestionSetPageActions.questionTitle();
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
        String title= CreateQuestionSetPageActions.questionTitle();
        CreateQuestionSetPageActions.questionMarks("10");
        CreateQuestionSetPageActions.clickSave();
        CreateQuestionSetPageActions.assertQuestionCreatedToastrMsg();
        BookPageActions.submitAndSendForReview();
    }

    @Test()
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

}