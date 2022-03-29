package tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utility.SeleniumHelperBasic;
import pages.POM_WikipediaMainPage;


public class Verifypageelements_TEST_TestNG extends SeleniumHelperBasic{

	SoftAssert softAssertion= new SoftAssert();
	POM_WikipediaMainPage Local_POM_WikipediaMainPage;

	@Test()
	public void Verifypageelements() throws InterruptedException {

    	System.out.println("--- Started Test");

    	//Navigating To
    	driver.get("https://en.wikipedia.org/wiki/Main_Page");

    	// New Page
    	Local_POM_WikipediaMainPage = new POM_WikipediaMainPage(driver);
    	String capturedText_0 = Local_POM_WikipediaMainPage.Main_page_GETTEXT();
    	softAssertion.assertTrue(capturedText_0.contains("Main page"), "capturedText_0 - Failed");
    	System.out.println("This text was Verified -> \"" + capturedText_0 + "\"");

    	String capturedText_1 = Local_POM_WikipediaMainPage.Contents_GETTEXT();
    	softAssertion.assertTrue(capturedText_1.contains("Contents"), "capturedText_1 - Failed");
    	System.out.println("This text was Verified -> \"" + capturedText_1 + "\"");

    	softAssertion.assertTrue(Local_POM_WikipediaMainPage.Current_events_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_WikipediaMainPage.Random_article_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_WikipediaMainPage.Donate_to_Wikipedia_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_WikipediaMainPage.Current_events_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_WikipediaMainPage.AboutWikipedia_DISPLAYED());
    	softAssertion.assertAll();
	}

}
