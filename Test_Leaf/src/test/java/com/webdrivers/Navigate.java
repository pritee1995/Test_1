package com.webdrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigate {
	@Test
	
	public void NavigateModule(){
		System.setProperty("webdriver.chrome.driver","E:\\CHROMEDRIVER\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver w;
		
		
		w=new ChromeDriver();
		w.get("http://leafground.com/pages/Window.html");
		w.navigate().back();
		w.navigate().forward();
		w.navigate().refresh();
		w.navigate().to("http://www.irctc.co.in/nget/");
}
}


