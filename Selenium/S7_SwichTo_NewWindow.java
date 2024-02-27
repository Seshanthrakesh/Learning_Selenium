package com.Learning.Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S7_SwichTo_NewWindow {
	static WebDriver driver=null;
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		//getWindowHandle --> will return the current window id
		//getWindowHandles --> will return all the window ids opened by the driver instance
		
		String parentWindow= driver.getWindowHandle();
		 driver.findElement(By.xpath("//*[@id=\"windowButton\"]")).click();
		 
		 Set<String> allwindows =driver.getWindowHandles();
		 for(String eachwindow:allwindows) {
			 driver.switchTo().window(eachwindow);
		 }
		 String childwindowtext =driver.findElement(By.id("sampleHeading")).getText();
		 System.out.println("Childwindow Text---->"+ childwindowtext);
		 
		 driver.switchTo().window(parentWindow);
		 String ParentwindowText=driver.findElement(By.xpath("//div[@class='main-header']")).getText();
		 System.out.println("ParentWindow Text------>"+ParentwindowText);
		 driver.quit();
		 

	}

}
