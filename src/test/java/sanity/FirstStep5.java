package sanity;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageActions.*;
import com.sunbird.PageObjects.ObservationPage;
import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.testng.annotations.Test;

public class FirstStep5 extends BaseTestConfig {



//    @Test(description = "User should be able to search and consume the published content.\n")
//    public void verifyThatUserIsAbleToSearchAndConsumeThePublishedContent() throws Exception {
//
//        OnBoardingActions.RolePoup();
//        OnBoardingActions.BMCPopup();
//        OnBoardingActions.LocationPopup();
//        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
//        DashboardPageActions.clickUserProfileIcon();
//        DashboardPageActions.assertWorkspace();
//        DashboardPageActions.clickOnWorkSpace();
//        UploadPageActions.uploadContent("PDF");
//        String resourceName = UploadPageActions.sendUploadContentForReview();
//        DashboardPageActions.logOut();
//        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
//        DashboardPageActions.clickUserProfileIcon();
//        DashboardPageActions.clickOnWorkSpace();
//        ReviewPageActions.reviewAndPublishContent(resourceName,"Upload");
//        DashboardPageActions.logOut();
//
//        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
//                    sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
//            DashboardPageActions.clickUserProfileIcon();
//            DashboardPageActions.assertWorkspace();
//            DashboardPageActions.clickOnWorkSpace();
//            WorkspaceDashboardPageActions.clickBook();
//            String createdContent = BookPageActions.createBookPopup("getdoid");
//            String des=BookPageActions.section1("getdescription");
//            BookPageActions.BMCDropdownSelectionSection2();
//            BookPageActions.Section3();
//            BookPageActions.assertContentIsSavedToastrMsg();
//            BookPageActions.waitContentIsSavedToastToDisapper();
//            BookPageActions.addResourceInLibrarySection(resourceName);
//            BookPageActions.submitAndSendForReview();
//            DashboardPageActions.logOut();
//            LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
//                    sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
//            DashboardPageActions.clickUserProfileIcon();
//            DashboardPageActions.clickOnWorkSpace();
//            ReviewPageActions.reviewAndPublishContent(createdContent, "Book");
//        DashboardPageActions.logOut();
//
//        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("PUBLIC_USER"),
//                sunbird_config.getSunbidConfigPropertyValue("PUBLIC_PASSWORD"));
//        DashboardPageActions.searchContentAndClickOnContentCard(createdContent);
//        ConsumptionPageActions.consumePDF();
//        ConsumptionPageActions.giveRating(3);
//    }


 /*   @Test(description = "Users view observations as tiles")
    public void validateObservationListsInObservationTab() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickOnObservationTab();
ObservationPageActions.assertObservationCount();
        ObservationPageActions.clickOnObservationCard();
        ObservationPageActions.assertObservationDetails();
    }*/

    @Test(description = "Post uploading and saving, content resides in all my bucket .")
    public void verifyUploadContentInAllMyContent() throws Exception {

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


}
