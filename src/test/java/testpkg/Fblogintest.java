package testpkg;

import java.io.IOException;

import org.testng.annotations.Test;

import basekkg.Baseclass;
import pagepkg.Fbloginpage;
import utilities.Excelutilities;

public class Fblogintest extends Baseclass{
	@Test
	public void verifyloginwithvalidcred() throws IOException
	{
		Fbloginpage ob=new Fbloginpage(driver);
		String xl="C:\\Users\\i\\Desktop\\Book1.xlsx";
		String sheet="Sheet1";
		int rowcount=Excelutilities.getrowcount(xl,sheet);
		for(int i=1;i<=rowcount;i++)
		{
			String username=Excelutilities.getcellvalues(xl, sheet, i, 0);
			System.out.println("username "+username);
			String password=Excelutilities.getcellvalues(xl, sheet, i, 1);
			System.out.println("password="+password);
			ob.fbln();
			ob.fbps(password);
			ob.fbun(username);
			
		}
		
		
		
	}


}
