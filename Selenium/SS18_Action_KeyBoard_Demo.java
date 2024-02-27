package com.Learning.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SS18_Action_KeyBoard_Demo {
	  static WebDriver driver=null;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		WebElement searchBox= driver.findElement(By.name("q"));
		Actions act = new Actions(driver);
		
		act.keyDown(searchBox, Keys.SHIFT).sendKeys("Action class").build().perform();
		
		
	}

}
