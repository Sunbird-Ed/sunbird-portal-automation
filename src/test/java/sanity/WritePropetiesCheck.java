package sanity;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageActions.*;
import org.testng.annotations.Test;

public class WritePropetiesCheck extends BaseTestConfig {

	@Test(description = "Create book and Send for review and publish")
	public void createBookAndPublish() throws Exception {

//		OnBoardingActions.RolePoup();
//		OnBoardingActions.BMCPopup();
//		OnBoardingActions.LocationPopup();

//		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
//				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
//		DashboardPageActions.clickUserProfileIcon();
//		DashboardPageActions.assertWorkspace();
//		DashboardPageActions.clickOnWorkSpace();
//		WorkspaceDashboardPageActions.clickBook();
//		String createdContent = BookPageActions.createBookPopup("getdoid");
String createdContent="Utlraju";

		writesunbird_config.writeDataIntoPropertyFile("Course",createdContent);


	String Course=writesunbird_config.getWriteSunbidConfigPropertyValue("Course");
	System.out.println(Course);
	}



}