package com.para;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo2 {
	
	@DataProvider(name="Login")
	public Object[][] getData()
	{
		Object[][] data= new Object[][] {{"Admin","admin123"}};
		return data;
	}
	@Test(dataProvider="Login")
	public void checkLogin(String uname, String pass)
	{
		System.out.println(uname);
		System.out.println(pass);
	}
	@Test 
	public void vaidateMethod()
	{
		Assert.assertEquals("admin", "Admin");
	}

}
