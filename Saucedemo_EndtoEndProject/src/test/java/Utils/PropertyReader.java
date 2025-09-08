package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	private static Properties properties;

	public static Properties readProperty() {
		if (properties == null) {
			properties = new Properties();
			try {
				// Path to config.properties
				FileInputStream fis = new FileInputStream("C:\\Users\\gopic\\eclipse-workspace\\CapstoneDemo\\Saucedemo_EndtoEndProject\\src\\test\\resources\\Config\\config.properties");
				properties.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException("Failed to load config.properties file!");
			}
		}
		return properties;
	}
	
	
}
