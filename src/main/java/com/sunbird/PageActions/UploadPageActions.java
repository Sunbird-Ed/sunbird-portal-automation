package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.DashboardPage;
import com.sunbird.PageObjects.UploadPage;
import org.openqa.selenium.support.PageFactory;


public class UploadPageActions extends BaseTestConfig {

	static UploadPage uploadPage = PageFactory.initElements(driver, UploadPage.class);
	public static void clickUploadInWorkspace() throws InterruptedException {
		uploadPage.uploadContentInWorkspace();
			}
	public static void clickcontentTypeDroddown() throws InterruptedException {
		uploadPage.contentTypeDroddown();
	}
			public static void uploadPDF() throws InterruptedException {
				clickUploadInWorkspace();
			//	UtilityFunctions.switchFrameOnIndex(0);
				clickcontentTypeDroddown();
Thread.sleep(5000);
			}


}
	
