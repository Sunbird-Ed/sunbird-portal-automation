package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ReviewPage extends BaseTestConfig {

		@FindBy(how = How.XPATH, using = "//*[contains(text(),' Up For Review ')]")
		private WebElement upforreview;

		@FindBy(how = How.XPATH, using = "//input[@placeholder='Search content']")
		private WebElement searchBar;

		@FindBy(how = How.XPATH, using = "//i[@class='circular search link icon']")
		private WebElement searchIcon;

		@FindBy(how = How.XPATH, using = "(//div[@class='UpReviewHeader'])[1]")
			private WebElement upForReviewContent;

		@FindBy(how = How.XPATH, using = "//button[contains(text(),' Publish ')]")
		private WebElement publishButton;

		@FindBy(how = How.XPATH, using = "//*[contains(text(),'Please confirm')]//following::button[contains(text(),'Publish')]")
		private WebElement publishButtonUploadContent;

		@FindBy(how = How.XPATH, using = "//button[contains(text(),' Yes ')]")
		private WebElement yesButton;

		@FindBy(how = How.XPATH, using = "//strong[contains(text(),'Content published successfully...')]")
		private WebElement contentPublishedMsg;

		@FindBy(how = How.XPATH, using = "//div[contains(text(),' Publish Collection ')]//following::input[@type='checkbox']")
		private List<WebElement> checkBox;
		
		@FindBy(how = How.XPATH, using = "//*[contains(text(),'Publish')]//following::input[@type='checkbox']")
		private List<WebElement> checkBoxForUploadContent;
		
		@FindBy(how = How.XPATH, using = "//strong[contains(text(),'Content published successfully...')]")
		private WebElement assertTostrMsg;
		

		public void upForReviewBucket() {

			UtilityFunctions.waitToBeClickableAndClick(upforreview);
			Listeners.addLogs("Clicked Up for Review");

		}

		public void clickSearchBar(String content_id) {

			UtilityFunctions.waitToBeClickableAndSendKeys(searchBar, content_id);
			Listeners.addLogs("Clicked on Search content");

		}

		public void clickOnSearch() {

			UtilityFunctions.waitToBeClickableAndClick(searchIcon);
			Listeners.addLogs("Searching Content");

		}

		public void assertContent() {

			UtilityFunctions.waitForVisibilityOfWebElement(upForReviewContent);
		}

		public void selectContentForReview() {
			UtilityFunctions.waitForVisibilityOfWebElement(upForReviewContent);
			UtilityFunctions.waitToBeClickableAndClick(upForReviewContent);
			Listeners.addLogs("Selected the Content");
		}

		public void assertPublichButton() {

			UtilityFunctions.validatIsElementPresent(publishButton, "Publish button is not Displayed");
		}

		public void clickOnPublish() {

			UtilityFunctions.waitToBeClickableAndClick(publishButton);
			Listeners.addLogs("Clicked on Publish Button");
		}

		public void scrollDownTillPublish()
		{
			UtilityFunctions.scrollInToviewUsingJavaScript(publishButton);
		}
		public void selectCheckBoxes() throws InterruptedException {

					// Iterate through checkboxes using index values
			for (int i = 0; i < checkBox.size(); i++) {
				checkBox.get(i).click();
			}
		}

		public void clickYesButton() {

			UtilityFunctions.waitToBeClickableAndClick(yesButton);
			Listeners.addLogs("Clicked on Yes Button");
		}

		public String assertContentPublishedMsgs() {
			UtilityFunctions.waitForVisibilityOfWebElement(contentPublishedMsg);
			String getActualText = UtilityFunctions.getTextFromElement(contentPublishedMsg);
			return getActualText;
		}

		public void selectAllCheckBoxesForUploadContent() throws InterruptedException {

			// Iterate through checkboxes using index values
	for (int i = 0; i < checkBoxForUploadContent.size(); i++) {
		checkBoxForUploadContent.get(i).click();
	}
}
		
		public void clickOnPublishButtonInPopup()
		{
			UtilityFunctions.waitToBeClickableAndClick(publishButtonUploadContent);

		}
	}
   