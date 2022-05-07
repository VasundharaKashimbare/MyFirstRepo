package com.Utils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.BaseClass.BaseClass;

public class ActionClassMethods extends BaseClass{
	static WebDriver driver;
	
	
	//1)clickmethod
	public static void click(WebElement wb)
	{
		new Actions(driver).click(wb).build().perform();
	}
	//2)doubleclick
	public static void doubleClickOnElement(WebElement wb) {
		
		new Actions(driver).doubleClick(wb).build().perform();
	}
	//3)rightclick
	public static void rightclick(WebElement wb)
	{
		new Actions(driver).contextClick().build().perform();
	}
	//4)dragdrop
	public static void dragNdrop(WebElement sr,WebElement tr)
	{
		new Actions(driver).dragAndDrop(sr, tr).build().perform();
	}
	//5)release
	public static void releaseElement(WebElement wb) {
		
		new Actions(driver).release(wb).build().perform();
	}
	//6)clickNhold
	public static void clickNhold(WebElement wb)
	{
		new Actions(driver).clickAndHold(wb).build().perform();
	}
	//7)sendkeys
	public static void gaveDate(WebElement wb,String value)
	{
		new Actions(driver).keyDown(Keys.SHIFT).sendKeys(wb, value).build().perform();

	}
	//8)moveEndpage
	public static void moveEndOfPage() {
		
		new Actions(driver).keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	}
	//9)homepage
	public static void moveHomePage() {
		
		new Actions(driver).keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
	}






}
