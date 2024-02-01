package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.BookPage;
import org.checkerframework.checker.guieffect.qual.UI;
import org.openqa.selenium.support.PageFactory;


public class BookPageActions extends BaseTestConfig {

  //  static DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
    //static BookPage bookPage = PageFactory.initElements(driver, BookPage.class);

	public static String createBookPopup(String getContentType) throws Exception {
		BookPage bookPage = PageFactory.initElements(driver, BookPage.class);

		String bookName = UtilityFunctions.generateRandomName("automationBook");
		bookPage.enterBookName(bookName);
		bookPage.clickStartCreateButton();
bookPage.assertSaveAsDraft();
		if (getContentType.equalsIgnoreCase("getContentName")) {
			return bookName;
		} else {

			return UtilityFunctions.generate_Do_id();

		}


	}

	public static String section1(String requestReturnType) throws InterruptedException {
		BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
		String description = UtilityFunctions.generateRandomName("autoDescription");
		bookPage.enterDesciption(description);
		String keyword = UtilityFunctions.generateRandomName("autoKeyword");
		bookPage.enterKeywords(keyword);

		bookPage.clickyesQRCodeRequiredCheckbox();
		String enteredQrCode=sunbird_config.getSunbidConfigPropertyValue("QRCodeValue");
bookPage.enterQrCode(enteredQrCode);
		bookPage.clickqrCodeBlueTickIcon();
		bookPage.assertGreenTickIcon();

		if(requestReturnType.equalsIgnoreCase("getqrcode"))
		{
			return enteredQrCode;
		}
		if(requestReturnType.equalsIgnoreCase("getdescription"))
		{
			return description;
		}
		else {
			return keyword;
		}


	}

	public static void BMCDropdownSelectionSection2() throws InterruptedException {
		Thread.sleep(5000);
		BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
				bookPage.clickBoardDropdown();
		bookPage.selectBoardValue();
		bookPage.clickMediumDropdown();
		bookPage.selectMediumValue();
		Thread.sleep(2000);
		bookPage.clickClassDropdown();
		Thread.sleep(2000);
		bookPage.selectClassValue();
		bookPage.clickSubjectDropdown();
		bookPage.selectSubjectValue();
		}


		public static void Section3() throws InterruptedException {
			BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
			bookPage.enterCopyRightYear("2024");
			Thread.sleep(5000);
			bookPage.clickSaveAsDraft();
			Thread.sleep(5000);
		}



	public static void addResourceFromLibrary()
	{
		BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
		bookPage.clikAddChild();
		bookPage.clickAddFromLibraryBtn();
		bookPage.searchContentInLibrary("sdf");
		bookPage.selectButtonInLibrary();
		bookPage.addContentInLibrary();
		bookPage.clickBackBtnFromLibrarysection();
	}
	
	public static void submitAndSendForReview()
	{
		BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
		bookPage.clickSubmitbtn();
		bookPage.clickTermsAndConditions();
		bookPage.clickSubmitButtonInSendForReview();

		String actualMsg = bookPage.assertSendForReviewTostrMsg();
		UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.contentSentForReview, "Failed to send the content for review");

	}
	public static void assertSendForReviewToastrMsg()
	{
		BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
		 String actualMsg = bookPage.assertSendForReviewTostrMsg();
	        UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.contentSentForReview, "Failed to send the content for review");

	}
}
