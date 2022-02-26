package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
//driver.findElement(By.name("email")).sendKeys("gan_esh33@yahoo.co.in");
//driver.findElement(By.name("pass")).sendKeys("vinayaka25");
//driver.findElement(By.name("login")).click();
//driver.findElement(By.linkText("Forgot password?")).click();
driver.findElement(By.partialLinkText("Forgot")).click();


	}

}
