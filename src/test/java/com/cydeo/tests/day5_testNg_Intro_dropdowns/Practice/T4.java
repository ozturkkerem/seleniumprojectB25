package com.cydeo.tests.day5_testNg_Intro_dropdowns.Practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4 {

    WebDriver driver;


    @BeforeClass
    public void setupMethod(){
        driver = WebDriverFactory.getDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void test() throws InterruptedException {
        driver.get("https://practice.cydeo.com/dropdown");
    //3. Verify “Simple dropdown” default selected value is correct
        //Expected: “Please select an option”
        Select dropDown= new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        WebElement dropDownFirstSelectedOption = dropDown.getFirstSelectedOption();

        Assert.assertTrue(dropDownFirstSelectedOption.getText().equals("Please select an option"));

        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State”
        Select stateSelection = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        dropDownFirstSelectedOption = stateSelection.getFirstSelectedOption();

        Assert.assertTrue(dropDownFirstSelectedOption.getText().equals("Select a State"));


        stateSelection.selectByVisibleText("Illinois");
        Thread.sleep(2000);
        stateSelection.selectByIndex(2);
        Thread.sleep(2000);
        stateSelection.selectByValue("CA");

    }



}


/*
TC#4: Verifying “Simple dropdown” and “State selection” dropdown
default values
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Verify “Simple dropdown” default selected value is correct
Expected: “Please select an option”
4. Verify “State selection” default selected value is correct
Expected: “Select a State”
3. Select Illinois
4. Select Virginia
5. Select California
6. Verify final selected option is California.
Use all Select options. (visible text, value, index)
 */
