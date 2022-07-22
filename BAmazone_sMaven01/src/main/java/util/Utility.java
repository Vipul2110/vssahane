package util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility
{	
	
	public static void captures1(WebDriver driver) throws IOException
	{
		
		String time = new SimpleDateFormat("DD_mm_yyyy  HH_mm_ss").format(new Date());
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\vipul\\OneDrive\\Desktop\\PROJECT data\\vipul "+time+".jpg");
		FileHandler.copy(source, dest);
	}

	
}
//testcase101 "+time+".jpg