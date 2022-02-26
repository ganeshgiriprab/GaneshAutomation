package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDemo {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	ChromeDriver driver  = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		// Switch driver focus to frame
		driver.switchTo().frame("iframeResult");
		//driver.switchTo().frame("iframeResult");
	// I want to maximize the window.
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		// Multi DD
				Select dd=new Select(driver.findElement(By.name("cars")));
				for(int i=0;i<dd.getOptions().size();i++)
				{
					dd.selectByIndex(i);
				}
				Thread.sleep(2000);
				dd.deselectAll();
				Thread.sleep(2000);

	}

}
