package sanity;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
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




    @Test(description = "Uploading MP4 Content and Reject")
    public void UploadMP4() throws InterruptedException {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.assertWorkspace();
        DashboardPageActions.clickOnWorkSpace();
        UploadPageActions.uploadContent("MP4");
    }


    @Test(description = "Uploading PDF Content And sendForReview and then Publish ")
    public void UploadPDF5() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.assertWorkspace();
        DashboardPageActions.clickOnWorkSpace();
        UploadPageActions.uploadContent("PDF");
        UploadPageActions.clickSendForReview();
        String contentTitleName = UploadPageActions.sendUploadContentForReview();
        DashboardPageActions.logOut();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnWorkSpace();
        ReviewPageActions.reviewAndPublishContent(contentTitleName,"Upload");
    }
    @Test(description = "Create Book with DifferentResourceType")
    public void createBookwithDifferentResourceType() throws Exception {

        OnBoardingActions.RolePoup();
        UtilityFunctions.dynamicElementHandlingForMatSelectTagname3();
        OnBoardingActions.su();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.assertWorkspace();
        DashboardPageActions.clickOnWorkSpace();
        WorkspaceDashboardPageActions.clickBook();
        String createdContent = BookPageActions.createBookPopup("getdoid");
        String des = BookPageActions.section1("getdescription");
        UtilityFunctions.scrollDownUsingPixelValue();
        UtilityFunctions.dynamicElementHandlingForSelectTagname3();
        Thread.sleep(7000);
        UtilityFunctions.scrollUpUsingPixelValue();
        UtilityFunctions.dynamicElementHandlingForUlTagName7();
        Thread.sleep(7000);
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
    }
    @Test(description = "The Course mentor who has content creator and course mentor role  should be able to create the open batch for the courses ")
    public void createOpenBatchesForCourse() throws Exception {

        OnBoardingActions.RolePoup();
        UtilityFunctions.dynamicElementHandlingForMatSelectTagname3();
        OnBoardingActions.su();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.assertWorkspace();
        DashboardPageActions.clickOnWorkSpace();
        WorkspaceDashboardPageActions.clickCourse();
        String createdContent = CoursePageActions.createCourseSection1("getdoid");
        UtilityFunctions.scrollDownUsingPixelValue();
        UtilityFunctions.scrollDownUsingPixelValue();
        UtilityFunctions.dynamicElementHandlingForSelectTagname3();
        Thread.sleep(7000);
        UtilityFunctions.scrollUpUsingPixelValue();
        UtilityFunctions.scrollUpUsingPixelValue();
        UtilityFunctions.dynamicElementHandlingForUlTagName8();
        Thread.sleep(7000);
        BookPageActions.Section3();


        BookPageActions.assertContentIsSavedToastrMsg();
        BookPageActions.waitContentIsSavedToastToDisapper();
        BookPageActions.addResourceFromLibrary();
        BookPageActions.submitAndSendForReview();
    }
}