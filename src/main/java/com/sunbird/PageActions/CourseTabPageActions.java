package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageObjects.CourseTabPage;
import com.sunbird.PageObjects.HomeTabPage;
import org.openqa.selenium.support.PageFactory;

public class CourseTabPageActions extends BaseTestConfig {

public static void clickViewAll() throws Exception {
	CourseTabPage courseTabPage = PageFactory.initElements(driver, CourseTabPage.class);
	courseTabPage.viewAllbtn();

		}
	public static void clickCloseBtn() throws Exception {
		CourseTabPage courseTabPage = PageFactory.initElements(driver, CourseTabPage.class);
		courseTabPage.closeBtn();
	}
	public static void assertAllDetailsOnCourseCard() throws Exception {
		CourseTabPage courseTabPage = PageFactory.initElements(driver, CourseTabPage.class);
		courseTabPage.validateAllDetailsInCourseCard();

	}


}
