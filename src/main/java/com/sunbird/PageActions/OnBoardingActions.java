package com.sunbird.PageActions;

import com.sunbird.PageActions.Agriculture.AgricultureOnBoardingActions;
import com.sunbird.PageActions.BMC.BmcOnBoardingActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.OnBoarding;
import java.util.List;


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
    public static void   BMCPopup() throws InterruptedException {

        OnBoarding onboard = PageFactory.initElements(driver, OnBoarding.class);


    onboard.BoardDropdown();
        Thread.sleep(2000);

        String frameworkName = sunbird_config.getSunbidConfigPropertyValue("FRAMEWORK");
        onboard.BoardValueSelect(frameworkName);
        switch(frameworkName){
            case "agriculture_framework_20":
              //  selectAgriculturePropertyDropdowns();
                AgricultureOnBoardingActions.selectAgriculturePropertyDropdowns();
                break;
            default:
                BmcOnBoardingActions.BMCSelection();
              //  BMCSelection();
        }

       onboard.BMCSubmit();

    }

    /* This method will handle the Location popup in onboarding flow */
    public static void LocationPopup() throws InterruptedException {
        OnBoarding onboard = PageFactory.initElements(driver, OnBoarding.class);
       Thread.sleep(2000);
        onboard.clickStateDropdown();
        onboard.selectStateValue();
        Thread.sleep(2000);

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
    public static void LocationPopupForSwitchUser() throws InterruptedException {
        OnBoarding onboard = PageFactory.initElements(driver, OnBoarding.class);
        Thread.sleep(2000);
//        onboard.clickStateDropdown();
//        onboard.selectStateValue();
//        onboard.clickDistrictDropDown();
//        onboard.selectDistrictValue();
        onboard.LocationPopupSubmit();

    }
    public static void submitButtonInLocationPopup() throws InterruptedException {
        OnBoarding onboard = PageFactory.initElements(driver, OnBoarding.class);
               onboard.LocationPopupSubmit();

    }

    public static void blockSelection()
    {
        OnBoarding onboard = PageFactory.initElements(driver, OnBoarding.class);
        onboard.clickBlockDropdown();
        onboard.selectBlockDropdown();


    }
    public static void schoolSelection()
    {
        OnBoarding onboard = PageFactory.initElements(driver, OnBoarding.class);
        onboard.clickSchoolDropdown();
        onboard.schoolDropdown();

    }

    public static void selectStateAndDistrict() throws InterruptedException {
        OnBoarding onboard = PageFactory.initElements(driver, OnBoarding.class);
        Thread.sleep(2000);
        onboard.clickStateDropdown();
        onboard.selectStateValue();
        Thread.sleep(2000);

        onboard.clickDistrictDropDown();
        onboard.selectDistrictValue();
           }

    /* This method will handle the BMC popup in onboarding flow */
    public static void  dynamicHandling() throws InterruptedException {

        Thread.sleep(5000);

//List<WebElement> el=driver.findElements(By.xpath("(//mat-select)"));
     // List<WebElement> el=driver.findElements(By.tagName("mat-select"));

        List<WebElement> elements=driver.findElements(By.xpath("//*[contains(text(),'To discover relevant content update the following details:')]//following::mat-select"));
        System.out.println("element found"+elements.size());

        for(int i=1;i<=elements.size();i++)
        {
          //  String xp="(//mat-select)[";
            String dropdownXpath="//*[contains(text(),'To discover relevant content update the following details:')]//following::mat-select[";
          //  String xp="(//mat-select)[";
            int val=i;
            String xpathClose="]";

            String dropdownValueXpath="//following::mat-option";
         //   String valueSlt="//following::*[@class='mat-option-text']";
            Thread.sleep(3000);
           driver.findElement(By.xpath(dropdownXpath+val+xpathClose)).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath(dropdownXpath+val+xpathClose+dropdownValueXpath)).click();
            UtilityFunctions.MoveByOffSet(50, 100);


        }
        Thread.sleep(2000);

    }

    /* This method will handle the BMC popup in onboarding flow */
    public static void  dynamicHandling2() throws InterruptedException {
        OnBoarding onboard = PageFactory.initElements(driver, OnBoarding.class);
        Thread.sleep(5000);
        List<WebElement> elements=onboard.ckDropdownmain();

        System.out.println("element found"+elements.size());
    int  totalCount=elements.size();
        for(int i=0;i<totalCount;i++)
        {
            String dropdownXpath="//*[contains(text(),'To discover relevant content update the following details:')]//following::mat-select[";
            int val=i;
            String xpathClose="]";
            String dropdownValueXpath="//following::mat-option";
            Thread.sleep(3000);

                   onboard.ckDropdown(val);
           // elements.get(i).click();
      //    driver.findElement(By.xpath(dropdownXpath+val+xpathClose)).click();
                     Thread.sleep(1000);
            int val2=val+1;
          WebElement d= driver.findElement(By.xpath(dropdownXpath+val2+xpathClose+dropdownValueXpath));
          UtilityFunctions.waitForElementAndClickable(d);
         //   driver.findElement(By.xpath(dropdownXpath+val2+xpathClose+dropdownValueXpath)).click();
            UtilityFunctions.MoveByOffSet(50, 100);
int totalCount2=elements.size();
totalCount=totalCount2;

        }
        Thread.sleep(2000);


    }


    public static void su()
    {
        OnBoarding onboard = PageFactory.initElements(driver, OnBoarding.class);
        onboard.BMCSubmit();

    }
}
