package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
	
	/**
	 * This method will read property from config.properties file
	 * @param propertyName
	 * @return
	 */
	public static String getConfig(String propertyName) {
		Properties config = new Properties();
		try {
			InputStream iStream = new FileInputStream("config.properties");
			config.load(iStream);
		} catch (IOException e) {
			System.out.println("unable to create fileInputStream");
		}
		return config.getProperty(propertyName);
	}
}
