package com.test;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowThreeExample {
	public static String parent,LinkedIn,Facebook,Twitter;
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
driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
driver.findElement(By.xpath("//div[@id='social-icons']/a")).click();
  all = driver.getWindowHandles();
  Iterator<String> it = all.iterator();
  while(it.hasNext())
  {
	  LinkedIn=it.next();
	   if(!parent.equals(LinkedIn))
	  {
		  driver.switchTo().window(LinkedIn);
	  }
  }
   System.out.println(driver.getTitle());
   System.out.println(driver.getCurrentUrl());
  

		 		

		 

	}

}
