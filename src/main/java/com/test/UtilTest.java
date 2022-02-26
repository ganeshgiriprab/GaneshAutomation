package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		WebElement joinfree = driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a"));
		JavaScriptUtil.drawBoarder(joinfree, driver);
		
		
			
		

	}

}
