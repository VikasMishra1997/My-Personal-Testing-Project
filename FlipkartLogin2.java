package MultipleThreadingConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartLogin2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver Driver;
		
		Driver = new EdgeDriver();
		
		Driver.manage().window().maximize();
		
		FlipkartLogin1 xyz = new FlipkartLogin1(Driver);
		
		Driver.get(" https://affiliate.flipkart.com/login ");
		
		Thread.sleep(4000);
		
		xyz.EnterUserName(" Vikas.abhi05@gmail.com ");
		
		xyz.EnterPassword("VikasMishra");
		
		Thread.sleep(7000);
		
		Driver.close();

	}

}
