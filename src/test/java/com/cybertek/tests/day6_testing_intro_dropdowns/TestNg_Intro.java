package com.cybertek.tests.day6_testing_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_Intro {

    @BeforeClass
    public void setupClass(){
        System.out.println("---> Before Class is running...");
    }

    @BeforeMethod // before method runs before each test
    public void setupMethod(){
        System.out.println("--> Before method is running...");
    }

    @AfterMethod // after method runs after each test
    public void tearDownMethod(){
        System.out.println("-->After method is running...");
    }

    @Test (priority = 2)
    public void test1(){
        System.out.println("Running Test1...");
        String actual = "apple";
        String expected= "apple";

        Assert.assertEquals(actual,expected);
    }

    @Test(priority = 1)
    public void test2(){
        System.out.println("Running Test2...");
        String actual = "apple";
        String expected= "apples";
        Assert.assertTrue(actual==expected); // anything that will return us a boolean value would works with .assertTrue
    }


}
