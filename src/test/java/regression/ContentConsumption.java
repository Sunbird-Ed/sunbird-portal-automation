package regression;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageActions.*;
import org.testng.annotations.Test;

import java.io.File;

public class ContentConsumption extends BaseTestConfig {

    @Test(description = "Verify clicking on Next, previous, Zoom in, Zoom out, rotate screen should work for pdf content")
    public void  ConsumePdfAndVerifyNextPreviousZoomInAndZoomOutScenario() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("PDF_Consume"));
        ConsumptionPageActions.clickRotatePDF(2);
        ConsumptionPageActions.clickZoomInPDF(3);
        ConsumptionPageActions.clickZoomOutPDF(2);
        ConsumptionPageActions.clickRotatePDF(2);
        ConsumptionPageActions.clicknextPDF();
        ConsumptionPageActions.clickpreviousPDF();
    }
    @Test(description = "Verify that while consuming single page PDF, user should click on next button to reach the end page, end page should not come when user scrolls the PDF")
    public void  verifSinglePagePDF() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("PDF_SINGLEPAGE"));
        ConsumptionPageActions.clickNextButton();
        ConsumptionPageActions.giveRating(3);
        ConsumptionPageActions.assertcompletionmessage();

    }
    @Test(description = "when the user is viewing the pdf then the User should open it up in full-screen mode while consuming from the portal. Hamburger menu should display for both normal mode and full-screen mode")
    public void ConsumeThePdfWithFullScreenAndHamburgerMenu() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("PDF_Consume"));
        ConsumptionPageActions.clickonHamburger();
        ConsumptionPageActions.clickFullScreen();
        ConsumptionPageActions.consumePDF();
        ConsumptionPageActions.assertminiScreen();
        ConsumptionPageActions.clickonHamburger();
    }
    @Test(description = "Verify, Content creator is able to get the content in Library section by searching with content name")
    public void UserSearchContentInLibrary() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("PDF_Consume"));
        ConsumptionPageActions.consumePDF();
    }
    @Test(description = "Verify when user is viewing the pdf then User should open it up in full screen mode while consuming from portal")
    public void UserAndCreatorAbleToSearchAndConsumeContent() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("PDF_Consume"));
        ConsumptionPageActions.clickFullScreen();
        ConsumptionPageActions.assertminiScreen();
        ConsumptionPageActions.consumePDF();
    }
    @Test(description = "Verify that user is able to Mute or Unmute on clicking on the Volume icon before the progress bar")
    public void  verifymuteunmuteinmp4() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("MP4_Consume"));
        ConsumptionPageActions.clickMute();
        ConsumptionPageActions.clickUnMute();
    }
    @Test(description = "Verify the Download icon should be there for both  normal mode and full screen mode. Click in on Download user should be able to download content.")
    public void  verifyConsumptionOfPDFcontentAndDownload() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("PDF_Consume"));
        ConsumptionPageActions.clickFullScreen();
        ConsumptionPageActions.clickZoomInPDF(3);
        ConsumptionPageActions.clickZoomOutPDF(2);
        ConsumptionPageActions.clickPageLocationAndPercentage();
        ConsumptionPageActions.clickonHamburger();
        ConsumptionPageActions.assertClickonDownload();
        ConsumptionPageActions.clickCloseBtn();
        ConsumptionPageActions.clickMinimizeScreen();
        ConsumptionPageActions.clickZoomInPDF(3);
        ConsumptionPageActions.clickZoomOutPDF(2);
        ConsumptionPageActions.clickPageLocationAndPercentage();
        ConsumptionPageActions.clickonHamburger();
      //  ConsumptionPageActions.clickonDownloadButton();
        Thread.sleep(10000);
        File file=UtilityFunctions.getLatestDownloadedFile(UtilityFunctions.getSystemDownloadPath());
        String fileName=file.getName();
        String splitedName = fileName.split("\\.")[1];
        UtilityFunctions.stringValueComparision(splitedName,"pdf","file not downloaded");
    }



}
