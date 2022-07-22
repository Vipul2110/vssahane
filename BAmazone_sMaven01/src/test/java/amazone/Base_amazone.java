package amazone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base_amazone 
{
	public static WebDriver Chromedriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		return driver;
	}
	public static WebDriver Edge()
	{
		System.setProperty("webdriver.edge.driver", "C:\\New folder\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		return driver;
	}


}
