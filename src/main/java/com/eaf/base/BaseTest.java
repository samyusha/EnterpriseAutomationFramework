package com.eaf.base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.eaf.config.ConfigReader;

public class BaseTest {
	protected WebDriver driver;
	
	@BeforeMethod
	public void setUP() {
		driver = DriverFactory.getDriver();
		driver.get(ConfigReader.getProperty("baseUrl"));
		
	}
	
	@AfterMethod
	public void tearDown() {
		if(driver!= null) {
			driver.quit();
		}
		
	}
	

}
