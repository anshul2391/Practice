package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticePageObject {

	WebDriver driver;
	
	PracticePageObject(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath="//11input[@value='radio1']")
	WebElement radioButton;
	
	@FindBy(css= "#autocomplete")
	WebElement autoSuggest;
	
	public void enter(String data) {
		radioButton.click();
		autoSuggest.sendKeys(data);
	}
	
	
}
