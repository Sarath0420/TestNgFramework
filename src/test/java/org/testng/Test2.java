package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2
{
	@BeforeClass
	private void beforeClass() {
		System.out.println("Task 2 @BeforeClass");
	}

	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Task 2 @BeforeMethod");
	}

	@Test
	private void tc1() {
		System.out.println("2nd Test Case");
	}

	@AfterMethod
	private void afterMethod() {
		System.out.println("Task 2 @AfterMethod");
	}

	@AfterClass
	private void afterClass() {
		System.out.println("Task 2 @afterClass");
	}
	
	@AfterTest
	private void atTestfor1stTest()
	{
		System.out.println("@Test for 1st Test case end");
	}
}
