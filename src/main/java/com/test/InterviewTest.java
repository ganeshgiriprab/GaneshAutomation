package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewTest {
	public static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		 Thread.sleep(10000);
		 WebElement rbutton = driver.findElement(By.xpath("//input[@name='sex']"));
  rbutton.click();
  System.out.println(rbutton.isDisplayed());
  System.out.println(rbutton.isEnabled());
  System.out.println(rbutton.isSelected());
  
	}

}
