package com.para;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {
	
	@Test(priority=1)
	@Parameters("Mumbai")
		public void states(String M)
		{
			System.out.println("This is the India state method");
			System.out.println(M+" is the captsl of maharashtra ");
		}
	@Test(priority=2)
	@Parameters("Panaji")
	public void s1(String P)
	{
		System.out.println(P+ " is the capital of goa");
	}
	@Test(priority=3)
	@Parameters("Benglore")
	public void s2(String B)
	{
		System.out.println(B+ " is the caital of Karnataka");
	}



}
