package com.sunbird.PageActions.BMC;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.OnBoarding;
import org.openqa.selenium.support.PageFactory;


public class BmcOnBoardingActions extends BaseTestConfig {



    /* Select BMC dropdowns */
    public static void BMCSelection() throws InterruptedException {
        OnBoarding onboard = PageFactory.initElements(driver, OnBoarding.class);
        Thread.sleep(2000);
        onboard.MediumDropDown();
        onboard.MediumValueSelect();

        UtilityFunctions.MoveByOffSet(50, 100);

        onboard.ClassDropDown();
        onboard.ClassValueSelect();

        UtilityFunctions.MoveByOffSet(50, 100);

    }


}
