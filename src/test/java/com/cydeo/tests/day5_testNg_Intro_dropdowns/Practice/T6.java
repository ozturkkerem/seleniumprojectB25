package com.cydeo.tests.day5_testNg_Intro_dropdowns.Practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T6 {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver();
        //driver.manage().window().maximize();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test(){
        //driver.manage().window().fullscreen();
        driver.get("https://practice.cydeo.com/dropdown");
        Select dropDownYear = new Select(driver.findElement( By.xpath ("//select[@id='year']")));
        Select dropDownMonth = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dropDownDay = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        dropDownYear.selectByVisibleText("1923");
        dropDownMonth.selectByValue("1");
        dropDownDay.selectByIndex(1);












    }




}


/*
TC #6: Selecting date on dropdown and verifying
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select “December 1st, 1923” and verify it is selected.
Select year using  : visible text
Select month using   : value attribute
Select day using : index number
 */