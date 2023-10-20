package SelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstProject {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver Driver;
		
		Driver = new EdgeDriver();
		
		Driver.manage().window().maximize();
				
	    Driver.get(" https://www.amazon.in/ ");
    
        WebElement Search =  Driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']"));
        
	    Search.sendKeys(" Air Conditioner 2 ton Capacity ");
	    
	    WebElement Vikas1 = Driver.findElement(By.xpath("//input[@id ='nav-search-submit-button']"));
	    
        Vikas1.click();
        
        
	    
	    WebDriver Vikas;
	    
	    Vikas = new ChromeDriver();
	    
	    Vikas.manage().window().maximize();
	    
	    Vikas.get(" https://www.flipkart.com/ ");
	    
	    Thread.sleep(4000);
	    
	    Vikas.findElement(By.xpath("//button[@class = '_2KpZ6l _2doB4z']")).click();
	    
	    
	    Vikas.findElement(By.className("_3704LK ")).sendKeys(" Dual Door Fridge ");
	    
	    
	    WebElement Click = Vikas.findElement(By.xpath(" //button[@class = 'L0Z3Pu'] "));
	    
	    Click.click();
	    
	}

}
