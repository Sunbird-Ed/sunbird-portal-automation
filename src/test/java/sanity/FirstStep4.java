package sanity;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageActions.ConsumptionPageActions;
import com.sunbird.PageActions.DashboardPageActions;
import com.sunbird.PageActions.LoginPageActions;
import com.sunbird.PageActions.OnBoardingActions;
import org.testng.annotations.Test;

public class FirstStep4 extends BaseTestConfig {


	@Test(description = "consumeMp4")
	public void consumeMp4() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();

		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CUSTODIAN_Usr"),
				sunbird_config.getSunbidConfigPropertyValue("CUSTODIAN_PWD"));

		DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("Textbook"));
		ConsumptionPageActions.consumeMp4();
		ConsumptionPageActions.giveRating(3);
	}

}
