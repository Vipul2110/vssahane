package Am_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmLogin 
{
	private Actions act;
	@FindBy(xpath="//span [contains(text(),'Account & Lists')]")private WebElement acclist;
	@FindBy(xpath="//span [@class=\'nav-action-inner\']")private WebElement signin;
	@FindBy(xpath="//input [@type='email']")private WebElement email1;
	@FindBy(xpath="//input [@id='continue']")private WebElement continue1;
	@FindBy(xpath="(//input [@type='submit'])[2]")private WebElement nochange;
	@FindBy(xpath="//input [@type='password']")private WebElement pass;
	@FindBy(xpath="//input [@id='signInSubmit']")private WebElement signinf;


	public AmLogin (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void nochange()
	{
		nochange.click();
	}

	public void acclist12(WebDriver driver)
	{
		 act = new Actions(driver);
		act.moveToElement(acclist).click(signin).perform();
	}
	public void email1enter()
	{
		email1.sendKeys("vipulsahane9496@gmail.com");
	}
	public void continue1click()
	{
		continue1.click();
	}
	public void pass()
	{
		pass.sendKeys("Vipul@42@987");
	}
	public void signinf()
	{
		signinf.click();
	}
	
	
	
	

	

}
