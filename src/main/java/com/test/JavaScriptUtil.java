package com.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
public static void flash(WebElement element,WebDriver driver) {
String bgColor = element.getCssValue("Backgroundcolor");
for(int i=0;i<=500;i++) {
	changeColor("#000000",element,driver);
}

}	

public static void changeColor(String color,WebElement element,WebDriver driver) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].style.backgroundColor = '" + color + "'" , element);
	
	try {
		Thread.sleep(20);
	} catch(InterruptedException e) {
		
	}
}
 public static void drawBoarder(WebElement element,WebDriver driver) {
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("aguments[0].style.border='3px solid red'", element);
 }
	
}


