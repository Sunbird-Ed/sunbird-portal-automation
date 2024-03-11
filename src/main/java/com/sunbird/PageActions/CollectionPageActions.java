package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.BookPage;
import com.sunbird.PageObjects.CollectionPage;
import com.sunbird.PageObjects.CoursePage;
import org.openqa.selenium.support.PageFactory;


public class CollectionPageActions extends BaseTestConfig {


	/* hanlde collection creation popup and return the content name or doid based on parameter */
	public static String createCollectionPopupSection1(String collectionTypeValue, String getContentType) throws Exception {
		CollectionPage collectionPage = PageFactory.initElements(driver, CollectionPage.class);
		BookPage bookPage = PageFactory.initElements(driver, BookPage.class);

		String collectionName = UtilityFunctions.generateRandomName("automationCollection");
		collectionPage.enterCollectiontitleName(collectionName);

		String collectionDes = UtilityFunctions.generateRandomName("automationCollectionDesc");
		collectionPage.enterCollectionDesciption(collectionDes);

		collectionPage.clickContentTypeDropdown();

		switch (collectionTypeValue) {
			case "Content Playlist":
				collectionPage.selectContentPlayListValue();
				break;
			case "Digital Textbook":
				collectionPage.selectDigitalTextVbookValue();
				break;
			case "Question paper":
				collectionPage.selectQuestionPaperValue();
				break;
		}
		bookPage.clickStartCreateButton();

		String keyword = UtilityFunctions.generateRandomName("autoCollectionKeyword");
		collectionPage.enterCollectionKeywords(keyword);

		if (getContentType.equalsIgnoreCase("getContentName")) {
			return collectionName;
		} else {

			return UtilityFunctions.generate_Do_id();

		}

	}




}