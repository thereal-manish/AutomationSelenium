package testcomponents;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BaseTest{
	

	
	WebDriver driver;


	public String getScreenshot(String testCaseName,WebDriver driver) 
	{
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");
		
			try {
				FileUtils.copyFile(source, file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		String fileLocation=System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";
		return fileLocation;
		
		
	}

}
