package tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utility.SeleniumHelperBasic;
import pages.POM_LoginBluebirdTBD;
import pages.POM_OneTimePasswordBluebirdTBD;
import pages.POM_HomeBluebirdTBD;


public class Login_Path_TEST_TestNG extends SeleniumHelperBasic{

	SoftAssert softAssertion= new SoftAssert();
	POM_LoginBluebirdTBD Local_POM_LoginBluebirdTBD;
	POM_OneTimePasswordBluebirdTBD Local_POM_OneTimePasswordBluebirdTBD;
	POM_HomeBluebirdTBD Local_POM_HomeBluebirdTBD;

	@Test()
	public void Login_Path() throws InterruptedException {

    	System.out.println("--- Started Test = Login_Path_TEST_TestNG");

    	//Navigating To
    	driver.get("https://secure.bluebird.com/login?intlink=us-bluebird-marketing-home-prospectslp-incomm2018-header-login");

    	// New Page
    	Local_POM_LoginBluebirdTBD = new POM_LoginBluebirdTBD(driver);
    	softAssertion.assertTrue(Local_POM_LoginBluebirdTBD.Username_input_SENDKEYS("mzilchwbb"));
    	softAssertion.assertTrue(Local_POM_LoginBluebirdTBD.passwordbbpasswordbbpassword_SENDKEYS("mzBBilch2019"));
    	softAssertion.assertTrue(Local_POM_LoginBluebirdTBD.Log_In_Button_CLICK());

    	// Wait Setting
    	Thread.sleep(10000);

    	// New Page
    	Local_POM_OneTimePasswordBluebirdTBD = new POM_OneTimePasswordBluebirdTBD(driver);

    	if(Local_POM_OneTimePasswordBluebirdTBD.Send_via_text_to_XXXXXX1161_DISPLAYED())
    	{

	    	// Wait Setting
	    	Thread.sleep(60000);

	    	// New Page
	    	Local_POM_HomeBluebirdTBD = new POM_HomeBluebirdTBD(driver);
	    	softAssertion.assertTrue(Local_POM_HomeBluebirdTBD.Money_In_Side_Menuitem_DISPLAYED());
    	}
    	else
    	{

	    	// New Page
	    	Local_POM_HomeBluebirdTBD = new POM_HomeBluebirdTBD(driver);

	    	// Wait Setting
	    	Thread.sleep(10000);
	    	softAssertion.assertTrue(Local_POM_HomeBluebirdTBD.Money_In_Side_Menuitem_DISPLAYED());
	    	softAssertion.assertTrue(Local_POM_HomeBluebirdTBD.Money_In_Side_Menuitem_CLICK());

	    	// Wait Setting
	    	Thread.sleep(10000);
    	}
    	softAssertion.assertAll();
	}

}
