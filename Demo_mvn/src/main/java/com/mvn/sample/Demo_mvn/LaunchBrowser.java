package com.mvn.sample.Demo_mvn;

import org.openqa.selenium.WebDriver;

public class LaunchBrowser {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/demo-Mvn-Proj/Demo_mvn/driver/chromedriver.exe");
		
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.getTitle());
		
	}
	
	

}
