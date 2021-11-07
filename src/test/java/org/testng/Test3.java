package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3
{
	@BeforeClass
	private void beforeClass() {
		System.out.println("Task 3 @BeforeClass");
	}
	
	@BeforeTest
	private void atTestfor1stTest()
	{
		System.out.println("@Test for 2nd Test case start");
	}
	
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Task 3 @BeforeMethod");
	}

	@Test
	private void tc1() {
		System.out.println("3rd Test Case");
	}

	@AfterMethod
	private void afterMethod() {
		System.out.println("Task 3 @AfterMethod");
	}

	@AfterClass
	private void afterClass() {
		System.out.println("Task 3 @afterClass");
	}
}
