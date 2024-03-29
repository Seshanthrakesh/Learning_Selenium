 //Explicit

package com.Learning.Selenium;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
                         
/*
 * 
 * Explicit wait is applicable for a specific webElement. If you think if a particular webelement is taking more than time than other elements, then we 
 * will go with explicit wait for that particular webElement
 */

public class SS11_ExplicityWait_Demo {
	static WebDriver driver=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		//WebElement searchBox= driver.findElement(By.id("APjFqbbbbb"));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.visibilityOf(searchBox));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q1111")));

		
		//searchBox.sendKeys("explicit wait");
		driver.findElement(By.name("q")).sendKeys("Explicit wait");
	}
}
