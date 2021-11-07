package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test4
{
	@BeforeClass
	private void beforeClass() {
		System.out.println("Task 4 @BeforeClass");
	}

	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Task 4 @BeforeMethod");
	}

	@Test
	private void tc1() {
		System.out.println("4th Test Case");
	}

	@AfterMethod
	private void afterMethod() {
		System.out.println("Task 4 @AfterMethod");
	}

	@AfterClass
	private void afterClass() {
		System.out.println("Task 4 @afterClass");
	}
	
	@AfterTest
	private void atTestfor1stTest()
	{
		System.out.println("@Test for 2nd Test case End");
	}
	
	@AfterSuite
	private void afterSuite()
	{
	System.out.println("@afterSuite");
	}
}
