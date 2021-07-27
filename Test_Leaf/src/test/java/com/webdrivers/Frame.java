package com.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frame {
	@Test

	public void frameModule(){
	
    System.setProperty("webdriver.chrome.driver","E:\\CHROMEDRIVER\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver w;
		
		w=new ChromeDriver();
		w.get("http://leafground.com/pages/frame.html");
		//frame
		w.switchTo().frame(0);
		w.findElement(By.id("Click")).click();
		w.switchTo().defaultContent();
		}
}
