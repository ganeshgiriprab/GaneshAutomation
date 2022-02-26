package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//driver.switchTo().frame("iframeResult");
		// Thread.sleep(10000);
		 WebElement MonthDropDown = driver.findElement(By.xpath("//select[@id='month']"));
		 driver.switchTo().frame("iframeResult");
		 Select s = new Select(MonthDropDown);
		 s.selectByIndex(3);
		 //WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		 //Select s1 = new Select(day);
		 //s1.selectByIndex(7);
		 
	     //WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	    // Select s2 = new Select(year);
	     //s2.selectByIndex(2022);
	     
	     
		 
		

	}

}
