package com.qc.action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo {
	
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "E:/Browser/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///D:/testing/Offline%20Website/index.html");
		
		WebElement email = driver.findElement(By.id("email"));
		
		Actions actions = new Actions(driver);
		Action action = actions.moveToElement(email).click()
				               .keyDown(Keys.SHIFT)
				               .sendKeys("queue")
				               .doubleClick()
				               .contextClick()
				
				               .build();
		action.perform();
		                      
		           
		
	}

}
