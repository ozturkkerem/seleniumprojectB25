package com.cydeo.tests.day6_alerts_iframes_windows.Practices;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_AlertPractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void clickForJSAlert(){
/*
3. Click to “Click for JS Alert” button
*/
        WebElement clickJsAlert = driver.findElement(By.xpath("//button [@class='btn btn-primary']"));
        clickJsAlert.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        String expected = "You successfully clicked an alert";
        String actual= driver.findElement(By.xpath("//p[@id='result']")).getText();

        Assert.assertTrue(actual.equals(expected));

        /*
/*
4. Click to OK button from the alert
5. Verify “You successfully clicked an alert” text is displayed.
 */
    }

    @Test
    public void clickForCFAlert(){

//3. Click to “Click for JS Confirm” button
        WebElement clickJsConfirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        clickJsConfirm.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(result.isDisplayed());

        Assert.assertEquals(result.getText(),"You clicked: Ok");

        /*

4. Click to OK button from the alert
5. Verify “You clicked: Ok” text is displayed.
       */
    }

    @Test
    public void clickForAlert(){
        WebElement clickForAlertButton = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        clickForAlertButton.click();

        Alert alert = driver.switchTo().alert();

        alert.sendKeys("hello");
        alert.accept();

        WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(result.isDisplayed());

        Assert.assertEquals(result.getText(),"You entered: hello");


        /*
3. Click to “Click for JS Prompt” button
4. Send “hello” text to alert
5. Click to OK button from the alert
6. Verify “You entered:  hello” text is displayed.


 */

    }



    @AfterMethod
    public void TearDown(){
        driver.close();
    }



}


/*


TC #2: Confirmation alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Confirm” button
4. Click to OK button from the alert
5. Verify “You clicked: Ok” text is displayed.

TC #3: Information alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Prompt” button
4. Send “hello” text to alert
5. Click to OK button from the alert
6. Verify “You entered:  hello” text is displayed.


 */