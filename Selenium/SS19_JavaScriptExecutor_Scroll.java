package com.Learning.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SS19_JavaScriptExecutor_Scroll {
	static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");

		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(2000);

		//to scroll down the page by 1000 pixels
		js.executeScript("window.scrollTo(0,1000);");

		Thread.sleep(2000);

		//to scroll up the page by 500 pixels
		js.executeScript("window.scrollTo(0,-500);");

		//to scroll right 
		js.executeScript("window.scrollTo(1000,0);");

		//to scroll left
		js.executeScript("window.scrollTo(-1000,0);");

		Thread.sleep(2000);

		//to scroll down until the bottom of the page
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");


		//to scroll up the page
		//js1.executeScript("window.scrollTo(0,0);");

		Thread.sleep(2000);

		js.executeScript("window.scrollTo(0,-document.body.scrollHeight);");

		System.out.println(js.executeScript("return document.title;"));


		//to scroll until a particular webelement
		WebElement greenKartText= driver.findElement(By.xpath("//strong[text()='GreenKart']"));
		js.executeScript("arguments[0].scrollIntoView(true);",greenKartText);

		//to click on a particular webelement 
		WebElement cartIcon= driver.findElement(By.xpath("//a[@class='cart-icon']"));
		js.executeScript("arguments[0].click();", cartIcon);
		Thread.sleep(2000);

		//type in text in a input box
		WebElement searchBox=driver.findElement(By.xpath("//input[@type='search']"));
		js.executeScript("arguments[0].value='cucumber';", searchBox);

	}

}
