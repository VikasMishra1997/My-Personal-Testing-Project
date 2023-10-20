package VikasTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SnitchTestNG {
	
	WebDriver Driver;
	@BeforeMethod
	
	public void OpenBrowser()
	{
		Driver = new EdgeDriver();
		
		Driver.get("https://www.snitch.co.in/");
		
		Driver.manage().window().maximize();	
		
		String Vikas = Driver.getTitle();
		
		System.out.println("Print Title---------->" + Vikas);
		
	}
    @Test(enabled=true)
	public void Test1() throws InterruptedException
	{
		Driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		
		Driver.findElement(By.xpath("//a[@class='site-nav__link site-nav__link--icon small--hide']")).click();
		
		Thread.sleep(4000);
		
		Driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Vikas.abhi05@gmail.com");
		
		JavascriptExecutor Mishraji = (JavascriptExecutor) Driver;
		
		Mishraji.executeScript("window.scrollBy(0,510)","");
		
		Thread.sleep(4000);
		
		Driver.findElement(By.xpath("//a[@class='flits-social-login-btn flits-social-login-btn-googleplus']")).click();
		
		Driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Vikas.abhi05@gmail.com");
		
		Driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']")).click();

        Thread.sleep(6000);
        
	}
    
    @AfterMethod
    
    public void Test3()
    
    {
    	Driver.close();
    }
    
}
