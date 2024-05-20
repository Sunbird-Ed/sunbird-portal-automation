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



}