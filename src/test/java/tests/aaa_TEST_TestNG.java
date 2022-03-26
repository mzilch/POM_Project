package tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utility.SeleniumHelperBasic;
import pages.POM_PNCSmallBusinessPage;


public class aaa_TEST_TestNG extends SeleniumHelperBasic{

	SoftAssert softAssertion= new SoftAssert();
	POM_PNCSmallBusinessPage Local_POM_PNCSmallBusinessPage;

	@Test()
	public void aaa() throws InterruptedException {

    	System.out.println("--- Started Test");

    	//Navigating To
    	driver.get("https://www.pnc.com/en/small-business.html?lnksrc=topnav");

    	// New Page
    	Local_POM_PNCSmallBusinessPage = new POM_PNCSmallBusinessPage(driver);
    	Assert.assertTrue(Local_POM_PNCSmallBusinessPage.PRODUCTS_SERVICES_CLICK());
    	String capturedText_0 = Local_POM_PNCSmallBusinessPage.Business_Checking_GETTEXT();
    	softAssertion.assertTrue(capturedText_0.contains("Checking"), "capturedText_0 - Failed");
    	System.out.println("This text was Verified -> \"" + capturedText_0 + "\"");

    	softAssertion.assertTrue(Local_POM_PNCSmallBusinessPage.Online_Mobile_Services_DISPLAYED());
    	String capturedText_1 = Local_POM_PNCSmallBusinessPage.Cash_Flow_Insight_GETTEXT();
    	softAssertion.assertTrue(capturedText_1.contains("Insight"), "capturedText_1 - Failed");
    	System.out.println("This text was Verified -> \"" + capturedText_1 + "\"");

    	String capturedText_2 = Local_POM_PNCSmallBusinessPage.Business_Credit_Cards_GETTEXT();
    	softAssertion.assertTrue(capturedText_2.contains("Credit Cards"), "capturedText_2 - Failed");
    	System.out.println("This text was Verified -> \"" + capturedText_2 + "\"");

    	String capturedText_3 = Local_POM_PNCSmallBusinessPage.Savings_GETTEXT();
    	softAssertion.assertTrue(capturedText_3.contains("Savings"), "capturedText_3 - Failed");
    	System.out.println("This text was Verified -> \"" + capturedText_3 + "\"");

    	Assert.assertTrue(Local_POM_PNCSmallBusinessPage.LEARNING_CLICK());
    	String capturedText_4 = Local_POM_PNCSmallBusinessPage.Starting_Your_Business_GETTEXT();
    	softAssertion.assertTrue(capturedText_4.contains("Your Business"), "capturedText_4 - Failed");
    	System.out.println("This text was Verified -> \"" + capturedText_4 + "\"");

    	String capturedText_5 = Local_POM_PNCSmallBusinessPage.Growing_Your_Business_GETTEXT();
    	softAssertion.assertTrue(capturedText_5.contains("Growing Your Business"), "capturedText_5 - Failed");
    	System.out.println("This text was Verified -> \"" + capturedText_5 + "\"");

    	String capturedText_6 = Local_POM_PNCSmallBusinessPage.Business_Planning_GETTEXT();
    	softAssertion.assertTrue(capturedText_6.contains("Business Planning"), "capturedText_6 - Failed");
    	System.out.println("This text was Verified -> \"" + capturedText_6 + "\"");

    	String capturedText_7 = Local_POM_PNCSmallBusinessPage.Corporate_Institutional_GETTEXT();
    	softAssertion.assertTrue(capturedText_7.contains("Corporate"), "capturedText_7 - Failed");
    	System.out.println("This text was Verified -> \"" + capturedText_7 + "\"");

    	softAssertion.assertAll();
	}

}
