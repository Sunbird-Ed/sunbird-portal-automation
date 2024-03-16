package sanity;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageActions.*;
import org.testng.annotations.Test;

public class FirstStep5 extends BaseTestConfig {

/*
	@Test(description = "User able to see sections in HomePage")
	public void VerifyHomePageSection() throws Exception {

		OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();
		OnBoardingActions.LocationPopup();
		LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
				sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
		DashboardPageActions.clickHomeTab();
		HomeTabPageActions.validateContinueLearningSection();
		HomeTabPageActions.validateBrowseBySubjectSection();
		HomeTabPageActions.validateBrowseByCategoriesSection();
		HomeTabPageActions.validateRecentlyPublishedSection();
	}
*/

/*
    @Test(description = "createCollectionAndVerify")
    public void createCollectionAndVerify() throws Exception {

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
        BookPageActions.addResourceFromLibrary();
        BookPageActions.submitAndSendForReview();
        DashboardPageActions.logOut();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("REVIEWER_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("REVIEWER_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnWorkSpace();
        ReviewPageActions.reviewAndPublishContent(createdContent, "Collection");

    }*/

   /* @Test(description = "Create Book with DifferentResourceType")
    public void createBookwithDifferentResourceType() throws Exception {

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
        BookPageActions.clickAddChild();
        BookPageActions.addDifferentResourceTypeInLibrarySection("Resource");
        BookPageActions.addDifferentResourceTypeInLibrarySection("Collection");
        BookPageActions.clickSaveAsDrafts();


    }*/

    /*@Test(description = "Create course with DifferentResourceType")
    public void CreateCourseWithAllResourceType() throws Exception {

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
        BookPageActions.clickAddChild();
        BookPageActions.addDifferentResourceTypeInLibrarySection("Resource");
        BookPageActions.clickOnAddChildLeftSectionUnit();
        BookPageActions.addDifferentResourceTypeInLibrarySection("Collection");
        BookPageActions.addDifferentResourceTypeInLibrarySection("Youtube");
        BookPageActions.addDifferentResourceTypeInLibrarySection("Pdf");
        BookPageActions.addDifferentResourceTypeInLibrarySection("Epub");
        BookPageActions.addDifferentResourceTypeInLibrarySection("h5p");
        BookPageActions.addDifferentResourceTypeInLibrarySection("Courses");
        BookPageActions.clickSaveAsDrafts();


    }
*/
//    @Test(description = "Generate QrCode",groups= {"Creation"})
//    public void downloadQRCode() throws Exception {
//
//        OnBoardingActions.RolePoup();
//        OnBoardingActions.BMCPopup();
//        OnBoardingActions.LocationPopup();
//        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
//                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
//        DashboardPageActions.clickUserProfileIcon();
//        DashboardPageActions.assertWorkspace();
//        DashboardPageActions.clickOnWorkSpace();
//        WorkspaceDashboardPageActions.clickBook();
//        String createdContent = BookPageActions.createBookPopup("getdoid");
//        String des=BookPageActions.section1("getdescription");
//        BookPageActions.BMCDropdownSelectionSection2();
//        BookPageActions.Section3();
//        BookPageActions.aseertContentIsSavedToastrMsg();
//        BookPageActions.waitContentIsSavedToastToDisapper();
//        BookPageActions.generateQrCode("2");
//        BookPageActions.downloadQrCode();
//        BookPageActions.generateQrCode("245");
//        BookPageActions.downloadQrCode();
//        BookPageActions.addResourceFromLibrary();
//        BookPageActions.submitAndSendForReview();
//
//    }
    @Test(description = "verify TVLesson in ResourceEditPage")
    public void TvLessonOptionInResourceSendForReview() throws Exception {
        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(sunbird_config.getSunbidConfigPropertyValue("CREATOR_USRNAME"),
                sunbird_config.getSunbidConfigPropertyValue("CREATOR_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickOnWorkSpace();
        WorkspaceDashboardPageActions.clickResource();
        String createdContent = ResourcePageActions.createResourcePopup("getContentName");
        ResourcePageActions.addTriangleShape();
        ResourcePageActions.addText();
        ResourcePageActions.addNewSlide();
        ResourcePageActions.saveAndCloseIcon();
        ResourcePageActions.resourceSendForReview();
    }

}