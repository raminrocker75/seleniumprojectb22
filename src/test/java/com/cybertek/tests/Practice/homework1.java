package com.cybertek.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement username = driver.findElement(By.name("email"));
        username.sendKeys("bahar_j@yahoo.com");
        // 4.Click on Retrieve password
        driver.findElement(By.id("form_submit")).click();

        System.out.println(driver.getCurrentUrl());
    }
}
