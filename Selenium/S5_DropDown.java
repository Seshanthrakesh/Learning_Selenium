package com.Learning.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S5_DropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		System.out.println("The title of this is -->"+driver.getTitle());
		System.out.println("The url of this website is "+driver.getCurrentUrl());
		driver.findElement(By.id("oldSelectMenu")).click();
		Select sel =new Select( driver.findElement(By.id("oldSelectMenu")));
		//Select by  the Index
		sel.selectByIndex(0);
		//select by the Value ,Note : It is in the Double Quotes
		sel.selectByValue("1");
		//select by the  visible Text
		sel.selectByVisibleText("Black");


		List<WebElement> options =sel.getOptions();

		for(WebElement eachOption:options)
		{
			System.out.println("The option is -->"+eachOption.getText());
		}

	}

}
