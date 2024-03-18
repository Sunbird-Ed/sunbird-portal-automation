package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.BatchPage;
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
}
