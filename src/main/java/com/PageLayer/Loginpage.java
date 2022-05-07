package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class Loginpage extends BaseClass {
	
	@FindBy(id="txtUsername")
	WebElement uname;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement loginbtn;
	
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	public void loginfunction(String username,String pass)
	{
		uname.sendKeys(username);
		password.sendKeys(pass);
		loginbtn.click();
	}

}
