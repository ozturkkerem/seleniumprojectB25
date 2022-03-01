package com.cydeo.tests.practice.Adam;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC5 {
    public static void main(String[] args) {
        /*
        TC:5 As a user I should be able to see the login page
        //1-open a chrome browser
         //2-goto https://vytrack.com/
        //3-click Login label
        //4-verify the url contains login
         */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://vytrack.com/");

        //WebElement logInButton = driver.findElement(By.cssSelector("a[href='http://app.vytrack.com']"));
        WebElement logInButton2 = driver.findElement(By.xpath("//a[.='LOGIN']"));
                                        //("//h2[.='Forgot Password']")
        logInButton2.click();
        String expectedUrl = "login";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl))
            System.out.println("Url contain 'login' test PASSED ");
            else System.out.println("Url does not contain login, test FAILED");
    }
}
