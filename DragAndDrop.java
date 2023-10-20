package SelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver Driver;
		
		Driver = new EdgeDriver();
		
		Driver.manage().window().maximize();
		
		Driver.get("https://jqueryui.com/droppable");
		
		String Vikas = Driver.getTitle();
		
		System.out.println("Window title---------->" + Vikas);
		
		Thread.sleep(5000);
		
        JavascriptExecutor Mishraji = (JavascriptExecutor) Driver;
		
		Mishraji.executeScript("window.scrollBy(0,310)", "");
		
		WebElement Abhi = Driver.findElement(By.tagName("iframe"));
		
		Driver.switchTo().frame(Abhi);
		
		WebElement Drag = Driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement Drop = Driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Thread.sleep(6000);
		
		Actions ACT = new Actions(Driver);
		
		ACT.dragAndDrop(Drag, Drop).perform();
		
		Thread.sleep(5000);
		
		Driver.close();
	
	}

}
