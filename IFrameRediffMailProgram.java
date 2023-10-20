package SelfPractice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IFrameRediffMailProgram {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver Driver;
		
		Driver = new EdgeDriver();
		
		Driver.manage().window().maximize();
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	    Driver.get("https://www.rediff.com/");
		
		String Title = Driver.getTitle();
		
		System.out.println("Window Title----------->"+Title);
		
		Driver.switchTo().frame(0);
		
		WebElement Vikas = Driver.findElement(By.xpath("//span[@id='nseindex']"));
		
		Vikas.click();
		
	    System.out.println("<-------------->"+Vikas.getText());
	    
	    Driver.close();
	    
	    
	}

}
