package Am_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut_pom 
{
	@FindBy(xpath="//span [contains(text(),'Account & Lists')]")private WebElement acclist;
	@FindBy(xpath="//span [contains(text(),'Sign Out')]")private WebElement logout;
	public LogOut_pom (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void logout(WebDriver driver)
	{
		Actions signout =new Actions(driver);
		signout.moveToElement(acclist).click(logout).perform();
	}

}
