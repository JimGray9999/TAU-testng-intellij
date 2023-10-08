package com.testautomationu.practice;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTestngClassTest {

    String employeeName;
    // test case 1
    @Test()
    public void testCase1() {
        System.out.println("in test case 1 of NewTestngClass");
        String employeeFullName = employeeName + " Gray";
        System.out.println("employeeFullName is: "+employeeFullName);
    }

    @BeforeTest
    public void name() {
        employeeName = "Jim";
        System.out.println("employeeName is: "+employeeName);
    }
}
