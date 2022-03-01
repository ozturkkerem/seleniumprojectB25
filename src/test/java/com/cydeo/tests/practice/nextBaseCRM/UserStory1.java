package com.cydeo.tests.practice.nextBaseCRM;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UserStory1 {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @Test
    public void crm_HR_login_test_1() {


        driver.get("https://login2.nextbasecrm.com/");

        //The login page title should be “Authorization”.
        BrowserUtils.verifyTitle(driver,"Authorization");
        CRM_Utilities.crm_Login(driver, "hr28@cydeo.com", "UserUser");

    }


    @Test
    public void crm_HR_login_test_2() {


        driver.get("https://login2.nextbasecrm.com/");

        //The login page title should be “Authorization”.
        BrowserUtils.verifyTitle(driver,"Authorization");
        CRM_Utilities.crm_Login(driver, "hr29@cydeo.com", "UserUser");

    }


    @Test
    public void crm_HR_login_test_3() {


        driver.get("https://login2.nextbasecrm.com/");

        //The login page title should be “Authorization”.
        BrowserUtils.verifyTitle(driver,"Authorization");
        CRM_Utilities.crm_Login(driver, "hr30@cydeo.com", "UserUser");

    }





    @Test
    public void crm_HD_login_test_1() {


        driver.get("https://login2.nextbasecrm.com/");

        //The login page title should be “Authorization”.
        BrowserUtils.verifyTitle(driver,"Authorization");
        CRM_Utilities.crm_Login(driver, "Helpdesk28@cydeo.com", "UserUser");

    }

    @Test
    public void crm_HD_login_test_2() {


        driver.get("https://login2.nextbasecrm.com/");

        //The login page title should be “Authorization”.
        BrowserUtils.verifyTitle(driver,"Authorization");
        CRM_Utilities.crm_Login(driver, "Helpdesk29@cydeo.com", "UserUser");

    }

    @Test
    public void crm_HD_login_test_3() {


        driver.get("https://login2.nextbasecrm.com/");

        //The login page title should be “Authorization”.
        BrowserUtils.verifyTitle(driver,"Authorization");
        CRM_Utilities.crm_Login(driver, "Helpdesk30@cydeo.com", "UserUser");

    }

    @Test
    public void crm_M_login_test_1() {

        driver.get("https://login2.nextbasecrm.com/");

        //The login page title should be “Authorization”.
        BrowserUtils.verifyTitle(driver,"Authorization");
        CRM_Utilities.crm_Login(driver, "marketing28@cydeo.com", "UserUser");

    }

    @Test
    public void crm_M_login_test_2() {

        driver.get("https://login2.nextbasecrm.com/");

        //The login page title should be “Authorization”.
        BrowserUtils.verifyTitle(driver,"Authorization");
        CRM_Utilities.crm_Login(driver, "marketing29@cydeo.com", "UserUser");

    }

    @Test
    public void crm_M_login_test_3() {

        driver.get("https://login2.nextbasecrm.com/");

        //The login page title should be “Authorization”.
        BrowserUtils.verifyTitle(driver,"Authorization");
        CRM_Utilities.crm_Login(driver, "marketing30@cydeo.com", "UserUser");

    }

    @AfterMethod
    public void down(){

        driver.close();
    }



    }
