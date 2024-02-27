package com.Learning.Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenKart_Assignment_Discount {

	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("ber");
		Thread.sleep(3000);
		
		List<WebElement> allCartButtons=driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
		
		for(WebElement eachCartButton:allCartButtons)
		{
			Thread.sleep(1000);
			eachCartButton.click();
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		
		List<WebElement> totalValues=driver.findElements(By.xpath("//tbody/tr/td[5]")); 
		int totPrice=0;
		for(WebElement eachValue:totalValues)
		{
			String toalPrice=eachValue.getText();
			int price= Integer.parseInt(toalPrice); 
			totPrice=totPrice+price; //0+48
			//48+160=208
			//208+180=388
		}	
		
		WebElement tot_discount_price=driver.findElement(By.xpath("//span[@class='discountAmt']"));
		String discount_price=tot_discount_price.getText();
		double Actual_discount_price=Double.parseDouble(discount_price);
		String dis_perc_text=driver.findElement(By.xpath("//span[@class='discountPerc']")).getText();
		String[] dis_perc_textsplit=dis_perc_text.split("%",0);
		
		System.out.println(dis_perc_textsplit);
		//double dis_perc=Double.parseDouble(dis_percent);
		System.out.println(Actual_discount_price);
		
		double Excepted_discount_price=(totPrice*0.10);
		System.out.println(Excepted_discount_price);
		if(Excepted_discount_price==Actual_discount_price) {
			System.out.println("discount is same");
		}
		else
		{
			System.out.println("discount is not same");
		}
		
		

	}		
	

}
