package com.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


         
public class Test1 {
	@Test
	
	public void script1()
	{
		System.setProperty("webdriver.chrome.driver","E:\\CHROMEDRIVER\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d1;
		
		d1=new ChromeDriver();
		
		d1.get("http://leafground.com/");
		d1.findElement(By.linkText("Edit")).click();
		d1.findElement(By.id("email")).sendKeys("priteebhosale@gmail.com");
		d1.findElement(By.cssSelector("input[value='Append']")).clear();
		d1.findElement(By.cssSelector("input[value='Append']")).sendKeys("Pritee");
		d1.findElement(By.name("username")).clear();
		d1.findElement(By.name("username")).sendKeys("P");
		d1.findElement(By.xpath("//input[@name='Clear me!!']")).sendKeys("clear");
			}
}
