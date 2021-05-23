package com.cybertek.tests.day6_testing_intro_dropdowns;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class P0_Checkbox_Practice {
    public static void main(String[] args) throws InterruptedException {
//        practice: cybertek checkbox
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        1. go to "http://practice.cybertekschool.com/checkboxes"
        driver.get("http://practice.cybertekschool.com/checkboxes");
//        2. Confirm checkbox #1 is NOT selected by default.
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));

//        3. Confirm checkbox #2 is SELECTED by default.
        WebElement checkBox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));

//        4. Click checkbox #1 to select it.
        Thread.sleep(2000);
        checkBox1.click();
//        5. Click checkbox #2 to deselect it.
        Thread.sleep(2000);
        checkBox2.click();
//        6. Confirm checkbox #1 is SELECTED.
        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());

//        7. Confirm checkbox #2 is NOT selected.
        System.out.println("checkBox2.isSelected() = " + checkBox2.isSelected());

        Thread.sleep(5000);
        driver.close();
    }
}
