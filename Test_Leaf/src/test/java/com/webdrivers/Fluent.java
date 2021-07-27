package com.webdrivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class Fluent {
	@Test
	public void FluentWaitModule(){
		System.setProperty("webdriver.chrome.driver","E:\\CHROMEDRIVER\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver w;
		
		w=new ChromeDriver();
		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		w.get("http://www.leafground.com/");
		w.findElement(By.linkText("Edit")).click();
		FluentWait var_wait=new FluentWait(w);
					.withTimeout(20,TimeUnit.SECONDS)
					.pollingEvery(5,TimeUnit.SECONDS)
					.ignoring(NoSuchElementException.class);
					
		var_wait.until(ExpectedConditions.numberOfwindowsToBe(2));
		w.findElement(By.id("email")).sendKeys("priteebhosale@gmail.com");
		
		
	}
}

