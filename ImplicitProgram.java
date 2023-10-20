package SelfPractice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ImplicitProgram {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver Driver;
		
		Driver = new EdgeDriver();
		
		Driver.manage().window().maximize();
		
    //  Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	 (//SELENIUM WEBDRIVER 3 CODE).
	
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	//	Driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(500));   (//IT WILL BE USED ONLY FOR RUN THE JAVA SCRIPT).
		
		Driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		Driver.findElement(By.xpath("//button[@id='btn1']")).click();
		
	//	Thread.sleep(6000);
		
		Driver.findElement(By.id("txt1")).sendKeys(" VIKAS MISHRA ");
		
		Driver.findElement(By.xpath("//button[@id='btn2']")).click();
		
	//	Thread.sleep(11000);
		
		Driver.findElement(By.id("txt2")).sendKeys(" Ducat The IT Institute ");
		
	}

}
