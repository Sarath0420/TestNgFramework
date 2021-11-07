package org.dataproviders;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderNumber extends BaseClass
{
	public OrderNumber()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	private WebElement Orderno;
	
	public WebElement getOrderno()
	{
		return Orderno;
	}
	
}
