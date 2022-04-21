package tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utility.SeleniumHelperBasic;
import pages.POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD;


public class ValidateWorforceServices_TEST_TestNG extends SeleniumHelperBasic{

	SoftAssert softAssertion= new SoftAssert();
	POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD;

	@Test()
	public void ValidateWorforceServices() throws InterruptedException {

    	System.out.println("--- Started Test");

    	//Navigating To
    	driver.get("https://usmsystems.com/");

    	// New Page
    	Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD = new POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD(driver);
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.WORKFORCESERVICESBLOCK_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.ReadMore_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.WorkforceServices_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.ProvideFulltimeRPOandContingentworkforces_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.IMG_V_Workforce_Services_IMG_DISPLAYED());
    	softAssertion.assertAll();
	}

}
