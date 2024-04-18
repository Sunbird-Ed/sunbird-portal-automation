package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PublishedPage {

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Download Course QR Code')]")
	private WebElement downloadCourseQRCode;


	public void downloadCourseQRCodeBtn() {
		UtilityFunctions.waitToBeClickableAndClick(downloadCourseQRCode);
		Listeners.addLogs("clicked on downloadCourseQRCode");
	}


}
