package SelfPractice;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class FlipkartAddToCart {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver Driver;
		
		Driver = new EdgeDriver();
		
		Driver.manage().window().maximize();
		
		Driver.get(" https://www.amazon.in/ ");
		
		String Vikas = Driver.getTitle();
		
		System.out.println("Amazon Title---------->" + Vikas);
	
		WebElement Vikas1 = Driver.findElement(By.xpath(" //input[@id = 'twotabsearchtextbox'] "));
		
        Vikas1.sendKeys("i phone 14 pro");
		
		Thread.sleep(4000);
		
		Driver.findElement(By.xpath("//div[@class = 'nav-search-submit nav-sprite']")).click();
		
        WebElement Vikas2 = Driver.findElement(By.linkText("Apple iPhone 14 Pro (512 GB) - Silver"));
        
        Vikas2.click();
        
        Thread.sleep(4000);
        
    	JavascriptExecutor jd = (JavascriptExecutor) Driver;
		 
        jd.executeScript("window.scrollBy(0,350)", "");

        Driver.findElement(By.xpath("//input[@id = 'add-to-cart-button']")).click();
        
        Thread.sleep(10000);
        
    //  Driver.findElement(By.xpath("//span[@class='a-button-inner']/span/span[text()='Proceed to checkout (1 item)']")).click();
        
        Driver.findElement(By.xpath("//*[@id='attach-view-cart-button-form']")).click();
        
        Driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
        
        Driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vikas.abhi05@gmail.com");
        
        Driver.findElement(By.xpath("//input[@id='continue']")).click();
        
        TakesScreenshot Take_Screenshot = (TakesScreenshot) Driver;
        
        File src = Take_Screenshot.getScreenshotAs(OutputType.FILE);
  
        FileHandler.copy(src, new File("C:\\Screenshot\\Vikas.png"));
        
        Thread.sleep(5000);
        
        Driver.close(); 
        
	}

}
