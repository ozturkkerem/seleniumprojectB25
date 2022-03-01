package com.cydeo.tests.practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Challenge2 {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/");

    }

    @Test
    public void swagLabs() throws InterruptedException {
        //Find the username input and send the value
        WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username' and @id='user-name']"));
        userName.sendKeys("standard_user");
        //Find the Password section and send the password
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        //Click to log in button
        WebElement clickButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        clickButton.click();

        //Products
        WebElement backpack = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        WebElement bikeLight = driver.findElement(By.xpath("//div[.='Sauce Labs Bike Light']"));
        WebElement t_shirt= driver.findElement(By.xpath("//div[.='Sauce Labs Bolt T-Shirt']"));
        WebElement fleeceJacket = driver.findElement(By.xpath("//div[.='Sauce Labs Fleece Jacket']"));
        WebElement oneSie = driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']"));
        WebElement t_shirtRed = driver.findElement(By.xpath("//div[text()='Test.allTheThings() T-Shirt (Red)']"));

        //Click short list


        Select select = new Select(driver.findElement(By.xpath("//select[@data-test='product_sort_container']")));
        Thread.sleep(2000);
        select.selectByValue("za");
        Thread.sleep(2000);
        select.selectByValue("lohi");
        Thread.sleep(2000);
        select.selectByValue("hilo");



    }

}
