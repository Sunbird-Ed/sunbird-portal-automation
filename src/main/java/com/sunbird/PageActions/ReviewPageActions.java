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

			reviewPage.assertPublichButton();
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
			//	Thread.sleep(5000);
				reviewPage.selectContentForReview();
				//Thread.sleep(1000);
				UtilityFunctions.scrollDownUsingPixelValue();
				//reviewPage.scrollDownTillPublish();
			//	Thread.sleep(2000);
				reviewPage.clickOnPublish();

reviewPage.selectAllCheckBoxesForUploadContent();
				reviewPage.clickOnPublishButtonInPopup();
			String actualMsg=reviewPage.assertContentPublishedMsgs();
				 UtilityFunctions.stringValueComparision(actualMsg,SunbirdConstants.contetnPublishedToastrMsg, "Failed to publish the upload content");
		    }


			/* review and publish all the content based on the type */
	public static void reviewAndPublishContent(String contentName,String contentType) throws Exception {
		ReviewPage reviewPage = PageFactory.initElements(driver, ReviewPage.class);
		reviewPage.upForReviewBucket();
		reviewPage.clickSearchBar(contentName);
		reviewPage.clickOnSearch();
		reviewPage.selectContentForReview();
		Thread.sleep(7000);
		reviewPage.assertPublichButton();
		reviewPage.clickOnPublish();
		switch(contentType){
			case "Book":
			reviewPage.selectCheckBoxes();
				reviewPage.clickYesButton();
			break;
			case "Course":
				reviewPage.clickYesButton();
				break;
			case "Collection":
				reviewPage.selectCheckBoxes();
				reviewPage.clickYesButton();
				break;
			case "Resource":
				reviewPage.selectCheckBoxesForResource();
				reviewPage.clickonPublishButtonPopupResouce();
				break;

		}
				String actualMsg =  reviewPage.assertContentPublishedMsgs();
		UtilityFunctions.stringValueComparision(actualMsg,SunbirdConstants.contetnPublishedToastrMsg, "Failed to publish the content");
	}

}
