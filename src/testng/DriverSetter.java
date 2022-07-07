package testng;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetter {
  static WebDriver driver;
	
	public WebDriver setDrvier(String browser, String url) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = WebDriverManager.chromedriver().create();
			driver.get(url);
			
			
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			driver = WebDriverManager.firefoxdriver().create();
			driver.get(url);
		}
		return driver;
		
		
		
		
	}
}
