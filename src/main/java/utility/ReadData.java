package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData {
	
	public static String readPropertyFile(String value) throws IOException
	{
		Properties p=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\CrossBrowser\\src\\main\\java\\config\\config.properties");
		p.load(file);
		return p.getProperty("value");	
	}
}
