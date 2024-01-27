package sanity;

import com.github.javafaker.Book;
import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageActions.BookPageActions;
import com.sunbird.PageActions.DashboardPageActions;
import com.sunbird.PageActions.LoginPageActions;
import com.sunbird.PageActions.OnBoardingActions;
import com.sunbird.PageActions.ReviewPageActions;
import com.sunbird.PageActions.UploadPageActions;
import com.sunbird.PageObjects.BookPage;

import org.testng.annotations.Test;

public class createBookAndPublish extends BaseTestConfig {

	@Test(description = "Create book and Send for review and publish")
	public void createBookAndPublish() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.assertWorkspace();
		DashboardPageActions.clickOnWorkSpace();
		DashboardPageActions.clickBook();
		String createdContent = BookPageActions.createBookPopup("getContentName");
		BookPageActions.handleBMCSDropdowns();
		BookPageActions.enterCopyWright();
		BookPageActions.saveAsDraft();
		BookPageActions.clickAddChild();
		BookPageActions.addResourceToLibrary();
		BookPageActions.submitAndSendForReview();
		BookPageActions.assertSendForReviewToastrMsg();
		DashboardPageActions.logOut();

		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.clickOnWorkSpace();

		ReviewPageActions.reviewCollection(createdContent);

	}



}