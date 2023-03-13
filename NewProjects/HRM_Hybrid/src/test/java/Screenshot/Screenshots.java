package Screenshot;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.utils.FileUtil;

import HRM_CCBR.Utils.Apputils;

public class Screenshots extends Apputils {

	
	
	
	public static void TakeScreenshot(String DestinFilepath) throws IOException
	{
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File ss=ts.getScreenshotAs(OutputType.FILE);
		File destpath=new File(DestinFilepath);
		 FileUtils.copyFile(ss, destpath);
		

	}
	
	 
	
	
	
	
}
