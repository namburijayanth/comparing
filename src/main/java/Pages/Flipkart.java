package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BASE.SEtup;

public class Flipkart extends SEtup  {


	public Flipkart (WebDriver driver) {

		PageFactory.initElements(driver, this);


	}

	@FindBy(xpath="//input[@type=\"text\"]") WebElement ele;
	@FindBy(xpath="(//img[@loading='eager'])[1]") WebElement ele1;

	public  void iphone() {
		ele.sendKeys("iphone 15 128+gb black");
		ele.sendKeys(Keys.ENTER);
		ele.sendKeys(Keys.ENTER);


	}
	public void phone() {
		ele1.click();

	}
	
}

