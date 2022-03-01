package com.cydeo.tests.nextBaseCrm;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginFunction {

// 1 TC for login
    /*
    * 1- go to login page
    * 2-write username
    * 3-write password
    * 4-click login button
    */

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
       driver =  WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //1- go to login page
        driver.get(ConfigurationReader.getProperty("env"));
    }


    @AfterMethod
    public void tearDown() {
        BrowserUtils.sleep(3);
        driver.close();
    }


    //Positive scenario //HRUsername1
    @Test
    public void login_with_valid_credentials_with_login_btn(){
       //2-write username
        WebElement userName = driver.findElement(By.xpath("(//input[@class='login-inp'])[1]"));
        userName.sendKeys(ConfigurationReader.getProperty("HRUsername1"));

        //3-write password
        WebElement password = driver.findElement(By.xpath("(//input[@class='login-inp'])[2]"));
        password.sendKeys(ConfigurationReader.getProperty("password"));

        //4-click login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        BrowserUtils.sleep(1);
        loginBtn.click();

        // verify title
        String expectedTitle = "Portal";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

    }






    //Negative Scenario
    @Test
    public void login_with_valid_username_invalid_password(){
        //2-write username
        WebElement userName = driver.findElement(By.xpath("(//input[@class='login-inp'])[1]"));
        userName.sendKeys(ConfigurationReader.getProperty("username"));

        //3-write password
        WebElement password = driver.findElement(By.xpath("(//input[@class='login-inp'])[2]"));
        password.sendKeys("abcd");

        //4-click login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        BrowserUtils.sleep(1);
        loginBtn.click();

        // verify error message
        String expectedErrorTitle = "Incorrect login or password";
        String actualTitle = driver.findElement(By.xpath("//div[@class='errortext']")).getText();
        Assert.assertEquals(actualTitle,expectedErrorTitle);

    }

    //Negative scenario
    @Test
    public void login_with_invalid_username(){
        //2-write username
        WebElement userName = driver.findElement(By.xpath("(//input[@class='login-inp'])[1]"));
        userName.sendKeys("helSD643esk1@cydeo.com");

        //3-write password
        WebElement password = driver.findElement(By.xpath("(//input[@class='login-inp'])[2]"));
        password.sendKeys(ConfigurationReader.getProperty("password"));

        //4-click login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        BrowserUtils.sleep(1);
        loginBtn.click();

        // verify error message
        String expectedErrorTitle = "Incorrect login or password";
        String actualTitle = driver.findElement(By.xpath("//div[@class='errortext']")).getText();
        Assert.assertEquals(actualTitle,expectedErrorTitle);


    }



}
