package com.qa.testbase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.qa.utility.WebDriverListener;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase
{
	public static WebDriver driver;
	public static EventFiringWebDriver e_driver;
	public static WebDriverListener eventlistener;
	
	@BeforeSuite
    public void start()
    { 
    String br="Chrome"; 
    if(br.equalsIgnoreCase("chrome"))
    {
    	WebDriverManager.chromedriver().setup();
    	 driver=new ChromeDriver();
    }
    else if(br.equalsIgnoreCase("firefox")) 
    {
      WebDriverManager.firefoxdriver().setup();
       driver=new FirefoxDriver();
    }
    else if(br.equalsIgnoreCase("edge")) 
    {
      WebDriverManager.edgedriver().setup();
       driver=new EdgeDriver();
    }
    else
    {
    	System.out.println("Browser not found,please enter valid browser name");
    }
    
    driver.get("https://www.ebay.com/");
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
    e_driver=new EventFiringWebDriver(driver);
    eventlistener=new WebDriverListener();
    e_driver.register(eventlistener);
    driver=e_driver;
    }
    
	@AfterSuite
    public void tearDown()
    {
    	driver.quit();
    }

	
}
