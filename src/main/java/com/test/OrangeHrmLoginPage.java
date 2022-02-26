package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHrmLoginPage {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	ChromeDriver driver  = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	//JavascriptExecutor js4=(JavascriptExecutor)driver;
	//String url = driver.getCurrentUrl();
	//url=js4.executeScript("return document.URL;").toString();
	//System.out.println("url");
	
// I want to maximize the window.
	driver.manage().window().maximize();
	
	JavascriptExecutor js2=(JavascriptExecutor)driver;
	  String title = driver.getTitle();
	  title=js2.executeScript("return document.title;").toString();
	  System.out.println(title);
	  System.out.println(driver.getCurrentUrl());
	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement user = driver.findElement(By.xpath("//input[@name='txtUsername']"));
	js.executeScript("arguments[0].value='Admin';", user);
	Thread.sleep(5000);
	JavascriptExecutor js20=(JavascriptExecutor)driver;
	WebElement users = driver.findElement(By.xpath("//input[@name='txtUsername']"));
	js.executeScript("arguments[0].value='admin';", users);
	
	JavascriptExecutor js1=(JavascriptExecutor)driver;
	 WebElement pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
	js.executeScript("arguments[0].value='admin123';", pass);
	
	WebElement ele = driver.findElement(By.name("Submit"));
	JavascriptExecutor js6=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", ele);
	//Thread.sleep(5000);
	//driver.findElement(By.xpath("//b[text()='Recruitment']")).click();
	//Thread.sleep(5000);
	//WebElement all = driver.findElement(By.xpath("//select[@name='candidateSearch[jobTitle]']"));
	//Select s= new Select(all);
	//s.selectByValue("26");


	}

}
