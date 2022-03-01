package com.cydeo.tests.day6_alerts_iframes_windows.Practices;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T5_Windows_Handle {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void windowsTab(){

        WebElement clickButton = driver.findElement(By.xpath("//a[.='Click Here']"));

        Assert.assertEquals(driver.getTitle(),"Windows","THe title is not match");


        clickButton.click();

        Set <String> set = driver.getWindowHandles();

        for (String each : set) {
            driver.switchTo().window(each);
            System.out.println("the tab is changing = " + each);
        }

        Assert.assertEquals(driver.getTitle(),"New Window", "the title is not match for new window");
    }



}

/*
TC #5: Window Handle practice

1. Create a new class called: T5_WindowsPractice
2. Create new test and make set ups
3. Go to : https://practice.cydeo.com/windows
4. Assert: Title is “Windows”
5. Click to: “Click Here” link
6. Switch to new Window.
7. Assert: Title is “New Window”
 */