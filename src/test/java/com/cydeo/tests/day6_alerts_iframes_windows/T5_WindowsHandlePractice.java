package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T5_WindowsHandlePractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //3. Go to:  https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows ");

    }

    @Test
    public void multiple_Window_test(){

        String mainHandle = driver.getWindowHandle();
        String expectedTitle = "Windows";
        String actualTitle =driver.getTitle();
        System.out.println(expectedTitle);
        System.out.println("actual title = "+actualTitle);


        //4. Assert: Title is “Windows”
        Assert.assertTrue(actualTitle.equals(expectedTitle));

        //5. Click to: “Click Here” link
        WebElement click = driver.findElement(By.xpath("//a[.='Click Here']"));

        click.click();
        Set<String> allWindowHandles = driver.getWindowHandles();

        //6. Switch to new Window.
        for (String each: driver.getWindowHandles())
        {
            driver.switchTo().window(each);
            System.out.println("current title while switching windows: " +driver.getTitle());
        }
        //7. Assert: Title is “New Window”

        actualTitle =driver.getTitle();
        System.out.println("actual title = "+actualTitle);

        //If we want to go back to main page, we can use already stored main handle;
        //driver.switchTo().window(mainHandle);
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
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