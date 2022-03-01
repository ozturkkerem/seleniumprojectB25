package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDownPractices {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }


    @Test
    public void dropdown_task5(){

        Select stateDropDown= new Select(driver.findElement(By.xpath("//select[@id='state']")));
        stateDropDown.selectByValue("IL");
        stateDropDown.selectByVisibleText("Virginia");
        stateDropDown.selectByIndex(5);

        String expectedOptionText = "California";
        String actualOptionText = stateDropDown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOptionText,expectedOptionText);

        List <WebElement> list = stateDropDown.getOptions();

        for (WebElement each : list) {

            System.out.println(each.getText());
        }



/*
TC #5: Selecting state from State dropdown and verifying result
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown
3. Select Illinois
4. Select Virginia
5. Select California
6. Verify final selected option is California.
Use all Select options. (visible text, value, index)  */
    }

    @Test
    public void dropdown_task6(){
        //Select “December 1st, 1923” and verify it is selected.
        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        yearDropdown.selectByVisibleText("1923");
        monthDropdown.selectByValue("11");
        dayDropdown.selectByIndex(0);

        String expectedYear = "1923";
        String expectedMonth = "December";
        String expectedDay = "1";

        //Select year using  : visible text
        //Select month using   : value attribute
        //Select day using : index number

        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualDay,expectedDay);
        Assert.assertEquals(actualMonth,expectedMonth);
        Assert.assertTrue(actualYear.equals(expectedYear));


        /*

TC #6: Selecting date on dropdown and verifying
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select “December 1st, 1923” and verify it is selected.


         */
    }
}


