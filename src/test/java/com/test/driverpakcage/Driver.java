package com.test.driverpakcage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
	
	public WebDriver driver;
	
	public void __initializeDriver(){
		System.out.println("initializing driver..");
		driver = __chromeDriver();
	}
	
	public WebDriver __chromeDriver(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		// Initialize browser
		driver = new ChromeDriver(options);
		return driver;
	}
	
	public WebDriver __ieDriver(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		// Initialize browser
		driver = new ChromeDriver(options);
		return driver;
	}
	
	public WebDriver __firefoxDriver(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		// Initialize browser
		driver = new ChromeDriver(options);
		return driver;
	}

}
