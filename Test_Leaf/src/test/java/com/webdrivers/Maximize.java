package com.webdrivers;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Maximize {
	
	@Test
	
	public void MaximizeModule(){
		System.setProperty("webdriver.chrome.driver","E:\\CHROMEDRIVER\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver w;
		
		w=new ChromeDriver();
		w.get("http://leafground.com/pages/Window.html");
		w.navigate().back();
		w.navigate().forward();
		w.navigate().refresh();
		///w.navigate().to("http://www.irctc.co.in/nget/");
		w.manage().window().maximize();
		Dimension dim=new Dimension(250,350);
		w.manage().window().setSize(dim);
}
}



