package org.adactinhotel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Test3 extends BaseClass
{
	@BeforeClass
	private void beforeClass() {
		System.out.println("Task 3 @BeforeClass");
	}
	
	@BeforeTest
	private void atTestfor1stTest()
	{
		System.out.println("\n@Test for 2nd Test case start");
	}
	
	@BeforeMethod
	private void beforeMethod()
	{
		Date d = new Date();
		System.out.println("\nBefore Page Load Time");
		System.out.println(d);
		System.out.println("Task 3 @BeforeMethod");
	}

	@Test
	private void tc3() throws IOException
	{
		System.out.println("3rd Test Case");
		
		ConfirmationPage confirm = new ConfirmationPage();
		
		//Assert for Radio Button
		WebElement assertRadiobutton = driver.findElement(By.id("radiobutton_0"));
		boolean AsRadiobutton = assertRadiobutton.isDisplayed();
		Assert.assertTrue(AsRadiobutton);
		
		WebElement radiobutton = confirm.getRadiobutton();
		click(radiobutton);
		
		//Assert for Continue Button
		WebElement assertContinueButton = driver.findElement(By.id("continue"));
		boolean AsContinueButton = assertContinueButton.isDisplayed();
		Assert.assertTrue(AsContinueButton);
		
		WebElement continueButton = confirm.getContinueButton();
		click(continueButton);
		
		System.out.println("\nConfirm Page");
	}

	@AfterMethod
	private void afterMethod()
	{
		Date d1 = new Date();
		System.out.println("\nAfter Page End");
		System.out.println(d1);
		
		System.out.println("Task 3 @AfterMethod");
	}

	@AfterClass
	private void afterClass() {
		System.out.println("Task 3 @afterClass");
	}
}
