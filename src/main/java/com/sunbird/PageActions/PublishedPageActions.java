package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.GetPage;
import com.sunbird.PageObjects.PublishedPage;
import org.bouncycastle.crypto.tls.UDPTransport;
import org.openqa.selenium.support.PageFactory;


public class PublishedPageActions extends BaseTestConfig {




	public static void clickDownloadCourseQrCode() throws InterruptedException {
		PublishedPage publishedPage = PageFactory.initElements(driver, PublishedPage.class);
		publishedPage.downloadCourseQRCodeBtn();
		UtilityFunctions.threadSleep(5000);
	}
	public static void clickFirstCard()
	{
		PublishedPage publishedPage = PageFactory.initElements(driver, PublishedPage.class);
		publishedPage.firstContent();

	}
	public static void assertFirstContentInPublishedSection()
	{
		PublishedPage publishedPage = PageFactory.initElements(driver, PublishedPage.class);
		publishedPage.verifyFirstContentInPublishedSection();

	}
	public static void clickDeleteButton() {
		PublishedPage publishedPage = PageFactory.initElements(driver, PublishedPage.class);
		publishedPage.deleteContent();
	}
	public static void clickYesonConfirmDelete() throws InterruptedException {
		PublishedPage publishedPage = PageFactory.initElements(driver, PublishedPage.class);
		publishedPage.clickYesonConfirmDeletePopup();
		//	publishedPage.assertDeletedContentMsg();
		//publishedPage.waitForContentDeletedToastrMsgDisAppear();
	}
	public static void assertContentNotAvailable() {
		PublishedPage publishedPage = PageFactory.initElements(driver, PublishedPage.class);
		publishedPage.assertNoContentMsg();
	}
	public static void assertDeletedContentMsg() throws InterruptedException {
		PublishedPage publishedPage = PageFactory.initElements(driver, PublishedPage.class);
		UtilityFunctions.threadSleep(2000);
		publishedPage.assertDeletedContentMsg();
		publishedPage.waitForContentDeletedToastrMsgDisAppear();
	}
}