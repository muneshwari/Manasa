package test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		
		driver=new FirefoxDriver();
	   driver.get("http://google.com");     
	}  
		@Test
		public void test()
		{
			driver.findElement(By.linkText("Gmail")).click();
		}
	}
