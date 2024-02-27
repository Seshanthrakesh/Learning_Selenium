package com.Learning.Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SS25_CaptureScreenshot {
	public static WebDriver driver=null;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File(".//Screenshots//sample.png");
	  //File dest= new File(System.getProperty("user.dir")+"/screenshots/sample.png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
