package MultipleThreadingConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstThreadingProgram {
		
		WebDriver driver; 
		//constructor
		FirstThreadingProgram(WebDriver d){
			driver =d;
		}
		By username = By.id("user-name");
		
		//WebElement username = driver.findElement(By.id("user-name"));
		By password = By.id("password"); 
		By login_btn = By.name("login-button");
		
		public void enterusername(String uname)
		{
			driver.findElement(username).sendKeys(uname);
		}
		public void enterpswd(String pswd)
		{
			driver.findElement(password).sendKeys(pswd);
		}
		
		public void clickBtn()
		{
			driver.findElement(login_btn).click();
		}
		
		
	}
