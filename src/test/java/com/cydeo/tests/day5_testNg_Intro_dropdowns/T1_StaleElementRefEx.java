package com.cydeo.tests.day5_testNg_Intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StaleElementRefEx {

    public static void main(String[] args) {
//1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//2. Go to https://practice.cydeo.com/add_remove_elements/
            driver.get("https://practice.cydeo.com/add_remove_elements/");

//3. Click to “Add Element” button

        WebElement addElement = driver.findElement(By.xpath("//button[@onclick='addElement()']"));

        addElement.click();
//4. Verify “Delete” button is displayed after clicking.

        WebElement deleteButton = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
        System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
//5. Click to “Delete” button.
        deleteButton.click();

//6. Verify “Delete” button is NOT displayed after clicking.


       try{
           System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
       }catch (StaleElementReferenceException e) {
           System.out.println("Stale LElement Reference Exception");
           System.out.println("This mean web element complitly");
       }
    }


}


/*
XPATH PRACTICES
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #1: StaleElementReferenceException handling
1. Open Chrome browser
2. Go to https://practice.cydeo.com/add_remove_elements/
3. Click to “Add Element” button
4. Verify “Delete” button is displayed after clicking.
5. Click to “Delete” button.
6. Verify “Delete” button is NOT displayed after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

 */