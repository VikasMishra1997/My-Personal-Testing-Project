package MultipleThreadingConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondThreadingProgram {

			public static void main(String[] args) {
				
				WebDriver driver;
				
				driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				// create object of Loginpage
				FirstThreadingProgram lpg = new FirstThreadingProgram(driver);
				
				driver.get("https://www.saucedemo.com/");
				
				lpg.enterusername("problem_user");
				/*public void enterusername(String uname)
				{
					driver.findElement(username).sendKeys(uname);
				}*/
				
				lpg.enterpswd("secret_sauce");
				
				lpg.clickBtn();

	}

}
