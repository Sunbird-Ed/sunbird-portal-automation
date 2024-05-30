package regression;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageActions.*;


import org.testng.annotations.Test;

public class Workspace extends BaseTestConfig {

	@Test(description = "Assert Workspace option when user clicks on profile")
	public void validateWorkspaceOption() throws Exception {
		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();

		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.assertWorkspace();
}
	
	@Test(description = "Click on Workspace Option")
	public void validateWorkspaceOptionLink() throws Exception {
		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();

		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.assertWorkspace();
		DashboardPageActions.clickOnWorkSpace();
		WorkspaceDashboardPageActions.assertCreate();
}
	
	@Test(description = "Assert the options when in Workspace")
	public void validateWorkspaceOptions() throws Exception {
		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();

		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.assertWorkspace();
		DashboardPageActions.clickOnWorkSpace();
		WorkspaceDashboardPageActions.assertCreate();
		WorkspaceDashboardPageActions.assertDrafts();
		WorkspaceDashboardPageActions.clickAllMyContent();
		WorkspaceDashboardPageActions.submittedForReview();
		WorkspaceDashboardPageActions.clickPublishedBucket();
		WorkspaceDashboardPageActions.assertAllUploads();
		WorkspaceDashboardPageActions.assertCourseBatches();
		WorkspaceDashboardPageActions.assertCreatedByme();
		WorkspaceDashboardPageActions.assertAssignedToMe();
		WorkspaceDashboardPageActions.assertSharedViaLink();
		WorkspaceDashboardPageActions.assertCollaborations();
	
}
	
	@Test(description = "Edit and replace a published mp4 content with same type of content")
	public void editAndReplacethemp4Content() throws Exception {
		 OnBoardingActions.RolePoup();
	     OnBoardingActions.BMCPopup();
	     OnBoardingActions.LocationPopup();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.assertWorkspace();
	     DashboardPageActions.clickOnWorkSpace();
	     UploadPageActions.uploadContent("MP4");
	     UploadPageActions.clickSendForReview();
	     String contentName = UploadPageActions.sendUploadContentForReview();
	     UtilityFunctions.switchToDefaultContentFrame();
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.clickOnWorkSpace();
	     ReviewPageActions.reviewAndPublishContent(contentName, "Upload");
	     DashboardPageActions.logOut();
		 LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		 DashboardPageActions.clickUserProfileIcon();
		 DashboardPageActions.assertWorkspace();
		 DashboardPageActions.clickOnWorkSpace();
		 WorkspaceDashboardPageActions.clickPublishedBucket();
		 AllMyContentPageActions.enterContentInSearchBox(contentName);
		 AllMyContentPageActions.clickFirstCard();
		 UtilityFunctions.switchFrameOnIndex(0);
		 UploadPageActions.clickReplaceAndUpload();
		 UploadPageActions.reUploadContent("MP4");
	}

	
	@Test(description = "Edit and replace a published pdf content with same content")
	public void editAndReplacethepdfContent() throws Exception {
		 OnBoardingActions.RolePoup();
	     OnBoardingActions.BMCPopup();
	     OnBoardingActions.LocationPopup();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.assertWorkspace();
	     DashboardPageActions.clickOnWorkSpace();
	     UploadPageActions.uploadContent("PDF");
	     UploadPageActions.clickSendForReview();
	     String resourceName = UploadPageActions.sendUploadContentForReview();
	     UtilityFunctions.switchToDefaultContentFrame();
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.clickOnWorkSpace();
	     ReviewPageActions.reviewAndPublishContent(resourceName, "Upload");
	     DashboardPageActions.logOut();
		 LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		 DashboardPageActions.clickUserProfileIcon();
		 DashboardPageActions.assertWorkspace();
		 DashboardPageActions.clickOnWorkSpace();
		 WorkspaceDashboardPageActions.clickPublishedBucket();
		 AllMyContentPageActions.enterContentInSearchBox(resourceName);
		 AllMyContentPageActions.clickFirstCard();
		 UtilityFunctions.switchFrameOnIndex(0);
		 UploadPageActions.clickReplaceAndUpload();
		 UploadPageActions.reUploadContent("PDF");
	}
	
	@Test(description = "Edit and replace a published epub content with same content")
	public void editAndReplacetheepubContent() throws Exception {
		 OnBoardingActions.RolePoup();
	     OnBoardingActions.BMCPopup();
	     OnBoardingActions.LocationPopup();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.assertWorkspace();
	     DashboardPageActions.clickOnWorkSpace();
	     UploadPageActions.uploadContent("EPUB");
	     UploadPageActions.clickSendForReview();
	     String resourceName = UploadPageActions.sendUploadContentForReview();
	     UtilityFunctions.switchToDefaultContentFrame();
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.clickOnWorkSpace();
	     ReviewPageActions.reviewAndPublishContent(resourceName, "Upload");
	     DashboardPageActions.logOut();
		 LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		 DashboardPageActions.clickUserProfileIcon();
		 DashboardPageActions.assertWorkspace();
		 DashboardPageActions.clickOnWorkSpace();
		 WorkspaceDashboardPageActions.clickPublishedBucket();
		 AllMyContentPageActions.enterContentInSearchBox(resourceName);
		 AllMyContentPageActions.clickFirstCard();
		 UtilityFunctions.switchFrameOnIndex(0);
		 UploadPageActions.clickReplaceAndUpload();
		 UploadPageActions.reUploadContent("EPUB");
	}
	
	@Test(description = "Edit and replace a published HTML content with same content")
	public void editAndReplacethehtmlContent() throws Exception {
		 OnBoardingActions.RolePoup();
	     OnBoardingActions.BMCPopup();
	     OnBoardingActions.LocationPopup();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.assertWorkspace();
	     DashboardPageActions.clickOnWorkSpace();
	     UploadPageActions.uploadContent("HTML");
	     UploadPageActions.clickSendForReview();
	     String resourceName = UploadPageActions.sendUploadContentForReview();
	     UtilityFunctions.switchToDefaultContentFrame();
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.clickOnWorkSpace();
	     ReviewPageActions.reviewAndPublishContent(resourceName, "Upload");
	     DashboardPageActions.logOut();
		 LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		 DashboardPageActions.clickUserProfileIcon();
		 DashboardPageActions.assertWorkspace();
		 DashboardPageActions.clickOnWorkSpace();
		 WorkspaceDashboardPageActions.clickPublishedBucket();
		 AllMyContentPageActions.enterContentInSearchBox(resourceName);
		 AllMyContentPageActions.clickFirstCard();
		 UtilityFunctions.switchFrameOnIndex(0);
		 UploadPageActions.clickReplaceAndUpload();
		 UploadPageActions.reUploadContent("HTML");
	}
	
	@Test(description = "Edit and replace a published H5P content with same content")
	public void EditAndReplaceH5PContent() throws Exception {
		 OnBoardingActions.RolePoup();
	     OnBoardingActions.BMCPopup();
	     OnBoardingActions.LocationPopup();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.assertWorkspace();
	     DashboardPageActions.clickOnWorkSpace();
	     UploadPageActions.uploadContent("H5P");
	     UploadPageActions.clickSendForReview();
	     String resourceName = UploadPageActions.sendUploadContentForReview();
	     UtilityFunctions.switchToDefaultContentFrame();
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.clickOnWorkSpace();
	     ReviewPageActions.reviewAndPublishContent(resourceName, "Upload");
	     DashboardPageActions.logOut();
		 LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		 DashboardPageActions.clickUserProfileIcon();
		 DashboardPageActions.assertWorkspace();
		 DashboardPageActions.clickOnWorkSpace();
		 WorkspaceDashboardPageActions.clickPublishedBucket();
		 AllMyContentPageActions.enterContentInSearchBox(resourceName);
		 AllMyContentPageActions.clickFirstCard();
		 UtilityFunctions.switchFrameOnIndex(0);
		 UploadPageActions.clickReplaceAndUpload();
		 UploadPageActions.reUploadContent("H5P");
	}
	
	@Test(description = "Edit and replace a published Webm content with same content")
	public void editAndReplacethewebmContent() throws Exception {
		 OnBoardingActions.RolePoup();
	     OnBoardingActions.BMCPopup();
	     OnBoardingActions.LocationPopup();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.assertWorkspace();
	     DashboardPageActions.clickOnWorkSpace();
	     UploadPageActions.uploadContent("WEBM");
	     UploadPageActions.clickSendForReview();
	     String resourceName = UploadPageActions.sendUploadContentForReview();
	     UtilityFunctions.switchToDefaultContentFrame();
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.clickOnWorkSpace();
	     ReviewPageActions.reviewAndPublishContent(resourceName, "Upload");
	     DashboardPageActions.logOut();
		 LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		 DashboardPageActions.clickUserProfileIcon();
		 DashboardPageActions.assertWorkspace();
		 DashboardPageActions.clickOnWorkSpace();
		 WorkspaceDashboardPageActions.clickPublishedBucket();
		 AllMyContentPageActions.enterContentInSearchBox(resourceName);
		 AllMyContentPageActions.clickFirstCard();
		 UtilityFunctions.switchFrameOnIndex(0);
		 UploadPageActions.clickReplaceAndUpload();
		 UploadPageActions.reUploadContent("WEBM");
	}
	
	@Test(description = "Copy and Publish a mp4 content with same content")
	public void copyAndPublishMp4Content() throws Exception {
		OnBoardingActions.RolePoup();
	     OnBoardingActions.BMCPopup();
	     OnBoardingActions.LocationPopup();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.assertWorkspace();
	     DashboardPageActions.clickOnWorkSpace();
	     UploadPageActions.uploadContent("MP4");
	     UploadPageActions.clickSendForReview();
	     String resourceName = UploadPageActions.sendUploadContentForReview();
	     UtilityFunctions.switchToDefaultContentFrame();
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.clickOnWorkSpace();
	     ReviewPageActions.reviewAndPublishContent(resourceName, "Upload");
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
					sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
	     DashboardPageActions.clickHomeTab();
	     DashboardPageActions.searchContentAndClickOnContentCard(resourceName);
	     UploadPageActions.clickCopyButton();
	     UtilityFunctions.switchFrameOnIndex(0);
	     UploadPageActions.clickSendForReview();
	     UploadPageActions.sendUploadContentForReview();
	     UtilityFunctions.switchToDefaultContentFrame();
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.clickOnWorkSpace();
	     ReviewPageActions.reviewAndPublishContent(resourceName, "Upload");
	     DashboardPageActions.logOut();
	     
	}
	
	@Test(description = "Copy and Publish a Webm content with same content")
	public void copyAndPublishWebmContent() throws Exception {
		OnBoardingActions.RolePoup();
	     OnBoardingActions.BMCPopup();
	     OnBoardingActions.LocationPopup();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.assertWorkspace();
	     DashboardPageActions.clickOnWorkSpace();
	     UploadPageActions.uploadContent("WEBM");
	     UploadPageActions.clickSendForReview();
	     String resourceName = UploadPageActions.sendUploadContentForReview();
	     UtilityFunctions.switchToDefaultContentFrame();
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.clickOnWorkSpace();
	     ReviewPageActions.reviewAndPublishContent(resourceName, "Upload");
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
					sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
	     DashboardPageActions.clickHomeTab();
	     DashboardPageActions.searchContentAndClickOnContentCard(resourceName);
	     UploadPageActions.clickCopyButton();
	     UtilityFunctions.switchFrameOnIndex(0);
	     UploadPageActions.clickSendForReview();
	     UploadPageActions.sendUploadContentForReview();
	     UtilityFunctions.switchToDefaultContentFrame();
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.clickOnWorkSpace();
	     ReviewPageActions.reviewAndPublishContent(resourceName, "Upload");
	     DashboardPageActions.logOut();
	     
	}
	
	@Test(description = "Copy and Publish a Pdf content with same content")
	public void copyAndPublishPdfContent() throws Exception {
		OnBoardingActions.RolePoup();
	     OnBoardingActions.BMCPopup();
	     OnBoardingActions.LocationPopup();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.assertWorkspace();
	     DashboardPageActions.clickOnWorkSpace();
	     UploadPageActions.uploadContent("PDF");
	     UploadPageActions.clickSendForReview();
	     String resourceName = UploadPageActions.sendUploadContentForReview();
	     UtilityFunctions.switchToDefaultContentFrame();
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.clickOnWorkSpace();
	     ReviewPageActions.reviewAndPublishContent(resourceName, "Upload");
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
					sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
	     DashboardPageActions.searchContentAndClickOnContentCard(resourceName);
	     UploadPageActions.clickCopyButton();
	     UtilityFunctions.switchFrameOnIndex(0);
	     UploadPageActions.clickSendForReview();
	     UploadPageActions.sendUploadContentForReview();
	     UtilityFunctions.switchToDefaultContentFrame();
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.clickOnWorkSpace();
	     ReviewPageActions.reviewAndPublishContent(resourceName, "Upload");
	     
	}
	
	@Test(description = "Copy and Publish a Epub content with same content")
	public void copyAndPublishEpubContent() throws Exception {
		OnBoardingActions.RolePoup();
	     OnBoardingActions.BMCPopup();
	     OnBoardingActions.LocationPopup();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.assertWorkspace();
	     DashboardPageActions.clickOnWorkSpace();
	     UploadPageActions.uploadContent("EPUB");
	     UploadPageActions.clickSendForReview();
	     String resourceName = UploadPageActions.sendUploadContentForReview();
	     UtilityFunctions.switchToDefaultContentFrame();
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.clickOnWorkSpace();
	     ReviewPageActions.reviewAndPublishContent(resourceName, "Upload");
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
					sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
	     DashboardPageActions.searchContentAndClickOnContentCard(resourceName);
	     UploadPageActions.clickCopyButton();
	     UtilityFunctions.switchFrameOnIndex(0);
	     UploadPageActions.clickSendForReview();
	     UploadPageActions.sendUploadContentForReview();
	     UtilityFunctions.switchToDefaultContentFrame();
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.clickOnWorkSpace();
	     ReviewPageActions.reviewAndPublishContent(resourceName, "Upload");
	     DashboardPageActions.logOut();
	     
	}
	
	@Test(description = "Copy and Publish a HTML content with same content")
	public void copyAndPublishHtmlContent() throws Exception {
		OnBoardingActions.RolePoup();
	     OnBoardingActions.BMCPopup();
	     OnBoardingActions.LocationPopup();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.assertWorkspace();
	     DashboardPageActions.clickOnWorkSpace();
	     UploadPageActions.uploadContent("HTML");
	     UploadPageActions.clickSendForReview();
	     String resourceName = UploadPageActions.sendUploadContentForReview();
	     UtilityFunctions.switchToDefaultContentFrame();
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.clickOnWorkSpace();
	     ReviewPageActions.reviewAndPublishContent(resourceName, "Upload");
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
					sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
	     DashboardPageActions.clickHomeTab();
	     DashboardPageActions.searchContentAndClickOnContentCard(resourceName);
	     UploadPageActions.clickCopyButton();
	     UtilityFunctions.switchFrameOnIndex(0);
	     UploadPageActions.clickSendForReview();
	     UploadPageActions.sendUploadContentForReview();
	     UtilityFunctions.switchToDefaultContentFrame();
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.clickOnWorkSpace();
	     ReviewPageActions.reviewAndPublishContent(resourceName, "Upload");
	     DashboardPageActions.logOut();
	     
	}
	
	@Test(description = "Copy and Publish a HTML content with same content")
	public void copyAndPublishH5plContent() throws Exception {
		OnBoardingActions.RolePoup();
	     OnBoardingActions.BMCPopup();
	     OnBoardingActions.LocationPopup();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.assertWorkspace();
	     DashboardPageActions.clickOnWorkSpace();
	     UploadPageActions.uploadContent("H5P");
	     UploadPageActions.clickSendForReview();
	     String resourceName = UploadPageActions.sendUploadContentForReview();
	     UtilityFunctions.switchToDefaultContentFrame();
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.clickOnWorkSpace();
	     ReviewPageActions.reviewAndPublishContent(resourceName, "Upload");
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
					sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
	     DashboardPageActions.clickHomeTab();
	     DashboardPageActions.searchContentAndClickOnContentCard(resourceName);
	     UploadPageActions.clickCopyButton();
	     UtilityFunctions.switchFrameOnIndex(0);
	     UploadPageActions.clickSendForReview();
	     UploadPageActions.sendUploadContentForReview();
	     UtilityFunctions.switchToDefaultContentFrame();
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.clickOnWorkSpace();
	     ReviewPageActions.reviewAndPublishContent(resourceName, "Upload");
	     DashboardPageActions.logOut();
	     
	}
	

	
}