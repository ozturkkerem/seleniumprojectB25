package com.cydeo.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://login1.nextbasecrm.com");

        WebElement rememberButton = driver.findElement(By.className("login-item-checkbox-label"));

        String actualResult = rememberButton.getText();
        String expectedResult = "Remember me on this computer";

        if (actualResult.equals(expectedResult))
            System.out.println("Remember me test PASSED");
        else System.out.println("Remember me test FAIL");

        WebElement forgotPassword= driver.findElement(By.className("login-link-forgot-pass"));
        actualResult = forgotPassword.getText();
        expectedResult = "Forgot your password?";

        if (actualResult.equals(expectedResult))
            System.out.println("Forgot pass test PASSED");
        else System.out.println("Forgot pass me test FAIL");





    }
}


/*
TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “remember me” label text is as expected:
Expected: Remember me on this computer
4- Verify “forgot password” link text is as expected:
Expected: Forgot your password?
5- Verify “forgot password” href attribute’s value contains expected:
Expected: forgot_password=yes



PS: Inspect and decide which locator you should be using to locate web
elements.
 */