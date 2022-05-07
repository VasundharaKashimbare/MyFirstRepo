package com.Utils;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;

import com.BaseClass.BaseClass;

public class JavaScriptMethods extends BaseClass {
	JavascriptExecutor js= (JavascriptExecutor)driver;
	
	public static  void openBrowser(String url)
	{
		((JavascriptExecutor)driver).executeScript("window.location='" + url +"';");
	}
	
	public static void ClickMethod(WebElement wb)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",wb);
	}
	public static void SendkeysMethod(WebElement wb,String value)
	{
		((JavascriptExecutor)driver).executeScript("document.getElementById('id').value='"+ value +"';",wb);
	}
	public static void borderMethod(String color)
	{
		((JavascriptExecutor)driver).executeScript("document.getElementById().style.borderColor="+ color+ "");
	}

	public static void AlertMethod(WebElement wb,String Text)
	{

	((JavascriptExecutor)driver).executeScript("alert('This is alert popup')");
	}
	
	public static void refeshMethod()
	{
		((JavascriptExecutor)driver).executeScript("history.go(0)");
	}
	public static void navigatemethod()
	{
		((JavascriptExecutor)driver).executeScript("history.go(-1)");//one step backword
	}
	public static void forwordMethod()
	{
		((JavascriptExecutor)driver).executeScript("history.go(1)");
	}



}
