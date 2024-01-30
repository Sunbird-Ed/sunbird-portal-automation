package sanity;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageActions.*;
import org.testng.annotations.Test;

public class UploadContent2 extends BaseTestConfig {

    @Test(description = "Uploading PDF Content And sendForReview and then Publish ")
    public void UploadPDF() throws InterruptedException {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();



              LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
       DashboardPageActions.clickUserProfileIcon();
       DashboardPageActions.clickOnWorkSpace();
       ReviewPageActions.reviewAndPubishUploadContent("do_31398039738105036811341");
       
    }




//    @Test(description = "Uploading MP4 Content and Reject")
//    public void UploadMP4() throws InterruptedException {
//
//        OnBoardingActions.RolePoup();
//        OnBoardingActions.BMCPopup();
//        OnBoardingActions.LocationPopup();
//        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
//        DashboardPageActions.clickUserProfileIcon();
//        DashboardPageActions.assertWorkspace();
//        DashboardPageActions.clickOnWorkSpace();
//        UploadPageActions.uploadContent("MP4");
//    }


}