package amazone;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Am_Pom.AmLogin;
import Am_Pom.LogOut_pom;
import Am_Pom.Return_order_Pom;
import Am_Pom.SearchBox_Pom;
import util.Utility;

public class Verify_Amazone_test 
{
	WebDriver driver;
	AmLogin loginpage ;
	SearchBox_Pom box ;
	Return_order_Pom retorder; 
	LogOut_pom signout ;
	
	@Parameters("browserName")
	@BeforeTest
	public void Chrome(String browser)
	{
		if(browser.equals("Chrome"))
		{
			driver=Base_amazone.Chromedriver();
		}
		if(browser.equals("Edge"))
		{
			driver=Base_amazone.Edge();
		}
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@BeforeClass
	public void launchbrowser()
	{
//		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver.exe");
//		driver = new ChromeDriver();
		loginpage = new AmLogin(driver);
		 box = new SearchBox_Pom(driver);
		 retorder = new Return_order_Pom(driver);
		 signout = new LogOut_pom(driver);
	}
	@BeforeMethod
	public void login()
	{
		
        driver.get("https://www.amazon.com/");
		loginpage.acclist12(driver);
    	loginpage.email1enter();
		loginpage.continue1click();
		loginpage.pass();
		loginpage.signinf();
	}
	@Test
	public void test1()
	{
		
		box.selectdrop();
		box.search();
//		String URL = driver.getCurrentUrl();
		String Title = driver.getTitle();
		//Assert.assertEquals(URL, "https://www.amazon.in/s?k=laptop&i=computers&ref=nb_sb_noss");
		Assert.assertEquals(Title, "1Amazon.in : laptop");
	}
	@Test
	public void test2() 
	{
		
		retorder.returnandorder();
	
	}
	@AfterMethod
	public void scr(ITestResult result) throws IOException 
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Utility.captures1(driver);
		}
	}
	public void logout()
	
	{
		
		signout.logout(driver);
	}
	@AfterClass
	public void clearobject()
	{
		loginpage=null;
		box=null;
		retorder=null;
		signout=null;
	}
	@AfterTest
	public void closebrowser()
	{
		driver.close();
		driver=null;
		System.gc();
	}

}
