package com.sunbird.PageActions.Agriculture;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.SunbirdConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.BookPage;
import org.openqa.selenium.support.PageFactory;


public class AgricultureBookPageActions extends BaseTestConfig {





    /* select all the BMC dropdown in book editor */
    public static void AgricultureDropdownSelectionSection2() throws InterruptedException {
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

public static void HandleBMCOfNewe()
{

}
public static void sendForeRvewiDropdwonResource()
{

}

    public static void uploadSendForReview()
    {

    }
}
