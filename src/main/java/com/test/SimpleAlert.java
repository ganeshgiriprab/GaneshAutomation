package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	// I want to maximize the window.
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@name='alert']")).click();
		Alert abc  = driver.switchTo().alert();
		Thread.sleep(3000);
		abc.accept();
		driver.findElement(By.xpath("//input[@name='confirmation']")).click();
		Thread.sleep(3000);
		abc.accept();
		driver.findElement(By.xpath("//input[@name='prompt']")).click();
		
		abc.sendKeys("Rama&Ganesh");
		Thread.sleep(10000);
		abc.accept();
		

	}

}
