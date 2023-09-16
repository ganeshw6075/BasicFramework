package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.HomePage;
import com.qa.testbase.TestBase;


public class HomePageTest extends TestBase
{   
	public static HomePage h;
    @Test
	public void verifytheFunctionalityofSearchBox()
	{
		h=new HomePage();
		h.EnterTextInSearchBox();
		h.ClickOnSearchButton();
	}
    
    @Test
    public void VerifytheFunctionalityofDropdown()
    {
    	h=new HomePage();
        h.SelectAnyOneOptionDropDown();
    }

    @Test
    public void VerifyFunctionalityofSearchButton()
    {   h=new HomePage();
    	h.clickonSearchButton();
    }
    
    @Test
    public void VerifyFunctionalityofSportElement()
    {   h=new HomePage();
    	h.MouseOverOnSportElement();
    	
    }
    @Test
    public void VerifyFuctionalityClickonLiveElement()
    {   h=new HomePage();
    	h.clickonLiveElement();
    }
    
    @Test
    public void FlowofProductBuyging()
    {   h=new HomePage();
    	h.EnterTextInSearchBox();
		h.ClickOnSearchButton();
		h.ClickonMobileElement();
    	
    }
}
