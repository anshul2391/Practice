package testng;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoSelenium {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		
		driver = WebDriverManager.chromedriver().create();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void alerts() throws IOException, InterruptedException {
		
		driver.findElement(By.xpath("//*[text()='New Tab']")).click();
		
		Set<String> handles =driver.getWindowHandles();
		Iterator<String> it =handles.iterator();
		String parent = it.next();
		String child = it.next();
		
		driver.switchTo().window(child);
		TakesScreenshot ts= (TakesScreenshot)driver;
		File file  = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\anshu\\eclipse-workspace\\Practice\\src\\testng\\image1.jpg"));
		
		System.out.println(driver.getCurrentUrl());
		
		
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//div[@class='element-list collapse show']/ul/li/span[text()='Alerts']")).click();
		File fil  = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fil, new File("C:\\Users\\anshu\\eclipse-workspace\\Practice\\src\\testng\\image2.jpg"));
		Thread.sleep(3000);
		
		//List<WebElement> ls =driver.findElements(By.xpath("//div[@class='element-list collapse show']/ul/li/span"));
		
		//System.out.println("outside");
		
				
				
		}
	}


