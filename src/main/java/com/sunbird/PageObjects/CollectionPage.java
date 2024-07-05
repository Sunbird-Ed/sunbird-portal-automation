package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CollectionPage {

	@FindBy(how=How.XPATH,using="//input[@placeholder='Name']")
	private WebElement enterCollectionTitleName;

	@FindBy(how=How.XPATH,using="//input[@placeholder='Description']")
	private WebElement enterCollectionDesciption;

	@FindBy(how=How.XPATH,using="//div[contains(text(),'Select one')]")
	private WebElement clickContentTypeDropdown;

	@FindBy(how=How.XPATH,using="//span[contains(text(),'Content Playlist')]")
	private WebElement selectContentPlaylistValue;

	@FindBy(how=How.XPATH,using="//span[contains(text(),'Digital Textbook')]")
	private WebElement selectDigitalTextBooktValue;

	@FindBy(how=How.XPATH,using="//span[contains(text(),'Question paper')]")
	private WebElement selectQuestionPaperValue;

	@FindBy(how=How.XPATH,using="//input[@placeholder='Input the keyword and PRESS enter']")
	private WebElement keyWords;


	public void enterCollectiontitleName(String randomCollectionName) throws InterruptedException {
		UtilityFunctions.waitToBeClickableAndSendKeys(enterCollectionTitleName, randomCollectionName);

	}
	public void enterCollectionDesciption(String randomCollectionDesc) throws InterruptedException {
		UtilityFunctions.waitToBeClickableAndSendKeys(enterCollectionDesciption, randomCollectionDesc);

	}

	public void clickContentTypeDropdown() {
		UtilityFunctions.waitToBeClickableAndClick(clickContentTypeDropdown);
		Listeners.addLogs("clickContentTypeDropdown");
	}
	public void selectContentPlayListValue() {
		UtilityFunctions.waitToBeClickableAndClick(selectContentPlaylistValue);
		Listeners.addLogs("selectContentPlaylistValue");
	}
	public void selectDigitalTextVbookValue() {
		UtilityFunctions.waitToBeClickableAndClick(selectDigitalTextBooktValue);
		Listeners.addLogs("selectDigitalTextBooktValue");
	}
	public void selectQuestionPaperValue() {
		UtilityFunctions.waitToBeClickableAndClick(selectQuestionPaperValue);
		Listeners.addLogs("selectQuestionPaperValue");
	}

	public void KeywordInCollection(String randomKeywordName) throws InterruptedException {
		UtilityFunctions.waitToBeClickableAndSendKeys(keyWords, randomKeywordName);
		UtilityFunctions.pressEnterKeyOnWebElement(keyWords);
	}


}
