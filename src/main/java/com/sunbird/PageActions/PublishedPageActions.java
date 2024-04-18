package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageObjects.GetPage;
import com.sunbird.PageObjects.PublishedPage;
import org.openqa.selenium.support.PageFactory;


public class PublishedPageActions extends BaseTestConfig {




	public static void clickDownloadCourseQrCode()
	{
		PublishedPage publishedPage = PageFactory.initElements(driver, PublishedPage.class);
		publishedPage.downloadCourseQRCodeBtn();
	}



}