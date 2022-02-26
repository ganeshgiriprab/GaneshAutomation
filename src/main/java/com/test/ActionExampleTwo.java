package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionExampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://jqueryui.com/selectable/");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
	Actions a=new Actions(driver);
a.keyDown(Keys.CONTROL).moveToElement(item1).click().moveToElement(item3).click().moveToElement(item5).click().build().perform();



				
				
			}
	

	}


