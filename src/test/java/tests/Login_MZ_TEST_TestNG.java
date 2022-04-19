package tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utility.SeleniumHelperBasic;
import pages.POM_LoginBluebirdTBD;
import pages.POM_HomeBluebirdTBD;
import pages.POM_MoneyInBluebirdTBD;


public class Login_MZ_TEST_TestNG extends SeleniumHelperBasic{

	SoftAssert softAssertion= new SoftAssert();
	POM_LoginBluebirdTBD Local_POM_LoginBluebirdTBD;
	POM_HomeBluebirdTBD Local_POM_HomeBluebirdTBD;
	POM_MoneyInBluebirdTBD Local_POM_MoneyInBluebirdTBD;

	@Test()
	public void Login_MZ() throws InterruptedException {

    	System.out.println("--- Started Test = Login_MZ_TEST_TestNG");

    	//Navigating To
    	driver.get("https://secure.bluebird.com/login?intlink=us-bluebird-marketing-home-prospectslp-incomm2018-header-login");

    	// New Page
    	Local_POM_LoginBluebirdTBD = new POM_LoginBluebirdTBD(driver);
    	softAssertion.assertTrue(Local_POM_LoginBluebirdTBD.Username_input_SENDKEYS("mzilchwbb"));
    	softAssertion.assertTrue(Local_POM_LoginBluebirdTBD.passwordbbpasswordbbpassword_SENDKEYS("mzBBilch2019"));
    	softAssertion.assertTrue(Local_POM_LoginBluebirdTBD.Log_In_Button_CLICK());

    	// Wait Setting
    	//Thread.sleep(15000);

    	// New Page
    	Local_POM_HomeBluebirdTBD = new POM_HomeBluebirdTBD(driver);
    	softAssertion.assertTrue(Local_POM_HomeBluebirdTBD.Money_In_Side_Menuitem_CLICK());

    	// Wait Setting
    	//Thread.sleep(3000);

    	// New Page
    	Local_POM_MoneyInBluebirdTBD = new POM_MoneyInBluebirdTBD(driver);
    	softAssertion.assertTrue(Local_POM_MoneyInBluebirdTBD.Transfer_Money_to_Main_Account_Move_money_from_a_S_CLICK());
    	softAssertion.assertTrue(Local_POM_MoneyInBluebirdTBD.Transfer_Money_to_How_It_Works_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_MoneyInBluebirdTBD.Transfer_Money_to_How_It_Works_CLICK_JAVASCRIPT());
    	//Thread.sleep(3000);
    	String capturedText_0 = Local_POM_MoneyInBluebirdTBD.Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b_GETTEXT();
    	softAssertion.assertTrue(capturedText_0.contains("You can choose whether you want to reclaim money"), "capturedText_0 - Failed");
    	System.out.println("This text was Verified -> \"" + capturedText_0 + "\"");
    	//Thread.sleep(3000);

    	softAssertion.assertTrue(Local_POM_MoneyInBluebirdTBD.Transfer_Money_to_Button_V_X1st_CloseModal_CLICK());
    	softAssertion.assertTrue(Local_POM_MoneyInBluebirdTBD.Transfer_Money_to_Button_V_X_2nd_CloseModal_CLICK());
    	softAssertion.assertTrue(Local_POM_MoneyInBluebirdTBD.MoneyInBluebird_Logout_CLICK());
    	Thread.sleep(15000);
    	softAssertion.assertAll();
	}

}




