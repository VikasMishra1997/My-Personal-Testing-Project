package SelfPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandler {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver Driver;
		
		Driver = new EdgeDriver();
		
		Driver.manage().window().maximize();
		
		System.out.println(" Window Handler ");
		
		Driver.get("http://omayo.blogspot.com/");
		
	    Driver.findElement(By.linkText("Open a popup window")).click();
	    
	    Thread.sleep(5000);
	    
	    Set<String> WindowIds = Driver.getWindowHandles();
	    
	    System.out.println("Window id is----------->" + WindowIds);
	    
	    
	    
	   
	    
	}

}
