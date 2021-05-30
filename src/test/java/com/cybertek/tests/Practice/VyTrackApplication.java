package com.cybertek.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class VyTrackApplication {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://qa3.vytrack.com/user/login");
        WebElement userName = driver.findElement(By.cssSelector("input[type='text']"));
        userName.sendKeys("Ramin");
        WebElement passWord = driver.findElement(By.cssSelector("input[type='password']"));
        passWord.sendKeys("123455321");
        Thread.sleep(2000);
        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();
        WebElement alertMessage = driver.findElement(By.cssSelector("div[class='alert alert-error']"));
        System.out.println(alertMessage.getText());


    }
}

