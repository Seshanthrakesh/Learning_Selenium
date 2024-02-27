package com.Learning.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S8_SwitchTo_Alert1 {
	WebDriver driver=null;
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		Alert alerts =driver.switchTo().alert();
		Thread.sleep(4000);
		alerts.accept();//clicking on OK button
		//567io;' //clicking on close or cancel button	
		driver.close();
	}

}
