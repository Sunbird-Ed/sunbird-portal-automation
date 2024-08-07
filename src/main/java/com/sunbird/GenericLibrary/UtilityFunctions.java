package com.sunbird.GenericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.List;
import java.util.Properties;

import com.github.javafaker.Faker;
import com.sunbird.PageObjects.OnBoarding;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;


public class UtilityFunctions extends BaseTestConfig {


    // This method will wait untill expected conditions and then it will perform click event on the given webElement */
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
        element.clear();
        element.sendKeys(Value);
    }

    // This method will just wait untill the given webElement is visible
    public static void waitForVisibilityOfWebElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    // FluentWait method will wait for the given webElement with provided max time with pollingEvery given second
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

    // This is fluentWait approach method which accepts WebElement as parameter and call the fluent method
    public static void waitForElementAndClickable(WebElement element) {
        int waitTime = 60;
        fluenWait(element, waitTime);
        element.click();
    }

    // This is fluentWait approach method which accepts WebElement as parameter and wait untill the element is visible using fluent wait
    public static void waitForElementIsVisible(WebElement element) {
        int waitTime = 30;
        fluenWait(element, waitTime);
    }

    // Method will wait for 2seconds before interaction
    public static void waitForElementInShortSpanAndClickable(WebElement element) {
        int waitTime = 2;
        fluenWait(element, waitTime);
        element.click();
    }

    // Accepts webElement as paramerter and wait untill that element get disappear
    public static void waitForElementToDisappear(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    // This method will click on the UI screen using given dimension value
    public static void MoveByOffSet(int a, int b) {

        Actions act = new Actions(driver);
        act.moveByOffset(a, b).click().build().perform();
    }

    // This method will take Xpath as string and perform findElement operation and click
    public static void findElementAndClick(String xpathValue) throws InterruptedException {
        driver.findElement(By.xpath(xpathValue)).click();

    }

    // Method will return the boolean status of webElement ,return true if webelement is present and return false if webElement is not present
    public static boolean isElementPresent(WebElement locator) {
        try {
            waitForVisibilityOfWebElement(locator);
            if (locator.isDisplayed())
                System.out.println("Element present on screen ***********" + locator);
            return true;
        } catch (Exception e) {
            System.out.println("Element not present on screen **************" + locator);
            return false;
        }
    }

    // Method will get the current url and do the substring and returning the with extracted do_Id
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

    // will give the RandomName by accepting the preFixName as parameter Ex: CourseJohn
    public static String generateRandomName(String preFixName) {
        Faker faker = new Faker();
        String name = faker.name().firstName();
        String randamtestdata = preFixName + name;
        return randamtestdata;
    }

   // Method will accept WebElement as parameter and get text from the WebElement and return the fetched Text as String
    public static String getTextFromElement(WebElement elementName) {
        String fetchedText = elementName.getText();
        return fetchedText;
    }

    // Accepts frameValue as parameter and waitUntil frame is loaded
    public static void waitForFrameToLoad(int frameValue) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameValue));
    }

    // This method will accept index value as parameter and switchToFrame to that provided Index value
    public static void switchFrameOnIndex(int indexValue) throws InterruptedException {
        Thread.sleep(5000);
        driver.switchTo().frame(indexValue);
    }


    /*This method will accept WebElement as paramter and uploadFile Path as String and it will upload
    using sendKeys approach using the provided String upload file path */
    public static void uploadSendKeys(WebElement element, String Value) {

        element.sendKeys(Value);
    }

    // get systemdirectorypath and get the upload content path along with fileName and returns complete file path
    public static String getExactFilePath(String fileName) {
        String filepath = System.getProperty("user.dir") + sunbird_config.getSunbidConfigPropertyValue("fileName");
        return filepath;
    }

    // Method will accept Actual result and Expected Result as parameter value and Msg parameter is taken only if Assertion gets fail
    public static void stringValueComparision(String actual, String expected, String Msg) {
        Assert.assertEquals(actual, expected, Msg);

    }

    // Method will scrollIntoView untill the element is visible using javascript
    public static void scrollInToviewUsingJavaScript(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    // Assert the given WebElement is true, if yes testcase gets pass or else it will fail the testcase
    public static void validatIsElementPresent(WebElement element, String ErrorMsg) {
        Assert.assertTrue(element.isDisplayed(), ErrorMsg);
    }

    // Assert the given WebElement is False, if yes testcase gets pass or else it will fail the testcase
    public static void validatIsElementNotPresent(WebElement element) {
        boolean status = isElementPresent(element);
        if (status == false) {
            Assert.assertFalse(status, "Element not displayed");
        } else {

            Assert.assertFalse(status, "Element is displayed");
        }
    }

    // check whether provided webelement is disabled , if not testcase will fail
    public static void assertWebElementIsDisabled(WebElement element) {
        boolean status = element.isEnabled();
        if (status == false) {
            Assert.assertFalse(status, "Element is disabled");
        } else {
            Assert.assertFalse(status, "Element is enabled");
        }
    }

    // Scroll down the page using JavaScript Executor
    public static void scrollDownUsingPixelValue() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)", "");
    }

    // Method will wait untill all the webelements is visible
    public static void waitForVisibilityOfAllWebElement(List<WebElement> element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }

    // Accepts WebElement as parameter and perform click operation
    public static void clickUsingJavaScriptExecutor(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    // Assign String Parameter value to WebElement and it will form as WebElement and perform isElement Assertion on it
    public static void assertWebElementAsString(String xpathValue) throws InterruptedException {
        UtilityFunctions.threadSleep(8000);
        WebElement element = driver.findElement(By.xpath(xpathValue));
        UtilityFunctions.validatIsElementPresent(element, "Element not disalyed");
        Listeners.addLogs("Element verified" + xpathValue);
    }

    // Scroll up the page using JavaScript
    public static void scrollUpUsingPixelValue() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-350)", "");
    }

    // Perform Enter Key operation on given WebElement
    public static void pressEnterKeyOnWebElement(WebElement element) {
        // element.sendKeys(Keys.ENTER);
        element.sendKeys(Keys.RETURN);
    }

    // Get the testdata property file path as string based on the environmentsetup in config property
    public static String getProperyFilePath() throws IOException {
        String path = System.getProperty("user.dir") + "//Config//SunbirdConfig.Properties";
        FileInputStream fis = new FileInputStream(path);
        Properties pro = new Properties();
        pro.load(fis);

        String Env = pro.getProperty("EnvironmentSetup");
        String path2 = "";
        if (Env.equalsIgnoreCase("STAGING")) {
            return path2 = System.getProperty("user.dir") + "//Config//SunbirdStaging.Properties";

        } else if (Env.equalsIgnoreCase("PREPROD")) {

            return path2 = System.getProperty("user.dir") + "//Config//SunbirdPreProd.Properties";

        } else if (Env.equalsIgnoreCase("Prod")) {
            return path2 = System.getProperty("user.dir") + "//Config//SunbirdProd.Properties";

        } else if (Env.equalsIgnoreCase("OCI")) {
            return path2 = System.getProperty("user.dir") + "//Config//SunbirdOCI.Properties";

        }
        return path2;
    }

    // Get the testdata property file path as string based on the environmentsetup in config property
    public static String getWriteProperyFilePath() throws IOException {
        String path = System.getProperty("user.dir") + "//Config//SunbirdConfig.Properties";
        FileInputStream fis = new FileInputStream(path);
        Properties pro = new Properties();
        pro.load(fis);

        String Env = pro.getProperty("EnvironmentSetup");
        String path2 = "";
        if (Env.equalsIgnoreCase("STAGING")) {
            return path2 = System.getProperty("user.dir") + "//Config//WriteSunbirdStagingData.Properties";

        } else if (Env.equalsIgnoreCase("PREPROD")) {

            return path2 = System.getProperty("user.dir") + "//Config//SunbirdPreProd.Properties";

        } else if (Env.equalsIgnoreCase("Prod")) {
            return path2 = System.getProperty("user.dir") + "//Config//SunbirdProd.Properties";

        } else if (Env.equalsIgnoreCase("OCI")) {
            return path2 = System.getProperty("user.dir") + "//Config//WriteSunbirdOCIdata.Properties";

        }
        return path2;
    }

 // Generate xpath using contains approach by accepting string as parameter and return finalXpath
    public static String generateXpathUsingContainsWithKeyNameValue(String keynameValue) {
        String firstXpath = "//*[contains(text(),'";
        String thirdXpath = "')]";
        String finalXpath = firstXpath + keynameValue + thirdXpath;
        return finalXpath;
    }

    // Generate xpath using provided attributeName and string value return finalXpath
    public static String generateXpathUsingAttributeNameAndKeynameValue(String attributeName, String keynameValue) {
        String finalXpath = "//*[@" + attributeName + "='" + keynameValue + "']";
        return finalXpath;
    }
    public static String getRandomString(int num) {
        return RandomStringUtils.randomAlphabetic(num).toLowerCase();
    }
    public static void clearPlaceHolderTxt(WebElement element) {
        element.clear();
    }
    // Switch the frame using iframe name
    public static void switchFrameUsingName() throws InterruptedException {

        WebElement iframe = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iframe);
    }

    // Method will wait untill the given webElement is clickable untill the provided duration
    public static void waitForElementToBeClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    // Method will accepts webElement and MaxAttempt as parameter and wait untill the MaxAttempt get over in for-loop and handle all exception in catch block
    public static void waitForElementUsingForLoopAndAssert(WebElement element, int maxAttempt) {
        for (int i = 0; i < maxAttempt; i++) {
            try {
                validatIsElementPresent(element, "element is not Displayed");
                break;
            } catch (Exception e) {

            }
        }
    }

    // Method will accepts webElement and MaxAttempt as parameter and wait untill the MaxAttempt get over in for-loop and handle StaleElementReferenceException in catch block
    public static void waitForElementUsingForLoop(WebElement element, int maxAttempt) {
        for (int i = 0; i < maxAttempt; i++) {
            try {
                validatIsElementPresent(element, "element is not Displayed");
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    // Method will accepts webElement and MaxAttempt as parameter and wait untill the MaxAttempt get over in for-loop and handle StaleElementReferenceException in catch block
    public static void waitForElementUsingForLoopCondition(WebElement element, int maxAttempt) {
        for (int i = 0; i < maxAttempt; i++) {
            try {
                waitForElementIsVisible(element);
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    // Method will switch the frame using webElement
    public static void switchToFrameUsingXpath(WebElement element) throws InterruptedException {
        // WebElement iframe = driver.findElement(By.xpath(element));
        driver.switchTo().frame(element);
    }

    // Method will switch the frame using Xpath
    public static void switchFrameUsingXpath() throws InterruptedException {
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='iziModal-iframe']"));
        driver.switchTo().frame(iframe);
    }

    // Method will return today's date in String format
    public static String getTodayDate(String pattern) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime now = LocalDateTime.now();
        String todayDate = dtf.format(now);
        return todayDate;
    }

    // Method will return future's date in String format by getting daycount as parameter
    public static String getFutureDate(int dayCount) {
        LocalDate today = LocalDate.now();
        String futureDate = (today.plusDays(dayCount)).format(DateTimeFormatter.ISO_DATE);
        return futureDate;
    }

   // Method accepts string as parameter and extract number from that string and return extracted number in return
    public static int extractNumberFromString(String data) {
        int value = Integer.parseInt(data.replaceAll("[^0-9]", ""));
        return value;
    }

    // Method will compare and assert given two number is same, if not assertion will fail
    public static void numberValueComparision(int actual, int expected, String Msg) {
        Assert.assertEquals(actual, expected, Msg);

    }

    // Method will click on browser back button
    public static void backButtonInBrowser() {

        driver.navigate().back();
    }

    // Method will accept the alert popup in browser
    public static void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    // Method will switch to default content frame
    public static void switchToDefaultContentFrame() {

        driver.switchTo().defaultContent();
    }

    // Method will accept webElement and attribute name  as parameter and return the attribute value
    public static String getAttributeValue(WebElement element, String attributeName) {
        String attributeValue = element.getAttribute(attributeName);
        return attributeValue;
    }

    // Method will wait untill the frame is available and then it switch frame to the provided webElement
    public static void waitForFrameToBeAvailable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));

    }

    // Method will accepts encoded string as parameter and decode the encoded string and return the decoded string
    public static String decodeString(String pass) {
        byte[] decodedBytes = Base64.getDecoder().decode(pass.getBytes());
        return new String(decodedBytes);
    }

    // Method will return the size of the Provided ListWebElement
    public static int getSizeOfWebElement(List<WebElement> element) {

        int elementsize = element.size();
        return elementsize;

    }

    // Method will refresh the browserPage
    public static void refreshPage() {
        driver.navigate().refresh();
    }

    // Method will return the colorvalue as string of the provided WebElement
    public static String getColorValue(WebElement element) {
        String getActualColor = element.getCssValue("color");
        String actualColor = Color.fromString(getActualColor).asHex();
        return actualColor;
    }

   // Method will mouseHover on the Given WebElement and perform the click on webElement
    public static void mouseHoverOnElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.click().build().perform();
    }

    // Method will wait untill the given seconds in parameter
    public static void threadSleep(int seconds) throws InterruptedException {
        Thread.sleep(seconds);
    }

    // Method will return system downloadPath in string format
    public static String getSystemDownloadPath() {
        String home = System.getProperty("user.home");
        File downloadPath = new File(home + "/Downloads/");
        String systemDownloadPath = downloadPath.toString();
        return systemDownloadPath;
    }

    // Method will return latest downloaded fileName from system downloadPath by accepting the directoryFilePath as parameter
    public static File getLatestDownloadedFile(String directoryFilePath) {
        File directory = new File(directoryFilePath);
        File[] files = directory.listFiles(File::isFile);
        long lastModifiedTime = Long.MIN_VALUE;
        File chosenFile = null;

        if (files != null) {
            for (File file : files) {
                if (file.lastModified() > lastModifiedTime) {
                    chosenFile = file;
                    lastModifiedTime = file.lastModified();
                }
            }
        }

        return chosenFile;
    }



    /* This method will handle the BMC popup in onboarding flow */
    public static void dynamicElementHandlingForMatSelectTagname() throws InterruptedException {
        OnBoarding onboard = PageFactory.initElements(driver, OnBoarding.class);
        // driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

//        if (document. readyState === 'complete') { d }

        // Thread.sleep(5000);
//onboard.matOp();

    /*    try {
            UtilityFunctions.waitForVisibilityOfWebElement(onboard.matOp());
        }
        catch(Exception e)
        {
            System.out.println("Handled");

        }*/
        UtilityFunctions.waitDocumentToLoad();
        List<WebElement> elements = onboard.ckDropdownmain();

        System.out.println("element found" + elements.size());
        int totalCount = elements.size();


        for (int i = 0; i < totalCount; i++) {

            String dropdownXpath = "//*[contains(text(),'To discover relevant content update the following details:')]//following::mat-select[";
            int val = i;
            String xpathClose = "]";
            String dropdownValueXpath = "//following::mat-option";
            //    Thread.sleep(3000);
            UtilityFunctions.waitDocumentToLoad();
            onboard.ckDropdown(val);
            UtilityFunctions.waitDocumentToLoad();

            // elements.get(i).click();
            //    driver.findElement(By.xpath(dropdownXpath+val+xpathClose)).click();
            // Thread.sleep(1000);
            int val2 = val + 1;
            WebElement d = driver.findElement(By.xpath(dropdownXpath + val2 + xpathClose + dropdownValueXpath));
            //  UtilityFunctions.waitForElementAndClickable(d);
            UtilityFunctions.waitForElementUsingForLoopAndAssert(d, 5);
            UtilityFunctions.waitForElementAndClickable(d);
            //   driver.findElement(By.xpath(dropdownXpath+val2+xpathClose+dropdownValueXpath)).click();
            UtilityFunctions.MoveByOffSet(50, 100);
            int totalCount2 = elements.size();
            totalCount = totalCount2;
            System.out.println(totalCount);
        }
        // Thread.sleep(2000);


    }


    public static void waitDocumentToLoad() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until((ExpectedCondition<Boolean>) wd ->
                ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));

    }


    /* This method will handle the BMC popup in onboarding flow */
    public static void dynamicElementHandlingForMatSelectTagname2() throws InterruptedException {
        OnBoarding onboard = PageFactory.initElements(driver, OnBoarding.class);

        UtilityFunctions.waitDocumentToLoad();
        List<WebElement> elements = onboard.ckDropdownmain();
        System.out.println("element found" + elements.size());
        int totalCount = elements.size();
        for (int i = 0; i < totalCount; i++) {
            String dropdownXpath = "//*[contains(text(),'To discover relevant content update the following details:')]//following::mat-select[";
            int val = i;
            String xpathClose = "]";
            String dropdownValueXpath = "//following::mat-option";
            UtilityFunctions.waitDocumentToLoad();
            onboard.ckDropdown(val);
            UtilityFunctions.waitDocumentToLoad();
            int val2 = val + 1;
            WebElement d = driver.findElement(By.xpath(dropdownXpath + val2 + xpathClose + dropdownValueXpath));
            UtilityFunctions.waitForElementUsingForLoopAndAssert(d, 5);
            UtilityFunctions.waitForElementAndClickable(d);
            UtilityFunctions.MoveByOffSet(50, 100);
            int totalCount2 = elements.size();
            totalCount = totalCount2;
            System.out.println(totalCount);
        }
    }


    /* This method will handle the BMC popup in onboarding flow */
    public static void dynamicElementHandlingForMatSelectTagname3() throws InterruptedException {
        OnBoarding onboard = PageFactory.initElements(driver, OnBoarding.class);
        Thread.sleep(5000);

        //  UtilityFunctions.waitJAv();
        List<WebElement> elements = onboard.ckDropdownmain();

        System.out.println("element found" + elements.size());
        int totalCount = elements.size();
        for (int i = 0; i < totalCount; i++) {
            String dropdownXpath = "//*[contains(text(),'To discover relevant content update the following details:')]//following::mat-select[";
            int val = i;
            String xpathClose = "]";
            String dropdownValueXpath = "//following::mat-option";
            Thread.sleep(1000);
            onboard.ckDropdown(val);
            // elements.get(i).click();
            //    driver.findElement(By.xpath(dropdownXpath+val+xpathClose)).click();
            Thread.sleep(1000);
            int val2 = val + 1;
            WebElement d = driver.findElement(By.xpath(dropdownXpath + val2 + xpathClose + dropdownValueXpath));
            UtilityFunctions.waitForElementAndClickable(d);
            //   driver.findElement(By.xpath(dropdownXpath+val2+xpathClose+dropdownValueXpath)).click();
            UtilityFunctions.MoveByOffSet(50, 100);
            int totalCount2 = elements.size();
            totalCount = totalCount2;

        }
        Thread.sleep(2000);
    }


    /* This method will handle the BMC popup in onboarding flow */
    public static void dynamicElementHandlingForSelectTagname3() throws InterruptedException {
        OnBoarding onboard = PageFactory.initElements(driver, OnBoarding.class);
        Thread.sleep(5000);

        //  UtilityFunctions.waitJAv();
        List<WebElement> elements = onboard.selectDropdowns();

        System.out.println("element in editor" + elements.size());
        int totalCount = elements.size();
        for (int i = 1; i < totalCount; i++) {

            String dropdownXpath = "(//select)[";
            int val = i;
            String xpathClose = "]";
            String dropdownValueXpath = "//following::option";
            Thread.sleep(2000);
            onboard.clkSelectDropdown(val);
            // elements.get(i).click();
            //    driver.findElement(By.xpath(dropdownXpath+val+xpathClose)).click();
            Thread.sleep(2000);
            int val2 = val + 1;
            WebElement d = driver.findElement(By.xpath(dropdownXpath + val2 + xpathClose + dropdownValueXpath));
            UtilityFunctions.waitForElementAndClickable(d);
            //   driver.findElement(By.xpath(dropdownXpath+val2+xpathClose+dropdownValueXpath)).click();
            //  int totalCount2=elements.size();
            //   totalCount=totalCount2;

        }
        Thread.sleep(2000);
    }

    /* This method will handle the BMC popup in onboarding flow */
    public static void dynamicElementHandlingForUlTagName() throws InterruptedException {
        OnBoarding onboard = PageFactory.initElements(driver, OnBoarding.class);
        Thread.sleep(5000);

        //  UtilityFunctions.waitJAv();
        List<WebElement> elements = onboard.UlTagnameElements();

        System.out.println("element in editor" + elements.size());
        int totalCount = elements.size();
        for (int i = 5; i < totalCount; i++) {

            String dropdownXpath = "(//lib-meta-form)//following::ul[";
            int val = i;
            String xpathClose = "]";
            String dropdownValueXpath = "//following::label";
            Thread.sleep(2000);
            WebElement d2 = driver.findElement(By.xpath(dropdownXpath + val + xpathClose));
            UtilityFunctions.waitForElementAndClickable(d2);
            System.out.println(d2);
            //   onboard.clkSelectDropdown(val);
            Thread.sleep(2000);
            WebElement d = driver.findElement(By.xpath(dropdownXpath + val + xpathClose + dropdownValueXpath));
            UtilityFunctions.waitForElementAndClickable(d);
            System.out.println(d);
            int i2 = i + 1;
            i = i2;

        }
        Thread.sleep(2000);
    }

    public static void dynamicElementHandlingForUlTagName6() throws InterruptedException {
        OnBoarding onboard = PageFactory.initElements(driver, OnBoarding.class);
        Thread.sleep(5000);

        //  UtilityFunctions.waitJAv();
        List<WebElement> elements = onboard.UlTagnameElements();

        System.out.println("element in editor" + elements.size());
        int totalCount = elements.size();
        int recount = totalCount + 2;
        totalCount = recount;
        System.out.println("TotalCount" + totalCount);

        for (int i = 5; i < totalCount; i++) {

            try {
                String dropdownXpath = "(//lib-meta-form)//following::ul[";
                int val = i;
                String xpathClose = "]";
                String dropdownValueXpath = "//following::label";
                Thread.sleep(2000);
                WebElement d2 = driver.findElement(By.xpath(dropdownXpath + val + xpathClose));
                UtilityFunctions.waitForElementAndClickable(d2);
                System.out.println(d2);
                //   onboard.clkSelectDropdown(val);
                Thread.sleep(2000);
                WebElement d = driver.findElement(By.xpath(dropdownXpath + val + xpathClose + dropdownValueXpath));
                UtilityFunctions.waitForElementAndClickable(d);
                System.out.println(d);
                int i2 = i + 1;
                i = i2;
            } catch (Exception e) {
                System.out.println("Exception handled");

            }

        }
        Thread.sleep(2000);
    }

    public static void dynamicElementHandlingForUlTagName7() throws InterruptedException {
        OnBoarding onboard = PageFactory.initElements(driver, OnBoarding.class);
        Thread.sleep(5000);

        //  UtilityFunctions.waitJAv();
        List<WebElement> elements = onboard.UlTagnameElements();

        System.out.println("element in editor" + elements.size());
        int totalCount = elements.size();
        int recount = totalCount + 2;
        totalCount = recount;
        System.out.println("TotalCount" + totalCount);

        for (int i = 1; i < totalCount; i++) {

            try {
                String dropdownXpath = "(//lib-meta-form)//following::ul[";
                int val = i;
                String xpathClose = "]";
                String dropdownValueXpath = "//following::label";
                Thread.sleep(2000);
                WebElement d2 = driver.findElement(By.xpath(dropdownXpath + val + xpathClose));
                UtilityFunctions.waitForElementAndClickable(d2);
                System.out.println(d2);
                //   onboard.clkSelectDropdown(val);
                Thread.sleep(2000);
                WebElement d = driver.findElement(By.xpath(dropdownXpath + val + xpathClose + dropdownValueXpath));
                UtilityFunctions.waitForElementAndClickable(d);
                System.out.println(d);
                int i2 = i + 1;
                i = i2;
            } catch (Exception e) {
                System.out.println("Exception handled");

            }

        }
        Thread.sleep(2000);
    }

    public static void dynamicElementHandlingForUlTagName8() throws InterruptedException {
        OnBoarding onboard = PageFactory.initElements(driver, OnBoarding.class);
        Thread.sleep(5000);

        //  UtilityFunctions.waitJAv();
        List<WebElement> elements = onboard.UlTagnameElements();

        System.out.println("element in editor" + elements.size());
        int totalCount = elements.size();
        int recount = totalCount + 4;
        totalCount = recount;
        System.out.println("TotalCount" + totalCount);

        for (int i = 1; i < totalCount; i++) {
            System.out.println(i);
            try {
                String dropdownXpath = "(//lib-meta-form)//following::ul[";
                int val = i;
                String xpathClose = "]";
                String dropdownValueXpath = "//following::label";
                Thread.sleep(2000);
                WebElement d2 = driver.findElement(By.xpath(dropdownXpath + val + xpathClose));
                UtilityFunctions.scrollInToviewUsingJavaScript(d2);
                UtilityFunctions.waitForElementInShortSpanAndClickable(d2);
                System.out.println(d2);
                //   onboard.clkSelectDropdown(val);
                Thread.sleep(2000);
                WebElement d = driver.findElement(By.xpath(dropdownXpath + val + xpathClose + dropdownValueXpath));
                UtilityFunctions.waitForElementInShortSpanAndClickable(d);
                System.out.println(d);
                int i2 = i + 1;
                i = i2;
            } catch (Exception e) {
                System.out.println("Exception handled");

            }

        }
        Thread.sleep(2000);
    }
}
