package com.cydeo.tests.day5_testNg_Intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T2_RadioButton {
    public static void main(String[] args) {

        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/radio_buttons

        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement hockeyRadioBtn = driver.findElement(By.xpath("//input[@id='hockey']"));
        //3. Click to “Hockey” radio button
        hockeyRadioBtn.click();

        //4. Verify “Hockey” radio button is selected after clicking.

        if (hockeyRadioBtn.isSelected())
            System.out.println("Button is selected. Verification PASSED!");
        else {
            System.out.println("Button is not selected. Verification FAILED!!!");
        }
    }
}

/*
XPATH PRACTICES
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #2: Radiobutton handling


4. Verify “Hockey” radio button is selected after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
 */
