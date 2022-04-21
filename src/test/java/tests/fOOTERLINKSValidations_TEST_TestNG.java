package tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utility.SeleniumHelperBasic;
import pages.POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD;
import pages.POM_ToolsQATBD;


public class fOOTERLINKSValidations_TEST_TestNG extends SeleniumHelperBasic{

	SoftAssert softAssertion= new SoftAssert();
	POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD;
	POM_ToolsQATBD Local_POM_ToolsQATBD;
	String nextUrl = "https://demoqa.com/date-picker";

	@Test(priority = 2)
	public void fOOTERLINKSValidations() throws InterruptedException {

    	System.out.println("--- Started Test = fOOTERLINKSValidations_TEST_TestNG");

    	//Navigating To
    	driver.get(nextUrl);

    	// New Page
    	Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD = new POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD(driver);
    	Thread.sleep(5000);
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.PAGEFOOTER_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.WorkforceManagement_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.DataQualitySolutions_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.CloudMigration_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.HRManagement_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.MobileAppDevelopment_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.AIServices_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.MachineLearning_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.DataScience_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.DeepLearning_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.AIinBanking_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.AIinRetail_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.AIinManufacturing_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.AIineCommerce_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.AIinComputerVision_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.AIinPharma_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.ALandMLUseCases_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.A6ChallengesThatFintechStartupsWillFaceEff_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.A7BestMobileBankingAppsInTheUSAIn2022_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.TopFinancialAppDevelopmentCompaniesInBahrain_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.HowIoTPowersMobileAppDevelopmentIndustryIn_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.HowNaturalLanguageProcessingMakesMobileApps_DISPLAYED());
    	softAssertion.assertAll();
	}
	
	@Test(priority = 1)
	public void ValidateWorforceServices() throws InterruptedException {

    	System.out.println("--- Started Test = ValidateWorforceServices_TEST_TestNG");

    	//Navigating To
    	driver.get(nextUrl);

    	// New Page
    	Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD = new POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD(driver);
    	Thread.sleep(5000);
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.WORKFORCESERVICESBLOCK_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.ReadMore_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.WorkforceServices_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.ProvideFulltimeRPOandContingentworkforces_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD.IMG_V_Workforce_Services_IMG_DISPLAYED());
    	softAssertion.assertAll();
	}
	
	@Test(priority = 0)
	public void SideMenuItems() throws InterruptedException {

    	System.out.println("--- Started Test = SideMenuItems_TEST_TestNG");

    	//Navigating To
    	driver.get("https://demoqa.com/date-picker");

    	// New Page
    	Local_POM_ToolsQATBD = new POM_ToolsQATBD(driver);
    	Thread.sleep(5000);
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.ELEMENTS_CLICK());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Text_Box_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Check_Box_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Radio_Button_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Web_Tables_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Buttons_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Links_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Broken_Links_Images_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Upload_and_Download_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Dynamic_Properties_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.ELEMENTS_CLICK());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.FORMS_CLICK());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Practice_Form_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.FORMS_CLICK());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.ALERTS_FRAME_WINDOWS_CLICK());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Browser_Windows_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Alerts_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Frames_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Nested_Frames_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Modal_Dialogs_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.ALERTS_FRAME_WINDOWS_CLICK());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.WIDGETS_CLICK());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Accordian_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Auto_Complete_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Date_Picker_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Slider_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Progress_Bar_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Tabs_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Tool_Tips_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Menu_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Select_Menu_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.WIDGETS_CLICK());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.INTERACTIONS_CLICK());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Sortable_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Selectable_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Resizable_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Droppable_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Dragabble_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.INTERACTIONS_CLICK());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.BOOK_STORE_APPLICATION_CLICK());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Login_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Book_Store_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Profile_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.Book_Store_API_DISPLAYED());
    	softAssertion.assertTrue(Local_POM_ToolsQATBD.BOOK_STORE_APPLICATION_CLICK());
    	softAssertion.assertAll();
    	nextUrl = "https://usmsystems.com/";
	}


}
