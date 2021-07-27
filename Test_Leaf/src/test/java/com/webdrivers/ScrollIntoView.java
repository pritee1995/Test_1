package com.webdrivers;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollIntoView {


	    @Test

	 

	    public void script1() throws InterruptedException, IOException, AWTException {

	 

	        System.setProperty("webdriver.chrome.driver", "E:\\CHROMEDRIVER\\chromedriver_win32\\chromedriver.exe");

	 

	        WebDriver d1;

	 

	        d1=new ChromeDriver();

	 

	        d1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        
	        d1.manage().window().maximize();

	 

	        d1.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
	        
	        WebElement ele1=d1.findElement(By.xpath("/html/body/div[2]/section/div[3]/div[1]/div/p[9]/textarea"));
	        JavascriptExecutor jse=(JavascriptExecutor) d1;
	        

	 

	        jse.executeScript("arguments[0].scrollIntoView(true);",ele1);
	     
	     ele1.sendKeys("Pritee");

	 

	        
	        
	        
	        
	    }

	 

	}
	 
