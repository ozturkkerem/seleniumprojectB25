package com.cydeo.tests.day5_testNg_Intro_dropdowns.Practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class K2_RadiobuttonHandling {

    WebDriver driver;

    @BeforeClass
    public void setupMethod(){
        driver = WebDriverFactory.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @Test
    public void Test(){
        //2. Go to https://practice.cydeo.com/radio_buttons
         driver.get("https://practice.cydeo.com/radio_buttons");

        //3. 3. Click to “Hockey” radio button
        WebElement element  = driver.findElement(By.xpath("//input[@id='football']"));
        element.click();

        /*
        4. Verify “Hockey” radio button is selected after clicking.
        USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
         */
        Assert.assertTrue(element.isSelected());

      //  List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='sport']"));

        //for (WebElement each : radioButtons) {
          //  String id = each.getAttribute("id");
          //  if (id.equals("hockey"))
            //    each.click();

        }


    }




/*

XPATH PRACTICES
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #2: Radiobutton handling
1. Open Chrome browser
2. Go to https://practice.cydeo.com/radio_buttons
3. Click to “Hockey” radio button
4. Verify “Hockey” radio button is selected after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
 */