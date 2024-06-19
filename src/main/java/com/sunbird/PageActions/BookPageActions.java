package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageActions.Agriculture.AgricultureBookPageActions;
import com.sunbird.PageActions.Agriculture.AgricultureOnBoardingActions;
import com.sunbird.PageActions.BMC.BMCBookPageActions;
import com.sunbird.PageActions.BMC.BmcOnBoardingActions;
import com.sunbird.PageObjects.BookPage;
import org.openqa.selenium.support.PageFactory;


public class BookPageActions extends BaseTestConfig {


	/* fill the details in createBook popup and will return created contentName or doid  based on paramter/*
	 */
    public static String createBookPopup(String getContentType) throws Exception {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);

        String bookName = UtilityFunctions.generateRandomName("automationBook");
        bookPage.enterBookName(bookName);
        bookPage.clickStartCreateButton();
        bookPage.assertSaveAsDraft();
        if (getContentType.equalsIgnoreCase("getContentName")) {
            return bookName;
        } else {

            return UtilityFunctions.generate_Do_id();

        }


    }

	/* fill all the details of book editor section1 and return the value */
    public static String section1(String requestReturnType) throws InterruptedException {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        String description = UtilityFunctions.generateRandomName("autoDescription");
        bookPage.enterDesciption(description);
        UtilityFunctions.scrollDownUsingPixelValue();
        String keyword = UtilityFunctions.generateRandomName("autoBookKeyword");
        bookPage.enterKeywords(keyword);

//        bookPage.clickyesQRCodeRequiredCheckbox();
//        String enteredQrCode = sunbird_config.getSunbidConfigPropertyValue("QRCodeValue");
//        bookPage.enterQrCode(enteredQrCode);
//        bookPage.clickqrCodeBlueTickIcon();
//        bookPage.assertGreenTickIcon();
//
//        if (requestReturnType.equalsIgnoreCase("getqrcode")) {
//            return enteredQrCode;
//        }
        if (requestReturnType.equalsIgnoreCase("getdescription")) {
            return description;
        } else {
            return keyword;
        }


    }

    /* select all the BMC dropdown in book editor */
    public static void BMCDropdownSelectionSection2() throws InterruptedException {
        String frameworkName = sunbird_config.getSunbidConfigPropertyValue("FRAMEWORK");
        switch(frameworkName){
            case "agriculture_framework_20":
                //  selectAgriculturePropertyDropdowns();
                AgricultureBookPageActions.AgricultureDropdownSelectionSection2();
                break;

            default:
                BMCBookPageActions.BMCDropdownSelectionSection2();
                //  BMCSelection();
        }


        Thread.sleep(5000);
//        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
//        bookPage.clickBoardDropdown();
//        bookPage.selectBoardValue();
//        bookPage.clickMediumDropdown();
//        bookPage.selectMediumValue();
//        Thread.sleep(2000);
//        bookPage.clickClassDropdown();
//        Thread.sleep(2000);
//        bookPage.selectClassValue();
//        bookPage.clickSubjectDropdown();
//        bookPage.selectSubjectValue();
    }

/* enterCopyRight and click on savedraft */
    public static void Section3() throws InterruptedException {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.enterCopyRightYear("2024");
        Thread.sleep(5000);
        bookPage.clickSaveAsDraft();

    }

/*Add resource from library section */
    public static void addResourceFromLibrary() throws InterruptedException {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.clikAddChild();
        bookPage.clickAddFromLibraryBtn();
        bookPage.searchContentInLibrary("mp4");
        bookPage.selectButtonInLibrary();
        bookPage.addContentInLibrary();
        String actualMsg = bookPage.assertContentAddedFolderToastrMsg();
        UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.contentAddedToFolderToastrMsg, "Failed to add content into folder");
        bookPage.waitContentAddedToFolderToastrToDisappear();
UtilityFunctions.scrollUpUsingPixelValue();
UtilityFunctions.threadSleep(2000);
        bookPage.clickBackBtnFromLibrarysection();
    }

    /* click submitAndSendForReview */
    public static void submitAndSendForReview() {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.clickSubmitbtn();
        bookPage.clickTermsAndConditions();
        bookPage.clickSubmitButtonInSendForReview();

        String actualMsg = bookPage.assertSendForReviewTostrMsg();
        UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.contentSentForReview, "Failed to send the content for review");

    }

    /* Validate the SendForReview toastrMsg */
    public static void assertSendForReviewToastrMsg() {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        String actualMsg = bookPage.assertSendForReviewTostrMsg();
        UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.contentSentForReview, "Failed to send the content for review");

    }

    /* click on generateQrCodeDropdown and enter the Qrcode size to generate */
    public static void generateQrCode(String qrCodeSize) throws InterruptedException {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.clickQrCodeDropdown();
        bookPage.clickGenerateQrCode();
        bookPage.enterQrCodeValue(qrCodeSize);
        bookPage.clkRequestBtn();
        String actualMsg = bookPage.assertGenerateQrCodeToastrMsg();
        UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.generateQrCodeToastrMsg, "Failed to generate Qrcode");
bookPage.waitGenerateQRCodeToastrToDisappear();
//Thread.sleep(8000);
    }

    /* click on DownloadqrCode in QRCode dropdown */
    public static void downloadQrCode() throws InterruptedException {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.clickQrCodeDropdown();
        Thread.sleep(8000);
        bookPage.clkDownloadQrCode();
        String actualMsg = bookPage.assertDownloadQrCodeToastrMsg();
        UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.downloadQrCodeToastrMg, "Failed to download Qrcode");
        bookPage.waitDownloadQRCodeToastrToDisappear();

    }

    /*Will downloadFolder as CSV File */
    public static void downloadFolderAsCSVFile() throws InterruptedException {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.clickVerticalEllipsisMenuIcon();
        bookPage.clickDownloadAsCSVFile();

    }
    public static void clickAddChild() {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.clikAddChild();
    }

    /*Add resource from library section */
    public static void addDifferentResourceTypeInLibrarySection(String resourceType) throws InterruptedException {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.clickAddFromLibraryBtn();
        bookPage.searchContentInLibrary(resourceType);
           bookPage.selectButtonInLibrary();
        bookPage.addContentInLibrary();
        String actualMsg = bookPage.assertContentAddedFolderToastrMsg();
        UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.contentAddedToFolderToastrMsg, "Failed to add content into folder");
        bookPage.waitContentAddedToFolderToastrToDisappear();
        UtilityFunctions.scrollUpUsingPixelValue();
        UtilityFunctions.threadSleep(2000);
          bookPage.clickBackBtnFromLibrarysection();
    }

    /* click on saveAsdrafts */
    public static void clickSaveAsDrafts() {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.clickSaveAsDraft();
    }

    /* click on childLeftSection */
    public static void clickOnAddChildLeftSectionUnit() {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.childUnitClick();
    }

    public static void clickCopyButton() {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.copyButton();
    }
    public static void assertCopyToastrMsg() {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        String actualMsg = bookPage.assertCopyToastrMsg();
        UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.copyToastrMsg, "Failed to copy the content");

    }
    public static void assertContentIsSavedToastrMsg() {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        String actualMsg = bookPage.assertContentSavedToastMsg();
        UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.contentSavedTostrMsg, "Failed to copy the content");

    }
    public static void waitContentIsSavedToastToDisapper() {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.waitContentIsSavedToastrToDisappear();
    }
    public static void waitCopyToastrMsgDisAppear() {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.waitCopyToastrMsg();
    }
    public static void copyAsCourse() {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.copyAsCourse();
    }
    public static void selectAllInCopyAscourse() {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.selectAllBtn();
    }
    public static void clickOnCreateBtnInCopyAsCourse() {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.createButtonIncopyascourse();
    }
    public static void addResourceInLibrarySection(String resourceName) throws InterruptedException {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.clikAddChild();
        bookPage.clickAddFromLibraryBtn();
        bookPage.searchContentInLibrary(resourceName);
        bookPage.selectButtonInLibrary();
        bookPage.addContentInLibrary();
        String actualMsg = bookPage.assertContentAddedFolderToastrMsg();
        UtilityFunctions.stringValueComparision(actualMsg, SunbirdConstants.contentAddedToFolderToastrMsg, "Failed to add content into folder");
        bookPage.waitContentAddedToFolderToastrToDisappear();
        UtilityFunctions.scrollUpUsingPixelValue();
        UtilityFunctions.threadSleep(2000);
        bookPage.clickBackBtnFromLibrarysection();
    }
    public static void clickBackButtonInEditor() {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.backButtonEditor();
    }
    public static void clickCollobratorIcon() throws InterruptedException {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.addCollobratorIcon();
        UtilityFunctions.threadSleep(4000);
    }
    public static void selectTheCollobratorFromlist() {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.selectCollobrator();
    }
    public static void clickDoneBtnInCollobrator() {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.doneBtnInAddCollobrator();
    }
    public static void assertAddedCollobratorToastrMsg() {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
    String actual=   bookPage.AddedCollobratorToastrMsg();
        UtilityFunctions.stringValueComparision(actual,SunbirdConstants.collobratorAddedToastrmsg,"Collobrator didn't add to the editor");
    }
    public static void clickManageCollobratorTab() {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.manageCollobratorTab();
    }
    public static void assertAddedCollobratorInManageTabs() throws InterruptedException {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.assertAddedCollobratorInManageTab();
    }
    public static void assertMultipleTaggedMediumAndClass() throws InterruptedException {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.assertMultipleTaggedMediumAndClass();
    }
    public static void selectMultipleBMCDropdownSelectionSection2() throws InterruptedException {
        String frameworkName = sunbird_config.getSunbidConfigPropertyValue("FRAMEWORK");
        switch(frameworkName){
            case "agriculture_framework_20":
                //  selectAgriculturePropertyDropdowns();
                AgricultureBookPageActions.AgricultureDropdownSelectionSection2();
                break;

            default:
                BMCBookPageActions.multipleBMCSelection();
                //  BMCSelection();
        }


        Thread.sleep(5000);
    }

    public static void clickAddFromLibraryBtn() throws InterruptedException {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.clickAddFromLibraryBtn();

    }


    public static void assertThreeDotsMenu() throws InterruptedException {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.assertThreeDotsMenu();
    }

    public static void clickThreeDotsMenu() throws InterruptedException {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.clickThreeDotsMenu();
    }

    public static void assetCreateFoldersOption() {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.assetCreateFoldersOption();

    }

    public static void assertDownloadFoldersAsCSVOption() {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.assertDownloadFoldersAsCSVOption();

    }

    public static void assertUpdateFolderOption() {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.assertUpdateFolderOption();

    }

    public static void assertAddCollaboratorButton() {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.assertAddCollaboratorButton();

    }

    public static void assertQRCodeOption() {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.assertAddCollaboratorButton();
    }

    public static void clickQRDropDown() {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.clickQrCodeDropdown();
    }

    public static void assertGenerateQROption () {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.assertGenerateQRCodeOption();
    }

    public static void assertDownloadQROption () {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.assertDownloadQRCodeOption();
    }

    public static void assertSaveAsDraftOption() {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.assertSaveAsDrafts();

    }

    public static void assertBackButton() {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.assertBackButton();

    }

    public static void assertAddSiblingOption() {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.assertAddSiblingOption();

    }

    public static void assertAddChildOption() {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.assertAddChild();

    }

    public static void assertAddFromLibraryOption() {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.assertAddFromLibrary();

    }
    public static void verify100ContentsInAddFromLibrary(String expected_count) throws InterruptedException {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.clickAddFromLibraryBtn();
        bookPage.assertShowing100ContentsMessage();
        int count=bookPage.getBookElementSize();
        String actual=String.valueOf(count);
        UtilityFunctions.stringValueComparision(actual, expected_count ,"100 content not found");
        bookPage.clickBackBtnFromLibrarysection();
    }
    public static void addSibling() throws InterruptedException {
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.clickAddSibling();
    }


}
