package testng;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ExecutionPageModel {

	WebDriver driver;
	DriverSetter set;
	@Test
	public void runningTest() {
		
		set = new DriverSetter();
		
		driver =set.setDrvier("firefox", "https://rahulshettyacademy.com/AutomationPractice/");
		
		PracticePageObject pj = new PracticePageObject(driver);
		PageFactory.initElements(driver, pj);
		pj.enter("ind");
		
	}
	
	@Test
	public void brokenLinks() {
		
		driver =set.setDrvier("firefox", "https://rahulshettyacademy.com/AutomationPractice/");
		WebElement subDriver=driver.findElement(By.cssSelector("#gf-BIG"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollTo(0,2100)");
		
		List<WebElement> lists=subDriver.findElements(By.tagName("a"));
		for(WebElement list: lists) {
			String url =list.getAttribute("href");
			
			//HttpURLConnection huc= (HttpURLConnection)(new URL(url).openConnection());
			
			
		}
		
		
	}
}
