package genericlibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataUtility {
	public String getDataFromProperties(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\FCI\\Documents\\atiti.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String value=pro.getProperty(key);
		return value;
	}
	

}
