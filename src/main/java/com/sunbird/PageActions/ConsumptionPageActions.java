package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.ConsumptionPage;
import org.openqa.selenium.support.PageFactory;


public class ConsumptionPageActions extends BaseTestConfig {

    /*  get the PDFPage Count and consume the content */
    public static void consumePDF() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        int totalPage = consumptionPage.getPDFTotalCount();

        try {
            for (int i = 0; i <= totalPage; i++) {
                consumptionPage.clickOnNextIcon();
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }

    /* give ratings after the consumption */
    public static void giveRating(int a) throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.giveRatingStars(a);
        consumptionPage.tellusMorecheckbox();
        consumptionPage.clickSubmitRatingPopup();
        String actual = consumptionPage.assertThankYouToastrMsg();
        UtilityFunctions.stringValueComparision(actual, SunbirdConstants.thankYouRatingToastrMsg, "Failed on Rating the content");
    }

    /* consume the Mp4 content */
    public static void consumeMp4() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);

        //   String txtBookName= sunbird_config.getSunbidConfigPropertyValue("Textbook_Name");

        // String generatedXpath=  UtilityFunctions.generateXpathUsingContainsWithKeyNameValue(txtBookName);
        // UtilityFunctions.findElementAndClick(generatedXpath);

        Thread.sleep(7000);
        String mp4Name = sunbird_config.getSunbidConfigPropertyValue("MP4_Consume");

        String generatedXpath = UtilityFunctions.generateXpathUsingAttributeNameAndKeynameValue(SunbirdConstants.title, mp4Name);
        UtilityFunctions.findElementAndClick(generatedXpath);

    }

    public static void giveRatingAndAssertToastrMsg(int a) throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.giveRatingStars(a);
        consumptionPage.tellusMorecheckbox();
        consumptionPage.clickSubmitRatingPopup();
        String actual = consumptionPage.assertThankYouToastrMsg1();
        UtilityFunctions.stringValueComparision(actual, SunbirdConstants.thankYouRatingToastrMsg, "Failed on Rating the content");
    }

    public static void clickFullScreen() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.fullScreen();

    }

    public static void assertCourseSuccesfullYCompletedPopupMsg() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.assertCourseCompleteMsg();
    }

    public static void clickCloseIconInCourseCompletePopup() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.closeIconInCongratsPopup();
    }

    public static void clickSyncProgressNow() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.kababMenuOption();
        consumptionPage.syncProgressNow();
    }

    public static void clickNextButtonInQuestionSetCon() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.clickOnNextIconInQuestionSet();
    }

    public static void clickSubmitButtonPlayer() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.submitBtnInPlayer();
    }

    public static void assertLastAttemptToastrMsg() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        String actualMsg = consumptionPage.validateLastAttemptToastrMsg();
        UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.lastAttemptToastrMsg, "Last attempt msg didn't load");

    }

    public static void assertMaximumNoOfAttemptExcededToastrMsg() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        String actualMsg = consumptionPage.validateMaximumNoofAttemptsExceeded();
        UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.maximumNoOfAttemptsExceeded, "maximumNoOfAttemptsExceeded msg didn't load");

    }

    public static void clickContentInTOC() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.contentInTOC();
    }

    public static void assertLastAttemptPopup() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        String actualMsg = consumptionPage.lastRemainingAttemptPopup();
        UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.lastAttemptToastrMsg, "lastAttemptToastrMsg msg didn't load");

    }

    public static void clickOnOkButtonInLastAttemptPopup() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.okBtnInLastAttemptPopup();
    }

    public static void clickRotatePDF(int RotateCount) throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        for (int i = 0; i <= RotateCount; i++) {
            consumptionPage.clickRotatePDF();
        }
    }

    public static void clicknextPDF() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        int totalPage = consumptionPage.getPDFTotalCount();
        for (int i = 0; i < totalPage - 1; i++) {
            consumptionPage.clickOnNextIcon();
        }

    }

    public static void clickpreviousPDF() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        int totalPage = consumptionPage.getPDFTotalCount();
        for (int i = 0; i < totalPage; i++) {
            consumptionPage.clickOnPreviousIcon();
        }
    }

    public static void clickZoomInPDF(int ZoomInCount) throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        for (int i = 0; i <= ZoomInCount; i++) {
            consumptionPage.clickZoomInPDF();
        }
    }

    public static void clickZoomOutPDF(int ZoomOutCount) throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        for (int i = 0; i <= ZoomOutCount; i++) {
            consumptionPage.clickZoomOutPDF();
        }
    }

    public static void clickNextButton() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.clickNextButton();
    }

    public static void assertcompletionmessage() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.assertCompleteMsg();
    }

    public static void clickonHamburger() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.clickonHamburger();
    }

    public static void assertminiScreen() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.assertminiScreen();
    }

    public static void clickMute() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.clickMute();
        consumptionPage.assertClickMute();
    }

    public static void clickUnMute() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.clickUnMute();
        consumptionPage.assertClickUnMute();
    }

    public static void clickPageLocationAndPercentage() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.clickPageLocationAndPercentage();
    }

    public static void assertClickonDownload() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.assertClickonDownload();


    }

    public static void clickCloseBtn() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.clickCloseBtn();
    }

    public static void clickMinimizeScreen() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.minimizeScreen();
    }

    public static void shareIcon() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.shareIcon();
    }

    public static void copyShareIcon() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.copyShareIcon();
    }

    public static void closeShareIcon() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.closeShareIcon();
    }

    public static void assertjoinCourse() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.assertjoinCourse();
    }

    public static void assertconsentPopupTitle() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.assertconsentPopupTitle();
    }


    public static void assertconsentPopupTermsAndConditionMessage() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.assertconsentPopupMessage();
    }

    public static void assertDoNotShare() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.assertDoNotShare();
    }

    public static void assertConsentShareIsDisabled() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.assertConsentShareEnable();
    }

    public static void assertProfilePopupCheckBox() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.assertProfilePopupCheckBox();
    }

    public static void assertProfilePopuptext() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.assertProfilePopuptext();
    }

    public static void profilePopupClickCheckBox() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.profilePopupCheckBox();
    }

    public static void clickProfilePopupContinueBtn() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.profilePopupcontinue();
    }

    public static void backButtonCourse() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.backButtonCourse();
    }

    public static void continueLearningCourse() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.continueLearningCourse();
    }

    public static void assertNoProfilePopuptext() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.assertNoProfilePopuptext();
    }


    public static void assertEnrolmentEndDateExpiredMessageAndColor() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        String color = consumptionPage.verifyEnrolmentEndDateExpiredAndColor();
        UtilityFunctions.stringValueComparision(color, SunbirdConstants.ColorOfCourseEnrolmentEndDateExpiredMessage, "Failed to check the color");
    }
    public static void assertNoEnrolmentEndDateLable() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.assertNoEnrolmentEndDate();
    }

    public static void assertNoCertificateMessage() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.assertcourseCompletionNoCertificateMessage();
    }

    public static void assertNoCertificate() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.assertNoCertificate();
    }

    public static void assertCertificateMessageForCourseCompletionInPopUp() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        String color = consumptionPage.assertcourseCompletionCertificateInPopUp();
        UtilityFunctions.stringValueComparision(color, SunbirdConstants.ColorOfCourseConsumptionMessage, "Failed to check the color");
    }

    public static void clickCertificateDetails() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.clickCertificateDetails();
    }
    public static void assertCertificateRule() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.assertCertificateRule();
    }

    public static void clickNextModule() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.clickNextModule();
    }
    public static void clickPrevModule() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.clickPrevModule();
    }
    public static void assertNoPrevModule() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.assertNoPrevModule();
    }
    public static void assertNoNextModule() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.assertNoNextModule();
    }
    public static void assertNextModule() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.assertNextModule();
    }
    public static void assertModuleCompletionMsg() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.assertModuleCompletionMsg();
    }
    public static void assertPrevModule() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.assertPrevModule();
    }
    public static void closeCertificateMessage() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.closeCertificateMessage();
    }
    public static void clickProfileSharingData() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.clickProfileSharingData();
    }
    public static void updateProfileSharingData() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.updateProfileSharingData();
    }
    public static void updateShareProfile() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.updateShareProfile();
    }
    public static void saveProfile() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.saveProfile();
    }

    public static void verifyConsentToasterProfileMsg() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        consumptionPage.verifyConsentToasterProfileMsg();
    }
    public static void assertStartDate() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        String StartDateValueXpath = consumptionPage.verifyStartDateLabelAndReturnStartDateValueXpath();
        UtilityFunctions.assertWebElementAsString(StartDateValueXpath);
    }
    public static void assertEndDate() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        String EndDateValueXpath = consumptionPage.verifyEndDateLabelAndReturnEndDateValueXpath();
        UtilityFunctions.assertWebElementAsString(EndDateValueXpath);
    }
    public static void assertEnrolmentEndDatenew() throws InterruptedException {
        ConsumptionPage consumptionPage = PageFactory.initElements(driver, ConsumptionPage.class);
        String EnrolmentDateValueXpath = consumptionPage.verifyEnrolmentDateLabelAndReturnEnrolmentDateValueXpath();
        UtilityFunctions.assertWebElementAsString(EnrolmentDateValueXpath);
    }

}
