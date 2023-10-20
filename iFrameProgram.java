package SelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class iFrameProgram {

	public static <Dimension> void main(String[] args) {
		
		WebDriver Driver;
		
		Driver = new EdgeDriver();
		
		Driver.manage().window().maximize();
		
		Driver.get("https://omayo.blogspot.com/");
		
		JavascriptExecutor Vikas = (JavascriptExecutor) Driver;
		
		Vikas.executeScript("window.scrollBy(0,1170)", "");
		
		org.openqa.selenium.Dimension Frame = Driver.findElement(By.id("iframe1")).getSize();	
		
		System.out.println("Frame Size1-------->"+Frame.height);
		
		System.out.println("Frame Size2-------->"+Frame.width);
		
		//Driver.close();

	}
}
