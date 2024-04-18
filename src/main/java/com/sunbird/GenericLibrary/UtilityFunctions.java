package com.sunbird.GenericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;

import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class UtilityFunctions extends BaseTestConfig {


    /* This method will wait untill expected conditions and then it will perform click event on the given webElement */
    public static void waitToBeClickableAndClick(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    /* This method will wait untill expected conditions and then it will perform click event on the given webElement and
     then is passes the testdata to the given textbox */
    public static void waitToBeClickableAndSendKeys(WebElement element, String Value) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
        element.sendKeys(Value);
    }

    /* This method will just wait untill the given webElement is visible */
    public static void waitForVisibilityOfWebElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    /* FluentWait method will wait for the given webElement with provided max time with pollingEvery given second */
    public static boolean fluenWait(WebElement element, int waitTime) {
        boolean conditionFulfilled = true;
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(waitTime))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            conditionFulfilled = false;

        }
        return conditionFulfilled;
    }

    /* This is fluentWait approach method which accepts WebElement as parameter and call the fluent method*/
    public static void waitForElementAndClickable(WebElement element) {
        int waitTime = 60;
        fluenWait(element, waitTime);
        element.click();
    }
    public static void waitForElementIsVisible(WebElement element) {
        int waitTime = 30;
        fluenWait(element, waitTime);


    }
    public static void waitForElementToDisappear(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }
    /* This method will click on the UI screen using given dimension value */
    public static void MoveByOffSet(int a, int b) {

        Actions act = new Actions(driver);
        act.moveByOffset(a, b).click().build().perform();
    }

    /* This method will take Xpath as string and perform findElement operation and click */
    public static void findElementAndClick(String xpathValue) throws InterruptedException {
        driver.findElement(By.xpath(xpathValue)).click();

    }

    /* Method will get the current url and do the substring and returning the with extracted do_Id */
    public static String generate_Do_id() {
        String currentUrl = driver.getCurrentUrl();
        String do_id = "do_";
        int startIndex = currentUrl.indexOf(do_id);
        String parsedString = currentUrl.substring(startIndex);
        String end_id = "/";
        int endIndex = parsedString.indexOf(end_id);
        endIndex = startIndex + endIndex;
        String DO_ID = currentUrl.substring(startIndex, endIndex);
        return DO_ID;
    }

    /* will give the RandomName by accepting the preFixName as parameter Ex: CourseJohn*/
    public static String generateRandomName(String preFixName) {
        Faker faker = new Faker();

        String name = faker.name().firstName();
        String randamtestdata = preFixName + name;
        return randamtestdata;
    }

    /* Method will accept WebElement as parameter and get text from the WebElement and return the fetched Text as String */
    public static String getTextFromElement(WebElement elementName) {
        String fetchedText = elementName.getText();
        return fetchedText;
    }

    public static void waitForFrameToLoad(int frameValue) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameValue));
    }

    /* This method will accept index value as parameter and switchToFrame to that provided Index value */
    public static void switchFrameOnIndex(int indexValue) throws InterruptedException {
        Thread.sleep(5000);
        //	waitForFrameToLoad(indexValue);
        driver.switchTo().frame(indexValue);
    }


	/* This method will accept WebElement as paramter and uploadFile Path as String and it will upload
	using sendKeys approach using the provided String upload file path */

    public static void uploadSendKeys(WebElement element, String Value) {
        element.sendKeys(Value);
    }

    public static String getExactFilePath(String fileName) {
        String filepath = System.getProperty("user.dir") + sunbird_config.getSunbidConfigPropertyValue("fileName");

        return filepath;
    }

    /* Method will accept Actual result and Expected Result as parameter value and Msg parameter is taken only if Assertion gets fail */
    public static void stringValueComparision(String actual, String expected, String Msg) {
        Assert.assertEquals(actual, expected, Msg);

    }

    /* Method will scrollIntoView untill the element is visible using javascript */
    public static void scrollInToviewUsingJavaScript(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void validatIsElementPresent(WebElement element, String ErrorMsg) {
        Assert.assertTrue(element.isDisplayed(), ErrorMsg);
    }
    public static void validatElementNotPresent(WebElement element, String ErrorMsg) {
        Assert.assertFalse(element.isDisplayed(),ErrorMsg);
    }


    public static void scrollDownUsingPixelValue() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)", "");
    }

    public static void waitForVisibilityOfAllWebElement(List<WebElement> element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }

    public static void clickUsingJavaScriptExecutor(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    public static void scrollUpUsingPixelValue() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-350)", "");
    }

    public static void pressEnterKeyOnWebElement(WebElement element) {

       // element.sendKeys(Keys.ENTER);
       element.sendKeys(Keys.RETURN);
    }

    public static String getProperyFilePath() throws IOException {
        String path = System.getProperty("user.dir") + "//Config//SunbirdConfig.Properties";
        FileInputStream fis = new FileInputStream(path);
        Properties pro = new Properties();
        pro.load(fis);

        String Env = pro.getProperty("EnvironmentSetup");
        String path2 = "";
        if (Env.equalsIgnoreCase("STAGING")) {
            return path2 = System.getProperty("user.dir") + "//Config//Sunbird.Properties";

        } else if (Env.equalsIgnoreCase("PREPROD")) {

            return path2 = System.getProperty("user.dir") + "//Config//SunbirdPreProd.Properties";

        } else if (Env.equalsIgnoreCase("Prod")) {
            return path2 = System.getProperty("user.dir") + "//Config//SunbirdProd.Properties";

        }
        return path2;
    }


    public static String generateXpathUsingContainsWithKeyNameValue(String keynameValue) {
        String firstXpath = "//*[contains(text(),'";
        String thirdXpath = "')]";
        String finalXpath = firstXpath + keynameValue + thirdXpath;
        return finalXpath;
    }

    public static String generateXpathUsingAttributeNameAndKeynameValue(String attributeName,String keynameValue)
    {
        String finalXpath = "//*[@"+attributeName+"='"+keynameValue+"']";
             return finalXpath;
    }

    public static void switchFrameUsingName() throws InterruptedException {
        WebElement iframe = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iframe);
    }

    public static void waitForElementToBeClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitForElementUsingForLoopAndAssert(WebElement element,int maxAttempt)
    {
        for(int i=0;i<maxAttempt;i++) {
            try {
               validatIsElementPresent(element, "element is not Displayed");
                break;
            } catch (Exception e)
            {

            }
    }
}
    public static void waitForElementUsingForLoop(WebElement element,int maxAttempt)
    {
        for(int i=0;i<maxAttempt;i++) {
            try {
                validatIsElementPresent(element, "element is not Displayed");
                break;
            } catch (StaleElementReferenceException e)
            {

                 }
        }
    }
    public static void switchToFrameUsingXpath(WebElement element) throws InterruptedException {
       // WebElement iframe = driver.findElement(By.xpath(element));
        driver.switchTo().frame(element);
    }
    public static void switchFrameUsingXpath() throws InterruptedException {
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='iziModal-iframe']"));
        driver.switchTo().frame(iframe);
    }

    public static String getTodayDate(String pattern)
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime now = LocalDateTime.now();
        String todayDate=dtf.format(now);
        return  todayDate;
    }
    public static String getFutureDate(int dayCount)
    {
        LocalDate today = LocalDate.now();
        String futureDate = (today.plusDays(dayCount)).format(DateTimeFormatter.ISO_DATE);
  return  futureDate;
    }
    public static void getDataInMonth(int dayCount)
    {
        // Get an instance of LocalTime
        // from date
        LocalDate currentDate = LocalDate.parse("date");

        // Get day from date
        int day = currentDate.getDayOfMonth();

        // Get month from date
        Month month = currentDate.getMonth();

        // Get year from date
        int year = currentDate.getYear();

        // Print the day, month, and year
        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
    }

    public static int extractNumberFromString(String data)
    {
        int value = Integer.parseInt(data.replaceAll("[^0-9]", ""));
return value;
    }

    public static void numberValueComparision(int actual, int expected, String Msg) {
        Assert.assertEquals(actual, expected, Msg);

    }

    public static void backButtonInBrowser()
    {

        driver.navigate().back();
    }
    public static void acceptAlert()
    {
        driver.switchTo().alert().accept();
    }
    public static void switchToDefaultContentFrame()
    {

        driver.switchTo().defaultContent();
    }

    public static void waitForFrameToBeAvailable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));

    }
    public static void refreshPage() {
     driver.navigate().refresh();
    }

    public static void elementToBeSelected(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeSelected(element));

    }
    public static void mouseHoverOnElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.click().build().perform();
            }

            public static void threadSleep(int seconds) throws InterruptedException {
                Thread.sleep(seconds);
            }
    public static File getLatestDownloadedFile(String directoryFilePath)
    {
        File directory = new File(directoryFilePath);
        File[] files = directory.listFiles(File::isFile);
        long lastModifiedTime = Long.MIN_VALUE;
        File chosenFile = null;

        if (files != null)
        {
            for (File file : files)
            {
                if (file.lastModified() > lastModifiedTime)
                {
                    chosenFile = file;
                    lastModifiedTime = file.lastModified();
                }
            }
        }

        return chosenFile;
    }

    public static String getSystemDownloadPath()
    {
        String home = System.getProperty("user.home");
        File downloadPath = new File(home+"/Downloads/");
        String systemDownloadPath=downloadPath.toString();
        return systemDownloadPath;
    }
}
