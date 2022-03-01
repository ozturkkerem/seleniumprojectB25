package com.cydeo.tests.practice.Adam;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC4 {
    public static void main(String[] args) {
    /*
    TC:4 As a user I should be able to see Login is displayed
 //1-open a chrome browser
 //2-goto https://vytrack.com/
 //3-verify Login is displayed
     */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //https://vytrack.com/
        driver.get("https://vytrack.com/"); //"//a[@ href='https://vytrack.com/contact/']"))

        WebElement loginButtonX = driver.findElement(By.xpath("//a[@href='http://app.vytrack.com']"));
        WebElement loginButton = driver.findElement(By.cssSelector("a[href='http://app.vytrack.com']"));
        //loginButton.click();
        //driver.navigate().back();
        loginButtonX.click();




    }
}
