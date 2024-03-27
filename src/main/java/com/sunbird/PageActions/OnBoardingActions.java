package com.sunbird.PageActions;

import org.openqa.selenium.support.PageFactory;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.OnBoarding;


public class OnBoardingActions extends BaseTestConfig {


    /* This method will handle the Rolepopup in Onboarding flow */
    public static void RolePoup() throws InterruptedException {
        OnBoarding onboard = PageFactory.initElements(driver, OnBoarding.class);
        //UtilityFunctions.waitToBeClickableAndClick(onboard.TeacherClick());
      //  onboard.explorebutton();
      // Thread.sleep(5000);


        onboard.TeacherClick();
        onboard.ContinueButtonClick();
    }

    /* This method will handle the BMC popup in onboarding flow */
    public static void BMCPopup() throws InterruptedException {

        OnBoarding onboard = PageFactory.initElements(driver, OnBoarding.class);

        onboard.BoardDropdown();
        Thread.sleep(2000);

      //  String frameworkName = sunbird_config.getSunbidConfigPropertyValue("TAMILNADU_Framework");
        String frameworkName = sunbird_config.getSunbidConfigPropertyValue("FRAMEWORK");
        onboard.BoardValueSelect(frameworkName);
        switch(frameworkName){
            case "agriculture_framework_20":
                selectAgriculturePropertyDropdowns();
                break;
            default:
                BMCSelection();
        }

       onboard.BMCSubmit();

    }

    /* This method will handle the Location popup in onboarding flow */
    public static void LocationPopup() throws InterruptedException {
        OnBoarding onboard = PageFactory.initElements(driver, OnBoarding.class);
       Thread.sleep(2000);
        onboard.clickStateDropdown();
        onboard.selectStateValue();
        onboard.clickDistrictDropDown();
        onboard.selectDistrictValue();
        onboard.LocationPopupSubmit();

    }

    /* Select BMC dropdowns */
    public static void BMCSelection()
    {
        OnBoarding onboard = PageFactory.initElements(driver, OnBoarding.class);
        onboard.MediumDropDown();
        onboard.MediumValueSelect();

        UtilityFunctions.MoveByOffSet(50, 100);

        onboard.ClassDropDown();
        onboard.ClassValueSelect();

        UtilityFunctions.MoveByOffSet(50, 100);

    }

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
