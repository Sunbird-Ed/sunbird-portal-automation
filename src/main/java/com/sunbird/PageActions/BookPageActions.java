package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.BookPage;
import com.sunbird.PageObjects.DashboardPage;
import com.sunbird.PageObjects.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class BookPageActions extends BaseTestConfig {

    static DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
    static BookPage bookPage = PageFactory.initElements(driver, BookPage.class);

    
	public static String createBookPopup(String getContentType) throws Exception {
		String bookName = UtilityFunctions.generateRandomName("automationBook");
		bookPage.enterBookName(bookName);
		bookPage.clickStartCreateButton();

		if (getContentType.equalsIgnoreCase("getContentName")) {
			return bookName;
		} else {

			return UtilityFunctions.generate_Do_id();

		}
	}

	public static void handleBMCSDropdowns()
	{
		bookPage.clickBoardDropdown();
		bookPage.selectBoardValue();
		bookPage.clickMediumDropdown();
		bookPage.selectMediumValue();
		bookPage.clickClassDropdown();
		bookPage.clickClassDropdown();
		bookPage.clickSubjectDropdown();
		bookPage.selectSubjectValue();
		}
	public static void enterCopyWright()
	{
		bookPage.enterCopyRightYear("2024");
}
	
	public static void saveAsDraft()
	{
		bookPage.clickSaveAsDraft();
	}
	public static void clickAddChild()
	{
		bookPage.clikAddChild();
	}
	
	public static void addResourceToLibrary()
	{
		bookPage.clickAddFromLibraryBtn();
		bookPage.searchContentInLibrary("sdf");
		bookPage.selectButtonInLibrary();
		bookPage.addContentInLibrary();
		bookPage.clickBackBtnFromLibrarysection();
	}
	
	public static void submitAndSendForReview()
	{
		bookPage.clickSubmitbtn();
		bookPage.clickTermsAndConditions();
		bookPage.clickSubmitButtonInSendForReview();
	}
	public static void assertSendForReviewToastrMsg()
	{
		 String actualMsg = bookPage.assertSendForReviewTostrMsg();
	        UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.contentSentForReview, "Failed to send the content for review");

	}
}
