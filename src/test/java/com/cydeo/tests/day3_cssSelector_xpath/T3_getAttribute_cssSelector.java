package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");
        WebElement login = driver.findElement(By.cssSelector("input[type='submit']"));

        String actualButtonText = login.getAttribute("value");
        String expectedButtonText = "Log In";

        System.out.println("expectedButtonText = " + expectedButtonText);
        System.out.println("actualButtonText = " + actualButtonText);

        if (actualButtonText.equals(expectedButtonText))
            System.out.println("PASSED");
        else System.out.println("FAIL");



    }


}

/*
TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “Log in” button text is as expected:
Expected: Log In
PS: Inspect and decide which locator you should be using to locate web
elements.
PS2: Pay attention to where to get the text of this button from
 */