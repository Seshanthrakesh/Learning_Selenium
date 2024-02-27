package com.Learning.Selenium;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKart_TopDeals {
	static WebDriver driver = null;
	public static void main(String[] args) throws Exception {

		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		//String parentwindow=driver.getWindowHandle();
				
		driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
				
		Set<String> allwindows=driver.getWindowHandles();
		for(String eachwindow:allwindows) {
			driver.switchTo().window(eachwindow);
		}

		//page1
		List<WebElement> page1_allcontent=driver.findElements(By.xpath("//tbody/tr/td"));
		for(WebElement page1_content:page1_allcontent)
		{
			String Page1_content=page1_content.getText();
			System.out.println(Page1_content);
		}
		WebElement next=driver.findElement(By.xpath("//a[@aria-label='Next']"));

		if(next.isEnabled()) {

			System.out.println("Next Button is Clicked");
			next.click();
		}else
			System.out.println("No Next Page");

		//page2
		List<WebElement> page2_allcontent=driver.findElements(By.xpath("//tbody/tr/td"));
		for(WebElement page2_content  :page2_allcontent)
		{
			String Page2_content=page2_content.getText();
			System.out.println(Page2_content);
		}	
		if(next.isEnabled()) {

			System.out.println("Next Button is Clicked");
			next.click();
		}else
			System.out.println("No Next Page");

		//page3
		List<WebElement> page3_allcontent=driver.findElements(By.xpath("//tbody/tr/td"));
		for(WebElement page3_content  :page3_allcontent)
		{
			String Page3_content=page3_content.getText();
			System.out.println(Page3_content);
		}	
		if(next.isEnabled()) {

			System.out.println("Next Button is Clicked");
			next.click();
		}else
			System.out.println("No Next Page");


		//page4
		List<WebElement> page4_allcontent=driver.findElements(By.xpath("//tbody/tr/td"));
		for(WebElement page4_content  :page4_allcontent)
		{
			String Page4_content=page4_content.getText();
			System.out.println(Page4_content);
		}	

		if(next.isEnabled()) {

			System.out.println("Next button is displayed");
			next.click();
		}else
			System.out.println("No Next Page");

	}
}
