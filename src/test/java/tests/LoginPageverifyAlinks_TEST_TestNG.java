package tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utility.SeleniumHelperBasic;
import pages.POM_LoginBluebirdTBD;


public class LoginPageverifyAlinks_TEST_TestNG extends SeleniumHelperBasic{

	SoftAssert softAssertion= new SoftAssert();
	POM_LoginBluebirdTBD Local_POM_LoginBluebirdTBD;

	@Test()
	public void LoginPageverifyAlinks() throws InterruptedException {

    	System.out.println("--- Started Test = LoginPageverifyAlinks_TEST_TestNG");

    	//Navigating To
    	driver.get("https://secure.bluebird.com/login?intlink=us-bluebird-marketing-home-prospectslp-incomm2018-header-login");

    	// New Page
    	Local_POM_LoginBluebirdTBD = new POM_LoginBluebirdTBD(driver);
    	softAssertion.assertTrue(Local_POM_LoginBluebirdTBD.Skip_to_Main_Content_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_LoginBluebirdTBD.A_Link_V__DISPLAYED());
    	softAssertion.assertTrue(Local_POM_LoginBluebirdTBD.Create_one_today_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_LoginBluebirdTBD.Forgot_usernamepassword_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_LoginBluebirdTBD.Bluebird_Bank_Account_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_LoginBluebirdTBD.Bluebird_Prepaid_Debit_Account_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_LoginBluebirdTBD.Activate_My_Card_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_LoginBluebirdTBD.Check_Temporary_Card_Balance_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_LoginBluebirdTBD.ATM_Finder_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_LoginBluebirdTBD.LegalPrivacy_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_LoginBluebirdTBD.FAQs_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_LoginBluebirdTBD.Contact_Us_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_LoginBluebirdTBD.Member_Agreement_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_LoginBluebirdTBD.Click_here_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_LoginBluebirdTBD.Click_here_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_LoginBluebirdTBD.Privacy_Statement_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_LoginBluebirdTBD.Privacy_Statement_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_LoginBluebirdTBD.Terms_of_Use_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_LoginBluebirdTBD.Google_Play_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_LoginBluebirdTBD.App_Store_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_LoginBluebirdTBD.Log_In_DISPLAYED());
    	softAssertion.assertAll();
	}

}
