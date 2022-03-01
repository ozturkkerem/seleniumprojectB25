package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class practiceYahoo {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.yahoo.com/");

        WebElement shoppingButton = driver.findElement(By.cssSelector("a[id='root_8']"));
        shoppingButton.click();

      //  WebElement searchBox = driver.findElement(By.cssSelector())


    }

}
