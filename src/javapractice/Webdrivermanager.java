package javapractice;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdrivermanager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//WebDriver driver = WebDriverManager.chromedriver().create();
		WebDriver driver = WebDriverManager.firefoxdriver().create();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
