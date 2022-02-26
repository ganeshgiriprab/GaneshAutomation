package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Bank {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.veethi.com/places/india_banks-ifsc-codes.html");
		//Thread.sleep(2000);
		driver.manage().window().maximize();
		//Thread.sleep(15000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement bank = driver.findElement(By.xpath("//select[@id='selBank']"));
       Select s = new Select(bank);
       //s.selectByValue("3");
       s.selectByVisibleText("Axis Bank");
       Thread.sleep(5000);
       WebElement state = driver.findElement(By.xpath("//select[@id='selState']"));
       Select s1 = new Select(state);
       Thread.sleep(5000);
       s1.selectByVisibleText("Andhra Pradesh");
       Thread.sleep(25000);
       WebElement city = driver.findElement(By.xpath("//select[@id='selCity']"));
       Select s2 = new Select(city);
       Thread.sleep(25000);
       s2.selectByVisibleText("Anantapur");
       Thread.sleep(3000);
       
       WebElement branchName = driver.findElement(By.xpath("//select[@id='selBranch']"));
       Select s3 = new Select(branchName);
       Thread.sleep(5000);
       s3.selectByVisibleText("Madhapur" );
       
       
       
       
	}

}
