package com.BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
public static WebDriver driver;
	
	
	public static void BrowserSetUpmethod()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sony\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		driver =new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}


}
