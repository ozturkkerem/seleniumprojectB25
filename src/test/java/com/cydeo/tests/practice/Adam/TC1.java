package com.cydeo.tests.practice.Adam;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC1 {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://vytrack.com/");
        WebElement home = driver.findElement(By.cssSelector("a[aria-current='page']"));
        home.click();
        //WebElement home2 = driver.findElement(By.xpath("//a[@href='https://vytrack.com/']"));
       // home.getText();
        String xxx = home.getText();
        System.out.println(xxx);

        System.out.println(home.getText());
    }


}


/*
WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

 TC:1 As a user I should be able to see Home is displayed
 //1-open a chrome browser
 //2-goto https://vytrack.com/
 //3-verify Home is displayed

 */
