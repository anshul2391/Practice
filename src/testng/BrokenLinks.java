package testng;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {
	
	
	WebDriver driver;
	
	
	@Parameters("browser")
	@BeforeTest
	void Steup(String browser){
		
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anshu\\eclipse-workspace\\Practice\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\anshu\\eclipse-workspace\\Practice\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		
		
	}


	@Test
	public void broken() throws MalformedURLException, IOException {
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.getTitle();
	
	driver.switchTo().defaultContent();
	
	
	driver.findElement(By.cssSelector("#name")).sendKeys("anshul", Keys.SHIFT);
	WebElement subDriver=driver.findElement(By.cssSelector("#gf-BIG"));
	
	
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("scrollTo(0,2100)");
	
	List<WebElement> links=subDriver.findElements(By.tagName("a"));
	 for(WebElement link :links) {
		 String url =link.getAttribute("href");
		 
		 HttpURLConnection  huc =(HttpURLConnection)(new URL(url).openConnection());
		  huc.setRequestMethod("HEAD");
		  huc.connect();
		  int  responseCode = huc.getResponseCode();
		  
		 if(responseCode> 400) {
			 File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(file, new File("C:\\Users\\anshu\\eclipse-workspace\\Practice\\src\\testng\\image.jpg"));
		  System.out.println(link.getText() + ":" + responseCode);
		
		 }
	 }
	
		
	}
}

