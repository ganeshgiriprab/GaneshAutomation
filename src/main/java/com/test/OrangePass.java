package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangePass {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	// I want to maximize the window.
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 WebElement pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		js.executeScript("arguments[0].value='Admin';", pass);

		
	}

}
