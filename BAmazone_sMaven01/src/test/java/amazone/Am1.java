package amazone;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Am_Pom.AmLogin;
import Am_Pom.LogOut_pom;
import Am_Pom.Return_order_Pom;
import Am_Pom.SearchBox_Pom;

public class Am1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		AmLogin loginpage = new AmLogin(driver);

		loginpage.acclist12(driver);
    	loginpage.email1enter();
		loginpage.continue1click();
		loginpage.pass();
		loginpage.signinf();
		
		//1st case
		SearchBox_Pom box = new SearchBox_Pom(driver);
		box.selectdrop();
		box.search();
		
		//2nd case
		Return_order_Pom retorder = new Return_order_Pom(driver);
		
		retorder.returnandorder();
		
		//logout
		LogOut_pom signout = new LogOut_pom(driver);
		signout.logout(driver);
		
	}
	
	

}
