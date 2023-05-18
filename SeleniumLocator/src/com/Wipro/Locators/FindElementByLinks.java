package com.Wipro.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utility.Helper;

public class FindElementByLinks {

	WebDriver driver;

	@Test
	
	public void TestNameDemo1() throws InterruptedException {
		
		driver= Helper.startBrowser("Google Chrome");
		driver.navigate().to("https://www.easycalculation.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Calculators")).click();
		
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		int linkcount=links.size();
		
		System.out.println("Count of Links = " +linkcount);
		
		for(int i=1;i<=links.size();i++) {
			System.out.println(links.get(i).getText());
		}
		
}
}
