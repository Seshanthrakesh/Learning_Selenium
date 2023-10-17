package com.Learning.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S3_FirstLink {
	static WebDriver driver=null;
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zenclass.in/class");
		Thread.sleep(2000);
		WebElement sel=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div[1]/form/div[1]/div/input"));
		sel.sendKeys("seshanthrakesh1901@gmail.com");
		sel.findElements(By.name("password"));
		sel.sendKeys("zen23@potral");


	}

}
