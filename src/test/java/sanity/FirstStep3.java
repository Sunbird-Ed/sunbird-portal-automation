package sanity;

import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageActions.*;
import org.testng.annotations.Test;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageActions.OnBoardingActions;

public class FirstStep3 extends BaseTestConfig {


	@Test
public void BMCPopup() throws InterruptedException
{

	System.out.println("Usr" +sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"));
	System.out.println("Pwd" +sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));

//	OnBoardingActions.RolePoup();
//	OnBoardingActions.BMCPopup();
//	OnBoardingActions.LocationPopup();
//
//	LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CUSTODIAN_Usr"),
//			sunbird_config.getSunbidConfigPropertyValue("CUSTODIAN_PWD"));
//
//	DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("Textbook"));
//	ConsumptionPageActions.consumePDF();
//	ConsumptionPageActions.giveRating(3);


}
}


