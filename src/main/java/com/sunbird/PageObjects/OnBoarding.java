package com.sunbird.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;

public class OnBoarding extends BaseTestConfig {
	
	@FindBy(how=How.XPATH,using="//mat-form-field[@id='board']")
private WebElement Board;

	@FindBy(how=How.XPATH,using="//*[contains(text(),'CBSE')]")
	private WebElement Cbsc;

	@FindBy(how=How.XPATH,using="//div[@id='mat-select-value-39']")
	//@FindBy(how=How.XPATH,using="//div[@id='mat-select-value-9']")
	private WebElement Medium;


	//@FindBy(how=How.XPATH,using="//div[@id='mat-select-value-9']//following::span[@class='mat-option-text']")
	@FindBy(how=How.XPATH,using="//div[@id='mat-select-value-39']//following::span[@class='mat-option-text']")

	private WebElement MediumValue;

	@FindBy(how=How.XPATH,using="//div[@id='mat-select-value-43']")
//	@FindBy(how=How.XPATH,using="//mat-form-field[@id='gradeLevel']")
	private WebElement Classs;

	//@FindBy(how=How.XPATH,using="//mat-form-field[@id='gradeLevel']//following::span[@class='mat-option-text']")
	@FindBy(how=How.XPATH,using="//div[@id='mat-select-value-43']//following::span[@class='mat-option-text']")
	private WebElement  ClassValue;
	
	@FindBy(how=How.XPATH,using="//button[@class='sb-btn sb-btn-normal sb-btn-primary']")
	private WebElement   BMCSubmit;

	@FindBy(how=How.XPATH,using="//img[@alt='Teacher']")
	private WebElement Teacher;
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	private WebElement ContinueButton;
	
	@FindBy(how=How.XPATH,using="(//button[@type='submit'])[2]")
	private WebElement LocationPopupSubmitButton;

//	public WebElement TeacherClick() {
//		
//		return Teacher;
//	}

public void TeacherClick() {
		
	
	UtilityFunctions.waitForElementAndClickable(Teacher);
//	UtilityFunctions.waitToBeClickableAndClick(Teacher);
//	 Teacher.click();
	}


public void ContinueButtonClick() {
	
	UtilityFunctions.waitToBeClickableAndClick(ContinueButton);
	
	}
	
public void BoardDropdown() {
	
	UtilityFunctions.waitToBeClickableAndClick(Board);
	
	}

public void BoardValueSelect(String frameworkName) {
				
	
	String boardXpath=XPATH_CONTAINS+frameworkName+XPATH_CONAINSCLOSEBRACKET;

	
	UtilityFunctions.findElementAndClick(boardXpath);
	
	//UtilityFunctions.waitToBeClickableAndClick(Cbsc);
	
	}

public void MediumDropDown() {
	
	UtilityFunctions.waitToBeClickableAndClick(Medium);
	
	}

public void MediumValueSelect() {
	
	UtilityFunctions.waitToBeClickableAndClick(MediumValue);
	
	}

public void ClassDropDown() {
	
	UtilityFunctions.waitToBeClickableAndClick(Classs);
	
	}

public void ClassValueSelect() {
	
	UtilityFunctions.waitToBeClickableAndClick(ClassValue);
	
	}

public void BMCSubmit() {
	
	UtilityFunctions.waitToBeClickableAndClick(BMCSubmit);
	
	}

public void LocationPopupSubmit() {
	
	UtilityFunctions.waitToBeClickableAndClick(LocationPopupSubmitButton);
	
	}
}
