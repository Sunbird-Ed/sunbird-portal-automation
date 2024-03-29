package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageObjects.GetPage;
import com.sunbird.PageObjects.ObservationPage;
import org.openqa.selenium.support.PageFactory;


public class ObservationPageActions extends BaseTestConfig {




	public static void clickOnObservationCard()
	{
		ObservationPage observationPage = PageFactory.initElements(driver, ObservationPage.class);
observationPage.observationCard();
	}
	public static void assertObservationDetails()
	{
		ObservationPage observationPage = PageFactory.initElements(driver, ObservationPage.class);
		observationPage.assertObservationDetails();
	}
	public static void assertObservationCount()
	{
		ObservationPage observationPage = PageFactory.initElements(driver, ObservationPage.class);
		observationPage.assertObservationCount();
	}


}