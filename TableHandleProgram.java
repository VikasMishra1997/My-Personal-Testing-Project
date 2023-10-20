package SelfPractice;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TableHandleProgram {

	public static void main(String[] args) {
		
		WebDriver Driver;
		
		Driver = new EdgeDriver();
		
		Driver.manage().window().maximize();
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		System.out.println(" SELENIUM TABLE HANDLE PROGRAM ");
		
		Driver.get("C:\\Users\\Admin\\Downloads\\table.html");
		
		String Mishraji = Driver.getTitle();
		
		System.err.println("Print title--------------->"+Mishraji);
		
		WebElement Vikas = Driver.findElement(By.xpath("//table/tbody/tr/td[3][text()='Ram']"));
		
		String Text = Vikas.getText();
		
		System.out.println("Print Text---------->"+Text);
		
		WebElement Row = Driver.findElement(By.xpath("//table/tbody/tr/td[3][text()='Ram']"));
		
		System.out.println("Print Row Dimension-------->"+Row.getSize());
		
		List<WebElement> Table = Driver.findElements(By.xpath("//table/tbody/tr"));
		
		System.out.println("Print Complete Table Dimension--------->"+Table.size());
		
		List<WebElement> Column = Driver.findElements(By.xpath("//table/tbody/tr"));
		
		System.out.println("Print All Column Dimension------>"+Column.size());
		
		org.openqa.selenium.Dimension Anoop = Driver.findElement(By.xpath("//table/tbody/tr")).getSize();
		
        System.out.println("Size1------>"+Anoop.height);
        
        System.out.println("Size2------>"+Anoop.width);
        
        for (int r=2; r<= Table.size();r++)
        	
        {
        
        for (int c=1; c<= Column.size();c++)
        	
        {
        	
        String Data = Driver.findElement(By.xpath("//table/tbody/tr["+r+"]/td["+c+"]")).getText();
        
        System.out.println("<--------------->"+Data);
        
        }
        
        }
        
        Driver.close();
	}

}
 