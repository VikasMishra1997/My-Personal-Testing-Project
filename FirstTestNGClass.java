package VikasTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestNGClass {
	@Test
	
	public void first() {
		
		System.out.println(" I Am Vikas Mishra, The Grate");
		
		
	}
	@Test
	
    public void second() {
    	
    	System.out.println(" Mishra Ji Rock ");
    }
	
WebDriver driver;
	
	@BeforeMethod
	
	public void openbrowser() {
		
		driver = new EdgeDriver();
		
	}
	@Test(enabled=true)
	public void test1() 
	{
		driver.get("https://www.amazon.in/");
		WebElement Searchbar = driver.findElement(By.id("twotabsearchtextbox"));
		Searchbar.sendKeys("Mobile");
		Searchbar.sendKeys(Keys.ENTER);
		
	}
	@Test(enabled=true)
	public void test2() 
	{
		driver.get("https://www.flipkart.com/");
		WebElement Searchbar = driver.findElement(By.name("q"));
		Searchbar.sendKeys("Mobile");
		Searchbar.sendKeys(Keys.ENTER);
	}
	
	@AfterMethod
	public void closebrowser() {
		driver.close();
	}
}
