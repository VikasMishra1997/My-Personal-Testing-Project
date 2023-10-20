package SelfPractice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DatePickerProgram {

	public static void main(String[] args) {
		
		System.out.println("Vikas Mishra--------------->");
		
		String Expecteddate = "25";
		
		String Expectedmonth = "September";
		
		String Expectedyear = "2023";
		
		WebDriver Driver;
		
		Driver = new EdgeDriver();
		
		Driver.manage().window().maximize();
		
		Driver.get("https://jqueryui.com/datepicker/");
		
		String Vikas = Driver.getTitle();
		
		System.out.println("Print Title----------->" +Vikas);
		
		Driver.switchTo().frame(0);
		
		Driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
//		Driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-hover']")).click();
		
		while(true)
			
		{
			String month = Driver.findElement(By.xpath("//span[@class = 'ui-datepicker-month']")).getText();

			String year =  Driver.findElement(By.xpath("//span[@class = 'ui-datepicker-year']")).getText();

		if
			(month.equals(Expectedmonth) && year.equals(Expectedyear))
		{
			 List<WebElement> daylist = Driver.findElements(By.xpath("//table/tbody/tr/td"));
			 
		for 
		    (WebElement e:daylist)
		{

			System.out.println(daylist+"******************");
			
			String calenderday = e.getText();
			
		if
		   (calenderday.equals(Expecteddate))
		{
		    e.click();
		    
	    break;
		}
		
		}
		break;
		
		}
		else 
		{
		   Driver.findElement(By.xpath("//span[@class = 'ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		}
		
	}

}
