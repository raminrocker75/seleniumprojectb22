package com.cybertek.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CyberTekPracticeToolVerifications {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");
        Thread.sleep(3000);
        driver.manage().window().maximize();

        String title = driver.getTitle();
        String expectedTitle = title;
        String url = driver.getCurrentUrl();
        String expectedUrl = url;
        if(url.contains(expectedUrl)){
            System.out.println("Website = " + expectedUrl);
        } else {
            System.out.println("does not contain Cybertek URL");
        }

        if(expectedTitle.equals(title)){
            System.out.println("Title = " + expectedTitle);
        }else {
            System.out.println("Title does not match");
        }
    }
}
