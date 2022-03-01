package com.cydeo.tests.day5_testNg_Intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {
    WebDriver driver;


    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver();
        driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }


    @Test
    public void selenium_test(){

        //Get "https://google.com
        driver.get("https://google.com");
        String actualTitle = driver.getTitle();
        String expectedTitle ="Google";

        //Assert: title is "Google"
        Assert.assertEquals(expectedTitle,actualTitle, "It is working");

        //Assert.assertEquals(driver.getTitle(),"Google", "Title is not matching");
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }

}
