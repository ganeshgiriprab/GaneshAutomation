package com.test;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenExample {
	public static ChromeDriver driver;
	public static int i=0;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		 driver  = new ChromeDriver();
		 ScreenExample pol= new ScreenExample();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	// I want to maximize the window.
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		pol.snap();
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		pol.snap();
		driver.findElement(By.name("Submit")).click();
		pol.snap();
} 
	    public void snap() throws IOException
	    {
	    	Random r = new Random();
	    	if(r.nextInt()!=0)
	    	{
	    		i=i+1;
	    	}
	    	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	File dest =new File(".//images//img"+i+".png");
	    	FileUtils.copyFile(src, dest);
	    	
	    }
	    
}
