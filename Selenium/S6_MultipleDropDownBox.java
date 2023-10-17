package com.Learning.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S6_MultipleDropDownBox {
	public static void main(String[] args) throws Exception {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Select sel =new Select(driver.findElement(By.name("cars")));
		//select by index
		sel.selectByIndex(1);
		Thread.sleep(2000);

		//select by value
		sel.selectByValue("volvo");
		Thread.sleep(2000);


		//select by visible text
		sel.selectByVisibleText("Audi");
		Thread.sleep(2000);


		System.out.println(sel.getFirstSelectedOption());

		List<WebElement> allOptions=sel.getOptions();

		for(WebElement eachOption:allOptions)
		{
			System.out.println(eachOption.getText());
		}

		sel.deselectAll();
		Thread.sleep(3000);
		driver.close();

	}

}
