package com.maven;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Driver.driver;

public class Login extends driver {

	@Test
	public void app()
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.id("loginbutton")).click();
	}
	
	@Test
	public void forget()
	{
		driver.findElement(By.linkText("Forgotten account?")).click();
	}
	
}
