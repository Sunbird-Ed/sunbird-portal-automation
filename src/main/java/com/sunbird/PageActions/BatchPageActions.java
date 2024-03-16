package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.BatchPage;
import org.openqa.selenium.support.PageFactory;


public class BatchPageActions extends BaseTestConfig {

	public static void batchCreation() throws InterruptedException {

		BatchPage batchPage = PageFactory.initElements(driver, BatchPage.class);
		batchPage.createBatchClick();
		String batchName = UtilityFunctions.generateRandomName("automationBatch");
		String batchDesc = UtilityFunctions.generateRandomName("automationBatchDesc");
		batchPage.enterBatchName(batchName);
		batchPage.enterbatchDescription(batchDesc);
				batchPage.issueCertificateNo();
			batchPage.startDate(UtilityFunctions.getTodayDate("MM/dd/yyyy"));
			batchPage.endData(UtilityFunctions.getFutureDate(3));
			batchPage.enrollmentEndDate(UtilityFunctions.getFutureDate(2));
			batchPage.termsAndCheckbox();
batchPage.batchCreationSubmit();
batchPage.assertBatchCretionToastrMsg();
batchPage.waitBatchCreationToastrMsgDisAppear();
	}


}
