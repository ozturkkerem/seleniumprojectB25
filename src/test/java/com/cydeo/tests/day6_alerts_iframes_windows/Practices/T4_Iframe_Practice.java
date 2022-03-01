package com.cydeo.tests.day6_alerts_iframes_windows.Practices;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Iframe_Practice {

    WebDriver driver;

    @BeforeMethod

    public void setupMethod(){
        driver = WebDriverFactory.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/iframe");
    }

    @Test
    public void IframesTest(){
        Assert.assertEquals(driver.findElement(By.xpath("//h3[.='An iFrame containing the TinyMCE WYSIWYG Editor']")).getText(),"An iFrame containing the TinyMCE WYSIWYG Editor");

        WebElement iFrame = driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(iFrame);
        Assert.assertTrue(driver.findElement(By.xpath("//p")).isDisplayed());
        driver.switchTo().parentFrame();





    }

}

/*

TC #4: Iframe practice

1. Create a new class called: T4_Iframes
2. Create new test and make set ups
3. Go to: https://practice.cydeo.com/iframe
4. Assert: “Your content goes here.” Text is displayed.
5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
 */