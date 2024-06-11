package regression;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageActions.*;

import java.io.File;

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
		WorkspaceDashboardPageActions.assertBook();
		WorkspaceDashboardPageActions.assertCourse();
		WorkspaceDashboardPageActions.assertResource();
		WorkspaceDashboardPageActions.assertCollection();
		WorkspaceDashboardPageActions.assertLessonPlan();
		WorkspaceDashboardPageActions.assertUploadContent();
		WorkspaceDashboardPageActions.assertUploadLargeContent();
		WorkspaceDashboardPageActions.assertCourseAssessment();
		WorkspaceDashboardPageActions.assertQuestionSet();
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
		WorkspaceDashboardPageActions.submitForReview();
		WorkspaceDashboardPageActions.clickPublishedBucket();
		WorkspaceDashboardPageActions.assertAllUploads();
		WorkspaceDashboardPageActions.assertCourseBatches();
		WorkspaceDashboardPageActions.assertCreatedByme();
		WorkspaceDashboardPageActions.assertAssignedTome();
		WorkspaceDashboardPageActions.assertAndClickSharedViaLink();
		WorkspaceDashboardPageActions.assertCollaborations();
	
}
	
	  @Test(description = "upload PDF")
	    public void UploadPDFcontent() throws Exception {
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
	    }
	    @Test(description = "upload Mp4")
	    public void UploadMP4content() throws Exception {
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
	    }
	    @Test(description = "upload HTML")
	    public void UploadHTMLcontent() throws Exception {
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
	    }
	    @Test(description = "upload WEBM")
	    public void UploadWEBMcontent() throws Exception {
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
	    }

	    @Test(description = "upload H5P")
	    public void UploadH5pcontent() throws Exception {
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
	    }
	
	 @Test(description = "upload EPUB")
	    public void UploadEPUBcontent() throws Exception {
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
	    }

	    @Test(description = "upload Youtube")
	    public void UploadYouTubecontent() throws Exception {
	        OnBoardingActions.RolePoup();
	        OnBoardingActions.BMCPopup();
	        OnBoardingActions.LocationPopup();
	        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
	        DashboardPageActions.clickUserProfileIcon();
	        DashboardPageActions.assertWorkspace();
	        DashboardPageActions.clickOnWorkSpace();
	        String link=sunbird_config.getSunbidConfigPropertyValue("YOUTUBE");
	        UploadPageActions.uploadYoutube(link);
	        UploadPageActions.clickSendForReview();
	        String resourceName = UploadPageActions.sendUploadContentForReview();
	        UtilityFunctions.switchToDefaultContentFrame();
	        DashboardPageActions.logOut();
	        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
	        DashboardPageActions.clickUserProfileIcon();
	        DashboardPageActions.clickOnWorkSpace();
	        ReviewPageActions.reviewAndPublishContent(resourceName, "Upload");
	        DashboardPageActions.logOut();
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
		 PublishedPageActions.clickFirstCard();
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
		 PublishedPageActions.clickFirstCard();
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
		 PublishedPageActions.clickFirstCard();
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
		 PublishedPageActions.clickFirstCard();
		 UtilityFunctions.switchFrameOnIndex(0);
		 UploadPageActions.clickReplaceAndUpload();
		 UploadPageActions.reUploadContent("HTML");
	}
	
	@Test(description = "Edit and replace a published H5P content with same content")
	public void editAndReplacetheh5pContent() throws Exception {
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
		 PublishedPageActions.clickFirstCard();
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
		 PublishedPageActions.clickFirstCard();
		 UtilityFunctions.switchFrameOnIndex(0);
		 UploadPageActions.clickReplaceAndUpload();
		 UploadPageActions.reUploadContent("WEBM");
	}
	
	 @Test(description = "Edit and replace a published Youtube content with same content")
	    public void EditAndReplaceUploadYouTubecontent() throws Exception {
	        OnBoardingActions.RolePoup();
	        OnBoardingActions.BMCPopup();
	        OnBoardingActions.LocationPopup();
	        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
	        DashboardPageActions.clickUserProfileIcon();
	        DashboardPageActions.assertWorkspace();
	        DashboardPageActions.clickOnWorkSpace();
	        String link=sunbird_config.getSunbidConfigPropertyValue("YOUTUBE");
	        UploadPageActions.uploadYoutube(link);
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
			 PublishedPageActions.clickFirstCard();
			 String replacedlink=sunbird_config.getSunbidConfigPropertyValue("YOUTUBE2");
			 UtilityFunctions.switchFrameOnIndex(0);
			 UploadPageActions.clickReplaceAndUpload();
		     UploadPageActions.reUploadYoutubeContent(replacedlink);
		    
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
	     String copiedname = UploadPageActions.sendUploadContentForReview();
	     UtilityFunctions.switchToDefaultContentFrame();
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.clickOnWorkSpace();
	     ReviewPageActions.reviewAndPublishContent(copiedname, "Upload");
	 
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
	     String copiedname = UploadPageActions.sendUploadContentForReview();
	     UtilityFunctions.switchToDefaultContentFrame();
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.clickOnWorkSpace();
	     ReviewPageActions.reviewAndPublishContent(copiedname, "Upload");
	   
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
	     String copiedname = UploadPageActions.sendUploadContentForReview();
	     UtilityFunctions.switchToDefaultContentFrame();
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.clickOnWorkSpace();
	     ReviewPageActions.reviewAndPublishContent(copiedname, "Upload");
	 
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
	     String copiedname = UploadPageActions.sendUploadContentForReview();
	     UtilityFunctions.switchToDefaultContentFrame();
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.clickOnWorkSpace();
	     ReviewPageActions.reviewAndPublishContent(copiedname, "Upload");
	
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
	     String copiedname = UploadPageActions.sendUploadContentForReview();
	     UtilityFunctions.switchToDefaultContentFrame();
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.clickOnWorkSpace();
	     ReviewPageActions.reviewAndPublishContent(copiedname, "Upload");
	 
	}
	
	@Test(description = "Copy and Publish a H5P content with same content")
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
	     String copiedname = UploadPageActions.sendUploadContentForReview();
	     UtilityFunctions.switchToDefaultContentFrame();
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.clickOnWorkSpace();
	     ReviewPageActions.reviewAndPublishContent(copiedname, "Upload");
	     
	}
	

	@Test(description = "Copy and Publish a Youtube content with same content")
	public void copyAndPublishYoutubeContent() throws Exception {
		 OnBoardingActions.RolePoup();
	        OnBoardingActions.BMCPopup();
	        OnBoardingActions.LocationPopup();
	        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
	        DashboardPageActions.clickUserProfileIcon();
	        DashboardPageActions.assertWorkspace();
	        DashboardPageActions.clickOnWorkSpace();
	        String link=sunbird_config.getSunbidConfigPropertyValue("YOUTUBE");
	        UploadPageActions.uploadYoutube(link);
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
		     String copiedname = UploadPageActions.sendUploadContentForReview();
		     UtilityFunctions.switchToDefaultContentFrame();
		     DashboardPageActions.logOut();
		     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
		     DashboardPageActions.clickUserProfileIcon();
		     DashboardPageActions.clickOnWorkSpace();
		     ReviewPageActions.reviewAndPublishContent(copiedname, "Upload");
		         
	}
	
	@Test(description = "Delete content from Published and All my content bucket")
	public void deleteContentFromPublishedandAllUploads() throws Exception {
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
		 PublishedPageActions.clickDeleteButton();
		 PublishedPageActions.clickYesonConfirmDelete();
		 WorkspaceDashboardPageActions.clickDrafts();
		 WorkspaceDashboardPageActions.clickPublishedBucket();
		 AllMyContentPageActions.enterContentInSearchBox(contentName);
		 PublishedPageActions.assertContentNotAvailable();
		 WorkspaceDashboardPageActions.clickCreate();
		 UploadPageActions.uploadContent("MP4");
		 UploadPageActions.clickEditDetails();
		 String allUploadContent = UploadPageActions.sendUploadContentForReview();
		 UploadPageActions.clickCloseIcon();
		 UploadPageActions.closeEditor();
		 UtilityFunctions.switchToDefaultContentFrame();
		 WorkspaceDashboardPageActions.clickAllUploads();
		 PublishedPageActions.clickDeleteButton();
		 PublishedPageActions.clickYesonConfirmDelete();
		 PublishedPageActions.assertDeletedContentMsg();
		 WorkspaceDashboardPageActions.clickAllMyContent();
		 AllMyContentPageActions.enterContentInSearchBox(allUploadContent);	 
		 AllMyContentPageActions.assertNoResultFoungMsg();
	}
	
	@Test(description = "click on Downlaod icon in preview page")
	public void DownloadContentFromPreviewPage () throws InterruptedException {
		OnBoardingActions.RolePoup();
	     OnBoardingActions.BMCPopup();
	     OnBoardingActions.LocationPopup();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.assertWorkspace();
	     DashboardPageActions.clickOnWorkSpace();
	     UploadPageActions.uploadContent("PDF");
	     UploadPageActions.clickDownloadButtonInPrveiewPage();
	     File file=UtilityFunctions.getLatestDownloadedFile(UtilityFunctions.getSystemDownloadPath());
	     String fileName=file.getName();
	     String splitedName = fileName.split("\\.")[1];
	     UtilityFunctions.stringValueComparision(splitedName,"ecar","file not downloaded");
		 
	}
	
	@Test(description = "Content is send for Limited Sharing")
	public void SendContentForLimitedSharing () throws Exception {
		OnBoardingActions.RolePoup();
	     OnBoardingActions.BMCPopup();
	     OnBoardingActions.LocationPopup();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.assertWorkspace();
	     DashboardPageActions.clickOnWorkSpace();
	     UploadPageActions.uploadContent("PDF");
	     UploadPageActions.clickEditDetails();
	     String contentName = UploadPageActions.sendUploadContentForReview();
	     UploadPageActions.clickCloseIcon();
	     UploadPageActions.clickLimitedSharing();
	     Thread.sleep(2000);
	     UtilityFunctions.switchToDefaultContentFrame();
	     WorkspaceDashboardPageActions.clickPublishedBucket();
	     UtilityFunctions.refreshPage();
	     WorkspaceDashboardPageActions.assertAndClickSharedViaLink();
	     WorkspaceDashboardPageActions.assertContentAndClick(contentName);
	}
	
	@Test(description = "Rejected content should be available in drafts")
	public void VerifyRejectedContentInDrafts () throws Exception {
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
	     ReviewPageActions.reviewAndRejectContent(resourceName, "Resource");
	     DashboardPageActions.logOut();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
	                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.clickOnWorkSpace();
	     WorkspaceDashboardPageActions.assertDrafts();
	     AllMyContentPageActions.enterContentInSearchBox(resourceName);
	     DraftsPageActions.clickFirstCard();
	     
	}
	
	@Test(description = "Created content should be available in All uploads and all my content")
	public void VerifyUploadedConetentInAllMyContentAndAllUploads() throws Exception {
		OnBoardingActions.RolePoup();
	     OnBoardingActions.BMCPopup();
	     OnBoardingActions.LocationPopup();
	     LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"), sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
	     DashboardPageActions.clickUserProfileIcon();
	     DashboardPageActions.assertWorkspace();
	     DashboardPageActions.clickOnWorkSpace();
		 UploadPageActions.uploadContent("MP4");
		 UploadPageActions.clickEditDetails();
		 String UploadContent = UploadPageActions.sendUploadContentForReview();
		 UploadPageActions.clickCloseIcon();
		 UploadPageActions.closeEditor();
		 Thread.sleep(2000);
		 UtilityFunctions.switchToDefaultContentFrame();
		 UtilityFunctions.refreshPage();
		 WorkspaceDashboardPageActions.clickAllUploads();
		 WorkspaceDashboardPageActions.assertContentAndClick(UploadContent);
		 UtilityFunctions.switchFrameOnIndex(0);
		 UploadPageActions.closeEditor();
		 UtilityFunctions.switchToDefaultContentFrame();
		 WorkspaceDashboardPageActions.clickAllMyContent();
		 AllMyContentPageActions.enterContentInSearchBox(UploadContent);
		 AllMyContentPageActions.clickFirstCard();
	}
	
	@Test(description = "Created content should be available in All uploads and all my content")
	public void verifyBookEditor() throws Exception {
		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.assertWorkspace();
		DashboardPageActions.clickOnWorkSpace();
		WorkspaceDashboardPageActions.clickBook();
		BookPageActions.createBookPopup("getdoid");
		BookPageActions.assertThreeDotsMenu();
		BookPageActions.clickThreeDotsMenu();
		BookPageActions.assetCreateFoldersOption();
		BookPageActions.assertDownloadFoldersAsCSVOption();
		BookPageActions.assertUpdateFolderOption();
		BookPageActions.clickThreeDotsMenu();
		BookPageActions.assertAddCollaboratorButton();
		BookPageActions.assertQRCodeOption();
		BookPageActions.clickQRDropDown();
		BookPageActions.assertGenerateQROption();
		BookPageActions.assertDownloadQROption();	
		BookPageActions.assertSaveAsDraftOption();
		BookPageActions.assertBackButton();
		BookPageActions.assertAddSiblingOption();
		BookPageActions.assertAddChildOption();
		BookPageActions.assertAddFromLibraryOption();
		
	}
	@Test(description = "Verify that the latest 100 relevant live contents are available in the add from library page by default")
	public void verifyLatestPublishedContentInAddFromLibrary() throws Exception {
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
		WorkspaceDashboardPageActions.clickBook();
		BookPageActions.createBookPopup("getdoid");
		BookPageActions.section1("getdescription");
		BookPageActions.BMCDropdownSelectionSection2();
		BookPageActions.Section3();
		BookPageActions.assertContentIsSavedToastrMsg();
		BookPageActions.waitContentIsSavedToastToDisapper();
		BookPageActions.addResourceInLibrarySection(resourceName);
		BookPageActions.clickAddChild();
		BookPageActions.verify100ContentsInAddFromLibrary("100");
		BookPageActions.submitAndSendForReview();

	}

	@Test(description = "Verify user is able to edit the published course")
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
}

	
