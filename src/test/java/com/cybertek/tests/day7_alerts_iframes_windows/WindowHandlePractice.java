package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WindowHandlePractice {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/windows");
    }

    @Test
    public void window_test(){
        //Printing out the window handle of the first page opened
        //Storing the first window handle into a string is a useful practice for future needs when need to switch back to it
        String mainHandle = driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);
        //4. Assert: title is "practice"
        String actualTitleBeforeClick = driver.getTitle();
        String expectedTitle = "practice";

        System.out.println("actualTitleBeforeClick = " + actualTitleBeforeClick);

        //5. click to: "click Here" text
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

        for (String each : driver.getWindowHandles()) {
            driver.switchTo().window(each);
            System.out.println("Current Title While Switching = " + driver.getTitle());

        }


        String actualTitleAfterClick = driver.getTitle();
        System.out.println("actualTitleAfterClick = " + actualTitleAfterClick);

        //6. Switch to new window.


        //7. Assert: Title is "New Window"
    }

}
