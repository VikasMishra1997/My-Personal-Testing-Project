package SelfPractice;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandlerIteratorProgram {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver Driver;
		
		Driver = new EdgeDriver();
		
		Driver.manage().window().maximize();
		
		Driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String Vikas = Driver.getTitle();
		
		System.out.println("Print Title------------>" +Vikas);
		
		String Parent = Driver.getWindowHandle();
		
		System.out.println("Main Window id-------->" + Parent);
		
		Driver.findElement(By.xpath("//button[@id='newWindowBtn']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(4000);
		
		Driver.findElement(By.xpath("//button[@id='newTabBtn']")).click();
		
		Thread.sleep(4000);
		
		Driver.findElement(By.xpath("//button[@id='newWindowsBtn']")).click();
		
		Thread.sleep(4000);
		
		Set<String> Child = Driver.getWindowHandles();
		
		System.out.println("Windows id------->" + Child);
		
		java.util.Iterator<String>itr = Child.iterator();
		
		itr.next();
		
		String ChildWindow = itr.next();
		
		Driver.switchTo().window(ChildWindow);
		
		System.out.println("window 1st------>"+ChildWindow);
		
		String ChildWindow1 = itr.next();
		
		Driver.switchTo().window(ChildWindow1);
		
		System.out.println("window 2nd------>"+ChildWindow1);
		
		String ChildWindow2 = itr.next();
		
		System.out.println("Window 3rd------->"+ChildWindow2);
		
		Driver.switchTo().window(Parent);
		
		System.out.println("Parent Windows--------->"+Parent);
		
		Driver.quit();
		
		System.out.println(" Window Handler With Iterator Program Successfully Completed ");
	}

}
