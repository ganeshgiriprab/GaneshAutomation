package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExampleTwo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement table = driver.findElement(By.xpath("//div[@class='rt-tbody']/div[i]/div/div[j]"));
		List<WebElement> rows = driver.findElements(By.tagName("div"));
		for(int i=1;i<=3;i++)
		{
			
			   List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<=5;j++)
			{
				String name= "";
				name=cells.get(j).getText();
				if(name.equals("Compliance"))
				{
				driver.findElement(By.xpath(" (//span[@title='Edit'])[2]")).click();
				}
				
			}
		}
			


	}

}
