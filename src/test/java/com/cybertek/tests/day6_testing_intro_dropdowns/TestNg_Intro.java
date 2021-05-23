package com.cybertek.tests.day6_testing_intro_dropdowns;

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

    @Test
    public void test1(){
        System.out.println("Running Test1...");
    }

    @Test
    public void test2(){
        System.out.println("Running Test2...");
    }


}
