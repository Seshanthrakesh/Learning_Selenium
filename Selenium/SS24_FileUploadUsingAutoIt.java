package com.Learning.Selenium;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SS24_FileUploadUsingAutoIt {
	public static WebDriver dvr=null;



	public static void main(String[] args) throws Exception {
		dvr=new ChromeDriver();
		dvr.navigate().to("https://the-internet.herokuapp.com/upload");
		dvr.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(dvr, Duration.ofSeconds(35));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("file-upload")));
		WebElement chooseFile=dvr.findElement(By.id("file-upload"));
		Thread.sleep(3000);
		Actions act = new Actions(dvr);
		act.moveToElement(chooseFile).click().build().perform();
		try {
			Runtime.getRuntime().exec("C:\\Users\\Seshanth_Pc\\Desktop\\fileupload.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		Thread.sleep(3000);
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
