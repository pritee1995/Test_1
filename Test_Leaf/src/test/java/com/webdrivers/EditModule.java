package com.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditModule {
	
	
	public void EditMod(){
     System.setProperty("webdriver.chrome.driver","E:\\CHROMEDRIVER\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver w;
		
		w=new ChromeDriver();
		w.get("http://leafground.com/pages/Edit.html");
		w.findElement(By.xpath("//input[@id='email']")).sendKeys("pritee123@gmail.com");
		w.findElement(By.xpath("//input[@value='Append']")).clear();
		w.findElement(By.xpath("//input[@value='Append']")).sendKeys("pritee bhosale");
		WebElement ele=w.findElement(By.xpath("//input[@name='username'][1]"));
		System.out.println(ele.getAttribute("value"));
		w.findElement(By.xpath("//input@name='username'][2]")).clear();
		
	}

}
