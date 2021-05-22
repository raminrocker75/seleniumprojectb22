package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_ZeroBankAttributeVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");
        String expectedLinKText = "Zero Bank";

        WebElement zeroBankLink = driver.findElement(By.className("brand"));
        String actualLinkText = zeroBankLink.getText();


        if(actualLinkText.equals(expectedLinKText)){
            System.out.println("Link Text Verification Passed!");
        }else {
            System.out.println("Link Text Verification Failed!");
        }

        String expectedInHrefValue = "index.html";

        String actualHrefValue = zeroBankLink.getAttribute("href");

        if(actualHrefValue.contains(expectedInHrefValue)){
            System.out.println("HREF attribute verification Passed!");
        }else {
            System.out.println("HREF attribute verification Failed!");
        }

    }
}
