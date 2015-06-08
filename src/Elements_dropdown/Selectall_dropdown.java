package Elements_dropdown;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class Selectall_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ProfilesIni pr=new ProfilesIni();
		//FirefoxProfile fp=pr.getProfile("SeleniumUser");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.in/");
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		List<WebElement> dropdown=drop.findElements(By.tagName("option"));
		System.out.println(dropdown.size());
		for(int i=0;i<dropdown.size();i++)
		{
			System.out.println(dropdown.get(i).getText());
		}
	}

}
