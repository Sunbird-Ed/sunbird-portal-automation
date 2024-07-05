package regression;

import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageActions.*;
import org.testng.annotations.Test;

import static com.sunbird.GenericLibrary.BaseTestConfig.sunbird_config;

public class Profile {

    @Test(description = "Verify Help, FAQ and Feedback in Help Section ")
    public void ValidateHelpSection() throws InterruptedException {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.VerifyHelpSection();
        HelpPageActions.assertFAQSection();
    }

    @Test(description = "Verify Login landing page,Sunbird logo Text Fields and Login button in Login Page")
    public void ValidateLoginLandingPage() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        DashboardPageActions.clickUserProfileIcon();
        LoginPageActions.clickLoginInPopup();
        LoginPageActions.verifySunbirdLogo();
        LoginPageActions.validateLoginPageHeading();
        LoginPageActions.assertEmailAndPasswordTextField();
        LoginPageActions.assertLoginButton();

    }

    @Test(description = "Validate Add User page")
    public void ValidateAddUserAndSwitchUser() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("Profile_New_User"),
                sunbird_config.getSunbidConfigPropertyValue("Profile_New_PWD"));
        DashboardPageActions.clickUserProfileIcon();
        AddUserPageActions.VerifyAddUserButton();
        AddUserPageActions.clickAddPlusIcon();
        AddUserPageActions.assertAddUserPage();
        AddUserPageActions.assertCancelButton();
        AddUserPageActions.assertAddUserButton();
        String creadtedUserName = AddUserPageActions.enterName();
        AddUserPageActions.addUserBtnInCreation();
        AddUserPageActions.assertAddedUserToastrMsg();
        AddUserPageActions.clickOnCreatedUser(creadtedUserName);
        AddUserPageActions.clickChangeUser();
        AddUserPageActions.checkBoxClick();
        AddUserPageActions.clickContinue();
        OnBoardingActions.RolePoup();
        OnBoardingActions.LocationPopupForSwitchUser();
    }

    @Test(description = "Verify Submit Details button and My details Section in Profile")
    public void ValidateSubmitDetailsButton() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("New_User1"),
                sunbird_config.getSunbidConfigPropertyValue("New_PWD1"));
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
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnProfileForLoginUser();
        ProfilePageActions.verifySubmitDetails();
        ProfilePageActions.clickOnSubmitDetails();
        ProfilePageActions.clickOnTenantDropDown();
        ProfilePageActions.selectTenantFromDropDown();
        ProfilePageActions.assertExternalIdField();
        ProfilePageActions.assertMobileField();
        ProfilePageActions.assertEmailIdField();
        ProfilePageActions.selectCheckBoxFromTeacherForm();
        ProfilePageActions.assertConsentTextForPolicy();
        ProfilePageActions.clickOnSubmitButtonInTeacherForm();
        ProfilePageActions.assertToasterMsgOfTeacherForm();
        ProfilePageActions.clickOnOkButtonInAlertMsgOfTeacherForm();
        ProfilePageActions.validateMyDetailsLabel();
        ProfilePageActions.clickOnTeacherFormUpdateButton();
        UtilityFunctions.scrollUpUsingPixelValue();
        ProfilePageActions.clickOnTenantDropDown();
        ProfilePageActions.selectOnNewTenantFromDropDown();
        ProfilePageActions.clickOnTeacherFormUpdateButton();
        ProfilePageActions.assertUpdateToasterMsg();
    }


    @Test(description = "Logged In User able to validate Switch to New/ Old Theme in Profile page")
    public void ValidateSwitchThemeInProfileOfLoggedInUser() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("Profile_New_User"),
                sunbird_config.getSunbidConfigPropertyValue("Profile_New_PWD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnProfileForLoginUser();
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnSwitchToClassicTheme();
        DashboardPageActions.assertClassicThemeProfilePageHeader();
        DashboardPageActions.assertClassicThemeProfilePageFooter();
        DashboardPageActions.clickUserProfileIconInClassicTheme();
        DashboardPageActions.clickOnSwitchToJoyfulTheme();
        DashboardPageActions.assertJoyfulThemeProfilePageHeader();
        DashboardPageActions.assertJoyfulThemeProfilePageFooter();
    }


    @Test(description = "Validate Course & Certificates FAQs in Help Page")
    public void ValidateCourseAndCertificateFAQInHelpPage() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.VerifyHelpSection();
        HelpPageActions.ClickOnCourseAndCertificateCategory();
        HelpPageActions.assertFAQInCourseCategory();
        DashboardPageActions.clickOnLanguageSelection();
        DashboardPageActions.selectKannadaLanguage();
        HelpPageActions.ClickOnCourseAndCertificateCategory();
        HelpPageActions.assertCourseProgressFAQInKannadaLanguage();

    }


    @Test(description = "Verify complete flow of Report Other Issue in Help Page")
    public void VerifyReportOtherIssueFlowInHelpPage() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.VerifyHelpSection();
        HelpPageActions.VerifyReportOtherIssue();
        HelpPageActions.ClickReportOtherIssue();
        HelpPageActions.clickOnSelectCategory();
        HelpPageActions.selectCategoryFromDropdown();
        HelpPageActions.clickOnSelectSubCategory();
        HelpPageActions.selectSubCategoryFromDropdown();
        HelpPageActions.enterTextInTellUsMoreTextField();
        HelpPageActions.clickOnSubmitFeedbackBtn();
        HelpPageActions.validateFeedbackToaster();

    }

    @Test(description = "Validate Organization Of Help Page")
    public void ValidateOrganizationOfHelpPage() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.VerifyHelpSection();
        HelpPageActions.validateHelpPage();

    }

    @Test(description = "Validate Debug Mode in Help Page")
    public void ValidateDebugModeInHelpPage() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        OnBoardingActions.waitContentIsSavedToastToDisapper();
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.VerifyHelpSection();
        HelpPageActions.assertDebugMode();
        HelpPageActions.clickOnDebugMode();
        HelpPageActions.clickOnEnableDebugMode();
        HelpPageActions.validateDebugModeToaster();
        HelpPageActions.assertDebugModeTextAfterEnabled();

    }


    @Test(description = "Validate School head & Official Role and Subrole and Update in Profile page of Loggedin User")
    public void validateSchoolHeadOrOfficialsRoleAndSelectSubRoleInProfileOfLoggedInUser() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        OnBoardingActions.waitContentIsSavedToastToDisapper();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("Profile_New_User"),
                sunbird_config.getSunbidConfigPropertyValue("Profile_New_PWD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnProfileForLoginUser();
        ProfilePageActions.clickEditButtonLocationDetails();
        ProfilePageActions.clickRoleDropdown();
        ProfilePageActions.selectSchoolHeadOrOfficials();
        ProfilePageActions.clickStateFromDropdown();
        ProfilePageActions.selectAPFromDropdown();
        ProfilePageActions.clickSubRoleDropdown();
        ProfilePageActions.selectSubRoleType("HM");

    }

    @Test(description = "Validate Ongoing and Completed Status of Course in My Learning section of Profile Page")
    public void validateOngoingAndCompletedStatusInMyLearningSection() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("Profile_New_User"),
                sunbird_config.getSunbidConfigPropertyValue("Profile_New_PWD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnProfileForLoginUser();
        ProfilePageActions.assertOngoingStatusAndValidateColor();
        ProfilePageActions.assertCompletedStatusAndValidateColor();

    }
    @Test(description = "User able to validate location and BMC details in profile and validate updated BMC details")
    public void validateBMCAndLocationDetailsAndUpdateInProfileOfLoggedInUser() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();

        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("Profile_New_User"),
                sunbird_config.getSunbidConfigPropertyValue("Profile_New_PWD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnProfileOptionForLoginUser();
        ProfilePageActions.assertDistrictAndStateWithEditBtn();
        UtilityFunctions.scrollDownUsingPixelValue();
        ProfilePageActions.assertBMCWithEditBtnForLoggedInUser();
        ProfilePageActions.updateBMGInGuestUser();
        ProfilePageActions.assertProfileUpdateToasterMsg();
    }



    @Test(description = "Guest User able to validate location and BMC details in profile and validate updated BMC details")
    public void validateBMCAndLocationDetailsInProfileOfGuestUser() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        OnBoardingActions.waitContentIsSavedToastToDisapper();
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnProfileOption();
        ProfilePageActions.assertDistrictAndStateWithEditBtn();
        ProfilePageActions.assertBMCWithEditBtn();
        ProfilePageActions.updateBMGInGuestUser();
        OnBoardingActions.waitContentIsSavedToastToDisapper();

    }

}