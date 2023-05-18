package com.Wipro.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Utility.Helper;

public class TestScenario_01 {
	
	WebDriver driver;

	@Test
	
	public void TestNameDemo() {
		
		driver= Helper.startBrowser("Google Chrome");
		driver.navigate().to("https://www.login.hiox.com/login?referrer=easycalculation.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='log_email']")).sendKeys("animeshkorshetti@gmail.com");
		driver.findElement(By.xpath("//input[@id='log_password']")).sendKeys("anikor123");
		driver.findElement(By.xpath("//input[@name='log_submit']")).click();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
