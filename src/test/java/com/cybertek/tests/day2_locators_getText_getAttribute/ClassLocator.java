package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/inputs");
        Thread.sleep(2000);
        driver.findElement(By.className("nav-link")).click();
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title Verification Passed!");
        }else {
            System.out.println("Title Verification Failed!");
        }

        Thread.sleep(5000);

        driver.close();
    }
}
