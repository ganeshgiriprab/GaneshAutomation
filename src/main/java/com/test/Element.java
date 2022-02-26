package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Element {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='country']"));
		// To interact with drop downs select class is mandatory.
		Select s = new Select(dropDown);
		//s.selectByIndex(4);
		//s.selectByValue("AF");
		//s.selectByVisibleText("Andorra");
		List<WebElement> opt = s.getOptions();
		System.out.println(opt.size());
		for(WebElement each:opt)
		{
			System.out.println(each.getText());
		}
		
		
		
		
		
		
		
		
		
		
		

	
	}
}
