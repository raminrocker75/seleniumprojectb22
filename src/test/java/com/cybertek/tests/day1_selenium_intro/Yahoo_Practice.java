package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_Practice {
    public static void main(String[] args) {



        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        // maximizing the browser
        driver.manage().window().maximize();

        // Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");

        // setting the the actual title in a variable
        String title = driver.getTitle();

        // setting the title into an expected variable for verification
        String expectedTitle = title;

        //creating our verification;

        if(title.equals(expectedTitle)){
            System.out.println("Title is as expected. Verification Passed!");
        }else {
            System.out.println("Title is not as expected. Verification Failed!!!");
        }

        // will close the page or tab for the session
        driver.quit();

    }
}
