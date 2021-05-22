package com.cybertek.tests.day4_cssSelector_Xpath;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
TC #6: XPATH LOCATOR practice
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/multiple_buttons
3. Click on Button 1
4. Verify text displayed is as expected:
Expected: “Clicked on button one!”
 */
public class p6_XpathMultipleButtons {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement button1 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        button1.click();
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        String expectedText = "Clicked on button one!";
        String actualText = resultText.getText();

        if (actualText.equals(expectedText)){
            System.out.println("Result text verification Passed!");
        }else {
            System.out.println("Result text verification Failed!");
        }



    }
}
