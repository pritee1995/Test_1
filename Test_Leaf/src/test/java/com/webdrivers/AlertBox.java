package com.webdrivers;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertBox {     
	    @Test
	    public void alertModule() throws InterruptedException, AWTException {
	    	
	        System.setProperty("webdriver.chrome.driver","E:\\CHROMEDRIVER\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://demoqa.com/alerts");
	        driver.manage().window().maximize();
	        // This step will result in an alert on screen
	        WebElement element = driver.findElement(By.id("promptButton"));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
	        Alert promptAlert  = driver.switchTo().alert();
	        String alertText = promptAlert.getText();
	        System.out.println("Alert text is " + alertText);
	        //Send some text to the alert
	        Thread.sleep(5000);
	        promptAlert.sendKeys("PRITEE");
	        promptAlert.accept();
	        Thread.sleep(5000);
	        String text = driver.findElement(By.xpath("//span[@id='promptResult']")).getText();
	        System.out.println(text);
	    }
	}


