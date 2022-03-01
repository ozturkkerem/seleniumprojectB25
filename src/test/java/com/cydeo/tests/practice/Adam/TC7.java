package com.cydeo.tests.practice.Adam;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC7 {
    public static void main(String[] args) throws InterruptedException {
        /*
        TC:7 As a user I should be able to see User is John Doe
 //1-open a chrome browser
 //2-goto https://vytrack.com/
 //3-click Login label
 //4-enter username "User1"
 //5-enter password "UserUser123"
 //6-click LOG IN
 //7-verify the user John Doe
         */
        WebDriver driver = WebDriverFactory.getDriver();
        driver.manage().window().maximize();
        driver.get("https://vytrack.com/");
        WebElement loginButton = driver.findElement(By.cssSelector("a[href='http://app.vytrack.com']"));
        loginButton.click();

        WebElement username = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        username.sendKeys("User1");
        password.sendKeys("UserUser123");

        // This log in button for summiting username
        WebElement loginButtonEnter = driver.findElement(By.cssSelector("button[id='_submit']"));
        loginButtonEnter.click();

        WebElement user = driver.findElement(By.cssSelector("a[class='dropdown-toggle']"));
        System.out.println(user.getText());
        if (user.getText().contains("John Doe")){
            System.out.println("The user is John Doe");
        }else {
            System.out.println("The user is not John Doe");
        }



    }
}
