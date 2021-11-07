package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	@BeforeSuite
	private void beforeSuite() {
		System.out.println("@beforeSuite");
	}

	@BeforeTest
	private void atTestfor1stTest() {
		System.out.println("@Test for 1st Test case opening");
	}

	@BeforeClass
	private void beforeClass() {
		System.out.println("Task 1 @BeforeClass");
	}

	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Task 1 @BeforeMethod");
	}

	@Test
	private void tc1() {
		System.out.println("1st Test Case");
	}

	@AfterMethod
	private void afterMethod() {
		System.out.println("Task 1 @AfterMethod");
	}

	@AfterClass
	private void afterClass() {
		System.out.println("Task 1 @afterClass");
	}
}
