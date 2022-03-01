package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_Locators_getText {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.yahoo.com/");
        WebElement element = driver.findElement(By.cssSelector("class[for='_yb_1ctza _yb_1i1c7  _yb_1821u  _yb_5j86l  ']"));
        element.click();


    }
}


