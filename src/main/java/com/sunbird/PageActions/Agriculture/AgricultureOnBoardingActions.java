package com.sunbird.PageActions.Agriculture;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageActions.BMC.BmcOnBoardingActions;
import com.sunbird.PageObjects.OnBoarding;
import org.openqa.selenium.support.PageFactory;


public class AgricultureOnBoardingActions extends BaseTestConfig {


    /* select the dropdownValues in Agriculture framework */
    public static void selectAgriculturePropertyDropdowns() throws InterruptedException {
Thread.sleep(3000);
        OnBoarding onboard = PageFactory.initElements(driver, OnBoarding.class);
        onboard.selectFarmingType();
       UtilityFunctions.MoveByOffSet(50, 100);

        onboard.selectCropCategory();
        UtilityFunctions.MoveByOffSet(50, 100);

        onboard.selectCropType();
        UtilityFunctions.MoveByOffSet(50, 100);

        onboard.selectCropName();
        UtilityFunctions.MoveByOffSet(50, 100);


    }

}
