package regression;

import com.sunbird.PageActions.*;
import org.testng.annotations.Test;

import static com.sunbird.GenericLibrary.BaseTestConfig.sunbird_config;

public class Profile {

    @Test(description="Verify Help, FAQ and Feedback in Help Section ")
    public void ValidateHelpSection() throws InterruptedException {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.VerifyHelpSection();
        HelpPageActions.assertFAQSection();
    }

    @Test(description="Verify Login landing page,Sunbird logo Text Fields and Login button in Login Page")
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

    @Test(description="Validate Add User page")
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
        String creadtedUserName=AddUserPageActions.enterName();
        AddUserPageActions.addUserBtnInCreation();
        AddUserPageActions.assertAddedUserToastrMsg();
        AddUserPageActions.clickOnCreatedUser(creadtedUserName);
        AddUserPageActions.clickChangeUser();
            AddUserPageActions.checkBoxClick();
        AddUserPageActions.clickContinue();
        OnBoardingActions.RolePoup();
        OnBoardingActions.LocationPopupForSwitchUser();
    }

    @Test(description="Verify Submit Details button and My details Section in Profile")
    public void ValidateSubmitDetailsButton() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("New_User1"),
                sunbird_config.getSunbidConfigPropertyValue("New_PWD1"));
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
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnProfileForLoginUser();
        ProfilePageActions.verifySubmitDetails();
        ProfilePageActions.clickOnSubmitDetails();
        ProfilePageActions.clickOnTenantDropDown();
        ProfilePageActions.selectTenantFromDropDown();
        ProfilePageActions.selectCheckBoxFromTeacherForm();
        ProfilePageActions.clickOnSubmitButtonInTeacherForm();
        ProfilePageActions.assertToasterMsgOfTeacherForm();
        ProfilePageActions.clickOnOkButtonInAlertMsgOfTeacherForm();
        ProfilePageActions.validateMyDetailsLabel();
    }



}
