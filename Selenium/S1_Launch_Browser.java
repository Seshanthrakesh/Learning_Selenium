package com.Learning.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class S1_Launch_Browser {
	static WebDriver driver=null;
	public static void main(String[] args) throws Exception {
		//first way (Here driver is the object for Chromedriver class and not webdriver interf
		WebDriver driver =new ChromeDriver();
		//EdgeDriver driver =new EdgeDriver();
		//driver= new FirefoxDriver();
		driver.get("https://www.google.com/");

		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}

}
