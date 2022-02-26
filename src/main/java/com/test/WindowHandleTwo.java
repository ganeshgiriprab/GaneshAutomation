package com.test;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleTwo {
	public static String parent,LinkedIn,Facebook,twitter;
	public static Set<String> all;
	public static Iterator<String> it;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		 parent = driver.getWindowHandle();
		System.out.println();
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Banda");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Suma");
		driver.findElement(By.xpath("//div[@id='social-icons']/a")).click();
		  all = driver.getWindowHandles();
		   it = all.iterator();
		  while(it.hasNext())
		  {
			  LinkedIn = it.next();
			  if(!parent.equals(LinkedIn))
			  {
				  driver.switchTo().window(LinkedIn);
			  }
			  
		  }
		   driver.findElement(By.xpath("//input[@name='email-address']")).sendKeys("Dummy");
		   	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Dummy");
		   System.out.println(driver.getCurrentUrl());
		   System.out.println(driver.getTitle());
		   driver.switchTo().window(parent);
		   driver.findElement(By.xpath("//div[@id='social-icons']/a[2]")).click();
		   all = driver.getWindowHandles();
			it = all.iterator();
			  while(it.hasNext())
			  {
				  Facebook = it.next();
				  if(!parent.equals(Facebook))
				  {
					  driver.switchTo().window(Facebook);
				  }
				  
			  }
			  System.out.println(driver.getTitle());
			  System.out.println(driver.getCurrentUrl());
			  Thread.sleep(5000);
			  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testemail");
			  driver.switchTo().window(parent);
			  driver.findElement(By.xpath("//div[@id='social-icons']/a[3]")).click();
			  
			  all = driver.getWindowHandles();
			   it = all.iterator();
			  while(it.hasNext())
			  {
				  twitter = it.next();
				  if(!parent.equals(twitter))
				  {
					  driver.switchTo().window(twitter);
				  }
				  
			  }
			  System.out.println(driver.getTitle());
			  System.out.println(driver.getCurrentUrl());
			  
			  driver.switchTo().window(Facebook);
			  driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("asdf");
			  
			  
		   
		   
		   
		   
		  
               
	}

}
