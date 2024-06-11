package sanity;

import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageActions.*;
import com.sunbird.PageObjects.HomeTabPage;
import org.testng.annotations.Test;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageActions.OnBoardingActions;

import java.io.File;

public class FirstStep3 extends BaseTestConfig {


	//	@Test
/*public void BMCPopup() throws InterruptedException
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


}*/



	/*@Test(description = "Verify user is able to edit the published course")
	public void userAbleToEditPublishedCourseAndRePublishCourse() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.assertWorkspace();
		DashboardPageActions.clickOnWorkSpace();
		WorkspaceDashboardPageActions.clickCourse();
		String createdContent = CoursePageActions.createCourseSection1("getdoid");
		BookPageActions.BMCDropdownSelectionSection2();
		BookPageActions.Section3();
		BookPageActions.assertContentIsSavedToastrMsg();
		BookPageActions.waitContentIsSavedToastToDisapper();
		BookPageActions.addResourceFromLibrary();
		BookPageActions.submitAndSendForReview();
		DashboardPageActions.logOut();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.clickOnWorkSpace();
		ReviewPageActions.reviewAndPublishContent(createdContent, "Course");
		DashboardPageActions.logOut();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.assertWorkspace();
		DashboardPageActions.clickOnWorkSpace();
		WorkspaceDashboardPageActions.clickPublishedBucket();
		AllMyContentPageActions.enterContentInSearchBox(createdContent);
		PublishedPageActions.clickFirstCard();
		UtilityFunctions.scrollDownUsingPixelValue();
		UtilityFunctions.scrollDownUsingPixelValue();
		BookPageActions.selectMultipleBMCDropdownSelectionSection2();
		BookPageActions.Section3();
		BookPageActions.assertContentIsSavedToastrMsg();
		BookPageActions.waitContentIsSavedToastToDisapper();
		BookPageActions.submitAndSendForReview();
		DashboardPageActions.logOut();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.clickOnWorkSpace();
		ReviewPageActions.reviewAndPublishContent(createdContent, "Course");
		DashboardPageActions.logOut();

	}

	@Test(description = "Verify user is able to copy the course to a new course")
	public void UserAbleToCopyTheCourse() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickCourseTab();
		DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("Course"));
		BookPageActions.clickCopyButton();
		BookPageActions.assertCopyToastrMsg();
		BookPageActions.waitCopyToastrMsgDisAppear();
		CoursePageActions.subjectCoveredDropdown();
		BookPageActions.BMCDropdownSelectionSection2();
		BookPageActions.clickSaveAsDrafts();

	}
	@Test(description = "Verify user is able to add textbook to the course ")
	public void UserAbleToAddTextBookToCouseInAddFromLibrarySection() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.assertWorkspace();
		DashboardPageActions.clickOnWorkSpace();
		WorkspaceDashboardPageActions.clickCourse();
		String createdContent = CoursePageActions.createCourseSection1("getdoid");
		BookPageActions.BMCDropdownSelectionSection2();
		BookPageActions.Section3();
		BookPageActions.assertContentIsSavedToastrMsg();
		BookPageActions.waitContentIsSavedToastToDisapper();
		BookPageActions.addResourceInLibrarySection(sunbird_config.getSunbidConfigPropertyValue("Textbook"));
		BookPageActions.submitAndSendForReview();
		DashboardPageActions.logOut();

	}
}*/

	@Test(description = " Verify in portal User is displayed with Share icon in the Course toc page before clicking on \"Join Course\" button and enrolling to that course \r\n"
			+ "Verify in portal that User should be able to share the courses without enrolling to it and only able to consume after enrolling to the course")
	public void  verifyShareIconInCourse() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("Add_User_Usr"),
				sunbird_config.getSunbidConfigPropertyValue("Add_User_Pwd"));
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
		DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("CourseWithAllContentsWIthAllBatchDetails"));
		ConsumptionPageActions.shareIcon();
		ConsumptionPageActions.copyShareIcon();
		ConsumptionPageActions.closeShareIcon();
		ConsumptionPageActions.assertjoinCourse();
		BatchPageActions.clickJoinCourse();
		BatchPageActions.clickDoNotShareBtn();
	}

	}