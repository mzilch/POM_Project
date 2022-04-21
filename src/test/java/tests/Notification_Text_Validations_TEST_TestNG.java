package tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utility.SeleniumHelperBasic;
import pages.POM_LoginBluebirdTBD;
import pages.POM_HomeBluebirdTBD;


public class Notification_Text_Validations_TEST_TestNG extends SeleniumHelperBasic{

	SoftAssert softAssertion= new SoftAssert();
	POM_LoginBluebirdTBD Local_POM_LoginBluebirdTBD;
	POM_HomeBluebirdTBD Local_POM_HomeBluebirdTBD;

	@Test()
	public void Notification_Text_Validations() throws InterruptedException {

    	System.out.println("--- Started Test");

    	//Navigating To
    	driver.get("https://secure.bluebird.com/login?intlink=us-bluebird-marketing-home-prospectslp-incomm2018-header-login");

    	// New Page
    	Local_POM_LoginBluebirdTBD = new POM_LoginBluebirdTBD(driver);
    	softAssertion.assertTrue(Local_POM_LoginBluebirdTBD.Username_input_SENDKEYS("mzilchwbb"));
    	softAssertion.assertTrue(Local_POM_LoginBluebirdTBD.passwordbbpasswordbbpassword_SENDKEYS("mzBBilch2019"));
    	softAssertion.assertTrue(Local_POM_LoginBluebirdTBD.Log_In_Button_CLICK());

    	// Wait Setting
    	//Thread.sleep(5000);

    	// New Page
    	Local_POM_HomeBluebirdTBD = new POM_HomeBluebirdTBD(driver);
    	softAssertion.assertTrue(Local_POM_HomeBluebirdTBD.Previous_Notification_ENABLED());
    	softAssertion.assertTrue(Local_POM_HomeBluebirdTBD.Next_Notification_ENABLED());
    	softAssertion.assertTrue(Local_POM_HomeBluebirdTBD.Enroll_Now_Button_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_HomeBluebirdTBD.Remind_Me_Later_Button_DISPLAYED());
    	String capturedText_0 = Local_POM_HomeBluebirdTBD.Notification_Header_Text_GETTEXT();
    	softAssertion.assertTrue(capturedText_0.contains("Enroll in Direct Deposit"), "capturedText_0 - Failed");
    	System.out.println("This text 'Enroll in Direct Deposit' is Contained in -> \"" + capturedText_0 + "\"");

    	String capturedText_1 = Local_POM_HomeBluebirdTBD.Notification_Text_GETTEXT();
    	softAssertion.assertTrue(capturedText_1.contains("Have your paycheck or government benefits"), "capturedText_1 - Failed");
    	System.out.println("This text 'Have your paycheck or government benefits' is Contained in -> \"" + capturedText_1 + "\"");

    	softAssertion.assertTrue(Local_POM_HomeBluebirdTBD.Next_Notification_CLICK_JAVASCRIPT());
    	String capturedText_2 = Local_POM_HomeBluebirdTBD.Notification_Header_Text_GETTEXT();
    	softAssertion.assertTrue(capturedText_2.contains("Add Goal - Manage your Money"), "capturedText_2 - Failed");
    	System.out.println("This text 'Add Goal - Manage your Money' is Contained in -> \"" + capturedText_2 + "\"");

    	String capturedText_3 = Local_POM_HomeBluebirdTBD.Notification_Text_GETTEXT();
    	softAssertion.assertTrue(capturedText_3.contains("Add a Goal to save money"), "capturedText_3 - Failed");
    	System.out.println("This text 'Add a Goal to save money' is Contained in -> \"" + capturedText_3 + "\"");

    	softAssertion.assertTrue(Local_POM_HomeBluebirdTBD.Next_Notification_CLICK_JAVASCRIPT());
    	String capturedText_4 = Local_POM_HomeBluebirdTBD.Notification_Header_Text_GETTEXT();
    	softAssertion.assertTrue(capturedText_4.contains("Add Money - Deposit your Checks"), "capturedText_4 - Failed");
    	System.out.println("This text 'Add Money - Deposit your Checks' is Contained in -> \"" + capturedText_4 + "\"");

    	String capturedText_5 = Local_POM_HomeBluebirdTBD.Notification_Text_GETTEXT();
    	softAssertion.assertTrue(capturedText_5.contains("Easily add money using Mobile Check Capture"), "capturedText_5 - Failed");
    	System.out.println("This text 'Easily add money using Mobile Check Capture' is Contained in -> \"" + capturedText_5 + "\"");

    	softAssertion.assertTrue(Local_POM_HomeBluebirdTBD.Next_Notification_CLICK_JAVASCRIPT());
    	String capturedText_6 = Local_POM_HomeBluebirdTBD.Notification_Header_Text_GETTEXT();
    	softAssertion.assertTrue(capturedText_6.contains("Download the Mobile App"), "capturedText_6 - Failed");
    	System.out.println("This text 'Download the Mobile App' is Contained in -> \"" + capturedText_6 + "\"");

    	String capturedText_7 = Local_POM_HomeBluebirdTBD.Notification_Text_GETTEXT();
    	softAssertion.assertTrue(capturedText_7.contains("Manage your Account on the go"), "capturedText_7 - Failed");
    	System.out.println("This text 'Manage your Account on the go' is Contained in -> \"" + capturedText_7 + "\"");

    	softAssertion.assertTrue(Local_POM_HomeBluebirdTBD.Next_Notification_CLICK_JAVASCRIPT());
    	String capturedText_8 = Local_POM_HomeBluebirdTBD.Notification_Header_Text_GETTEXT();
    	softAssertion.assertTrue(capturedText_8.contains("Get your Tax Refund up to 2 Days Faster* with Direct Deposit"), "capturedText_8 - Failed");
    	System.out.println("This text 'Get your Tax Refund up to 2 Days Faster* with Direct Deposit' is Contained in -> \"" + capturedText_8 + "\"");

    	String capturedText_9 = Local_POM_HomeBluebirdTBD.Notification_Text_GETTEXT();
    	softAssertion.assertTrue(capturedText_9.contains("It's easy to direct deposit your tax refund to your Bluebird"), "capturedText_9 - Failed");
    	System.out.println("This text 'It's easy to direct deposit your tax refund to your Bluebird' is Contained in -> \"" + capturedText_9 + "\"");

    	softAssertion.assertTrue(Local_POM_HomeBluebirdTBD.Next_Notification_CLICK_JAVASCRIPT());
    	String capturedText_10 = Local_POM_HomeBluebirdTBD.Notification_Header_Text_GETTEXT();
    	softAssertion.assertTrue(capturedText_10.contains("Create Another Subaccount"), "capturedText_10 - Failed");
    	System.out.println("This text 'Create Another Subaccount' is Contained in -> \"" + capturedText_10 + "\"");

    	String capturedText_11 = Local_POM_HomeBluebirdTBD.Notification_Text_GETTEXT();
    	softAssertion.assertTrue(capturedText_11.contains("Subaccounts get their own Card"), "capturedText_11 - Failed");
    	System.out.println("This text 'Subaccounts get their own Card' is Contained in -> \"" + capturedText_11 + "\"");

    	softAssertion.assertAll();
	}

}
