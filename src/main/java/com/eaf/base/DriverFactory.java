package com.eaf.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.eaf.config.ConfigReader;

public class DriverFactory {
	public static WebDriver getDriver() {
		// Read the browser type from config.properties file
		String browser = ConfigReader.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start--maximized");
			return new ChromeDriver(options);
			}
		else if(browser.equalsIgnoreCase("edge")){
			//return new EdgeDriver();
			throw new RuntimeException("Edge browser is not supported yet");
		}
		else if(browser.equalsIgnoreCase("firefox")) {
				//return new FirefoxDriver();
				throw new RuntimeException("Firefox browser is not supported yet");
			}
			
		throw new RuntimeException("Browser not supported");
		}
				
	}


