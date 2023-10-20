package SelfPractice;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SaucelabsProgram {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver Driver;
		
		Driver = new EdgeDriver();
		
		Driver.manage().window().maximize();
		
		Driver.get("https://www.Saucelabs.com");
		
		String Vikas = Driver.getTitle();
		
		System.out.println("Print Title--------->"+Vikas);
		
		Driver.findElement(By.xpath("//button[@class='onetrust-close-btn-handler banner-close-button ot-close-icon']")).click();
		
		Driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textDark MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-text MuiButton-textDark MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-disableElevation css-zaj0tr']")).click();
		
		Thread.sleep(4000);
		
	    Set<String> Parent = Driver.getWindowHandles();
		
		System.out.println("Window Id------->"+Parent);
		
		Driver.getWindowHandles();
		
		System.out.println("Hello Saucelabs");
		
		java.util.Iterator<String>itr = Parent.iterator();
		
		itr.next();
		
        String ChildWindow1 = itr.next();
		
		Driver.switchTo().window(ChildWindow1);
		
		System.out.println(Driver.getTitle());
		
		Driver.findElement(By.xpath("//input[@id='idToken1']")).sendKeys("Vikas.abhi05@gmail.com");
		
		Driver.findElement(By.xpath("//input[@id='idToken2']")).sendKeys("123456789");
		
		Thread.sleep(5000);
		
		Driver.quit();
		
	}

}
