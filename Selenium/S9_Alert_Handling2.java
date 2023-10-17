package com.Learning.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S9_Alert_Handling2 {
	WebDriver driver=null;
	public static void main(String[] args) throws Exception  {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
		Alert alerts =driver.switchTo().alert();
		Thread.sleep(2000);
		alerts.sendKeys("seshanth");
		alerts.accept();
	}

}
