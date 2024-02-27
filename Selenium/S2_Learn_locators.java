package com.Learning.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S2_Learn_locatos {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement ent=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
				ent.click();			
		//WebElement ent=driver.findElement(By.id("APjFqb"));//*[@id="APjFqb"]
		//Thread.sleep(3000);
				ent.sendKeys("kumar shopping kumbakonam");
				ent.sendKeys(Keys.ENTER);
				driver.findElement(By.partialLinkText("Maps")).click();
					
				//ent.findElement(By.partialLinkText("")).click();                           				
				
				
		//locating by id
		 //WebElement ent= driver.findElement(By.id("Search"));
			//ent. sendKeys("kavala tamil song");
			//ent.sendKeys(Keys.ENTER);
		
		
		//locating by name
		//driver.findElement(By.name("q")).sendKeys("Selenium");
		
		//locating by xpath
		//driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("xpath");
		
		//using linktext
		//driver.findElement(By.linkText("Images")).click();
		
		
		//using parial linktext
		//driver.findElement(By.partialLinkText("Ima")).click();
		
		//using xpath for clickin on a link
		//driver.findElement(By.xpath("//a[text()='Images']")).click();
		
		
		//Thread.sleep(2000);
		//driver.close();
		
	}

}
