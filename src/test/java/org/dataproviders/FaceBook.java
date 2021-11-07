package org.dataproviders;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook extends BaseClass
{
	@Test
	private void Launch()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("8870461002");
		driver.findElement(By.id("pass")).sendKeys("S@6@th*1504*s");
		driver.findElement(By.name("login")).click();
			
	}
}
