package com.cydeo.tests.adamTask.tc17_02;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Tc1 {

        WebDriver driver;

        @BeforeMethod
        public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        }

        @Test (priority = 1)
        public void testHomeButton(){
          driver.get("https://vytrack.com/");

          //Confirm for Home Button
            WebElement homeButton = driver.findElement(By.xpath("//a[@aria-current='page']"));
            String actualLabel = homeButton.getText();
            Assert.assertEquals(actualLabel,"Home");
        }

        @Test (priority = 2)
        public void testAboutUs(){
            driver.get("https://vytrack.com/");
            WebElement element = driver.findElement(By.xpath("//a[.='About us']"));
            Assert.assertEquals(element.getText(),"About us");
        }

        @Test (priority = 3)
        public void testOurApproach(){
            driver.get("https://vytrack.com/");
            WebElement element = driver.findElement(By.xpath("//a[@href='#']"));
            Assert.assertEquals(element.getText(),"Our Approach");

        }

        @Test (priority = 4)
        public void testProductsAndServices(){
            driver.get("https://vytrack.com/");
            WebElement element = driver.findElement(By.xpath("//a[.='Products and Services']"));
            Assert.assertEquals(element.getText(),"Products and Services");

        }

        @Test (priority = 5)
        public void testContact(){
            driver.get("https://vytrack.com/");
            WebElement element = driver.findElement(By.xpath("//a[@href='https://vytrack.com/contact/']"));
            Assert.assertEquals(element.getText(),"Contact");
        }

        @Test (priority = 6)
        public void testLogin(){
        driver.get("https://vytrack.com/");
        WebElement element = driver.findElement(By.xpath("//a[.='LOGIN']"));
        Assert.assertTrue(element.isDisplayed());
        }


        @AfterMethod
        public void down(){

            driver.close();

        }

    }

    /*
    TC 1- As a user I should be able to see the labels [“Home”,”About us”,”Our
Approach”,”Products and Services”,”Contact”,”LOGIN”]
1- Open a chrome browser
2- Go to “https://vytrack.com/”
3- Verify that [“Home”,”About us”,”Our Approach”,”Products and Services”,”Contact”,”
LOGIN”] is displayed
     */

