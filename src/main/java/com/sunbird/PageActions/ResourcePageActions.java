package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.BookPage;
import com.sunbird.PageObjects.ResourcePage;
import org.openqa.selenium.support.PageFactory;

import static com.sunbird.GenericLibrary.BaseTestConfig.driver;


public class ResourcePageActions extends BaseTestConfig {


/* enter ResourceName and all details in ResourceCreation poup */
	public static String createResourcePopup(String getContentType) throws Exception {
		ResourcePage resourcePage = PageFactory.initElements(driver, ResourcePage.class);

		String resourceName = UtilityFunctions.generateRandomName("automationResource");
		resourcePage.enterResourceName(resourceName);
		resourcePage.clkContentTypeDropdown();
		Thread.sleep(2000);
		resourcePage.selectExplanationContentType();
		Thread.sleep(2000);
		resourcePage.clickStartCreating();
		Thread.sleep(7000);
		UtilityFunctions.switchFrameUsingName();
		if (getContentType.equalsIgnoreCase("getContentName")) {
			return resourceName;
		} else {

			return UtilityFunctions.generate_Do_id();

		}
    }

	/* Add Triangle Shape in Resource editor */
	public static void addTriangleShape() throws InterruptedException {
		ResourcePage resourcePage = PageFactory.initElements(driver, ResourcePage.class);
resourcePage.addShape();
resourcePage.selectShape();
	}

	/* AddTextbox in resource editor */
	public static void addText() throws InterruptedException {
		ResourcePage resourcePage = PageFactory.initElements(driver, ResourcePage.class);
		resourcePage.addText();
	}

	/* click on Add new slide in resource editor */
	public static void addNewSlide() throws InterruptedException {
		ResourcePage resourcePage = PageFactory.initElements(driver, ResourcePage.class);
		resourcePage.addNewSlide();
	}

	/* click on save and close popup icon */
	public static void saveAndCloseIcon() throws InterruptedException {
		ResourcePage resourcePage = PageFactory.initElements(driver, ResourcePage.class);
resourcePage.clickSaveIcon();
resourcePage.clickCloseIcon();

	}

	/* click on SendForReview button and fill all detials and save*/
	public static void resourceSendForReview() throws InterruptedException {
		ResourcePage resourcePage = PageFactory.initElements(driver, ResourcePage.class);
		resourcePage.clickSendForReviewButton();
		resourcePage.addImageInSendForReview();
resourcePage.selectAdditionalCategory();
		selectBMCInResourceSendForReview();
		resourcePage.enterYearofCreation("2024");
		resourcePage.clickSubmitInReviewPopup();
		driver.switchTo().defaultContent();

	}

	/* select BMC in resource edit page */
public static void selectBMCInResourceSendForReview() throws InterruptedException {
	Thread.sleep(5000);
	ResourcePage resourcePage = PageFactory.initElements(driver, ResourcePage.class);
resourcePage.selectBoard();
resourcePage.selectMedium();
resourcePage.selectClass();
resourcePage.selectSubject();

}

	public static void clickPreivewIcon() throws InterruptedException {
		ResourcePage resourcePage = PageFactory.initElements(driver, ResourcePage.class);
		resourcePage.previewIconButton();
	}
public static void assertContentInPreviewPlayer() throws InterruptedException {
	ResourcePage resourcePage = PageFactory.initElements(driver, ResourcePage.class);
	resourcePage.asssertQuestionInPreviewPlayer();
}

	}

