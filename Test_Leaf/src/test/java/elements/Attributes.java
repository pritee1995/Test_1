package elements;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	 

	public class Attributes {
	    
	    public static WebElement emailid(WebDriver d1) {
	        return d1.findElement(By.id("ap_email"));
	    }
	    
	    
	    public static WebElement login_button(WebDriver d1) {
	        return d1.findElement(By.id("continue"));
	    }

	 

	
}
