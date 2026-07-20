package com.eaf.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
	public static WebDriver getDrriver() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--maximized");
		return new ChromeDriver(options);
		
	}

}
