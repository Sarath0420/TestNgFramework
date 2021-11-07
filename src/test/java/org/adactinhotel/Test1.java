package org.adactinhotel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test1 extends BaseClass
{
	@BeforeSuite
	private void beforeSuite() {
		System.out.println("@beforeSuite");
	}

	@BeforeTest
	private void atTestfor1stTest() {
		System.out.println("@Test for 1st Test case opening");
	}

	@BeforeClass
	private void beforeClass()
	{
		driver("https://adactinhotelapp.com/index.php");
		
		String currentUrl = driver.getCurrentUrl();
		boolean contains = currentUrl.contains("adactinhotelapp");
		Assert.assertTrue(contains);
		System.out.println("\nWe are in Adactin Page");
		
		System.out.println("Task 1 @BeforeClass");
	}

	@BeforeMethod
	private void beforeMethod()
	{
		Date d = new Date();
		System.out.println("\nBefore Page Load Time");
		System.out.println(d);
		System.out.println("Task 1 @BeforeMethod");
	}

	@Test
	private void tc1() throws IOException
	{
		System.out.println("1st Test Case");
		
		adactinhotelappLoginPage login = new adactinhotelappLoginPage();
		
		//Assert for username
		WebElement txtusername = driver.findElement(By.id("username"));
		boolean usernamedisplayed = txtusername.isDisplayed();
		Assert.assertTrue(usernamedisplayed);
		
		WebElement username = login.getUsername();
		String xlusername = excelRead("E:\\Sarath\\Selenium Class\\Maven Framework\\October\\28\\adactinhotelapp.xlsx", "Sample", 0, 1);
		enterText(username, xlusername);
		
		//Assert for Password
		WebElement txtpassword = driver.findElement(By.id("password"));
		boolean passworddisplayed = txtpassword.isDisplayed();
		Assert.assertTrue(passworddisplayed);
				
		WebElement password = login.getPassword();
		String xlpassword = excelRead("E:\\Sarath\\Selenium Class\\Maven Framework\\October\\28\\adactinhotelapp.xlsx", "Sample", 1, 1);
		enterText(password, xlpassword);
		
		//Assert for login
		WebElement login1 = driver.findElement(By.id("login"));
		boolean loginclicked = login1.isDisplayed();
		Assert.assertTrue(loginclicked);
						
		WebElement buttonLogin = login.getLogin();
		buttonLogin.click();
		
		System.out.println("\nLogin Page");
	}

	@AfterMethod
	private void afterMethod()
	{
		Date d1 = new Date();
		System.out.println("\nAfter Page End");
		System.out.println(d1);
		
		System.out.println("Task 1 @AfterMethod");
	}

	@AfterClass
	private void afterClass() {
		System.out.println("Task 1 @afterClass");
	}
}
