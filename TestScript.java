package browserhandling;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;

public class TestScript
{
	public static void main(String[] args) throws InterruptedException
	
	{
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		//enter username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
    	Thread.sleep(2000);
		
		//enter password
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
    	Thread.sleep(2000);
    	
    	
		//click on login button
		
		driver.findElement(By.id("login-button")).click();
	
		Thread.sleep(2000);
  }
}	
		
