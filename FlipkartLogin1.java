package MultipleThreadingConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlipkartLogin1 {
	
	WebDriver Driver;
	
	FlipkartLogin1(WebDriver Vikas){
		
	Driver = Vikas;
	
	}

	By Email    = By.name("inputEmail");
	
	By Password = By.name("inputPassword");
	
	By Login    = By.id("submitLogin");
	
	public void EnterUserName (String Abhinash)
	{
	Driver.findElement(Email).sendKeys(Abhinash);
	}
	public void EnterPassword (String Mishra)
	{
	Driver.findElement(Password).sendKeys(Mishra);
	}
	public void Login ()
	{
	Driver.findElement(Login).click();
	}
	
}

