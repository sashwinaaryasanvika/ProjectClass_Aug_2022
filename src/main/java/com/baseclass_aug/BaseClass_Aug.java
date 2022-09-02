package com.baseclass_aug;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass_Aug {
	
	public static WebDriver driver; //Null Driver
	
	public static WebDriver browserName(String browser) {
		
		
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\Driver\\chromedriver1.exe");
			driver=new ChromeDriver();

		}
		
		else if(browser.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +"\\Driver\\FirefoxDriver.exe");
			driver=new FirefoxDriver();
			
			
		}
		driver.manage().window().maximize();
		return driver;
		
	}
	
	//driver.get("https://adactinhotelapp.com/");
	public static void getUrl(String url) {
		driver.get(url);

	}
	
	//driver.close();
	
	public static void close() {
		driver.close();

	}
	
	//login.click();
	public static void clickButton(WebElement element) {
		element.click();

	}
	
	//user.sendKeys("arvind19");
	
	public static void inputTextBox(WebElement element, String inputvalue) {
		
		element.sendKeys(inputvalue);

	}
	
	
	

}
