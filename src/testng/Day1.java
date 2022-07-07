package testng;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Day1 {
     
	//public static void main(String[] args) {
		@Test
		public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anshu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.getTitle();
			
			
			WebElement name= driver.findElement(By.cssSelector("#name"));
			Actions ac = new Actions(driver);
			ac.keyDown(name,Keys.SHIFT).sendKeys("anshul").build().perform();
			
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("scrollTo(0,2100)");
			Thread.sleep(3000);
			WebElement subDriver=driver.findElement(By.cssSelector("#gf-BIG"));
			Thread.sleep(3000);
			subDriver.findElement(By.xpath("///li[@class='gf-li'][3]")).click();
	}
}
