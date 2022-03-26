package tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utility.SeleniumHelperBasic;
import pages.POM_BlueBirdLoginPage;
import pages.POM_WikipediaMainPage;


public class testnavigationofpages_TEST_TestNG extends SeleniumHelperBasic{

	SoftAssert softAssertion= new SoftAssert();
	POM_BlueBirdLoginPage Local_POM_BlueBirdLoginPage;
	POM_WikipediaMainPage Local_POM_WikipediaMainPage;

	@Test()
	public void testnavigationofpages() throws InterruptedException {

    	System.out.println("--- Started Test");

    	//Navigating To
    	driver.get("https://secure.bluebird.com/login");

    	// New Page
    	Local_POM_BlueBirdLoginPage = new POM_BlueBirdLoginPage(driver);

    	if(Local_POM_BlueBirdLoginPage.UserName_GETTEXT().equals("aaa"))
    	{
	    	softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.Password_Field_DISPLAYED());
	    	softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.RememberMe_Checkbox_DISPLAYED());
	    	softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.LogIn_Button_DISPLAYED());
	    	softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.Create_an_Account_DISPLAYED());
	    	softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.UsernameSection_DISPLAYED());
	    	softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.Legal_DISPLAYED());
	    	softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.Privacy_Center_First_DISPLAYED());
    	}
    	else
    	{

	    	//Navigating To 
	    	driver.get("https://en.wikipedia.org/wiki/Main_Page");

	    	// New Page
	    	Local_POM_WikipediaMainPage = new POM_WikipediaMainPage(driver);
            if(Local_POM_WikipediaMainPage.Main_page_GETTEXT().equals("Main page"))	
    	
            {
        		softAssertion.assertTrue(Local_POM_WikipediaMainPage.Contents_DISPLAYED());
	    		softAssertion.assertTrue(Local_POM_WikipediaMainPage.Current_events_DISPLAYED());
	    		softAssertion.assertTrue(Local_POM_WikipediaMainPage.Random_article_DISPLAYED());
	    		softAssertion.assertTrue(Local_POM_WikipediaMainPage.Donate_to_Wikipedia_DISPLAYED());
	    		String capturedText_0 = Local_POM_WikipediaMainPage.AboutWikipedia_GETTEXT();
	    		softAssertion.assertEquals(capturedText_0, "About Wikipedia", "capturedText_0 - Failed");
	    		System.out.println("This text was Verified -> \"" + capturedText_0 + "\"");

    		}
    		else
    		{

	    		//Navigating To
	    		driver.get("https://secure.bluebird.com/login");
	    		softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.UserName_DISPLAYED());
	    		softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.Password_Field_DISPLAYED());
	    		softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.RememberMe_Checkbox_DISPLAYED());
	    		softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.LogIn_Button_DISPLAYED());
	    		softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.Create_an_Account_DISPLAYED());
	    		softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.UsernameSection_DISPLAYED());
	    		softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.Legal_DISPLAYED());
	    		softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.Privacy_Center_First_DISPLAYED());	
    		}
    	}
		
	
	softAssertion.assertAll();
}
}