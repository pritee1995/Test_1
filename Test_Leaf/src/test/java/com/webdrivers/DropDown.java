package com.webdrivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
    static WebDriver d1;
    @Test
    public void dropDown() {
        
        System.setProperty("webdriver.chrome.driver", "E:\\CHROMEDRIVER\\chromedriver_win32\\chromedriver.exe");
        d1=new ChromeDriver();
        d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        d1.get("http://leafground.com/");
        d1.manage().window().maximize();
        d1.findElement(By.linkText("Drop down")).click();
        
        //select by index
        WebElement selectByIntex = d1.findElement(By.id("dropdown1"));
        Select select=new Select(selectByIntex);
        select.selectByIndex(2);
        
        //Select By Text
        WebElement selectBytext = d1.findElement(By.name("dropdown2"));
        Select selectText=new Select(selectBytext);
        selectText.selectByVisibleText("Loadrunner");
        
        //Select By Value
        WebElement selectByvalue = d1.findElement(By.id("dropdown3"));
        Select selectvalue=new Select(selectByvalue);
        selectvalue.selectByValue("3");
        
       
    }
  }

