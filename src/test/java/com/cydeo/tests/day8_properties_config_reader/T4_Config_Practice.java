package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Config_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        String browser = ConfigurationReader.getProperty("browser");

        driver = WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.com");
    }

    @Test
    public void google_search_test(){
        //3- Write “apple” in search box

        WebElement googleSearchBox =driver.findElement(By.xpath("//input[@name='q']"));

        //4- Verify title:
        //Expected: apple - Google Search
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);

        String expectedTitle = "apple - Google Search";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }


}
