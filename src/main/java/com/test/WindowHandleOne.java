package com.test;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleOne {
	public static String parent,linkedIn;
	public static Set<String> all;
	public static Iterator<String> it;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		 parent = driver.getWindowHandle();
		System.out.println();
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Banda");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Suma");
		driver.findElement(By.xpath("//div[@id='social-icons']/a")).click();
		 all = driver.getWindowHandles();
		  it = all.iterator();
		  while(it.hasNext())
		  {
			  linkedIn=it.next();
			  if(!parent.equals(linkedIn))
			  {
				  driver.switchTo().window(linkedIn);
			  }
		  }
		   
		 
		
		
		
		

	}

}
