package com.TestLayer;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.PageLayer.Loginpage;

public class LoginpageTest extends BaseClass{
	
	@BeforeClass
	public void setup()
	{
		BaseClass.BrowserSetUpmethod();
	}
	@Test(priority=1)
	public void LoginValidation()
	{
		Assert.assertEquals(driver.getTitle().contains("HRM"),true);
	}
	@Test(priority=2)
	public void EnterDataToLoginpage()
	{
		Loginpage obj=new Loginpage();
		obj.loginfunction("Admin", "admin123");
	}
	@Test(priority=3)
	public void teardwoun()
	{
		driver.quit();
	}
	
}	


