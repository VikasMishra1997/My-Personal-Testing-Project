package SelfPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BackwardForward {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver Driver;
		
		Driver = new EdgeDriver();
		
		Driver.manage().window().maximize();
		
		Driver.get(" https://www.myntra.com/ ");
		
		Driver.navigate().to(" https://www.amazon.in/ ");
		
		Driver.navigate().back();
		
		Thread.sleep(4000);
		
		Driver.navigate().forward();
		
		Thread.sleep(5000);
		
		Driver.navigate().refresh();
		
		Thread.sleep(8000);
		
		Driver.switchTo().window("  https://www.bajajcapital.com/ ");
		
		Driver.get(" https://www.bajajcapital.com/ ");
		
		Thread.sleep(6000);
		
		Driver.close();
		
	}

}
