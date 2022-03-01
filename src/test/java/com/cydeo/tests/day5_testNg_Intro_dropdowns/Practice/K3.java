package com.cydeo.tests.day5_testNg_Intro_dropdowns.Practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class K3 {

   WebDriver driver;

   @BeforeClass
   public void setupMethod(){
       driver = WebDriverFactory.getDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   }

   //@Test




}


/*


USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

Create a utility method to handle above logic.
Method name: clickAndVerifyRadioButton
Return type: void or boolean
Method args:
1. WebDriver
2. Name attribute as String (for providing which group of radio buttons)
3. Id attribute as String (for providing which radio button to be clicked)

Method should loop through the given group of radio buttons. When it finds the
matching option, it should click and verify option is Selected.
Print out verification: true
 */
