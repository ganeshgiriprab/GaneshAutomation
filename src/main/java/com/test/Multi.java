package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		 WebElement mutiDrop = driver.findElement(By.xpath("//select[@id='second']"));
        Select s = new Select(mutiDrop);
        s.selectByValue("pizza");
        s.selectByValue("burger");
        //s.selectByValue("bonda");
        s.deselectByValue("burger");
        s.deselectAll();
        s.deselectByValue("Bonda");
        
        //JavascriptExecutor js=(JavaScriptExecutor)driver;
        //js.executeScript(script,arguments);
        String url="";
        //url=js.executeScript("return document.URL;").toString();
        System.out.println(url);
        
        
        
        
        
        
	}

}
