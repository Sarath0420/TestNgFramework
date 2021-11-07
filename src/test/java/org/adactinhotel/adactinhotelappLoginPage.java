package org.adactinhotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class adactinhotelappLoginPage extends BaseClass {
	// This is pojo class so we no need to create main method for this class

	// Step 1 --> Create Constructor for this method

	public adactinhotelappLoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Create instance variable for every method and give getters value for each and
	// every methods

	@FindBy(id="username")
	private WebElement username; // Ithu username kana instance variable, son ingaye nama loactors use panikalam thaniya method create pann athevai illai
	
	@FindBy(id="password")
	private WebElement password; // Ithu password kana instance variable, son ingaye nama loactors use panikalam thaniya method create pann athevai illai
	
	@FindBy(id="login")
	private WebElement login; // Ithu login kana instance variable, son ingaye nama loactors use panikalam thaniya method create pann athevai illai

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	
}
