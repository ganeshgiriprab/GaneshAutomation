package com.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class Medplus {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.getCurrentUrl("https://www.medplusmart.com/");
		driver.get("https://www.medplusmart.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();

	}

}
