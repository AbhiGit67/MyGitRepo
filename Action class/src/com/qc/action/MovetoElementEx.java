package com.qc.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MovetoElementEx {
	
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/Browser/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		driver.get("https://www.facebook.com/");
		
		WebElement txtUser = driver.findElement(By.id("email"));
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		Action seriesOfActions= builder.moveToElement(txtUser).click().keyDown(txtUser,Keys.SHIFT).sendKeys(txtUser,"hello").
				                                                      keyUp(txtUser,Keys.SHIFT).doubleClick(txtUser).contextClick().build();
		
		seriesOfActions.perform();
	

 }
}
