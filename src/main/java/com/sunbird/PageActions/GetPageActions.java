package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageObjects.GetPage;
import org.openqa.selenium.support.PageFactory;


public class GetPageActions extends BaseTestConfig {


	public static void enterQrCode(String qrCodeValue) throws Exception {
		GetPage getPage = PageFactory.initElements(driver, GetPage.class);
		getPage.enterQRCode(qrCodeValue);

	}

	public static void clickSearhIcon()
	{
		GetPage getPage = PageFactory.initElements(driver, GetPage.class);
getPage.searchIconInGetPage();
	}
	public static void assertContentDisplayed()
	{
		GetPage getPage = PageFactory.initElements(driver, GetPage.class);
		getPage.assertContent();
	}



}