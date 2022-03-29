package tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utility.SeleniumHelperBasic;
import pages.POM_AmexHomePage;


public class AMEXVerifyPageElementsExists_TEST_TestNG extends SeleniumHelperBasic{

	SoftAssert softAssertion= new SoftAssert();
	POM_AmexHomePage Local_POM_AmexHomePage;

	@Test()
	public void AMEXVerifyPageElementsExists() throws InterruptedException {

    	System.out.println("--- Started Test");

    	//Navigating To
    	driver.get("https://www.americanexpress.com/");

    	// New Page
    	Local_POM_AmexHomePage = new POM_AmexHomePage(driver);

    	if(Local_POM_AmexHomePage.Log_In_Button_GETTEXT().contains("Log In") && Local_POM_AmexHomePage.About_American_Express_DISPLAYED())
    	{
	    	softAssertion.assertTrue(Local_POM_AmexHomePage.Investor_Relations_DISPLAYED());
	    	softAssertion.assertTrue(Local_POM_AmexHomePage.Careers_DISPLAYED());
	    	softAssertion.assertTrue(Local_POM_AmexHomePage.Site_Map_DISPLAYED());
	    	softAssertion.assertTrue(Local_POM_AmexHomePage.Contact_Us_DISPLAYED());
	    	softAssertion.assertTrue(Local_POM_AmexHomePage.ABOUT_DISPLAYED());
	    	softAssertion.assertTrue(Local_POM_AmexHomePage.Credit_Cards_DISPLAYED());
	    	softAssertion.assertTrue(Local_POM_AmexHomePage.Business_Credit_Cards_DISPLAYED());
	    	softAssertion.assertTrue(Local_POM_AmexHomePage.Corporate_Programs_DISPLAYED());
	    	softAssertion.assertTrue(Local_POM_AmexHomePage.Prepaid_Cards_DISPLAYED());
	    	softAssertion.assertTrue(Local_POM_AmexHomePage.Savings_Accounts_CDs_DISPLAYED());
	    	softAssertion.assertTrue(Local_POM_AmexHomePage.Gift_Cards_DISPLAYED());
    	}
    	else
    	{
	    	softAssertion.assertTrue(Local_POM_AmexHomePage.PRODUCTS_SERVICES_DISPLAYED());
	    	softAssertion.assertTrue(Local_POM_AmexHomePage.Bluebird_DISPLAYED());
	    	softAssertion.assertTrue(Local_POM_AmexHomePage.Accept_Amex_Cards_DISPLAYED());
	    	softAssertion.assertTrue(Local_POM_AmexHomePage.Refer_A_Friend_DISPLAYED());
	    	softAssertion.assertTrue(Local_POM_AmexHomePage.LINKS_YOU_MAY_LIKE_DISPLAYED());
	    	softAssertion.assertAll();
    	}
	}

}
