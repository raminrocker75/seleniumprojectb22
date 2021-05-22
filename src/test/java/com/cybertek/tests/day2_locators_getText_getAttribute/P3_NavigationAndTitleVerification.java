package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationAndTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");
        driver.findElement(By.linkText("Gmail")).click();

        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title Verification Passed!");
        }else {
            System.out.println("Title Verification Failed!");
        }

        driver.navigate().back();

        String expectedTitle1 = "Google";
        String actualTitle1 = driver.getTitle();
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title Verification Passed!");
        }else {
            System.out.println("Title Verification Failed!");
        }

        String expectedURL = "https://www.google.com/";
        String actualURL = driver.getCurrentUrl();

        if(actualURL.contains(expectedURL)){
            System.out.println("URL Verification Passed!");
        }else {
            System.out.println("URL Verification Failed");
        }
        System.out.println(driver.getCurrentUrl());
    }
}
