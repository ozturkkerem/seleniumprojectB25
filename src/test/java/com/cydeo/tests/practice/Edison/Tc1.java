package com.cydeo.tests.practice.Edison;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tc1 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //a. “Home” link
        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement homeLink2 = driver.findElement(By.xpath("//a[@class='nav-link']"));
        //homeLink2.click();
        //b. “Forgot password” header
        WebElement passwordHeader = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        System.out.println(passwordHeader.getText());

        //c. “E-mail” text
        WebElement eMailText = driver.findElement(By.xpath("//label[@for='email']"));
        WebElement eMailText2 = driver.findElement(By.cssSelector("label[for='email']"));
        System.out.println(eMailText2.getText() + "<-- E-mail");

        //d. E-mail input box

        WebElement eMailBox = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement eMailBox2 = driver.findElement(By.cssSelector("input[type='text']"));
        eMailBox2.sendKeys("Selamdddd");

        //e. “Retrieve password” button

        WebElement retrievePassword = driver.findElement(By.cssSelector("button[class='radius']"));
        WebElement retrievePassword2 = driver.findElement(By.xpath("//button[@class='radius']"));

        retrievePassword2.click();

    }
}

/*
XPATH and CSS Selector PRACTICES
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered by Cybertek School” text
4. Verify all WebElements are displayed.
 */
