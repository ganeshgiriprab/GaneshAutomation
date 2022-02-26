package com.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	
	public static String parent,linkedIn,facebook,twitter;
	public static Set<String> all;
	public static  Iterator<String> it;
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			parent=driver.getWindowHandle();
			System.out.println();
			driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
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
			
			driver.findElement(By.xpath("//input[@id='email-or-phone']")).sendKeys("Dummy");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("dummypwd");
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.switchTo().window(parent);
			driver.findElement(By.xpath("(//div[@id='social-icons']/a)[2]")).click();
			all = driver.getWindowHandles();
			it = all.iterator();
			while(it.hasNext())
			{
				facebook=it.next();
				if(!parent.equals(facebook))
				{
					driver.switchTo().window(facebook);
				}
			}
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testemail");
			driver.switchTo().window(parent);
			driver.findElement(By.xpath("(//div[@id='social-icons']/a)[3]")).click();
			all = driver.getWindowHandles();
			it = all.iterator();
			while(it.hasNext())
			{
				twitter=it.next();
				if(!parent.equals(twitter))
				{
					driver.switchTo().window(twitter);
				}
			}
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.switchTo().window(facebook);
			driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("adafds");
		}

	}

	
	
	


	