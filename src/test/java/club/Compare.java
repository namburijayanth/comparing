package club;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BASE.SEtup;
import Pages.Amzon;
import Pages.Flipkart;

public class Compare extends  SEtup {
	Amzon jay;
	Flipkart jay1;
	public static String amzoniphone;

	public static String flipkartiphone;

	@BeforeMethod
	public void compares() {
		setup();
		jay= new Amzon(driver);
		jay1= new Flipkart(driver);
	}
	@Test(priority=2)
	public void drop() {
		driver.get("https://www.amazon.in/");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		jay.iphonessss();
		jay.phonesd();
		amzoniphone=driver.findElement(By.xpath("(//span[text()='60,000'])[5]")).getText().replace(",", "");
		
		System.out.println( "amzon:"+amzoniphone);
		

	}
	@Test(priority=1)
	public void a() {
		driver.get("https://www.flipkart.com/");
		jay1.iphone();
		jay1.phone();
		flipkartiphone=driver.findElement(By.xpath("(//div[text()='₹64,900'])[1]")).getText().substring(1).replace(",", "");
		
		System.out.println( "flipkart:"+flipkartiphone);
	}
	@Test(priority=3)
	public void comparing() {

		int jay=Integer.parseInt(amzoniphone);
		int num2=Integer.parseInt(flipkartiphone);

		if(jay<num2) {System.out.println("amazon price is less");}
		else if(jay>num2) {System.out.println("flipkart price is less");}
		else {System.out.println("not");}
	}
}
