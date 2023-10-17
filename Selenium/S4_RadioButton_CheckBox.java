package com.Learning.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S4_RadioButton_CheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.findElement(By.id("vfb-7-3")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("vfb-7-2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("vfb-7-1")).click();
		
	}

}
