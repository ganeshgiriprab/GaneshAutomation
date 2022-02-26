package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeNine {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	// I want to maximize the window.
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement user = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		WebElement passwd = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='txtUsername']")));
		user.sendKeys("Admin");
		passwd.sendKeys("admin123");
		
		
		
		

	}

}
