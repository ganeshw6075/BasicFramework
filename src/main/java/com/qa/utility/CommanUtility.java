package com.qa.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.qa.testbase.TestBase;

public class CommanUtility extends TestBase 
{
	public static void ScreenShot() 
	{
     TakesScreenshot ts=(TakesScreenshot)driver;
     File scr = ts.getScreenshotAs(OutputType.FILE);
     File des=new File("C:\\Users\\Dell\\eclipse-workspace\\FrameworkBasic\\ScreenShot\\" +System.currentTimeMillis()+".png");
     try {
		FileHandler.copy(scr, des);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
     
	}

}
