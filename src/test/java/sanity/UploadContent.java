package sanity;
import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageActions.DashboardPageActions;
import com.sunbird.PageActions.LoginPageActions;
import com.sunbird.PageActions.OnBoardingActions;
import com.sunbird.PageActions.UploadPageActions;
import org.testng.annotations.Test;

public class UploadContent extends BaseTestConfig {

	@Test(description = "Uploading PDF Content")
	public void UploadPDF() throws InterruptedException {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.assertWorkspace();
		DashboardPageActions.clickOnWorkSpace();
		UploadPageActions.uploadContent("PDF");
	}










//	@Test(description = "Uploading MP4 Content")
//	public void UploadMP4() throws InterruptedException {
//
//		OnBoardingActions.RolePoup();
//		OnBoardingActions.BMCPopup();
//		OnBoardingActions.LocationPopup();
//		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
//		DashboardPageActions.clickUserProfileIcon();
//		DashboardPageActions.assertWorkspace();
//		DashboardPageActions.clickOnWorkSpace();
//		UploadPageActions.uploadContent("MP4");
//	}
}