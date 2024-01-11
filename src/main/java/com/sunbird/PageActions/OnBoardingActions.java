package com.sunbird.PageActions;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.OnBoarding;


public class OnBoardingActions extends BaseTestConfig {


	
	/* This method will handle the Rolepopup in Onboarding flow */
	public static void RolePoup()
	{
		OnBoarding onboard= PageFactory.initElements(driver, OnBoarding.class);
		//UtilityFunctions.waitToBeClickableAndClick(onboard.TeacherClick());
	
		onboard.TeacherClick();
		onboard.ContinueButtonClick();
	}
	
	/* This method will handle the BMC popup in onboarding flow */
	public static void BMCPopup() {

		OnBoarding onboard = PageFactory.initElements(driver, OnBoarding.class);

		onboard.BoardDropdown();

	// String frameworkName=frameworkconfig.getFramework("CBSE_FRAMEWORK");
		String frameworkName=frameworkconfig.getFramework("TAMILNADU_Framework");
		 
		//String usRname=frameworkconfig.getFramework("CREATOR_USRNAME");
		 
		//String frameworkName = frameworkconfig.getFramework("ANDHRA_Framework");

		onboard.BoardValueSelect(frameworkName);

		onboard.MediumDropDown();
		onboard.MediumValueSelect();

		UtilityFunctions.MoveByOffSet(50, 100);

		onboard.ClassDropDown();
		onboard.ClassValueSelect();

		UtilityFunctions.MoveByOffSet(50, 100);

		onboard.BMCSubmit();

	}
	
	/* This method will handle the Location popup in onboarding flow */
	public static void LocationPopup()
	{
		OnBoarding onboard= PageFactory.initElements(driver, OnBoarding.class);
		onboard.LocationPopupSubmit();

	}
	
}
