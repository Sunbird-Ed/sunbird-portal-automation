package regression;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageActions.*;
import org.testng.annotations.Test;
import static com.sunbird.GenericLibrary.BaseTestConfig.sunbird_config;

public class CourseConsumption {

    @Test(description = "Verify in portal User is displayed with Share icon in the Course toc page before clicking on \"Join Course\" button and enrolling to that course \r\n"
            + "Verify in portal that User should be able to share the courses without enrolling to it and only able to consume after enrolling to the course")
    public void VerifyShareIconInCourse() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CourseConsumption_Usr"),
                sunbird_config.getSunbidConfigPropertyValue("CourseConsumption_Pwd"));
        DashboardPageActions.clickUserProfileIcon();
        AddUserPageActions.clickAddPlusIcon();
        String creadtedUserName = AddUserPageActions.enterName();
        AddUserPageActions.addUserBtnInCreation();
        AddUserPageActions.assertAddedUserToastrMsg();
        AddUserPageActions.clickOnCreatedUser(creadtedUserName);
        AddUserPageActions.clickChangeUser();
        AddUserPageActions.checkBoxClick();
        AddUserPageActions.clickContinue();
        OnBoardingActions.RolePoup();
        OnBoardingActions.LocationPopupForSwitchUser();
        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("CourseWithAllContentsWIthAllBatchDetails"));
        ConsumptionPageActions.shareIcon();
        ConsumptionPageActions.copyShareIcon();
        ConsumptionPageActions.closeShareIcon();
        ConsumptionPageActions.assertjoinCourse();
        BatchPageActions.clickJoinCourse();
        BatchPageActions.clickDoNotShareBtn();
    }

    @Test(description = " Verify that the popup should have the Title for the pop-up as “Consent to share details” and the updated text for the checkbox is “I consent to share my details with the administrators of this course. All course administrators are bound by the Privacy Policy and Course Terms in their use of my data. SUNBIRD Terms of Use”")
    public void VerifyAllTheFieldsInConsentPopUpInCourse() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CourseConsumption_Usr"),
                sunbird_config.getSunbidConfigPropertyValue("CourseConsumption_Pwd"));
        DashboardPageActions.clickUserProfileIcon();
        AddUserPageActions.clickAddPlusIcon();
        String creadtedUserName = AddUserPageActions.enterName();
        AddUserPageActions.addUserBtnInCreation();
        AddUserPageActions.assertAddedUserToastrMsg();
        AddUserPageActions.clickOnCreatedUser(creadtedUserName);
        AddUserPageActions.clickChangeUser();
        AddUserPageActions.checkBoxClick();
        AddUserPageActions.clickContinue();
        OnBoardingActions.RolePoup();
        OnBoardingActions.LocationPopupForSwitchUser();
        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("CourseWithAllContentsWIthAllBatchDetails"));
        BatchPageActions.clickJoinCourse();
        BatchPageActions.validateAttributesInConsentPopup();
        ConsumptionPageActions.assertconsentPopupTitle();
        ConsumptionPageActions.assertconsentPopupTermsAndConditionMessage();
        ConsumptionPageActions.assertDoNotShare();
        ConsumptionPageActions.assertConsentShareIsDisabled();
    }

    @Test(description = " Verify that the Profile Name change Pop up is displayed when user clicks on Start Learning, course should have the certificate attached")
    public void verifyProfilePopupInCourse() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CourseConsumption_Usr"),
                sunbird_config.getSunbidConfigPropertyValue("CourseConsumption_Pwd"));
        DashboardPageActions.clickUserProfileIcon();
        AddUserPageActions.clickAddPlusIcon();
        String creadtedUserName = AddUserPageActions.enterName();
        AddUserPageActions.addUserBtnInCreation();
        AddUserPageActions.assertAddedUserToastrMsg();
        AddUserPageActions.clickOnCreatedUser(creadtedUserName);
        AddUserPageActions.clickChangeUser();
        AddUserPageActions.checkBoxClick();
        AddUserPageActions.clickContinue();
        OnBoardingActions.RolePoup();
        OnBoardingActions.LocationPopupForSwitchUser();
        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("Course"));
        BatchPageActions.clickJoinCourse();
        BatchPageActions.clickDoNotShareBtn();
        BatchPageActions.clickStartLearning();
        ConsumptionPageActions.assertProfilePopupCheckBox();
        ConsumptionPageActions.profilePopupClickCheckBox();
        ConsumptionPageActions.assertProfilePopuptext();
        ConsumptionPageActions.clickProfilePopupContinueBtn();
        ConsumptionPageActions.backButtonCourse();
        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("Course"));
        BatchPageActions.clickStartLearning();
        ConsumptionPageActions.consumePDF();
        ConsumptionPageActions.giveRating(4);
        ConsumptionPageActions.backButtonCourse();
        ConsumptionPageActions.continueLearningCourse();
        ConsumptionPageActions.assertNoProfilePopuptext();
    }



    @Test(description = "Verify that in portal for minor users (Below 18 age) consent popup to share Personal Identification Information(PII) while joining a course should not be displayed.")
    public void verifyConsentPopupNotDisplayedForMinorUserInCourse() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("MINOR_Usr"),
                sunbird_config.getSunbidConfigPropertyValue("MINOR_PWD"));
        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("CourseWithEnrolmentEndDateExpired"));
        BatchPageActions.clickJoinCourse();
        BatchPageActions.assertNoConsentPopup();
    }

    @Test(description = " Verify that the course completion message should be highlighted in Amber if the course is not attached with a certificate")
    public void verifyNoCertificateAttachedMessageInCourseTOC() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CourseConsumption_Usr"),
                sunbird_config.getSunbidConfigPropertyValue("CourseConsumption_Pwd"));
        DashboardPageActions.clickUserProfileIcon();
        AddUserPageActions.clickAddPlusIcon();
        String creadtedUserName = AddUserPageActions.enterName();
        AddUserPageActions.addUserBtnInCreation();
        AddUserPageActions.assertAddedUserToastrMsg();
        AddUserPageActions.clickOnCreatedUser(creadtedUserName);
        AddUserPageActions.clickChangeUser();
        AddUserPageActions.checkBoxClick();
        AddUserPageActions.clickContinue();
        OnBoardingActions.RolePoup();
        OnBoardingActions.LocationPopupForSwitchUser();
        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("CourseDOIDwithoutCertificate"));
        BatchPageActions.clickJoinCourse();
        BatchPageActions.clickDoNotShareBtn();
        ConsumptionPageActions.assertNoCertificate();
        BatchPageActions.clickStartLearning();
        ConsumptionPageActions.consumePDF();
        ConsumptionPageActions.giveRating(4);
        ConsumptionPageActions.backButtonCourse();
        ConsumptionPageActions.continueLearningCourse();
        ConsumptionPageActions.consumePDF();
        ConsumptionPageActions.giveRating(4);
        ConsumptionPageActions.assertCourseSuccesfullYCompletedPopupMsg();
        ConsumptionPageActions.assertNoCertificateMessage();
    }

    @Test(description = " Verify that the course completion message should be displayed. Note: You will receive the certificate within 7 working days")
    public void verifyCertificateAttachedMessageInCourse() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CourseConsumption_Usr"),
                sunbird_config.getSunbidConfigPropertyValue("CourseConsumption_Pwd"));
        DashboardPageActions.clickUserProfileIcon();
        AddUserPageActions.clickAddPlusIcon();
        String creadtedUserName = AddUserPageActions.enterName();
        AddUserPageActions.addUserBtnInCreation();
        AddUserPageActions.assertAddedUserToastrMsg();
        AddUserPageActions.clickOnCreatedUser(creadtedUserName);
        AddUserPageActions.clickChangeUser();
        AddUserPageActions.checkBoxClick();
        AddUserPageActions.clickContinue();
        OnBoardingActions.RolePoup();
        OnBoardingActions.LocationPopupForSwitchUser();
        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("Course"));
        BatchPageActions.clickJoinCourse();
        BatchPageActions.clickDoNotShareBtn();
        ConsumptionPageActions.clickCertificateDetails();
        ConsumptionPageActions.assertCertificateRule();
        BatchPageActions.clickStartLearning();
        ConsumptionPageActions.profilePopupClickCheckBox();
        ConsumptionPageActions.clickProfilePopupContinueBtn();
        BatchPageActions.clickStartLearning();
        ConsumptionPageActions.consumePDF();
        ConsumptionPageActions.giveRating(4);
        ConsumptionPageActions.backButtonCourse();
        ConsumptionPageActions.continueLearningCourse();
        ConsumptionPageActions.clickNextButton();
        ConsumptionPageActions.giveRating(4);
        ConsumptionPageActions.backButtonCourse();
        ConsumptionPageActions.continueLearningCourse();
        ConsumptionPageActions.consumePDF();
        ConsumptionPageActions.giveRating(4);
        ConsumptionPageActions.assertCourseSuccesfullYCompletedPopupMsg();
        ConsumptionPageActions.assertCertificateMessageForCourseCompletionInPopUp();
    }


    @Test(description = " Verify that the user is in the first module then 'prev' should not be shown 'next' should be shown. If user is in any other module which is not the first or the last one then it should have 'prev' and 'next'. If the user is in the last module, then only 'prev' is shown.")
    public void verifyPrevAndNextModulesAndModuleSuccessMessageInCourse() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("Add_User_Usr"),
                sunbird_config.getSunbidConfigPropertyValue("Add_User_Pwd"));
        DashboardPageActions.clickUserProfileIcon();
        AddUserPageActions.clickAddPlusIcon();
        String creadtedUserName = AddUserPageActions.enterName();
        AddUserPageActions.addUserBtnInCreation();
        AddUserPageActions.assertAddedUserToastrMsg();
        AddUserPageActions.clickOnCreatedUser(creadtedUserName);
        AddUserPageActions.clickChangeUser();
        AddUserPageActions.checkBoxClick();
        AddUserPageActions.clickContinue();
        OnBoardingActions.RolePoup();
        OnBoardingActions.LocationPopupForSwitchUser();
        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("CourseWithMultipleModuleWithCourseUpdateMessage"));
        BatchPageActions.clickJoinCourse();
        BatchPageActions.clickDoNotShareBtn();
        BatchPageActions.clickStartLearning();
        ConsumptionPageActions.assertNoPrevModule();
        ConsumptionPageActions.clickNextModule();
        ConsumptionPageActions.assertPrevModule();
        ConsumptionPageActions.assertNextModule();
        ConsumptionPageActions.assertModuleCompletionMsg();
        ConsumptionPageActions.clickPrevModule();
        ConsumptionPageActions.giveRating(4);
        ConsumptionPageActions.clickNextModule();
        ConsumptionPageActions.clickNextModule();
        ConsumptionPageActions.assertNoNextModule();
    }

    @Test(description = "Verify that when user enters QR code linked to course then course is displayed.")
    public void  verifySearchAndClickOnCourseQRCode() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("PUBLIC_USER"),
                sunbird_config.getSunbidConfigPropertyValue("PUBLIC_PASSWORD"));
        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("CourseQRCode"));
        ConsumptionPageActions.backButtonCourse();
        DashboardPageActions.searchContentAndClickOnContentCard("Course");
        ConsumptionPageActions.backButtonCourse();
        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("CourseDOIDwithoutCertificate"));
        ConsumptionPageActions.backButtonCourse();

    }
    @Test(description = "Verify that if batch enrollment date is ended, respective message should be displayed in red.Verify that if the enrollment end date is not given for that particular course then the enrollment end date should not be visible near the join course button for both Guest user /Logged in User")
    public void VerifyEnrolmentEndDateExpiredInCourse() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("PUBLIC_USER"),
                sunbird_config.getSunbidConfigPropertyValue("PUBLIC_PASSWORD"));
        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("CourseWithEnrolmentEndDateExpired"));
        ConsumptionPageActions.assertEnrolmentEndDateExpiredMessageAndColor();
        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("CourseWithAssessmentAndWithOutEnrolmentEndDate"));
        ConsumptionPageActions.assertNoEnrolmentEndDateLable();
    }


    @Test(description = " Verify that the Consent feature is not be disabled even when the user has completed the course 100%")
    public void  verifyCourseConsentPopupAfterConsumption() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("Add_User_Usr"),
                sunbird_config.getSunbidConfigPropertyValue("Add_User_Pwd"));
        DashboardPageActions.clickUserProfileIcon();
        AddUserPageActions.clickAddPlusIcon();
        String creadtedUserName=AddUserPageActions.enterName();
        AddUserPageActions.addUserBtnInCreation();
        AddUserPageActions.assertAddedUserToastrMsg();
        AddUserPageActions.clickOnCreatedUser(creadtedUserName);
        AddUserPageActions.clickChangeUser();
        AddUserPageActions.checkBoxClick();
        AddUserPageActions.clickContinue();
        OnBoardingActions.RolePoup();
        OnBoardingActions.LocationPopupForSwitchUser();
        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("CourseWithCertificate"));
        BatchPageActions.clickJoinCourse();
        BatchPageActions.clickDoNotShareBtn();
        BatchPageActions.clickStartLearning();
        ConsumptionPageActions.profilePopupClickCheckBox();
        ConsumptionPageActions.clickProfilePopupContinueBtn();
        BatchPageActions.clickStartLearning();
        ConsumptionPageActions.consumePDF();
        ConsumptionPageActions.giveRating(4);
        ConsumptionPageActions.backButtonCourse();
        ConsumptionPageActions.continueLearningCourse();
        ConsumptionPageActions.clickNextButton();
        ConsumptionPageActions.giveRating(4);
        ConsumptionPageActions.backButtonCourse();
        ConsumptionPageActions.continueLearningCourse();
        ConsumptionPageActions.consumePDF();
        ConsumptionPageActions.giveRating(4);
        ConsumptionPageActions.closeCertificateMessage();
        ConsumptionPageActions.backButtonCourse();
        ConsumptionPageActions.clickProfileSharingData();
        ConsumptionPageActions.updateProfileSharingData();
        ConsumptionPageActions.saveProfile();
        BatchPageActions.clickTermsCheckInConsentPopup();
        BatchPageActions.clickShareBtn();
        ConsumptionPageActions.updateProfileSharingData();
        ConsumptionPageActions.saveProfile();
        ConsumptionPageActions.verifyConsentToasterProfileMsg();
    }

    @Test(description = "Verify that the below details is displayed in the course car")
    public void  verifyCourseContentCard() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("PUBLIC_USER"),
                sunbird_config.getSunbidConfigPropertyValue("PUBLIC_PASSWORD"));
        CourseTabPageActions.assertAllDetailsOnCourseCard();
        DashboardPageActions.clickCourseTab();
        CourseTabPageActions.clickViewAll();
        CourseTabPageActions.assertAllDetailsOnCourseCard();
        CourseTabPageActions.clickCloseBtn();
        CourseTabPageActions.clickViewAll();
    }
    @Test(description = " Verify the Logged in user can view the details of the enrollment end date, batch start date and end date in the \"batch details\" section Before Joining the Course")
    public void  verifyStartEnrolmentEndDatesInCourse() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("PUBLIC_USER"),
                sunbird_config.getSunbidConfigPropertyValue("PUBLIC_PASSWORD"));
        DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("CourseWithAllContentsWIthOpenBatchDetailsWithStartEnrolmentEndDates"));
        ConsumptionPageActions.assertStartDate();
        ConsumptionPageActions.assertEndDate();
        ConsumptionPageActions.assertEnrolmentEndDatenew();
    }

}