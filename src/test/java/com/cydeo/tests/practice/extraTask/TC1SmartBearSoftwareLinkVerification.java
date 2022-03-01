package com.cydeo.tests.practice.extraTask;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC1SmartBearSoftwareLinkVerification {


    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver =  WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //1- go to login page
        //Go to website:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get(ConfigurationReader.getProperty("env1"));
    }

    @Test
    public void find_all_links() {


        //3. Enter username: “Tester”
        WebElement loginInPut = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        loginInPut.sendKeys(ConfigurationReader.getProperty("user1"));
        //4. Enter password: “test”
        WebElement password = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        password.sendKeys(ConfigurationReader.getProperty("password1"));

        //5. Click to Login button
        WebElement loginButton= driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        loginButton.click();
        //6. Print out count of all the links on landing page
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("allLinks.size() = " + allLinks.size());
        for (WebElement each : allLinks) {
            System.out.println("Text of link: " + each.getText());


        }
        //7. Print out each link text on this page
    }

    @Test
    public void find_all_links2() {


        //3. Enter username: “Tester”
        WebElement loginInPut = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        loginInPut.sendKeys(ConfigurationReader.getProperty("user1"));
        //4. Enter password: “test”
        WebElement password = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        password.sendKeys(ConfigurationReader.getProperty("password1"));

        //5. Click to Login button
        WebElement loginButton= driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        loginButton.click();
        //6. Print out count of all the links on landing page
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("allLinks.size() = " + allLinks.size());
        for (WebElement each : allLinks) {
            System.out.println("Text of link: " + each.getText());


        }
        //7. Print out each link text on this page
    }


    @AfterMethod
    public void tearDown() {
        BrowserUtils.sleep(3);
        driver.close();
    }


}
