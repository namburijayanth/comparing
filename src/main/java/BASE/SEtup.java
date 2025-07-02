package BASE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SEtup {
	public  static WebDriver driver;
	public void setup()  {
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
	
		
		
		
		
		


	}
}
