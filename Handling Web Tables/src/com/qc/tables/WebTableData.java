package com.qc.tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableData {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/Browser/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		WebElement UserName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		UserName.sendKeys("Admin");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("admin123");
		
		WebElement LogIn = driver.findElement(By.xpath("//input[@type='submit']"));
		LogIn.click();
		

		WebElement Admin=driver.findElement(By.linkText("Admin"));
		Admin.click();
			
		WebElement table = driver.findElement(By.className("table"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("Total rows :"+rows.size());
		
		for(WebElement row:rows) {
			List<WebElement> columns =row.findElements(By.tagName("td"));
			
			for(WebElement col:columns) {
				System.out.println(col.getText());
			}
			System.out.println("----------------------------------");
		}
		
		WebElement LogOutPanel = driver.findElement(By.className("panelTrigger"));
		LogOutPanel.click();
		
		WebElement LogOut = driver.findElement(By.xpath("//a[text()='Logout']"));
		LogOut.click();
		
	
	}

}
