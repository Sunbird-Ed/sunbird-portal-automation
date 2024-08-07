package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;

import java.util.ArrayList;
import java.util.List;

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

		@FindBy(how = How.XPATH, using = "//strong[contains(text(),'Content is published')]")
		private WebElement contentPublishedMsg;

		@FindBy(how = How.XPATH, using = "//div[contains(text(),' Publish Collection ')]//following::input[@type='checkbox']")
		private List<WebElement> checkBox;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),' Publish Collection ')]//following::input[@type='checkbox']//following::label")
	private List<WebElement> checkBoxText;
		
		@FindBy(how = How.XPATH, using = "//*[contains(text(),'Publish')]//following::input[@type='checkbox']")
		private List<WebElement> checkBoxForUploadContent;

				@FindBy(how = How.XPATH, using = "//strong[contains(text(),'Content published successfully...')]")
		private WebElement assertTostrMsg;

	@FindBy(how = How.XPATH, using = "//i[@class='icon close']")
	private WebElement closeIconPublishPopup;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Please confirm')]//following::input[@type='checkbox']")
	private List<WebElement> checkBoxForResource;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Please confirm')]//following::button[contains(text(),'Publish')]")
	private WebElement clickPublishBtnInResource;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),' Request changes ')]")
	private WebElement requestChanges;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Request changes')]//following::input[@type='checkbox']")
	private List<WebElement> checkBoxForResourceForReject;
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Request changes')]//following::input[@type='checkbox']//following::button[1]")
	private WebElement requestChangesInPopup;

	@FindBy(how = How.XPATH, using = "//textarea[@rows='3']")
	private WebElement commentBox;

	@FindBy(how = How.XPATH, using = "//strong[contains(text(),'Content rejected successfully...')]")
	private WebElement assertRejectedTostrMsg;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),' Reject ')]")
	private WebElement rejectButton;

	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Add comment']")
	private WebElement enterCommentForReject;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),' Submit Review ')]")
	private WebElement clickOnSubmitreviewInPopup;

	@FindBy(how = How.XPATH, using = "//strong[contains(text(),'Content is sent back for corrections')]")
	private WebElement assertQuestionsetRejectedTostrMsg;

	@FindBy(how = How.XPATH, using = "(//span[@class='fancytree-title'])[2]")
	private WebElement childUnitLeftSide;

	@FindBy(how = How.XPATH, using = "(//span[@class='fancytree-title'])[2]//following::span[1]")
	private WebElement assertAddedContentInChildUnit;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'There is no content to review')]")
	private WebElement assertNoContentForReviewMsg;



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
			UtilityFunctions.waitForElementIsVisible(upForReviewContent);
			UtilityFunctions.waitForElementAndClickable(upForReviewContent);
			Listeners.addLogs("Selected the Content");
		}

	public void assertPublishButton() {
		boolean status= UtilityFunctions.isElementPresent(publishButton);
		if (status==true) {
			UtilityFunctions.waitForElementIsVisible(publishButton);
			UtilityFunctions.validatIsElementPresent(publishButton, "Publish button is not Displayed");
		}
		else {
			for(int i=0;i<10;i++) {
				try {
					UtilityFunctions.refreshPage();
					boolean status2= UtilityFunctions.isElementPresent(publishButton);
					if (status2==true) {
						break;
					}
				}
				catch(Exception e) {

				}

			}
		}
	}


	public void clickOnPublish() {

			UtilityFunctions.waitForElementAndClickable(publishButton);
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
			UtilityFunctions.waitForElementIsVisible(contentPublishedMsg);
			String getActualText = UtilityFunctions.getTextFromElement(contentPublishedMsg);
			return getActualText;
		}

		public void selectAllCheckBoxesForUploadContent() throws InterruptedException {

//UtilityFunctions.waitForVisibilityOfAllWebElement(checkBoxForUploadContent);

			UtilityFunctions.waitForVisibilityOfWebElement(closeIconPublishPopup);
			// Iterate through checkboxes using index values
	for (int i = 0; i < checkBoxForUploadContent.size(); i++) {
		checkBoxForUploadContent.get(i).click();
	}
}
		
		public void clickOnPublishButtonInPopup() throws InterruptedException {
//Thread.sleep(5000);
//UtilityFunctions.clickUsingJavaScriptExecutor(publishButtonUploadContent);

	UtilityFunctions.waitForElementAndClickable(publishButtonUploadContent);

		}
	public void selectCheckBoxesForResource() throws InterruptedException {

		// Iterate through checkboxes using index values
Thread.sleep(5000);
for (int i = 0; i < checkBoxForResource.size(); i++) {
	//UtilityFunctions.waitForElementAndClickable(checkBoxForResource.get(i));
			checkBoxForResource.get(i).click();
		}
	}
	public void clickonPublishButtonPopupResouce() {

		UtilityFunctions.waitToBeClickableAndClick(clickPublishBtnInResource);
		Listeners.addLogs("Clicked on publish Button");
	}
	public String assertResourceContentPublishedMsgs() {
		UtilityFunctions.waitForElementIsVisible(assertTostrMsg);
		String getActualText = UtilityFunctions.getTextFromElement(assertTostrMsg);
		return getActualText;
	}
	public void requestChanges() {

		UtilityFunctions.waitToBeClickableAndClick(requestChanges);
		Listeners.addLogs("Clicked on requestChanges Button");
	}

	public void selectCheckBoxesForResourceForReject() throws InterruptedException {

		// Iterate through checkboxes using index values
		Thread.sleep(5000);
		for (int i = 0; i < checkBoxForResourceForReject.size(); i++) {
			//UtilityFunctions.waitForElementAndClickable(checkBoxForResource.get(i));
			checkBoxForResourceForReject.get(i).click();
		}
	}
	public void requestChangesInPopup() {

		UtilityFunctions.waitToBeClickableAndClick(requestChangesInPopup);
		Listeners.addLogs("Clicked on requestChangesInPopup ");
	}
	public void enterCommenntInBox(String commentSuggestion) {
UtilityFunctions.scrollInToviewUsingJavaScript(commentBox);
		UtilityFunctions.waitToBeClickableAndSendKeys(commentBox, commentSuggestion);
		Listeners.addLogs("Entered comment in box");

	}

	public String assertResourceContentRejectedMsgs() {
		UtilityFunctions.waitForElementIsVisible(assertRejectedTostrMsg);
		String getActualText = UtilityFunctions.getTextFromElement(assertRejectedTostrMsg);
		UtilityFunctions.waitForElementToDisappear(assertRejectedTostrMsg);
		return getActualText;
	}
	public void clickOnReject() {
		UtilityFunctions.waitToBeClickableAndClick(rejectButton);
		Listeners.addLogs("Clicked on reject Button");
	}
	public void enterCommentForRejection(String commentSuggestion) {
		UtilityFunctions.scrollInToviewUsingJavaScript(enterCommentForReject);
		UtilityFunctions.waitToBeClickableAndSendKeys(enterCommentForReject, commentSuggestion);
		Listeners.addLogs("Entered comment in box");
	}
	public void clickOnSubmitReviewInPopup() {
		UtilityFunctions.waitToBeClickableAndClick(clickOnSubmitreviewInPopup);
		Listeners.addLogs("Clicked on SubmitreviewInPopup ");
	}
	public String assertQuestionsetContentRejectedMsgs() {
		UtilityFunctions.waitForElementIsVisible(assertQuestionsetRejectedTostrMsg);
		String getActualText = UtilityFunctions.getTextFromElement(assertQuestionsetRejectedTostrMsg);
		UtilityFunctions.waitForElementToDisappear(assertQuestionsetRejectedTostrMsg);
		return getActualText;
	}


	public void getAllCheckBokText() throws InterruptedException {
		List<String> list=new ArrayList<String>();
	list.add(SunbirdConstants.CheckBoxListText1);
		list.add(SunbirdConstants.CheckBoxListText2);
		list.add(SunbirdConstants.CheckBoxListText3);
		list.add(SunbirdConstants.CheckBoxListText4);
		list.add(SunbirdConstants.CheckBoxListText5);
		list.add(SunbirdConstants.CheckBoxListText6);
		list.add(SunbirdConstants.CheckBoxListText7);
		list.add(SunbirdConstants.CheckBoxListText8);
		list.add(SunbirdConstants.CheckBoxListText9);
		list.add(SunbirdConstants.CheckBoxListText10);
		list.add(SunbirdConstants.CheckBoxListText11);
		list.add(SunbirdConstants.CheckBoxListText12);
		list.add(SunbirdConstants.CheckBoxListText13);
		for (int i = 0; i < checkBoxText.size(); i++) {
			String value=checkBoxText.get(i).getText();
			list.contains(value);
			UtilityFunctions.stringValueComparision(list.get(i).toString(),value,"Failed to validate checkList");
			Listeners.addLogs("Verified" +value);
		}
	}

	public void childUnitLeftSide() {

		UtilityFunctions.waitToBeClickableAndClick(childUnitLeftSide);
		Listeners.addLogs("Clicked Up for childUnitLeftSide");

	}
	public void verifyAddedContentInChild() {
		UtilityFunctions.waitForElementIsVisible(assertAddedContentInChildUnit);
		UtilityFunctions.validatIsElementPresent(assertAddedContentInChildUnit,"added content not available");
		Listeners.addLogs("Clicked Up for Review");

	}
	public void verifyNoContentForReview() {
		UtilityFunctions.waitForElementIsVisible(assertNoContentForReviewMsg);
		UtilityFunctions.validatIsElementPresent(assertNoContentForReviewMsg,"No Content for review msg not found");
		Listeners.addLogs("assertNoContentForReviewMsg");

	}
}
   