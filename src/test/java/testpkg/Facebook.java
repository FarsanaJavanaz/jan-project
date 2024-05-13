package testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
				
	}
	@Test
	public void test()
	{
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abcd");
		driver.findElement(By.name("login")).click();
	}
	@Test
	public void titleverification()
	{
		String Act=driver.getTitle();
		String exp="Facebook";
		Assert.assertEquals(Act, exp);
	}
	

}
