package com.cydeo.tests.practice.Adam;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC8 {
    public static void main(String[] args) {

        /*
        //1-open a chrome browser
 //2-goto https://app.seamlessly.net/index.php/login
 //3-enter password "UserUser123"
 //4-verify password as "*****"
 //5-click eye icon
 //6-verify that password is shown
         */
        WebDriver driver = WebDriverFactory.getDriver();
        driver.manage().window().maximize();
        driver.get("https://app.seamlessly.net/index.php/login");

        WebElement usernameBox = driver.findElement(By.cssSelector("input[id='user']"));
        WebElement passwordBox = driver.findElement(By.xpath("//input[@id='password']"));

        usernameBox.sendKeys("UserUser123");
        passwordBox.sendKeys("UserUser123");

        if (passwordBox.getAttribute("type").equals("password"))
            System.out.println("Password is ***** PASSED");
        else System.out.println("FAIL");

        WebElement eyesOnLogin = driver.findElement(By.xpath("a[class='toggle-password']"));
        eyesOnLogin.click();
    }
}
