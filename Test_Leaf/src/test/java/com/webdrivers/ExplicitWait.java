package com.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait {
	
	@Test
	
	public void ExplicitWaitModule(){
		System.setProperty("webdriver.chrome.driver","E:\\CHROMEDRIVER\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver w;
		
		w=new ChromeDriver();
		w.get("http://www.leafground.com/");
		w.findElement(By.linkText("Edit")).click();
		WebDriverWait var_wait=new WebDriverWait(w,20);
		var_wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		w.findElement(By.id("email")).sendKeys("priteebhosale@gmail.com");
}
}