package Am_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Return_order_Pom 
{
	@FindBy(xpath="//a [@href='/gp/css/order-history?ref_=nav_orders_first']")private WebElement returnAndorder;
	@FindBy(xpath="//li [contains(text(),'Orders')]")private WebElement order;
	@FindBy(xpath="//a [contains(text(),'Buy Again')]")private WebElement buyagain;
	@FindBy(xpath="//a [contains(text(),'Not Yet Shipped')]")private WebElement notyetshipped;
	@FindBy(xpath="//a [contains(text(),'Digital Orders')]")private WebElement digitalorder;
	@FindBy(xpath="//a [contains(text(),'Local Store Orders')]")private WebElement localstore;
	@FindBy(xpath="//a [contains(text(),'Cancelled Orders')]")private WebElement cancelorder;

	public Return_order_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void returnandorder() 
	{
		returnAndorder.click();
		order.click();
		buyagain.click();
		notyetshipped.click();
		digitalorder.click();
		localstore.click();
		cancelorder.click();
	}
	
	
			
					
							
									

}
