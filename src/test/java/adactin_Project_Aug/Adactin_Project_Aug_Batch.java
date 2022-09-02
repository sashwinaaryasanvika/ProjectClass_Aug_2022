package adactin_Project_Aug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass_aug.BaseClass_Aug;

public class Adactin_Project_Aug_Batch extends BaseClass_Aug{
	
	
	public static void main(String[] args) {
		
		browserName("Chrome");

		//driver.get("https://adactinhotelapp.com/");
		
		getUrl("https://adactinhotelapp.com/");
		
		WebElement user = driver.findElement(By.id("username"));
		inputTextBox(user, "arvind19");
		//user.sendKeys("arvind19");
		
		WebElement pass = driver.findElement(By.id("password"));
		inputTextBox(pass, "12345678");
		//pass.sendKeys("12345678");
		
		WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
		clickButton(login);
		//login.click();
		
		close();
		//driver.close();
		
		
	}

}
