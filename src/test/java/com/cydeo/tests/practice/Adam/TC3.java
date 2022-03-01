package com.cydeo.tests.practice.Adam;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC3 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://vytrack.com/");
       // WebDriver contactButton = driver.findElement(By.cssSelector("a[]"))
        WebElement contactButton = driver.findElement(By.xpath("//a[@ href='https://vytrack.com/contact/']"));
        WebElement contactButton1 = driver.findElement(By.cssSelector("a[href='https://vytrack.com/contact/']"));
        System.out.println(contactButton1.getText());
        contactButton1.click();



    }
}

/*
TC:3 As a user I should be able to see Contact is displayed
 //1-open a chrome browser
 //2-goto https://vytrack.com/
 //3-verify Contact is displayed and label is "Contact"
 */