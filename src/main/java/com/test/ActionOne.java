package com.test;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionOne {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
		
		
		

	}

}
