package SelfPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadProgram {

	public static void main(String[] args) throws AWTException {
		
		WebDriver Driver;
		
		Driver = new EdgeDriver();
		
		Driver.manage().window().maximize();
		
		Driver.get("https://demoqa.com/upload-download");
		
		WebElement Upload = Driver.findElement(By.xpath("//input[@class='form-control-file']"));
		
		Actions act = new Actions(Driver);
		
		act.moveToElement(Upload).click().perform();
		
		StringSelection Vikas = new StringSelection("D:\\Shaadi Shopping.xlsx");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Vikas,null);
		
        Robot Mishra = new Robot();
        
        Mishra.delay(5000);
        
        Mishra.keyPress(KeyEvent.VK_CONTROL);
        
        Mishra.keyPress(KeyEvent.VK_V);
        
        Mishra.keyRelease(KeyEvent.VK_CONTROL);
        
        Mishra.keyRelease(KeyEvent.VK_V);
        
        Mishra.keyPress(KeyEvent.VK_ENTER);
        
        Mishra.keyRelease(KeyEvent.VK_ENTER);
	}

}
