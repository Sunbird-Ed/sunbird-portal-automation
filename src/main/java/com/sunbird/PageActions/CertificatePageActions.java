package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.BatchPage;
import com.sunbird.PageObjects.CertificatePage;
import com.sunbird.PageObjects.GetPage;
import com.sunbird.PageObjects.UploadPage;
import org.openqa.selenium.support.PageFactory;


public class CertificatePageActions extends BaseTestConfig {


	public static void clickAddCertificate() throws Exception {
		CertificatePage certificatePage = PageFactory.initElements(driver, CertificatePage.class);
certificatePage.addCertificatebtn();
	}
	public static void clickAddCertificatePlusIcon() throws Exception {
		CertificatePage certificatePage = PageFactory.initElements(driver, CertificatePage.class);
		certificatePage.addCertificatePlusIcon();
	}
	public static void clickCreateTemplate() throws Exception {
		CertificatePage certificatePage = PageFactory.initElements(driver, CertificatePage.class);
		certificatePage.createTemplateBtn();
	}

	public static String enterCertificateTitle() throws Exception {
		CertificatePage certificatePage = PageFactory.initElements(driver, CertificatePage.class);
		String certificateTitle = UtilityFunctions.generateRandomName("automationCertficate");
		certificatePage.certificateTitle(certificateTitle);
		return certificateTitle;
	}
	public static String enterStateName() throws Exception {
		CertificatePage certificatePage = PageFactory.initElements(driver, CertificatePage.class);
		String stateName = UtilityFunctions.generateRandomName("automationStateName");
		certificatePage.stateName(stateName);
		return stateName;
	}
	public static void uploadStateLogoImg() throws Exception {
		CertificatePage certificatePage = PageFactory.initElements(driver, CertificatePage.class);
		certificatePage.stateBrowseBtn();
		certificatePage.selectStateLogo();
		certificatePage.selectBtnInUploadPage();
	}
	public static void uploadSignatureImg() throws Exception {
		CertificatePage certificatePage = PageFactory.initElements(driver, CertificatePage.class);
		certificatePage.signatureBrowseBtn();
		String filepath = System.getProperty("user.dir") + sunbird_config.getSunbidConfigPropertyValue("SignatureImg");
		certificatePage.uploadSignatureFile(filepath);
		certificatePage.uploadAndUse();
	}
	public static void enterDesignations() throws Exception {
		CertificatePage certificatePage = PageFactory.initElements(driver, CertificatePage.class);
		certificatePage.enterDesignation1("Developer");
		certificatePage.enterDesignation1("Tester");
	}
	public static void clickCheckBox() throws Exception {
		CertificatePage certificatePage = PageFactory.initElements(driver, CertificatePage.class);
		certificatePage.checkBox();
}
	public static void selectLayoutTemplate() throws Exception {
		CertificatePage certificatePage = PageFactory.initElements(driver, CertificatePage.class);
		certificatePage.selectLayout();
	}
	public static void clickSaveTemplate() throws Exception {
		CertificatePage certificatePage = PageFactory.initElements(driver, CertificatePage.class);
		certificatePage.saveTemplate();
	}
	public static void assertCertificateAddedTostrMsg()
	{
		CertificatePage certificatePage = PageFactory.initElements(driver, CertificatePage.class);
		String actualMsg=certificatePage.verifyCertificateAddedMsg();
		UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.certificateAddedMsg, "Failed to create certificate");

	}
	public static void clickCloseDialogBox() throws Exception {
		CertificatePage certificatePage = PageFactory.initElements(driver, CertificatePage.class);
		certificatePage.closeDialogBox();
	}
	public static void clickIssueCertificateDropdown() throws Exception {
		CertificatePage certificatePage = PageFactory.initElements(driver, CertificatePage.class);
		certificatePage.issueCertficateDrodown();
	}
	public static void selectAllValueInIssueCertificate() throws Exception {
		CertificatePage certificatePage = PageFactory.initElements(driver, CertificatePage.class);
		certificatePage.selectAllInIssueCertificateDropdown();
	}
	public static void clickRefreshBtn() throws Exception {
		CertificatePage certificatePage = PageFactory.initElements(driver, CertificatePage.class);
		certificatePage.refreshBtn();
	}
	public static void chooseTemplateAndClickPreview() throws Exception {
		CertificatePage certificatePage = PageFactory.initElements(driver, CertificatePage.class);
		certificatePage.chooseTemplate();
	}
	public static void selectTemplateInPreviewPopup() throws Exception {
		CertificatePage certificatePage = PageFactory.initElements(driver, CertificatePage.class);
		certificatePage.selectTemplateInPreviewPopup();
	}
	public static void clickAddCertificateForCreation() throws Exception {
		CertificatePage certificatePage = PageFactory.initElements(driver, CertificatePage.class);
		certificatePage.addCertificateButtonForCreation();
	}
	public static void assertCertificateAddedImg() throws Exception {
		CertificatePage certificatePage = PageFactory.initElements(driver, CertificatePage.class);
		certificatePage.assertCertificateAdded();
	}
}