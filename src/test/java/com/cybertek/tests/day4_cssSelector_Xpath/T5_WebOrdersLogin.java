package com.cybertek.tests.day4_cssSelector_Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_WebOrdersLogin {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        //1-Open a chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2-Go to: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        // 3-Verify title equals:Expected: Web Orders Login
        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Login page title verification Passed!");
        }else {
            System.out.println("Login page title verification Failed!");
        }
        //* 4-Enter username: Tester
        WebElement inputUserName = driver.findElement(By.id("ctl00_MainContent_username"));
        inputUserName.sendKeys("Tester");
        //         * 5-Enter password: test
        WebElement inputPassword = driver.findElement(By.id("ctl00_MainContent_password"));
        inputPassword.sendKeys("test");

        //* 6-Click “Sign In” button
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        //* 7-Verify titleEquals:Expected:Web Orders;


    }
}
