package regression;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageActions.*;
import org.testng.annotations.Test;

public class Login extends BaseTestConfig {


    @Test(description="Verify all the labels and buttons in Login Page")
    public void ValidateLoginPage() throws Exception {

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        DashboardPageActions.clickUserProfileIcon();
        LoginPageActions.clickLoginInPopup();
        LoginPageActions.assertLoginPage();

    }

    @Test(description="Verify Login button for Student role")
    public void ValidateLoginButtonForStudent() throws InterruptedException {

        OnBoardingActions.StudentRolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();

        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickHomeTab();

    }

    @Test(description="BMG values should be displayed in Home Page")
    public void ValidateBMGInGuestAndLoginUserHomePage() throws Exception
    {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        DashboardPageActions.clickHomeTab();
        HomeTabPageActions.ValidateGuestHomePageBMG();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        HomeTabPageActions.ValidateLoginUserHomePageBMG();
    }
    @Test(description="Verifying all the roles and fields in the location popup page")
    public void ValidateLocationPopupPage() throws InterruptedException
    {
        OnBoardingActions.ValidateRolePoup();
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        DashboardPageActions.clickHomeTab();
    }

}
