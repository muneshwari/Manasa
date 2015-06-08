package Elements_dropdown;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class test {
FirefoxDriver driver;
@BeforeMethod
public void setup()
{
	driver=new FirefoxDriver();
	driver.get("http://google.com");
}
}
