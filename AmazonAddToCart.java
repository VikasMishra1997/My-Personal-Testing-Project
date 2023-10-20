package SelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonAddToCart {
	
	public static void main(String[] args) throws InterruptedException {
				
		WebDriver Driver;
		
		Driver = new EdgeDriver();
		
		Driver.manage().window().maximize();
		
		Driver.get("https://www.amazon.in/");
		
		Driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']")).sendKeys("Wrist watch");
		
		Driver.findElement(By.xpath("//input[@id = 'nav-search-submit-button']")).click();
	
		JavascriptExecutor Mishra = (JavascriptExecutor) Driver;
		
		Mishra.executeScript("window.scrollBy(0,510)", "");
			
		Driver.findElement(By.xpath("//a[@class = 'a-link-normal s-navigation-item']/span[text()='Casio']")).click();
		
		Thread.sleep(6000);
		
        JavascriptExecutor Mishraji = (JavascriptExecutor) Driver;
		
		Mishraji.executeScript("window.scrollBy(0,720)", "");
		
		Driver.findElement(By.xpath("//a[@class='a-link-normal s-navigation-item']/span[text()='25% Off or more']")).click();
		
		Thread.sleep(4000);
		
		JavascriptExecutor Abhi = (JavascriptExecutor) Driver;
		
		Abhi.executeScript("window.scrollBy(0,1010)", "");
		
		Driver.findElement(By.xpath("//a[@class ='a-link-normal s-navigation-item']/span[text ( ) = 'Analogue']")).click();
		
		Driver.findElement(By.xpath("//div[@class = 'a-section a-spacing-small puis-padding-left-micro puis-padding-right-micro']")).click();
		
		Driver.findElement(By.xpath("//span[@class='a-button-inner']/span[text()=' Add all three to Cart ']")).click();	
		
		Thread.sleep(10000);
		
		Driver.close();
			
	}
	
}


