package com.sunbird.PageActions;

import org.openqa.selenium.support.PageFactory;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.OnBoarding;


public class OnBoardingActions extends BaseTestConfig {


    /* This method will handle the Rolepopup in Onboarding flow */
    public static void RolePoup() {
        OnBoarding onboard = PageFactory.initElements(driver, OnBoarding.class);
        //UtilityFunctions.waitToBeClickableAndClick(onboard.TeacherClick());
       // onboard.explorebutton();
        onboard.TeacherClick();
        onboard.ContinueButtonClick();
    }

    /* This method will handle the BMC popup in onboarding flow */
    public static void BMCPopup() throws InterruptedException {

        OnBoarding onboard = PageFactory.initElements(driver, OnBoarding.class);

        onboard.BoardDropdown();

      //  String frameworkName = sunbird_config.getSunbidConfigPropertyValue("TAMILNADU_Framework");
        String frameworkName = sunbird_config.getSunbidConfigPropertyValue("FRAMEWORK");
        onboard.BoardValueSelect(frameworkName);
       // Thread.sleep(5000);
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
      Thread.sleep(5000);
        onboard.clickStateDropdown();
        onboard.selectStateValue();
        onboard.clickDistrictDropDown();
        onboard.selectDistrictValue();
        onboard.LocationPopupSubmit();

    }
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
    public static void selectAgriculturePropertyDropdowns()
    {
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
