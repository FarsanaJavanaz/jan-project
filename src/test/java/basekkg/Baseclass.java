package basekkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	
		protected WebDriver driver;
		String main="https://www.facebook.com";
		
		@BeforeTest
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get(main);
		}
		

}
