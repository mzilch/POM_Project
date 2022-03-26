package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utility.SeleniumHelperBasic;
import pages.POM_BlueBirdLoginPage;


public class VerifiyAllLInksLogiinPage_TEST_TestNG extends SeleniumHelperBasic{

	SoftAssert softAssertion= new SoftAssert();
	POM_BlueBirdLoginPage Local_POM_BlueBirdLoginPage;

	@Test()
	public void VerifiyAllLInksLogiinPage() throws InterruptedException {

    	System.out.println("--- Started Test >>> VerifiyAllLInksLogiinPage");

    	//Navigating To
    	driver.get("https://secure.bluebird.com/login");

    	// New Page
    	Local_POM_BlueBirdLoginPage = new POM_BlueBirdLoginPage(driver);
    	softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.RememberMe_Checkbox_CLICK_JAVASCRIPT());
    	softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.UserName_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.Password_Field_DISPLAYED());    	
    	softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.LogIn_Button_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.Create_an_Account_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.UsernameSection_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.Legal_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BlueBirdLoginPage.Privacy_Center_First_DISPLAYED());
    	softAssertion.assertAll();
	}
	
	@AfterMethod()
	public void TestEnd()
	{
		System.out.println("--- Test Ended >>> VerifiyAllLInksLogiinPage");
	}

}
