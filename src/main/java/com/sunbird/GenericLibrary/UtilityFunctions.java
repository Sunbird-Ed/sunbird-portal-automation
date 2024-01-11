package com.sunbird.GenericLibrary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class UtilityFunctions extends BaseTestConfig {
	
	
	
	/* This method will wait untill expected conditions and then it will perform click event on the given webElement */
	public static void waitToBeClickableAndClick(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	/* This method will wait untill expected conditions and then it will perform click event on the given webElement and 
	 then is passes the testdata to the given textbox */
	public static void waitToBeClickableAndSendKeys(WebElement element,String Value) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		element.sendKeys(Value);
	}
	
	

	public static boolean fluenWait(WebElement element,int waitTime) {
	    boolean conditionFulfilled = true;
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	            .withTimeout(Duration.ofSeconds(waitTime))
	            .pollingEvery(Duration.ofSeconds(1))
	            .ignoring(NoSuchElementException.class);

	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(element));
	    } catch (Exception e ){
	         conditionFulfilled = false;
	       
	    }
	    return conditionFulfilled;
	}
	
	
	public static void waitForElementAndClickable(WebElement element){
		int waitTime = 30;
		fluenWait(element,waitTime);
	    element.click();
	}
	
	
	
	
	
	/* This method will click on the UI screen using given dimension value */
	public static void MoveByOffSet(int a,int b)
	{
		
	Actions act = new Actions(driver);
	act.moveByOffset(a, b).click().build().perform();
	}


	public static void findElementAndClick(String xpathValue)
	{
	 driver.findElement(By.xpath(xpathValue)).click();
	}
	
	
}
