package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IhgSignIn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(10,000);
		//driver.findElement(By.linkText("Sign In")).click();
		//driver.findElement(By.partialLinkText("Sign")).click();
		driver.findElement(By.xpath("//a[@title='Sign In']")).click();
		
		

}
}
