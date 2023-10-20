package SelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleMic {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver Driver;
		
		Driver = new ChromeDriver();
		
		Driver.manage().window().maximize();
		
		Driver.get(" https://www.google.com/ ");
		
		Driver.findElement(By.xpath("//div[@class = 'XDyW0e'] ")).click();
		
		Thread.sleep(8000);

	}

}
