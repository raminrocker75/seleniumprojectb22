package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_IncorrectTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.Facebook.com");

       //Locating the web element using id locator and storing it in WebElement type.
        WebElement inputUserName=  driver.findElement(By.id("email"));
        // enter incorrect username
        inputUserName.sendKeys("something123@Gmail.com");

        WebElement inputPassword = driver.findElement(By.id("pass"));

        inputPassword.sendKeys("some wrong password" + Keys.ENTER);

        String expectedTitle = "Log into Facebook";

        Thread.sleep(5000);
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verified");
        }else {
            System.out.println("Title verification Failed");
        }
            Thread.sleep(5000);
        driver.quit();
    }
}
