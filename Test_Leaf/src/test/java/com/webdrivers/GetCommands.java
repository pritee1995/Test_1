package com.webdrivers;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetCommands {
	@Test
	
	public void GetCommandModule(){
		System.setProperty("webdriver.chrome.driver","E:\\CHROMEDRIVER\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver w;
		
		w=new ChromeDriver();
		w.get("http://leafground.com/pages/Window.html");
		w.findElement(By.id("home")).click();
		Set<String> window_value=w.getWindowHandles();
		Iterator<String> iter=window_value.iterator();
		String w1=iter.next();
		String w2=iter.next();
		w.switchTo().window(w2);
		System.out.println(w1);
		System.out.println(w2);
		String title_child=w.getTitle();
		System.out.println(title_child);

	String url=w.getCurrentUrl();
	String sou=w.getPageSource();
	System.out.println(url);
	System.out.println(sou);
}
}
