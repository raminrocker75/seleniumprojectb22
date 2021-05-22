package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F3_HeaderVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://Facebook.com");
        WebElement eso = driver.findElement(By.className("_8eso"));


        String expectedHeader = "Connect with friends and the world around you on Facebook.";
        String actualHeader = eso.getText();

        if (actualHeader.equals(expectedHeader)) {
            System.out.println("header verification Passed!");
        }else {
        System.out.println("Header verification Failed!");
    }


        Thread.sleep(5000);
        driver.quit();
    }
}
