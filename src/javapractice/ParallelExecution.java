package javapractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {

	private WebDriver driver;
	String syspath = System.getProperty("user.dir");
	
	@Parameters("browser")
	@BeforeTest
	void Steup(String browser){
		
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anshu\\eclipse-workspace\\Practice\\Drivers\\chromedriver.exe");
		
		
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		driver = new ChromeDriver();}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\anshu\\eclipse-workspace\\Practice\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		
		
	};
	
	@Test
	public void getData() {
		
		
		driver.get("https://www.google.com/");
		
		
		
	}
	
	@AfterMethod
	@AfterTest
	void tearDown()
	{
		driver.close();
		System.out.println("driver is closed");
	}
}
