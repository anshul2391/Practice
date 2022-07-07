package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tables {

	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		 driver=WebDriverManager.chromedriver().create();
        driver.get("https://sqengineer.com/practice-sites/practice-tables-selenium/");		
	}

  @Test
  public void click() throws InterruptedException
  {  driver.findElement(By.linkText("https://www.seleniumhq.org/")).click();
	   Thread.sleep(6000);
	  
	  
	  
  }

}
