package com.eaf.tests;
import com.eaf.base.BaseTest;
import org.testng.annotations.Test;


public class SmokeTest extends BaseTest {
@Test
	public void launchApplication() {
		System.out.println("Application launched successfully");
		System.out.println(driver.getTitle());
	}


}
