package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage {
	WebDriver driver;
	
	@FindBy (id="email")
	WebElement fbun;
	
	@FindBy (id="pass")
	WebElement fbps;
	
	@FindBy (name="login")
	WebElement fbln;
	
	public Fbloginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void fbun(String un)
	{
		fbun.sendKeys(un);
	}
	public void fbps(String ps)
	{
		fbps.sendKeys(ps);
	}
	public void fbln()
	{
		fbln.click();
	}

}
