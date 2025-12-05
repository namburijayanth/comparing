package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BASE.SEtup;

public class Amzon extends SEtup {
	
	
	public  Amzon(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='text']") WebElement obj;
	@FindBy(xpath="(//img[@class=\"s-image\"])[1]") WebElement obj1;
	public void iphonessss() {
		obj.sendKeys("iphone 15 128+gb black");
		obj.sendKeys(Keys.ENTER);		
	}
	public void phonesd() {
		obj1.click();
	}
}

