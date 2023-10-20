package SelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownProgram {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver Driver;
		
		Driver = new EdgeDriver();
		
		Driver.manage().window().maximize();
		
		Driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		String Vikas = Driver.getTitle();
		
		System.out.println("Print Title----------->" + Vikas);
		
        JavascriptExecutor Mishra = (JavascriptExecutor) Driver;
		
		Mishra.executeScript("window.scrollBy(0,510)", "");
		
		Select Country = new Select(Driver.findElement(By.name("country")));
		
		Country.selectByVisibleText("INDIA");
		
		Thread.sleep(5000); 
		
		Country.selectByIndex(55);
		
		Thread.sleep(6000);
		
		String Anoop =Driver.getWindowHandle();
		
		System.out.println("Bhai Ki id----------->"+Anoop);
		
		Driver.close();
	}

}