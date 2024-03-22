package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.BatchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class BatchPageActions extends BaseTestConfig {


	public static void clickBatchCreationBtn()
	{
		BatchPage batchPage = PageFactory.initElements(driver, BatchPage.class);
		batchPage.createBatchClick();
	}
	public static String enterBatchNameandDescription() throws InterruptedException {

		BatchPage batchPage = PageFactory.initElements(driver, BatchPage.class);
		String batchName = UtilityFunctions.generateRandomName("automationBatch");
		String batchDesc = UtilityFunctions.generateRandomName("automationBatchDesc");
		batchPage.enterBatchName(batchName);
		batchPage.enterbatchDescription(batchDesc);
		return batchName;
	}

		public static void clickIssueCertificateNo()
	{
		BatchPage batchPage = PageFactory.initElements(driver, BatchPage.class);
batchPage.issueCertificateNo();
	}
	public static void startDate(String pattern)
	{
		BatchPage batchPage = PageFactory.initElements(driver, BatchPage.class);
		batchPage.startDate(UtilityFunctions.getTodayDate("MM/dd/yyyy"));
	}
	public static void endDate(int dayCount)
	{
		BatchPage batchPage = PageFactory.initElements(driver, BatchPage.class);
		batchPage.endData(UtilityFunctions.getFutureDate(dayCount));
	}
	public static void enrollmentEndDate(int dayCount)
	{
		BatchPage batchPage = PageFactory.initElements(driver, BatchPage.class);
		batchPage.enrollmentEndDate(UtilityFunctions.getFutureDate(dayCount));
	}

	public static void clickTermsCheckBoxAndSubmit()
	{
		BatchPage batchPage = PageFactory.initElements(driver, BatchPage.class);
		batchPage.termsAndCheckbox();
		batchPage.batchCreationSubmit();
	}

	public static void assertBatchTostrMsg()
	{
		BatchPage batchPage = PageFactory.initElements(driver, BatchPage.class);
String actualMsg=batchPage.assertBatchCretionToastrMsg();
		UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.batchCreationToastrMSG, "Failed to create Batch");
		batchPage.waitBatchCreationToastrMsgDisAppear();

	}

	public static void batchCreationShouldNotDisplay()
	{
		BatchPage batchPage = PageFactory.initElements(driver, BatchPage.class);
	batchPage.createBatchShouldNotDisplay();

	}

	public static void clickJoinCourse()
	{
		BatchPage batchPage = PageFactory.initElements(driver, BatchPage.class);
batchPage.JoinCourseButton();
	}
	public static void validateAttributesInConsentPopup()
	{
		BatchPage batchPage = PageFactory.initElements(driver, BatchPage.class);
batchPage.assertConsentPopupAttributes();

	}
	public static void clickTermsCheckInConsentPopup()
	{
		BatchPage batchPage = PageFactory.initElements(driver, BatchPage.class);
		batchPage.termsCheckBoxInConsentPopup();
	}
	public static void clickShareBtn()
	{
		BatchPage batchPage = PageFactory.initElements(driver, BatchPage.class);
		batchPage.shareBtn();
	}
	public static void assertBatchEndTimeStamp() throws InterruptedException {
		BatchPage batchPage = PageFactory.initElements(driver, BatchPage.class);
batchPage.assertBatchTimerStamp();

	}

	public static void clickLeaveCourse()
	{
		BatchPage batchPage = PageFactory.initElements(driver, BatchPage.class);
batchPage.leaveCourse();
	}
	public static void clickLeaveCourseInUnEnrollPopup()
	{
		BatchPage batchPage = PageFactory.initElements(driver, BatchPage.class);
		batchPage.leaveCourseInUnenrollPopup();


	}
	public static void assertJoinCourse()
	{
		BatchPage batchPage = PageFactory.initElements(driver, BatchPage.class);
		batchPage.assertJoinCourse();
	}

	public static void assertNoOpenBatchToasrtMsg()
	{
		BatchPage batchPage = PageFactory.initElements(driver, BatchPage.class);
String actualtxt=batchPage.assertNoOpenBatchToastrMsg();
UtilityFunctions.stringValueComparision(actualtxt,SunbirdConstants.noOpenBatchAvailableToastrMSG,"Didn't display No openBatch toastr msg ");
	}
	public static void assertProfileShareToastrMessage()
	{
		BatchPage batchPage = PageFactory.initElements(driver, BatchPage.class);
		String actualtxt=batchPage.assertProfileShareToastrMsg();
		UtilityFunctions.stringValueComparision(actualtxt,SunbirdConstants.profileShareToastrMsg,"ProfileShare Toastr didn't display ");
	}
	public static void waitProfileShareTostrToDisapper()
	{
		BatchPage batchPage = PageFactory.initElements(driver, BatchPage.class);
batchPage.waitProfileShareToastrMsgDisappear();
	}

}
