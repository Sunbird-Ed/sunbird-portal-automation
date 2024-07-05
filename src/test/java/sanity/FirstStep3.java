package sanity;

import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageActions.*;
import org.testng.annotations.Test;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageActions.OnBoardingActions;

import java.awt.print.Book;

public class FirstStep3 extends BaseTestConfig {

	/*@Test(description = "Verify that the Book creator is able to add the courses to the nodes by searching the course name, do_id from add from library page")
	public void BookCreatorAbleToAddCourseIntoTextbookUsingCourseNameAndDoIDFromAddLibrarySection() throws Exception {

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
		String des = BookPageActions.section1("getdescription");
		BookPageActions.BMCDropdownSelectionSection2();
		BookPageActions.Section3();
		BookPageActions.assertContentIsSavedToastrMsg();
		BookPageActions.waitContentIsSavedToastToDisapper();
		BookPageActions.clickAddChild();
		BookPageActions.addDifferentResourceTypeInLibrarySection("Course");
		BookPageActions.clickOnAddChildLeftSectionUnit();
		BookPageActions.addDifferentResourceTypeInLibrarySection(sunbird_config.getSunbidConfigPropertyValue("CourseDOIDwithoutCertificate"));
		BookPageActions.clickSaveAsDrafts();
	}*/
	/*@Test(description = "User should be able to edit the publsihed textbook")
	public void UserAbleToEditPublishedTextBookAndRePublishTextBook() throws Exception {

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
		String des = BookPageActions.section1("getdescription");
		BookPageActions.BMCDropdownSelectionSection2();
		BookPageActions.Section3();
		BookPageActions.assertContentIsSavedToastrMsg();
		BookPageActions.waitContentIsSavedToastToDisapper();
		BookPageActions.addResourceInLibrarySection("Mp4");
		BookPageActions.submitAndSendForReview();
		DashboardPageActions.logOut();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.clickOnWorkSpace();
		ReviewPageActions.reviewAndPublishContent(createdContent, "Book");
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
		ReviewPageActions.reviewAndPublishContent(createdContent, "Book");
	}*/

	/*@Test(description = "Verify that if the book creator is able to copy a book")
	public void CreatorAbleToCopyThePublishedBook() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickDigitalTextbookTab();
		DashboardPageActions.searchContentAndClickOnContentCard(sunbird_config.getSunbidConfigPropertyValue("Textbook"));
		BookPageActions.clickCopyButton();
		BookPageActions.assertCopyToastrMsg();
		BookPageActions.waitCopyToastrMsgDisAppear();
		BookPageActions.BMCDropdownSelectionSection2();
		BookPageActions.clickSaveAsDrafts();
	}*/

	/*@Test(description = "Verify creator is able to fill the details in the root node and click on save as draft button")
	public void FillDetailsInRootNodeForCollectionAndSaveAsDraft() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.assertWorkspace();
		DashboardPageActions.clickOnWorkSpace();
		WorkspaceDashboardPageActions.clickCollection();
		String createdContent = CollectionPageActions.createCollectionPopupSection1("Content Playlist", "getdoid");
		BookPageActions.BMCDropdownSelectionSection2();
		BookPageActions.Section3();
		BookPageActions.assertContentIsSavedToastrMsg();
		BookPageActions.waitContentIsSavedToastToDisapper();

	}*/

	/*@Test(description = "Verify that the user with Admin role should be able to see All Textbook option in Workspace")
	public void UserWithAdminRoleAbleToSeeAllTextBookOptionInWorkspace() throws Exception {
		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
			LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("TN_ORGADMIN"),
				sunbird_config.getSunbidConfigPropertyValue("TN_ORGADMIN_PWD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.clickOnWorkSpace();
		WorkspaceDashboardPageActions.clickAllTextBookOption();
		AllMyContentPageActions.clickFirstCard();
	}*/

/*
	@Test(description = "Verify creator is able to add the content from library for draft collection and save and send for review.")
	public void AddContentFromLibraryForDraftCollection() throws Exception {
		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.assertWorkspace();
		DashboardPageActions.clickOnWorkSpace();
		WorkspaceDashboardPageActions.clickCollection();
		String createdContent = CollectionPageActions.createCollectionPopupSection1("Content Playlist","getdoid");
		BookPageActions.BMCDropdownSelectionSection2();
		BookPageActions.Section3();
		BookPageActions.assertContentIsSavedToastrMsg();
		BookPageActions.waitContentIsSavedToastToDisapper();
		BookPageActions.clickBackButtonInEditor();
		AllMyContentPageActions.enterContentInSearchBox(createdContent);
		DraftsPageActions.clickFirstCard();
		BookPageActions.addResourceFromLibrary();
		BookPageActions.submitAndSendForReview();

	}
*/

	/*@Test(description = "Reviewer should be able to review the added contents under the Child.")
	public void ReviewAddedContentUnderChildFromReviewerSide() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.assertWorkspace();
		DashboardPageActions.clickOnWorkSpace();
		WorkspaceDashboardPageActions.clickCollection();
		String createdContent = CollectionPageActions.createCollectionPopupSection1("Content Playlist","getdoid");
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
		ReviewPageActions.clickUpForReview();
		ReviewPageActions.enterSearchAndClickOnSearchIcon(createdContent);
		ReviewPageActions.clickOnFirstContentAfterSearch();
		ReviewPageActions.reviewAddedContentUnderChildFromReviewerSide();


	}*/

	/*@Test(description = "Publish pop up should show with the list of items in the checklist is displayed for reviewer post clicking on publish button of the textbook")
	public void VerifyListOfCheckListItemsInTextBookPublishPopup() throws Exception {

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
		String des = BookPageActions.section1("getdescription");
		BookPageActions.BMCDropdownSelectionSection2();
		BookPageActions.Section3();
		BookPageActions.assertContentIsSavedToastrMsg();
		BookPageActions.waitContentIsSavedToastToDisapper();
		BookPageActions.addResourceInLibrarySection("Mp4");
		BookPageActions.submitAndSendForReview();
		DashboardPageActions.logOut();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.clickOnWorkSpace();
		ReviewPageActions.assertAllTheCheckListInPublishPopup(createdContent);
	}
*/

	/*@Test(description = "User should be able to add the course to the textbook")
	public void UserAbleToAddCourseToTheTextBookInAddFromLibraryPage() throws Exception {

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
		String des = BookPageActions.section1("getdescription");
		BookPageActions.BMCDropdownSelectionSection2();
		BookPageActions.Section3();
		BookPageActions.assertContentIsSavedToastrMsg();
		BookPageActions.waitContentIsSavedToastToDisapper();
		BookPageActions.clickAddChild();
		BookPageActions.addDifferentResourceTypeInLibrarySection(sunbird_config.getSunbidConfigPropertyValue("CourseDOIDwithoutCertificate"));
		BookPageActions.clickSaveAsDrafts();
	}*/



/*	@Test(description = "Once the Book is rejected the by the reviewer, the respective book should get dissappeared from his up for review bucket")
	public void OnceBookIsRejectedShouldGetDisappearFromUpForReviewBucket() throws Exception {
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
		String des = BookPageActions.section1("getdescription");
		BookPageActions.BMCDropdownSelectionSection2();
		BookPageActions.Section3();
		BookPageActions.assertContentIsSavedToastrMsg();
		BookPageActions.waitContentIsSavedToastToDisapper();
		BookPageActions.addResourceInLibrarySection("Mp4");
		BookPageActions.submitAndSendForReview();
		DashboardPageActions.logOut();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.clickOnWorkSpace();
		ReviewPageActions.reviewAndRejectContent(createdContent, "Book");
		ReviewPageActions.clickUpForReview();
		ReviewPageActions.enterSearchAndClickOnSearchIcon(createdContent);
ReviewPageActions.assertNoContentForReviewMsg();
		DashboardPageActions.logOut();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickUserProfileIcon();
		DashboardPageActions.clickOnWorkSpace();
		WorkspaceDashboardPageActions.assertDrafts();
		AllMyContentPageActions.enterContentInSearchBox(createdContent);
		DraftsPageActions.clickFirstCard();

	}*/

//	@Test(description = "Once the Book is published the by the reviewer, the respective book should get dissappeared from his Up for revie")
//	public void OnceBookIsPublishedShouldGetDisappearFromUpForReviewBucket() throws Exception {
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
//		String des = BookPageActions.section1("getdescription");
//		BookPageActions.BMCDropdownSelectionSection2();
//		BookPageActions.Section3();
//		BookPageActions.assertContentIsSavedToastrMsg();
//		BookPageActions.waitContentIsSavedToastToDisapper();
//		BookPageActions.addResourceInLibrarySection("Mp4");
//		BookPageActions.submitAndSendForReview();
//		DashboardPageActions.logOut();
//		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
//				sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
//		DashboardPageActions.clickUserProfileIcon();
//		DashboardPageActions.clickOnWorkSpace();
//		ReviewPageActions.reviewAndPublishContent(createdContent, "Book");
//		ReviewPageActions.clickUpForReview();
//		ReviewPageActions.enterSearchAndClickOnSearchIcon(createdContent);
//		ReviewPageActions.assertNoContentForReviewMsg();
//		DashboardPageActions.logOut();
//		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
//				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
//		DashboardPageActions.clickUserProfileIcon();
//		DashboardPageActions.assertWorkspace();
//		DashboardPageActions.clickOnWorkSpace();
//		WorkspaceDashboardPageActions.clickPublishedBucket();
//		AllMyContentPageActions.enterContentInSearchBox(createdContent);
//		PublishedPageActions.assertFirstContentInPublishedSection();
//			WorkspaceDashboardPageActions.clickAllMyContent();
//		AllMyContentPageActions.enterContentInSearchBox(createdContent);
//		AllMyContentPageActions.clickFirstCard();
//
//	}

   /* @Test(description = "Creator should be able to add siblings and child in the toc and click on save as draft button")
    public void CreatorAbleToAddSibilingAndChildToColelctionAndSaveAsDraft() throws Exception {
*//*String username="contentreviewerTN@yopmail.com";
String password="Test@123";

			String usernameEncrypt = EncoderAndDecoder.getEncodedText(username);
		String passwordEncrypt=  EncoderAndDecoder.getEncodedText(password);
		String usrName = EncoderAndDecoder.getdecodedText(usernameEncrypt);
		String pwd = EncoderAndDecoder.getdecodedText(passwordEncrypt);

		System.out.println(("EncryptedUsrName " +usernameEncrypt));
		System.out.println(("EncryptedPwd " +passwordEncrypt));

		System.out.println(("decryptedUsrName " +usrName));
		System.out.println(("decryptedPwd " +pwd));*//*

        String username="Y29udGVudHJldmlld2VyVE5AeW9wbWFpbC5jb20";
        String password="VGVzdEAxMjM=";


        String usrName = EncoderAndDecoder.getdecodedText(username);
        String pwd = EncoderAndDecoder.getdecodedText(password);

        System.out.println(("decryptedUsrName " +usrName));
        System.out.println(("decryptedPwd " +pwd));

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(usrName,pwd);
        DashboardPageActions.clickUserProfileIcon();

    }
*/

//    @Test(description = "The content creator should be able to save the resource and send the resource for review,is able to see the resource in Submitted for review section")
//    public void verifyResourceInSubmittedForReviewBucketAfterSendingResourceForReview() throws Exception {
//        OnBoardingActions.RolePoup();
//        OnBoardingActions.BMCPopup();
//        OnBoardingActions.LocationPopup();
//        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
//                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
//        DashboardPageActions.clickUserProfileIcon();
//        DashboardPageActions.clickOnWorkSpace();
//        WorkspaceDashboardPageActions.clickResource();
//        String createdContent = ResourcePageActions.createResourcePopup("getContentName");
//        ResourcePageActions.addTriangleShape();
//        ResourcePageActions.addText();
//        ResourcePageActions.addNewSlide();
//        ResourcePageActions.saveAndCloseIcon();
//        ResourcePageActions.resourceSendForReview();
//        UtilityFunctions.threadSleep(5000);
//        WorkspaceDashboardPageActions.clickDrafts();
//        WorkspaceDashboardPageActions.clickAllMyContent();
//        WorkspaceDashboardPageActions.clickDrafts();
//        WorkspaceDashboardPageActions.submittedForReview();
//     String resourceXpath= UtilityFunctions.generateXpathUsingContainsWithKeyNameValue(createdContent);
//UtilityFunctions.assertWebElementAsString(resourceXpath);
//        DashboardPageActions.logOut();
//        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
//                sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
//        DashboardPageActions.clickUserProfileIcon();
//        DashboardPageActions.clickOnWorkSpace();
//        ReviewPageActions.reviewAndPublishContent(createdContent, "Resource");
//
//    }


    @Test(description = "createCollectionAndVerify")
    public void CreateCollectionAndVerify() throws Exception {

        String name="raju";
        String Name="arun";

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.assertWorkspace();
        DashboardPageActions.clickOnWorkSpace();
        WorkspaceDashboardPageActions.clickCollection();
        String createdContent = CollectionPageActions.createCollectionPopupSection1("Content Playlist","getdoid");
        BookPageActions.BMCDropdownSelectionSection2();
        BookPageActions.Section3();
        BookPageActions.assertContentIsSavedToastrMsg();
        BookPageActions.waitContentIsSavedToastToDisapper();
        BookPageActions.addResourceFromLibrary();
        BookPageActions.addResourceFromLibrary();
        BookPageActions.submitAndSendForReview();
        DashboardPageActions.logOut();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnWorkSpace();
        ReviewPageActions.reviewAndPublishContent(createdContent, "Collection");

    }
}