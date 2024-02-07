package sanity;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageActions.*;
import org.testng.annotations.Test;

public class FirstStep5 extends BaseTestConfig {





/*	@Test(description = "createCourseSendForReview")
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

	}*/


	@Test(description = "Publish the Course")
	public void publishCourse() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();

		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.clickOnWorkSpace();
		String newcourseDoId=writesunbird_config.getWriteSunbidConfigPropertyValue("Course");
		ReviewPageActions.reviewAndPublishContent(newcourseDoId,"Course");

	}

}
