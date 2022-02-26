package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		Actions a=new Actions(driver);
		a.sendKeys(username, Keys.SHIFT).keyDown(Keys.SHIFT).sendKeys("rama").keyUp(Keys.SHIFT).sendKeys("rao").build().perform();
		a.click(username).keyDown(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
			}

		


	}


