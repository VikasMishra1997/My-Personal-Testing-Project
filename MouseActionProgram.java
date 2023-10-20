package SelfPractice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionProgram {

	public static void main(String[] args) {
		
		WebDriver Driver;
		
		Driver = new EdgeDriver();
		
		Driver.manage().window().maximize();
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Driver.get("https://www.amazon.in/");
		
		String Vikas = Driver.getTitle();
		
		System.out.println("AMAZON TITLE PRINT---------->"+Vikas);
		
		Driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(" SAMSUNG WASHING MACHINE 7.5KG fRONT LOADED");
		
		Driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
//		Driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).sendKeys(Keys.ENTER);
		
		WebElement Search = Driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
//		Search.click();
		
		Actions Mishraji = new Actions (Driver);
		
		Mishraji.moveToElement(Search).build().perform();
		
		Mishraji.scrollByAmount(0,310).build().perform();
		
	//	Mishraji.doubleClick(Search).build().perform();
		
		Mishraji.contextClick(Search).perform();
		
		Driver.close();
		
	}

}
