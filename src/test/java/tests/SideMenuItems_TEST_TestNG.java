package tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utility.SeleniumHelperBasic;
import pages.POM_ToolsQATBD;


public class SideMenuItems_TEST_TestNG extends SeleniumHelperBasic{

	SoftAssert softAssertion= new SoftAssert();
	POM_ToolsQATBD Local_POM_ToolsQATBD;

	@Test()
	public void SideMenuItems() throws InterruptedException {

    	System.out.println("--- Started Test = SideMenuItems_TEST_TestNG");

    	//Navigating To
    	driver.get("https://demoqa.com/date-picker");

    	// New Page
    	Local_POM_ToolsQATBD = new POM_ToolsQATBD(driver);
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
	}

}
