package org.adactinhotel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Test4 extends BaseClass
{
	@BeforeClass
	private void beforeClass() {
		System.out.println("Task 4 @BeforeClass");
	}

	@BeforeMethod
	private void beforeMethod()
	{
		Date d = new Date();
		System.out.println("\nBefore Page Load Time");
		System.out.println(d);
		System.out.println("Task 4 @BeforeMethod");
	}

	@Test
	private void tc4() throws IOException, InterruptedException
	{
		System.out.println("4th Test Case");
		
		PersonalDetails personal = new PersonalDetails();

		//Assert for First Name
		WebElement assertFirstName = driver.findElement(By.id("first_name"));
		boolean AsFirstName = assertFirstName.isDisplayed();
		Assert.assertTrue(AsFirstName);
		
		WebElement firstName = personal.getFirstName();
		String xlfirstName = excelRead("E:\\Sarath\\Selenium Class\\Maven Framework\\October\\28\\adactinhotelapp.xlsx", "Sample", 10, 1);
		enterText(firstName, xlfirstName);
		
		//Assert for Last Name
		WebElement assertLastName = driver.findElement(By.id("last_name"));
		boolean AsLastName = assertLastName.isDisplayed();
		Assert.assertTrue(AsLastName);
		
		WebElement lastName = personal.getLastName();
		String xllastName = excelRead("E:\\Sarath\\Selenium Class\\Maven Framework\\October\\28\\adactinhotelapp.xlsx", "Sample", 11, 1);
		enterText(lastName, xllastName);
		
		//Assert for Address
		WebElement assertAddress = driver.findElement(By.id("address"));
		boolean AsAddress = assertAddress.isDisplayed();
		Assert.assertTrue(AsAddress);
		
		WebElement address = personal.getAddress();
		String xladdress = excelRead("E:\\Sarath\\Selenium Class\\Maven Framework\\October\\28\\adactinhotelapp.xlsx", "Sample", 12, 1);
		enterText(address, xladdress);
		
		//Assert for Credit Card Number
		WebElement assertCreditCardNumber = driver.findElement(By.id("cc_num"));
		boolean AsCreditCardNumber = assertCreditCardNumber.isDisplayed();
		Assert.assertTrue(AsCreditCardNumber);
		
		WebElement creditCardNumber = personal.getCreditCardNumber();
		String xlcreditCard = excelRead("E:\\Sarath\\Selenium Class\\Maven Framework\\October\\28\\adactinhotelapp.xlsx", "Sample", 13, 1);
		enterText(creditCardNumber, xlcreditCard);
		
		//Assert for Credit Card Type
		WebElement assertCreditCardType = driver.findElement(By.id("cc_type"));
		boolean AsCreditCardType = assertCreditCardType.isDisplayed();
		Assert.assertTrue(AsCreditCardType);
		
		WebElement creditCardType = personal.getCreditCardType();
		String xlcreditCardType = excelRead("E:\\Sarath\\Selenium Class\\Maven Framework\\October\\28\\adactinhotelapp.xlsx", "Sample", 14, 1);
		int parseInt6 = Integer.parseInt(xlcreditCardType);
		selectByIndex(creditCardType, parseInt6);
	
		//Assert for Credit Card Expiry Month
		WebElement assertCcExpiryMonth = driver.findElement(By.id("cc_exp_month"));
		boolean AsCcExpiryMonth = assertCcExpiryMonth.isDisplayed();
		Assert.assertTrue(AsCcExpiryMonth);
		
		WebElement ccExpiryMonth = personal.getCcExpiryMonth();
		String xlcardExpiryMonth = excelRead("E:\\Sarath\\Selenium Class\\Maven Framework\\October\\28\\adactinhotelapp.xlsx", "Sample", 15, 1);
		int parseInt7 = Integer.parseInt(xlcardExpiryMonth);
		selectByIndex(ccExpiryMonth, parseInt7);
		
		//Assert for Credit Card Expiry Year
		WebElement assertCcExpiryYear = driver.findElement(By.id("cc_exp_year"));
		boolean AsCcExpiryYear = assertCcExpiryYear.isDisplayed();
		Assert.assertTrue(AsCcExpiryYear);
		
		WebElement ccExpiryYear = personal.getCcExpiryYear();
		String xlcardExpiryYear = excelRead("E:\\Sarath\\Selenium Class\\Maven Framework\\October\\28\\adactinhotelapp.xlsx", "Sample", 16, 1);
		int parseInt8 = Integer.parseInt(xlcardExpiryYear);
		selectByIndex(ccExpiryYear, parseInt8);
	
		//Assert for Credit Card CVV Number
		WebElement assertCvvNumber = driver.findElement(By.id("cc_cvv"));
		boolean AsCvvNumber = assertCvvNumber.isDisplayed();
		Assert.assertTrue(AsCvvNumber);
		
		WebElement cvvNumber = personal.getCvvNumber();
		String xlcvvNumber = excelRead("E:\\Sarath\\Selenium Class\\Maven Framework\\October\\28\\adactinhotelapp.xlsx", "Sample", 17, 1);
		enterText(cvvNumber, xlcvvNumber);
		
		thread(3000);
		
		//Assert for Book Now Button
		WebElement assertBookNow = driver.findElement(By.id("book_now"));
		boolean AsBookNow = assertBookNow.isDisplayed();
		Assert.assertTrue(AsBookNow);
		
		WebElement bookNow = personal.getBookNow();
		click(bookNow);
		
		System.out.println("\nPersonal Details");
	}

	@AfterMethod
	private void afterMethod()
	{
		Date d1 = new Date();
		System.out.println("\nAfter Page End");
		System.out.println(d1);
		
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
