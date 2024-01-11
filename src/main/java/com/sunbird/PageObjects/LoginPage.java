package com.sunbird.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sunbird.GenericLibrary.UtilityFunctions;

public class LoginPage {
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'English')]//following::div[@class='sb-avatar__img']")
	private WebElement userProfileIcon;

	@FindBy(how=How.XPATH,using="//a[text()=' Login ']")
	private WebElement loginLink;

	@FindBy(how=How.XPATH,using="//input[@id='username']")
	private WebElement userName;

	@FindBy(how=How.XPATH,using="//input[@id='password']")
	private WebElement password;

	@FindBy(how=How.XPATH,using="//button[@id='login']")
	private WebElement login;

	@FindBy(how=How.XPATH,using="//div[@class='title mt-4']")
	private WebElement checkAssert;

public void userProfileIcon() {
		
	UtilityFunctions.waitToBeClickableAndClick(userProfileIcon);
	}
public void LoginButtonInProfileIconDropdown() {
	
	UtilityFunctions.waitToBeClickableAndClick(loginLink);
	
	}
	

/* Enter username data into the field */ 
public void LoginUserName(String userNameValue) {
	
	UtilityFunctions.waitToBeClickableAndSendKeys(userName, userNameValue);
	
	}


public void LoginPassword(String passwordValue) {
	
	UtilityFunctions.waitToBeClickableAndSendKeys(password,passwordValue);
	
	}

public void TapLoginButton() {
	
	UtilityFunctions.waitToBeClickableAndClick(login);
	
	}
public String getTeacherText()
{
	String d=UtilityFunctions.getTextFromElement(checkAssert);
	return d;

}

}
