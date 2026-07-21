package com.eaf.config;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;


public class ConfigReader {
	private static Properties properties = new Properties();
	static {
		try {
			FileInputStream fis = new FileInputStream("config.properties");
			properties.load(fis);	
		}
		catch(IOException e){
			throw new RuntimeException("Failed to load .propertied file", e);
			
		}
	}
	
	public static String getProperty(String key) {
		return properties.getProperty(key);
	}
}
