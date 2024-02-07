package sanity;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageActions.*;
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


	@Test(description = "createCourseSendForReview")
	public void createCourseSendForReview() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.assertWorkspace();
		DashboardPageActions.clickOnWorkSpace();
		WorkspaceDashboardPageActions.clickCourse();
		String createdContent=CoursePageActions.createCourseSection1("getdoid");
		BookPageActions.BMCDropdownSelectionSection2();
		BookPageActions.Section3();

		BookPageActions.addResourceFromLibrary();
		BookPageActions.submitAndSendForReview();
		writesunbird_config.writeDataIntoPropertyFile("Course",createdContent);

	}

}
