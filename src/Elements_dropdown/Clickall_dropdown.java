package Elements_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Clickall_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		WebElement drop=driver.findElement(By.name("country"));
		List<WebElement> dropdown=drop.findElements(By.tagName("option"));
		System.out.println(dropdown.size());
		for (int i = 0; i < dropdown.size(); i++) {
			dropdown.get(i).click();
			if(dropdown.get(i).isSelected()){
	
			  System.out.println(dropdown.get(i).getText() + " is active");
			}
			else {
				System.out.println(dropdown.get(i).getText() + " is inactive");
			}
		}
        driver.close();  
	}

}
