package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.BookPage;
import com.sunbird.PageObjects.ResourcePage;
import org.openqa.selenium.support.PageFactory;

import static com.sunbird.GenericLibrary.BaseTestConfig.driver;


public class ResourcePageActions extends BaseTestConfig {



	public static String createResourcePopup(String getContentType) throws Exception {
		ResourcePage resourcePage = PageFactory.initElements(driver, ResourcePage.class);

		String resourceName = UtilityFunctions.generateRandomName("automationResource");
		resourcePage.enterResourceName(resourceName);
		resourcePage.clkContentTypeDropdown();
		resourcePage.selectExplanationContentType();
		resourcePage.clickStartCreating();
		UtilityFunctions.switchFrameUsingName();
		if (getContentType.equalsIgnoreCase("getContentName")) {
			return resourceName;
		} else {

			return UtilityFunctions.generate_Do_id();

		}
    }

	public static void addTriangleShape() throws InterruptedException {
		ResourcePage resourcePage = PageFactory.initElements(driver, ResourcePage.class);
resourcePage.addShape();
resourcePage.selectShape();
	}
	public static void addText() throws InterruptedException {
		ResourcePage resourcePage = PageFactory.initElements(driver, ResourcePage.class);
		resourcePage.addText();
	}
	public static void addNewSlide() throws InterruptedException {
		ResourcePage resourcePage = PageFactory.initElements(driver, ResourcePage.class);
		resourcePage.addNewSlide();
	}

	public static void saveAndCloseIcon() throws InterruptedException {
		ResourcePage resourcePage = PageFactory.initElements(driver, ResourcePage.class);
resourcePage.clickSaveIcon();
resourcePage.clickCloseIcon();

	}

	public static void resourceSendForReview() throws InterruptedException {
		ResourcePage resourcePage = PageFactory.initElements(driver, ResourcePage.class);
		resourcePage.addImageInSendForReview();
resourcePage.selectAdditionalCategory();
		selectBMCInResourceSendForReview();
		resourcePage.enterYearofCreation("2024");
		resourcePage.clickSubmitInReviewPopup();
	}
public static void selectBMCInResourceSendForReview() throws InterruptedException {
	Thread.sleep(5000);
	ResourcePage resourcePage = PageFactory.initElements(driver, ResourcePage.class);
resourcePage.selectBoard();
resourcePage.selectMedium();
resourcePage.selectClass();
resourcePage.selectSubject();


}

	}

