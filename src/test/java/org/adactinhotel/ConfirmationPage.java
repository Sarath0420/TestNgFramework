package org.adactinhotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage extends HotelDeatils
{
	public ConfirmationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(id="continue")
	private WebElement continueButton;

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}
	
	
}
