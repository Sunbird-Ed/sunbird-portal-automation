package sanity;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageActions.*;
import org.testng.annotations.Test;

public class createBookAndPublish4 extends BaseTestConfig {

	@Test(description = "Create book And Send For Review")
	public void createBookAndSendForReview() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();

		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.assertWorkspace();
		DashboardPageActions.clickOnWorkSpace();
		WorkspaceDashboardPageActions.clickBook();
		String createdContent = BookPageActions.createBookPopup("getdoid");
String des=BookPageActions.section1("getdescription");
System.out.println(des);

		BookPageActions.BMCDropdownSelectionSection2();
		BookPageActions.Section3();
		BookPageActions.addResourceFromLibrary();
		BookPageActions.submitAndSendForReview();
		writesunbird_config.writeDataIntoPropertyFile("BookDoID",createdContent);


	}



}