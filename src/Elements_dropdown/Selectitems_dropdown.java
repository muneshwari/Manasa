package Elements_dropdown;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Selectitems_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://amazon.in");
		driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("harry potter");
		driver.findElement(By.className("nav-input")).click();
	}
}
