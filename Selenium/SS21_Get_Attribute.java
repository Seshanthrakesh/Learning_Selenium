package com.Learning.Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SS21_Get_Attribute {
	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("selenium learning");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		for(WebElement eachLink: allLinks)
		{
			Thread.sleep(250);
			System.out.println(eachLink.getAttribute("href"));
			
		}

	}

}
