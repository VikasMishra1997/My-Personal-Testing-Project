package VikasTestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopUpTestNG {

	WebDriver Driver;
	@BeforeMethod

	public void openbrowser()  {

		Driver = new EdgeDriver();
	}

	@Test(enabled=true)
	public void Test1() throws InterruptedException
	{
		Driver.get("https://the-internet.herokuapp.com/javascript_alerts");	
		
		Driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		Driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
	}

	@Test(enabled=true)
	public void Test2() throws InterruptedException
	{
		Driver.get("https://the-internet.herokuapp.com/javascript_alerts");	

		Driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

		Driver.switchTo().alert().accept();
		
		Thread.sleep(5000);

	}

	@Test(enabled=true)
	public void Test3() throws InterruptedException
	{
		Driver.get("https://the-internet.herokuapp.com/javascript_alerts");	

		Driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

		Alert Vikas = Driver.switchTo().alert();

		System.out.println("The Message Display On Alert-------->"+Vikas.getText());

		Vikas.sendKeys("Best of Luck Vikas");	
		
		Thread.sleep(5000);
		
		Driver.switchTo().alert().accept();
	}

	@AfterMethod

	public void closebrowser()
	{
		Driver.close();
	}

}