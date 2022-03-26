package tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utility.SeleniumHelperBasic;
import pages.POM_BlueBirdLoginPage;


public class aaaafff_TEST_TestNG extends SeleniumHelperBasic{

	SoftAssert softAssertion= new SoftAssert();
	POM_BlueBirdLoginPage Local_POM_BlueBirdLoginPage;

	@Test()
	public void aaaafff() throws InterruptedException {

    	System.out.println("--- Started Test");

    	//Navigating To
    	driver.get("https://secure.bluebird.com/login");

    	// New Page
    	Local_POM_BlueBirdLoginPage = new POM_BlueBirdLoginPage(driver);
    	softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.UserName_SENDKEYS("mzilchwbb"));
    	softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.Password_Field_SENDKEYS("mzBBilch2019"));
    	softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.RememberMe_Checkbox_CLICK_JAVASCRIPT());
    	softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.LogIn_Button_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.Create_an_Account_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.UsernameSection_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.Legal_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.Privacy_Center_First_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.LogIn_Button_CLICK());
    	// Wait Setting
    	Thread.sleep(3000);
    	ValidatePageTitle("One Time Password - Bluebird");
    	softAssertion.assertAll();
	}

}
