package com.Learning.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SS23_FileUpload {
	static WebDriver dvr=null;
	public static void main(String[] args) throws Exception {
		dvr=new ChromeDriver();
		dvr.navigate().to("https://the-internet.herokuapp.com/upload");
		dvr.findElement(By.id("file-upload")).sendKeys("C:\\Program Files\\Google\\Chrome\\Application\\chrome_proxy.exe");
		dvr.findElement(By.id("file-submit")).click();
		Thread.sleep(3000);
		if(dvr.getPageSource().contains("File Uploaded!")) {
			System.out.println("File Uploaded successfully");
		}
		else
		 {
			 System.out.println("File upload failed");
		 }
		Thread.sleep(3000);
		dvr.quit();
		
		
	}

}
