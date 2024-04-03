package sanity;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageActions.*;
import com.sunbird.PageObjects.DashboardPage;
import com.sunbird.PageObjects.ObservationPage;
import org.apache.poi.ss.formula.functions.T;
import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.testng.annotations.Test;

public class FirstStep5 extends BaseTestConfig {



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
}