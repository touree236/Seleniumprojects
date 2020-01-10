package com.class07;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class TC2 extends CommonMethods {

//	TC 2: Verify element is clickable
//
//	Open chrome browser
//	Go to “https://the-internet.herokuapp.com/”
//	Click on “Click on the “Dynamic Controls” link
//	Select checkbox and click Remove
//	Click on Add button and verify “It’s back!” text is displayed
//	Close the browser 

	public static void main (String[]args) {
	
	 setUp("chrome","https://the-internet.herokuapp.com/");
	
		driver.findElement(By.linkText("Dynamic Controls")).click();
		driver.findElement(By.linkText("checkbox")).click();
		
		//String expectedValue="Susan Mclarean";
		
	
}
}