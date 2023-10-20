package SelfPractice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeProgram {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver Driver;
		
		Driver = new ChromeDriver();
		
		Driver.manage().window().maximize();
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(15));
		
		Driver.get("https://www.youtube.com/");
		
		String Vikas = Driver.getTitle();
		
		System.out.println("<--------Print Title-------->"+Vikas);
		
		String Youtube = Driver.getWindowHandle();
		
		System.out.println("<--------PRINT YOUTUBE ID-------->"+Youtube);
		
		Driver.findElement(By.linkText("Sign in")).click();
		
		Driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("vikas.abhi05@gmail.com");
		
		Driver.findElement(By.xpath("//span[@jsname='V67aGc'][text()='Next']")).click();

		Driver.findElement(By.xpath("//a[@class='WpHeLc VfPpkd-mRLv6 VfPpkd-RLmnJb']")).click();
		
		Driver.navigate().to("https://www.youtube.com/");
		
		Driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Software Testing Interview For Fresher");
		
		Driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		
		Driver.findElement(By.linkText("Software Testing Mock Interview for Fresher | SoftwaretestingbyMKT")).click();
		
		Thread.sleep(20000);
		
		Driver.navigate().back();
		
		Driver.findElement(By.xpath("//input[@id='search']")).clear();
		
		Driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Paisa Paisa star boy LOC Song");
		
		Driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		
		Driver.findElement(By.linkText("Paisa Paisa (Full Video) | Star Boy LOC | Amit Majithia, Nia Sharma |BCC Music Factory")).click();
			
	}

}
