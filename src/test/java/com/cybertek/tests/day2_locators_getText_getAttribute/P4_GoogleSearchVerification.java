package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearchVerification {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://Google.com");

        driver.findElement(By.name("q")).sendKeys("Apple" + Keys.ENTER);
        driver.findElement(By.partialLinkText("Apple - Official Site")).click();

        String expectedTitle = "Apple";
        String ActualTitle = driver.getTitle();

        if(ActualTitle.startsWith(expectedTitle)){
            System.out.println("Title verification Passed!");
        }else {
            System.out.println("Title verification Failed!");
        }
    }


}
