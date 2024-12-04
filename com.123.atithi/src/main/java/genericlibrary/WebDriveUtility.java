package genericlibrary;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class WebDriveUtility {
	
	 public String captureScreenshot(WebDriver driver, String name) {
	        // Generate the file path and timestamped name
	        String modName = name + "_" + JavaUtility.getTimeStamp();
	        String path = "./Screenshot/" + modName + ".png";
	        
	        // Take screenshot and save it
	        TakesScreenshot ts = (TakesScreenshot) driver;
	        File src = ts.getScreenshotAs(OutputType.FILE);
	        File dest = new File(path);
	        
	        try {
	            // Copy the screenshot to the destination
	            Files.copy(src.toPath(), dest.toPath());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return path;
	    }

}
