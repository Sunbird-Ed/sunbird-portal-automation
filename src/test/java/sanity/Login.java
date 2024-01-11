package sanity;

import org.testng.annotations.Test;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageActions.LoginPageActions;
import com.sunbird.PageActions.OnBoardingActions;
import com.sunbird.PageActions.OnBoardingActions;

public class Login extends BaseTestConfig {


	@Test 
public void LoginWithValidUser() throws InterruptedException
{
	OnBoardingActions.RolePoup();
		  OnBoardingActions.BMCPopup();
	  	  OnBoardingActions.LocationPopup(); 
	  	  LoginPageActions.Login();
	 
		
}
	

	
}
