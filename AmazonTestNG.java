package VikasTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonTestNG {

	WebDriver Driver;
	@BeforeMethod

	public void OpenBrowser() 

	{
		Driver = new EdgeDriver();

		Driver.get("https://www.amazon.in/");

		Driver.manage().window().maximize();
	}

	@Test(enabled=true)
	public void Test1() throws InterruptedException

	{
		Driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Dell Laptop i7 processor");

		Driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

		JavascriptExecutor Mishra = (JavascriptExecutor) Driver;

		Mishra.executeScript("window.scrollBy(0,510)", "");

		Driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]")).click();

		Thread.sleep(5000);
	}

	@AfterMethod

	public void CloseDriver()
	{

		Driver.close();

	}
}