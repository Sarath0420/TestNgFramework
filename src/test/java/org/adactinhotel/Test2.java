package org.adactinhotel;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Test2 extends BaseClass
{
	@BeforeClass
	private void beforeClass() {
		System.out.println("\nTask 2 @BeforeClass");
	}

	@BeforeMethod
	private void beforeMethod()
	{
		Date d = new Date();
		System.out.println("\nBefore Page Load Time");
		System.out.println(d);
		
		System.out.println("Task 2 @BeforeMethod");
	}

	@Test
	private void tc2() throws IOException, InterruptedException
	{
		System.out.println("2nd Test Case");
		HotelDeatils details = new HotelDeatils();
		
		//Assert for Hotel List
		WebElement assertHotelList = driver.findElement(By.id("hotels"));
		boolean hotelList = assertHotelList.isDisplayed();
		Assert.assertTrue(hotelList);		
		
		WebElement hotelsList = details.getHotels();
		String xlLocation = excelRead("E:\\Sarath\\Selenium Class\\Maven Framework\\October\\28\\adactinhotelapp.xlsx", "Sample", 2, 1);
		int parseInt = Integer.parseInt(xlLocation);
		selectByIndex(hotelsList, parseInt);
		
		//Assert for Hotel Location
		WebElement assertHotelLocation = driver.findElement(By.id("location"));
		boolean hotelLocation = assertHotelLocation.isDisplayed();
		Assert.assertTrue(hotelLocation);
		
		WebElement hotellocation = details.getHotellocation();
		String xlHotelName = excelRead("E:\\Sarath\\Selenium Class\\Maven Framework\\October\\28\\adactinhotelapp.xlsx", "Sample", 3, 1);
		int parseInt1 = Integer.parseInt(xlHotelName);
		selectByIndex(hotellocation, parseInt1);
		
		//Assert for Room Type
		WebElement assertRoomType = driver.findElement(By.id("room_type"));
		boolean AsroomType = assertRoomType.isDisplayed();
		Assert.assertTrue(AsroomType);
		
		WebElement roomType = details.getRoomType();
		String xlhtlRoomType = excelRead("E:\\Sarath\\Selenium Class\\Maven Framework\\October\\28\\adactinhotelapp.xlsx", "Sample", 4, 1);
		int parseInt2 = Integer.parseInt(xlhtlRoomType);
		selectByIndex(roomType, parseInt2);
		
		//Assert for Number Of Rooms
		WebElement assertNumberOfRooms = driver.findElement(By.id("room_nos"));
		boolean AsNumberOfRooms = assertNumberOfRooms.isDisplayed();
		Assert.assertTrue(AsNumberOfRooms);
		
		WebElement numberOfRooms = details.getNumberOfRooms();
		String xlhtlRoomNos = excelRead("E:\\Sarath\\Selenium Class\\Maven Framework\\October\\28\\adactinhotelapp.xlsx", "Sample", 5, 1);
		int parseInt3 = Integer.parseInt(xlhtlRoomNos);
		selectByIndex(numberOfRooms, parseInt3);

		//Assert for Check In Date
		WebElement assertCheckIn = driver.findElement(By.id("datepick_in"));
		boolean AsCheckIn = assertCheckIn.isDisplayed();
		Assert.assertTrue(AsCheckIn);
		
		WebElement checkIn = details.getCheckIn();
		clear(checkIn);
		thread(1000);
		String xlcheckInDate = excelRead("E:\\Sarath\\Selenium Class\\Maven Framework\\October\\28\\adactinhotelapp.xlsx", "Sample", 6, 1);
		enterText(checkIn, xlcheckInDate);
		
		//Assert for Check Out Date
		WebElement assertCheckOut = driver.findElement(By.id("datepick_out"));
		boolean AsCheckOut = assertCheckOut.isDisplayed();
		Assert.assertTrue(AsCheckOut);
		
		WebElement checkOut = details.getCheckOut();
		clear(checkOut);
		thread(1000);
		String xlcheckOutDate  = excelRead("E:\\Sarath\\Selenium Class\\Maven Framework\\October\\28\\adactinhotelapp.xlsx", "Sample", 7, 1);
		enterText(checkOut, xlcheckOutDate );

		//Assert for Adult Room
		WebElement assertAdultRoom = driver.findElement(By.id("adult_room"));
		boolean AsAdultRoom = assertAdultRoom.isDisplayed();
		Assert.assertTrue(AsAdultRoom);
		
		WebElement adultRoom = details.getAdultRoom();
		String xladultPerRoom = excelRead("E:\\Sarath\\Selenium Class\\Maven Framework\\October\\28\\adactinhotelapp.xlsx", "Sample", 8, 1);
		int parseInt4 = Integer.parseInt(xladultPerRoom);
		selectByIndex(adultRoom, parseInt3);
	
		//Assert for Child Room
		WebElement assertChildRoom = driver.findElement(By.id("child_room"));
		boolean AsChildRoom = assertChildRoom.isDisplayed();
		Assert.assertTrue(AsChildRoom);
		
		WebElement childRoom = details.getChildRoom();
		String xlchildrenPerRoom = excelRead("E:\\Sarath\\Selenium Class\\Maven Framework\\October\\28\\adactinhotelapp.xlsx", "Sample", 9, 1);
		int parseInt5 = Integer.parseInt(xlchildrenPerRoom);
		selectByIndex(childRoom, parseInt5);
	
		//Assert for Submit Button
		WebElement assertsubmit = driver.findElement(By.id("Submit"));
		boolean Assubmit = assertsubmit.isDisplayed();
		Assert.assertTrue(Assubmit);
		
		WebElement submit = details.getsubmit();
		click(submit);
		
		System.out.println("\nHotel Details");
	}

	@AfterMethod
	private void afterMethod()
	{
		Date d1 = new Date();
		System.out.println("\nAfter Page End");
		System.out.println(d1);
		
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
