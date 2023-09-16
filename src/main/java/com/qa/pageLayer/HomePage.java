package com.qa.pageLayer;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.testbase.TestBase;

public class HomePage extends TestBase 
{
    public HomePage()
    {
    	PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//input[@id='gh-ac']")
    private WebElement SearchBox;
    
    public void EnterTextInSearchBox()
    {
    	SearchBox.sendKeys("iphone13");
    }
    
    public void ClickOnSearchButton() 
    {
    	SearchBox.sendKeys(Keys.ENTER);
    }
    
    @FindBy(xpath="//select[@id='gh-cat']")
    private WebElement Dropdown;
    
    public void SelectAnyOneOptionDropDown()
    {
    	Select s=new Select(Dropdown);
    	s.selectByIndex(5);
    	List<WebElement> All_Options = s.getOptions();
    	int count=All_Options.size();
    	System.out.println(count);
    }
    
    @FindBy(xpath="//input[@id='gh-btn']")
    private WebElement SearchButton;
    
    public void clickonSearchButton()
    {
    	SearchButton.click();
    	
    }
    
    @FindBy(xpath="//a[text()='Sports']")
    private WebElement SportsElement;
    
    public void MouseOverOnSportElement()
    {
    	Actions act=new Actions(driver);
    	act.moveToElement(Dropdown).build().perform();
    }
    
    @FindBy(xpath="//div[@class='hl-full-bleed-banner__wrapper']")
    private WebElement LiveElement;
    
    public void clickonLiveElement()
   { 
    	LiveElement.click();
    }
    
    @FindBy(xpath="//h3[text()='NEW 2022 SEALED APPLE IPHONE 13 PRO MAX - ALPINE GREEN 1TB WORLDWIDE UNLOCKED']")
    private WebElement ClickonMobile;
    
    public void ClickonMobileElement()
    {
    	ClickonMobile.click();
    	
    }
    
    
}
