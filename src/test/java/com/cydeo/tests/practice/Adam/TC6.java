package com.cydeo.tests.practice.Adam;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC6 {
    public static void main(String[] args) {
        /*
        TC:6 As a user I should be able to see the password as
"*******"
 //1-open a chrome browser
 //2-goto https://vytrack.com/
 //3-click Login label
 //4-enter username "User1"
 //5-enter password "UserUser123"
 //6-verify the password is hidden
         */
        WebDriver driver = WebDriverFactory.getDriver();
        driver.manage().window().maximize();
        driver.get("https://vytrack.com/");
       // WebElement loginButton = driver.findElement(By.cssSelector("a[href='http://app.vytrack.com']"));
        WebElement loginButton = driver.findElement(By.xpath("//a[@href='http://app.vytrack.com']"));
        loginButton.click();
        WebElement userName= driver.findElement(By.cssSelector("input[id='prependedInput']"));
        userName.sendKeys("User1");
        WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        password.sendKeys("UserUser123");

        String passwordType = password.getAttribute("type");

        System.out.println(passwordType);

        if (passwordType.equals("password"))
            System.out.println("PASSED");
        else System.out.println("FAIL");

    }
}
