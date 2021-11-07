package org.dataproviders;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Employee extends BaseClass
{
	@Test(dataProvider="ExcelData")
	private static void tc1
	(String username, String password, String Hotel, String location, String roomType, String nos, 
			String checkIN, String checkOut, String adultRoom, String childRoom, 
			String firstName, String lastName, String address, String creditCardno, String creditCardType, 
			String expiryMonth, String expiryYear, String cvvNo) throws InterruptedException, IOException
	{
		driver("https://adactinhotelapp.com/index.php");
		
		// Login page
		adactinhotelappLoginPage login = new adactinhotelappLoginPage();
		
		WebElement txtusername = login.getUsername();
		System.out.println(username);
		enterText(txtusername, username);
		
		WebElement txtpassword = login.getPassword();
		System.out.println(password);
		enterText(txtpassword, password);
		
		WebElement btnclick = login.getLogin();
		click(btnclick);
		
		//Hotel Details
		HotelDeatils details = new HotelDeatils();
		
		WebElement hotelsList = details.getHotellocation();
		int parseInt = Integer.parseInt(Hotel);
		selectByIndex(hotelsList, parseInt);
		
		WebElement hotellocation = details.getHotels();
		int locationparseInt = Integer.parseInt(location);
		selectByIndex(hotellocation, locationparseInt);
		
		WebElement htlroomType = details.getRoomType();
		int parseInt2 = Integer.parseInt(roomType);
		selectByIndex(htlroomType, parseInt2);
		
		WebElement numberOfRooms = details.getNumberOfRooms();
		int parseInt3 = Integer.parseInt(nos);
		selectByIndex(numberOfRooms, parseInt3);

		WebElement checkIn = details.getCheckIn();
		clear(checkIn);
		thread(1000);
		enterText(checkIn, checkIN);

		WebElement htlcheckOut = details.getCheckOut();
		clear(htlcheckOut);
		thread(1000);
		enterText(htlcheckOut, checkOut );
		
		WebElement htladultRoom = details.getAdultRoom();
		int parseInt4 = Integer.parseInt(adultRoom);
		selectByIndex(htladultRoom, parseInt3);
	
		WebElement htlchildRoom = details.getChildRoom();
		int parseInt5 = Integer.parseInt(childRoom);
		selectByIndex(htlchildRoom, parseInt5);
	
		WebElement submit = details.getsubmit();
		click(submit);
		
		//Confirmation page
		ConfirmationPage confirm = new ConfirmationPage();
		
		WebElement radiobutton = confirm.getRadiobutton();
		click(radiobutton);

		WebElement continueButton = confirm.getContinueButton();
		click(continueButton);
		
		//Personal Details page
		PersonalDetails personal = new PersonalDetails();

		WebElement htlfirstName = personal.getFirstName();
		enterText(htlfirstName, firstName);
		
		WebElement htllastName = personal.getLastName();
		enterText(htllastName, lastName);

		WebElement htladdress = personal.getAddress();
		enterText(htladdress, address);
		
		WebElement htlcreditCardNumber = personal.getCreditCardNumber();
		enterText(htlcreditCardNumber, creditCardno);
		
		WebElement htlcreditCardType = personal.getCreditCardType();
		int parseInt6 = Integer.parseInt(creditCardType);
		selectByIndex(htlcreditCardType, parseInt6);
	
		WebElement ccExpiryMonth = personal.getCcExpiryMonth();
		int parseInt7 = Integer.parseInt(expiryMonth);
		selectByIndex(ccExpiryMonth, parseInt7);
		
		WebElement ccExpiryYear = personal.getCcExpiryYear();
		int parseInt8 = Integer.parseInt(expiryYear);
		selectByIndex(ccExpiryYear, parseInt8);
	
		WebElement htlcvvNumber = personal.getCvvNumber();
		enterText(htlcvvNumber, cvvNo);
		
		thread(3000);
		
		WebElement bookNow = personal.getBookNow();
		click(bookNow);
		thread(10000);
		//Order details
		OrderNumber order = new OrderNumber();
		WebElement weborderno = order.getOrderno();
		String gettingAttribute = gettingAttribute(weborderno, "value");
		exelwrite(0, 0, gettingAttribute);
	}

	@DataProvider(name="ExcelData")
	private Object [][] data() throws IOException
	{
		return new Object [][]
		{
			{(excelRead(0, 1)), (excelRead(1, 1)), (excelRead(2, 1)), (excelRead(3, 1)), 
			(excelRead(4, 1)), (excelRead(5, 1)), (excelRead(6, 1)),
				(excelRead(7, 1)), (excelRead(8, 1)), (excelRead(9, 1)),
				(excelRead(10, 1)), (excelRead(11, 1)), (excelRead(12, 1)), (excelRead(13, 1)), 
				(excelRead(14, 1)), (excelRead(15, 1)), (excelRead(16, 1)), (excelRead(17, 1))},
			
			{(excelRead(19, 1)), (excelRead(20, 1)), (excelRead(21, 1)), 
				 (excelRead(22, 1)), (excelRead(23, 1)), (excelRead(24, 1)),
				 (excelRead(25, 1)), (excelRead(26, 1)), (excelRead(27, 1)),
				 (excelRead(28, 1)), (excelRead(29, 1)), (excelRead(30, 1)), (excelRead(31, 1)), 
				 (excelRead(32, 1)), (excelRead(33, 1)), (excelRead(34, 1)), (excelRead(35, 1)), (excelRead(36, 1))},
			
			{(excelRead(38, 1)), (excelRead(39, 1)), 
				 (excelRead(40, 1)), (excelRead(41, 1)), (excelRead(42, 1)),
				 (excelRead(43, 1)), (excelRead(44, 1)), (excelRead(45, 1)),
				 (excelRead(46, 1)), (excelRead(47, 1)), (excelRead(48, 1)), (excelRead(49, 1)), 
				 (excelRead(50, 1)), (excelRead(51, 1)), (excelRead(52, 1)), (excelRead(53, 1)), 
				 (excelRead(54, 1)), (excelRead(55, 1))}


		};
	}
}
