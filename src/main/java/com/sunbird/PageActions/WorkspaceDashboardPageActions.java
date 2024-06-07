package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.ReviewPage;
import com.sunbird.PageObjects.WorkspaceDashboardPage;
import org.openqa.selenium.support.PageFactory;


public class WorkspaceDashboardPageActions extends BaseTestConfig {

/* validate Drafts sections is available */
    public static void assertDrafts() throws InterruptedException {
        WorkspaceDashboardPage workspacedashboardPage=PageFactory.initElements(driver, WorkspaceDashboardPage.class);
        workspacedashboardPage.assertDrafts();
    }

    /* click on book option in workspace */
    public static void clickBook() throws InterruptedException {
        WorkspaceDashboardPage workspacedashboardPage=PageFactory.initElements(driver, WorkspaceDashboardPage.class);
        workspacedashboardPage.clickBook();
        
    }

    /* click on course option in workspace */
    public static void clickCourse() throws InterruptedException {
        WorkspaceDashboardPage workspacedashboardPage=PageFactory.initElements(driver, WorkspaceDashboardPage.class);
        workspacedashboardPage.clickCourse();

    }

    /* click on resource option in workspace */
    public static void clickResource() throws InterruptedException {
        WorkspaceDashboardPage workspacedashboardPage=PageFactory.initElements(driver, WorkspaceDashboardPage.class);
        workspacedashboardPage.clickResource();

    }

    /* click on collection option in workspace */
    public static void clickCollection() throws InterruptedException {
        WorkspaceDashboardPage workspacedashboardPage=PageFactory.initElements(driver, WorkspaceDashboardPage.class);
        workspacedashboardPage.clickCollection();

    }
    public static void clickAllMyContent() throws InterruptedException {
        WorkspaceDashboardPage workspacedashboardPage=PageFactory.initElements(driver, WorkspaceDashboardPage.class);
        workspacedashboardPage.allMyContent();

    }
    public static void clickOnQuestionSet() throws InterruptedException {
        WorkspaceDashboardPage workspacedashboardPage=PageFactory.initElements(driver, WorkspaceDashboardPage.class);
        workspacedashboardPage.questionSet();

    }
    public static void clickDrafts() throws InterruptedException {
        WorkspaceDashboardPage workspacedashboardPage=PageFactory.initElements(driver, WorkspaceDashboardPage.class);
        workspacedashboardPage.clickDrafts();

    }
    public static void clickPublishedBucket() throws InterruptedException {
        WorkspaceDashboardPage workspacedashboardPage=PageFactory.initElements(driver, WorkspaceDashboardPage.class);
        workspacedashboardPage.published();

    }
    public static void clickAllTextBookOption() throws InterruptedException {
        WorkspaceDashboardPage workspacedashboardPage=PageFactory.initElements(driver, WorkspaceDashboardPage.class);
        workspacedashboardPage.allTextBook();

    }
    public static void assertCreate() throws InterruptedException {
        WorkspaceDashboardPage workspacedashboardPage=PageFactory.initElements(driver, WorkspaceDashboardPage.class);
        workspacedashboardPage.assertCreateButton();
    }
    /* validate Submit for review button on workspace */
    public static void submittedForReview() {
        WorkspaceDashboardPage workspacedashboardPage=PageFactory.initElements(driver, WorkspaceDashboardPage.class);
        workspacedashboardPage.assertsubmittedForReview();
    }

    /* validate All Uploads sections is available */
    public static void assertAllUploads() throws InterruptedException {
        WorkspaceDashboardPage workspacedashboardPage=PageFactory.initElements(driver, WorkspaceDashboardPage.class);
        workspacedashboardPage.assertAllUpload();
    }

    public static void assertCourseBatches() throws InterruptedException {
        WorkspaceDashboardPage workspacedashboardPage=PageFactory.initElements(driver, WorkspaceDashboardPage.class);
        workspacedashboardPage.assertCourseBatchesbutton();

    }

    public static void assertCreatedByme() throws InterruptedException {
        WorkspaceDashboardPage workspacedashboardPage=PageFactory.initElements(driver, WorkspaceDashboardPage.class);
        workspacedashboardPage.assertCreatedByMe();

    }

    public static void assertAssignedToMe() throws InterruptedException {
        WorkspaceDashboardPage workspacedashboardPage=PageFactory.initElements(driver, WorkspaceDashboardPage.class);
        workspacedashboardPage.assertAssignedToMe();

    }

    public static void assertAndClickSharedViaLink() throws InterruptedException {
        WorkspaceDashboardPage workspacedashboardPage=PageFactory.initElements(driver, WorkspaceDashboardPage.class);
        workspacedashboardPage.assertSharedViaLink();

    }

    public static void assertCollaborations() throws InterruptedException {
        WorkspaceDashboardPage workspacedashboardPage=PageFactory.initElements(driver, WorkspaceDashboardPage.class);
        workspacedashboardPage.assertCollaborations();

    }
    /* validate Submit for review button on workspace */
    public static void submitForReview() {
        WorkspaceDashboardPage workspacedashboardPage=PageFactory.initElements(driver, WorkspaceDashboardPage.class);
        workspacedashboardPage.assertsubmittedForReview();
    }

    public static void assertAssignedTome() throws InterruptedException {
        WorkspaceDashboardPage workspacedashboardPage=PageFactory.initElements(driver, WorkspaceDashboardPage.class);
        workspacedashboardPage.assertAssignedToMe();

    }
    /* validate Create button is available */
    public static void clickCreate() throws InterruptedException {
        WorkspaceDashboardPage workspacedashboardPage=PageFactory.initElements(driver, WorkspaceDashboardPage.class);
        workspacedashboardPage.assertCreateButton();
    }
    public static void clickAllUploads() throws InterruptedException {
        WorkspaceDashboardPage workspacedashboardPage=PageFactory.initElements(driver, WorkspaceDashboardPage.class);
        workspacedashboardPage.clickAllUploads();
    }
    public static void assertContentAvailable(String contentname) throws Exception {
        String limitedSharingContent = SunbirdConstants.XPATH_LS_CONTAINS + contentname + SunbirdConstants.XPATH_CONAINSCLOSEBRACKET;
        UtilityFunctions.threadSleep(2000);
        UtilityFunctions.findElementAndClick(limitedSharingContent);
    }

    public static void upForReviewSelection() {
        ReviewPage reviewPage = PageFactory.initElements(driver, ReviewPage.class);
        reviewPage.upForReviewBucket();
    }
}
	
