package com.sunbird.PageActions;

import org.openqa.selenium.support.PageFactory;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.ReviewPage;

public class ReviewPageActions extends BaseTestConfig {

	//	static ReviewPage reviewPage = PageFactory.initElements(driver, ReviewPage.class);

		/*
		 * This method will handle the Collection review flow for Book, course and
		 * collection
		 */
		public static void reviewCollection(String do_id) throws Exception {
			ReviewPage reviewPage = PageFactory.initElements(driver, ReviewPage.class);
			reviewPage.upForReviewBucket();
			reviewPage.clickSearchBar(do_id);
			reviewPage.clickOnSearch();
			Thread.sleep(5000);
			reviewPage.selectContentForReview();
			Thread.sleep(1000);

			reviewPage.assertPublishButton();
			reviewPage.clickOnPublish();
			reviewPage.selectCheckBoxes();
		reviewPage.clickYesButton();
		String actualMsg =  reviewPage.assertContentPublishedMsgs();
		 UtilityFunctions.stringValueComparision(actualMsg,
		 SunbirdConstants.contetnPublishedToastrMsg, "Failed to publish the content");
		}


		 public static void reviewAndPubishUploadContent(String contentName) throws InterruptedException
		    {
				ReviewPage reviewPage = PageFactory.initElements(driver, ReviewPage.class);
		    	reviewPage.upForReviewBucket();
				reviewPage.clickSearchBar(contentName);
				reviewPage.clickOnSearch();
				Thread.sleep(5000);
				reviewPage.selectContentForReview();
				UtilityFunctions.scrollDownUsingPixelValue();
				reviewPage.clickOnPublish();
reviewPage.selectAllCheckBoxesForUploadContent();
Thread.sleep(5000);
				reviewPage.clickOnPublishButtonInPopup();
			String actualMsg=reviewPage.assertResourceContentPublishedMsgs();
				 UtilityFunctions.stringValueComparision(actualMsg,SunbirdConstants.resourceContentPublishedToastrMsg, "Failed to publish the upload content");
		    }


			/* review and publish all the content based on the type */
	public static void reviewAndPublishContent(String contentName,String contentType) throws Exception {
		ReviewPage reviewPage = PageFactory.initElements(driver, ReviewPage.class);
		reviewPage.upForReviewBucket();
		reviewPage.clickSearchBar(contentName);
		reviewPage.clickOnSearch();
		Thread.sleep(3000);
		reviewPage.selectContentForReview();
	//	Thread.sleep(7000);
		reviewPage.assertPublishButton();
		reviewPage.clickOnPublish();
		switch(contentType){
			case "Book":
			reviewPage.selectCheckBoxes();
				reviewPage.clickYesButton();
			break;
			case "Course":
				reviewPage.clickYesButton();
				String actualMsg =  reviewPage.assertContentPublishedMsgs();
				UtilityFunctions.stringValueComparision(actualMsg,SunbirdConstants.contetnPublishedToastrMsg, "Failed to publish the content");
				break;
			case "Collection":
				reviewPage.selectCheckBoxes();
				reviewPage.clickYesButton();
				String actualMsg3 =  reviewPage.assertContentPublishedMsgs();
				UtilityFunctions.stringValueComparision(actualMsg3,SunbirdConstants.contetnPublishedToastrMsg, "Failed to publish the content");
				break;
			case "Resource":
				reviewPage.selectCheckBoxesForResource();
				reviewPage.clickonPublishButtonPopupResouce();
				String actualMsg2 =  reviewPage.assertResourceContentPublishedMsgs();
				UtilityFunctions.stringValueComparision(actualMsg2,SunbirdConstants.resourceContentPublishedToastrMsg, "Failed to publish the content");
				break;
			case "Upload":
				reviewPage.selectAllCheckBoxesForUploadContent();
				//Thread.sleep(5000);
				reviewPage.clickOnPublishButtonInPopup();
				String actualMsg4=reviewPage.assertResourceContentPublishedMsgs();
				UtilityFunctions.stringValueComparision(actualMsg4,SunbirdConstants.resourceContentPublishedToastrMsg, "Failed to publish the upload content");
				break;

		}

	}

	/* review and publish all the content based on the type */
	public static void reviewAndRejectContent(String contentName,String contentType) throws Exception {
		ReviewPage reviewPage = PageFactory.initElements(driver, ReviewPage.class);
		reviewPage.upForReviewBucket();
		reviewPage.clickSearchBar(contentName);
		reviewPage.clickOnSearch();
		Thread.sleep(3000);
		reviewPage.selectContentForReview();
		reviewPage.assertPublishButton();

		switch(contentType){
			case "Book":
				reviewPage.selectCheckBoxes();
				reviewPage.clickYesButton();
				break;
			case "Course":
				reviewPage.clickYesButton();
				String actualMsg =  reviewPage.assertContentPublishedMsgs();
				UtilityFunctions.stringValueComparision(actualMsg,SunbirdConstants.contetnPublishedToastrMsg, "Failed to publish the content");
				break;
			case "Collection":
				reviewPage.selectCheckBoxes();
				reviewPage.clickYesButton();
				String actualMsg3 =  reviewPage.assertContentPublishedMsgs();
				UtilityFunctions.stringValueComparision(actualMsg3,SunbirdConstants.contetnPublishedToastrMsg, "Failed to publish the content");
				break;
			case "Resource":
				reviewPage.requestChanges();
				reviewPage.selectCheckBoxesForResourceForReject();
				reviewPage.enterCommenntInBox("Not good");
				reviewPage.requestChangesInPopup();
				String actualMsg2 =  reviewPage.assertResourceContentRejectedMsgs();
				UtilityFunctions.stringValueComparision(actualMsg2,SunbirdConstants.resourceContentRejectedToastrMsg, "Failed to Reject the content");
				break;
			case "Upload":
				reviewPage.selectAllCheckBoxesForUploadContent();
				//Thread.sleep(5000);
				reviewPage.clickOnPublishButtonInPopup();
				String actualMsg4=reviewPage.assertResourceContentPublishedMsgs();
				UtilityFunctions.stringValueComparision(actualMsg4,SunbirdConstants.resourceContentPublishedToastrMsg, "Failed to publish the upload content");
				break;

		}

	}

}
