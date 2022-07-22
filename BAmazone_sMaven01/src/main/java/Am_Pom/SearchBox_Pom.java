package Am_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchBox_Pom 
{	
	@FindBy(xpath="//select[@aria-describedby='searchDropdownDescription']")private WebElement selectdrop;
	@FindBy(xpath="//input [@type='text']")private WebElement searchdropdown;
	@FindBy(xpath="//input [@id='nav-search-submit-button']")private WebElement searchbutton;

	
	public SearchBox_Pom (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void selectdrop() 
	{
		selectdrop.click();
		Select drop = new Select(selectdrop);
		drop.selectByVisibleText("Computers");
	}
	public void search()
	{
		searchdropdown.sendKeys("laptop");
		searchbutton.click();
	}

}
