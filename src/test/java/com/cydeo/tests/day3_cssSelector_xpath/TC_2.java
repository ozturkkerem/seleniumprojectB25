package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC_2 {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        String actualRememberMeLabel = rememberMeLabel.getText();
        String expectedRememberMeLabel = "Remember me on this computer";

        if (actualRememberMeLabel.equals(expectedRememberMeLabel))
        System.out.println("Remember me label test is PASSED");
        else System.out.println("Remember me label test is not working");

        WebElement forgetPassword = driver.findElement(By.className("login-link-forgot-pass"));

        String actualForgetPassword = forgetPassword.getText();
        String expectedForgetPassword = "Forgot your password?";

        if (actualForgetPassword.equals(expectedForgetPassword))
            System.out.println("Forget Password test PASSED");
        else System.out.println("Forget Password os FAIL");

        String expectedInHref = "forgot_password=yes";
        String actuallyHrefAttValue = forgetPassword.getAttribute("href");
        if (actuallyHrefAttValue.contains(expectedInHref))
            System.out.println("PASSEDDD");
        else System.out.println("FAIL");



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