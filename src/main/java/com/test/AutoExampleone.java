package com.test;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoExampleone {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath(" //input[@id='uploadPicture']")).click();
       Runtime.getRuntime().exec("C:\\Users\\User\\OneDrive\\Desktop\\AutoIT\\FileUploadScripts.exe");
       Thread.sleep(3000);
       
	}

}
