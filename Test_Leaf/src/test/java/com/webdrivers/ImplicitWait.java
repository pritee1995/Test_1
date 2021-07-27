package com.webdrivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWait {
	
	@Test
	public void ImplicitWaitModule(){
		System.setProperty("webdriver.chrome.driver","E:\\CHROMEDRIVER\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver w;
		
		w=new ChromeDriver();
		w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		w.get("http://leafground.com/pages/Window.html");
		w.navigate().back();
		w.navigate().forward();
		w.navigate().refresh();

}
}
