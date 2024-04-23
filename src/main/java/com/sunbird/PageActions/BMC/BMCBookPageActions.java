package com.sunbird.PageActions.BMC;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageObjects.BookPage;
import org.openqa.selenium.support.PageFactory;


public class BMCBookPageActions extends BaseTestConfig {



    /* select all the BMC dropdown in book editor */
    public static void BMCDropdownSelectionSection2() throws InterruptedException {
        Thread.sleep(5000);
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.clickBoardDropdown();
        bookPage.selectBoardValue();
        bookPage.clickMediumDropdown();
        bookPage.selectMediumValue();
        Thread.sleep(2000);
        bookPage.clickClassDropdown();
        Thread.sleep(2000);
        bookPage.selectClassValue();
        bookPage.clickSubjectDropdown();
        bookPage.selectSubjectValue();
    }

    public static void multipleBMCSelection() throws InterruptedException {
        Thread.sleep(5000);
        BookPage bookPage = PageFactory.initElements(driver, BookPage.class);
        bookPage.clickBoardDropdown();
        bookPage.selectBoardValue();
        bookPage.clickMediumDropdown();
        bookPage.mediumSelectAll();
        Thread.sleep(2000);
        bookPage.clickClassDropdown();
        Thread.sleep(2000);
        bookPage.classSelectAll();
        bookPage.clickSubjectDropdown();
        bookPage.subjectSelectAll();
    }


}
