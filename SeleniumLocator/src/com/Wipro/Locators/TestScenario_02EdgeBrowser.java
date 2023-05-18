package com.Wipro.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Utility.Helper;

public class TestScenario_02EdgeBrowser {

	WebDriver driver;

	@Test

	public void TestNameDemo() throws InterruptedException {

		driver = Helper.startBrowser("Microsoft Edge");
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();
		
		//Enter FirstName
		driver.findElement(By.id("input-firstname")).sendKeys("Animesh");
		
		//Enter LastName
		driver.findElement(By.id("input-lastname")).sendKeys("Korshetti");
		
		//Enter Email
		driver.findElement(By.id("input-email")).sendKeys("animesh.Korshetti@gmail.com");
		
		//Enter Password
		driver.findElement(By.id("input-password")).sendKeys("anikor123");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(2000);	
		
		//Click on Yes Button
		driver.findElement(By.xpath("//input[@id='input-newsletter-yes']")).click();
		Thread.sleep(2000);
		
		//Click on CheckBox
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		
		//Click on Continue Button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
