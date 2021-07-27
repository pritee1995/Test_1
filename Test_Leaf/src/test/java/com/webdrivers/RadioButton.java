package com.webdrivers;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButton {
    static WebDriver d1;
    @Test
    public void radioButton() throws IOException, InterruptedException {
     System.setProperty("webdriver.chrome.driver","E:\\CHROMEDRIVER\\chromedriver_win32\\chromedriver.exe");
        d1=new ChromeDriver();
        d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        d1.get("http://leafground.com/");
        d1.manage().window().maximize();
        
        //Radio Button Module
        d1.findElement(By.linkText("Radio Button")).click();
        
        //Find default selected radio button
        List<WebElement> checkselect = d1.findElements(By.name("news"));
        System.out.println("Find default selected radio button:");
        for (WebElement verifyselect : checkselect) {
            
            
            if (verifyselect.isSelected()) {
                String text = verifyselect.getAttribute("value");            
                        System.out.println(text);      
            }
        }
    }
}