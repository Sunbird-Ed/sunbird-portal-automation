package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UploadPage {

	@FindBy(how=How.XPATH,using="//span[text()='Upload Content']")
	private WebElement uploadcontent;

	@FindBy(how=How.XPATH,using="//*[@id='_selectPrimaryCategory']")
	private WebElement contentTypeDropDown;

	@FindBy(how=How.XPATH,using="//option[@data-value='eTextbook']")
	private WebElement eTextbook;

	@FindBy(how=How.XPATH,using="//*[@id='browseButton']//input")
	private WebElement browserbutton;

public void uploadContentInWorkspace() {
		
	UtilityFunctions.waitToBeClickableAndClick(uploadcontent);
	}
	public void contentTypeDroddown() {

		UtilityFunctions.waitToBeClickableAndClick(contentTypeDropDown);
	}

	

}
