package com.cydeo.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://login1.nextbasecrm.com");
        WebElement login = driver.findElement(By.name("USER_LOGIN"));
        login.sendKeys("incorrect");
        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("incorrect");

        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        Thread.sleep(1000);

        WebElement authorization = driver.findElement(By.className("errortext"));

        String actualMessage = authorization.getText();

        String expectedMessage = "Incorrect login or password" ;

        if (actualMessage.equals(expectedMessage))
            System.out.println("Test is PASSED");
        else System.out.println("Test is FAIL");

    }
}

/*
TC #1: NextBaseCRM, locators and getText() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Enter incorrect username: “incorrect”
4- Enter incorrect password: “incorrect”
5- Click to login button.
6- Verify error message text is as expected:
Expected: Incorrect login or password
 */