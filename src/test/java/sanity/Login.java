package sanity;

import com.sunbird.PageActions.DashboardPageActions;
import com.sunbird.PageActions.UploadPageActions;
import org.testng.annotations.Test;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageActions.LoginPageActions;
import com.sunbird.PageActions.OnBoardingActions;

public class Login extends BaseTestConfig {


	@Test 
public void LoginWithValidUser() throws InterruptedException
{
	OnBoardingActions.RolePoup();
		  OnBoardingActions.BMCPopup();
	  	  OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
	DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.clickOnWorkSpace();
	UploadPageActions.uploadPDF();
}
	

	
}
