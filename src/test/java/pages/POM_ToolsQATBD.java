package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import utility.SeleniumHelperBasic;

public class POM_ToolsQATBD extends SeleniumHelperBasic{

   //Variables
	private Actions action;
	public String PAGE_Title = "ToolsQA";
	public String PAGE_URL = "https://demoqa.com/browser-windows";

   //Constructor
	public POM_ToolsQATBD(WebDriver driver){
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}

   //Locators
	By New_Tab = By.xpath("//button[@id='tabButton']");
	By New_Window = By.xpath("//button[@class='mt-4 btn btn-primary']");
	By New_Window_Message = By.xpath("//button[@id='messageWindowButton']");
	By ELEMENTS = By.xpath("//*[@id='app']/div[1]/div/div[2]/div[1]/div[1]/div/div[1]/span[1]/div");
	By FORMS = By.xpath("//*[contains(text(),'Forms')]");
	By ALERTS_FRAME_WINDOWS = By.xpath("//*[contains(text(),'Alerts, Frame & Windows')]");
	By WIDGETS = By.xpath("//*[contains(text(),'Widgets')]");
	By INTERACTIONS = By.xpath("//*[contains(text(),'Interactions')]");
	By BOOK_STORE_APPLICATION = By.xpath("//*[contains(text(),'Book Store Application')]");
	By Text_Box = By.xpath("//*[contains(text(),'Text Box')]");
	By Check_Box = By.xpath("//*[contains(text(),'Check Box')]");
	By Radio_Button = By.xpath("//*[contains(text(),'Radio Button')]");
	By Web_Tables = By.xpath("//*[contains(text(),'Web Tables')]");
	By Buttons = By.xpath("//*[contains(text(),'Buttons')]");
	By Links = By.xpath("//li/*[text()='Links']");
	By Broken_Links_Images = By.xpath("//*[contains(text(),'Broken Links - Images')]");
	By Upload_and_Download = By.xpath("//*[contains(text(),'Upload and Download')]");
	By Dynamic_Properties = By.xpath("//*[contains(text(),'Dynamic Properties')]");
	By Practice_Form = By.xpath("//*[contains(text(),'Practice Form')]");
	By Browser_Windows = By.xpath("//*[contains(text(),'Browser Windows')]");
	By Alerts = By.xpath("//li/*[text()='Alerts']");
	By Frames = By.xpath("//li/*[text()='Frames']");
	By Nested_Frames = By.xpath("//*[contains(text(),'Nested Frames')]");
	By Modal_Dialogs = By.xpath("//*[contains(text(),'Modal Dialogs')]");
	By Accordian = By.xpath("//*[contains(text(),'Accordian')]");
	By Auto_Complete = By.xpath("//*[contains(text(),'Auto Complete')]");
	By Date_Picker = By.xpath("//li[@class='btn btn-light active']");
	By Slider = By.xpath("//*[contains(text(),'Slider')]");
	By Progress_Bar = By.xpath("//*[contains(text(),'Progress Bar')]");
	By Tabs = By.xpath("//*[contains(text(),'Tabs')]");
	By Tool_Tips = By.xpath("//*[contains(text(),'Tool Tips')]");
	By Menu = By.xpath("//li/*[text()='Menu']");
	By Select_Menu = By.xpath("//*[contains(text(),'Select Menu')]");
	By Sortable = By.xpath("//*[contains(text(),'Sortable')]");
	By Selectable = By.xpath("//*[contains(text(),'Selectable')]");
	By Resizable = By.xpath("//*[contains(text(),'Resizable')]");
	By Droppable = By.xpath("//*[contains(text(),'Droppable')]");
	By Dragabble = By.xpath("//*[contains(text(),'Dragabble')]");
	By Login = By.xpath("//*[contains(text(),'Login')]");
	By Book_Store = By.xpath("//li/*[text()='Book Store']");
	By Profile = By.xpath("//*[contains(text(),'Profile')]");
	By Book_Store_API = By.xpath("//*[contains(text(),'Book Store API')]");

   //Methods

   // New_Tab
	public boolean New_Tab_DISPLAYED(){
	    return VerifyElement(New_Tab,"displayed","New_Tab");
	}
	public boolean New_Tab_ENABLED(){
	    return VerifyElement(New_Tab,"enabled","New_Tab");
	}
	public boolean New_Tab_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(New_Tab);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean New_Tab_MOVETOANDCLICK(){
	    return Element_Click(New_Tab, "moveToAndClick","New_Tab");
 	}
	public boolean New_Tab_CLICK_JAVASCRIPT(){
	    return Element_Click(New_Tab, "javaClick","New_Tab");
  	}
	public boolean New_Tab_CLICK(){
	    return Element_Click(New_Tab, "click","New_Tab");
  	}
	public String New_Tab_GETTEXT(){
	    return driver.findElement(New_Tab).getText();	}

   // New_Window
	public boolean New_Window_DISPLAYED(){
	    return VerifyElement(New_Window,"displayed","New_Window");
	}
	public boolean New_Window_ENABLED(){
	    return VerifyElement(New_Window,"enabled","New_Window");
	}
	public boolean New_Window_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(New_Window);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean New_Window_MOVETOANDCLICK(){
	    return Element_Click(New_Window, "moveToAndClick","New_Window");
 	}
	public boolean New_Window_CLICK_JAVASCRIPT(){
	    return Element_Click(New_Window, "javaClick","New_Window");
  	}
	public boolean New_Window_CLICK(){
	    return Element_Click(New_Window, "click","New_Window");
  	}
	public String New_Window_GETTEXT(){
	    return driver.findElement(New_Window).getText();	}

   // New_Window_Message
	public boolean New_Window_Message_DISPLAYED(){
	    return VerifyElement(New_Window_Message,"displayed","New_Window_Message");
	}
	public boolean New_Window_Message_ENABLED(){
	    return VerifyElement(New_Window_Message,"enabled","New_Window_Message");
	}
	public boolean New_Window_Message_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(New_Window_Message);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean New_Window_Message_MOVETOANDCLICK(){
	    return Element_Click(New_Window_Message, "moveToAndClick","New_Window_Message");
 	}
	public boolean New_Window_Message_CLICK_JAVASCRIPT(){
	    return Element_Click(New_Window_Message, "javaClick","New_Window_Message");
  	}
	public boolean New_Window_Message_CLICK(){
	    return Element_Click(New_Window_Message, "click","New_Window_Message");
  	}
	public String New_Window_Message_GETTEXT(){
	    return driver.findElement(New_Window_Message).getText();	}

   // ELEMENTS
	public boolean ELEMENTS_DISPLAYED(){
	    return VerifyElement(ELEMENTS,"displayed","ELEMENTS");
	}
	public boolean ELEMENTS_ENABLED(){
	    return VerifyElement(ELEMENTS,"enabled","ELEMENTS");
	}
	public boolean ELEMENTS_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(ELEMENTS);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean ELEMENTS_MOVETOANDCLICK(){
	    return Element_Click(ELEMENTS, "moveToAndClick","ELEMENTS");
 	}
	public boolean ELEMENTS_CLICK_JAVASCRIPT(){
	    return Element_Click(ELEMENTS, "javaClick","ELEMENTS");
  	}
	public boolean ELEMENTS_CLICK(){
	    return Element_Click(ELEMENTS, "click","ELEMENTS");
  	}
	public String ELEMENTS_GETTEXT(){
	    return driver.findElement(ELEMENTS).getText();	}

   // FORMS
	public boolean FORMS_DISPLAYED(){
	    return VerifyElement(FORMS,"displayed","FORMS");
	}
	public boolean FORMS_ENABLED(){
	    return VerifyElement(FORMS,"enabled","FORMS");
	}
	public boolean FORMS_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(FORMS);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean FORMS_MOVETOANDCLICK(){
	    return Element_Click(FORMS, "moveToAndClick","FORMS");
 	}
	public boolean FORMS_CLICK_JAVASCRIPT(){
	    return Element_Click(FORMS, "javaClick","FORMS");
  	}
	public boolean FORMS_CLICK(){
	    return Element_Click(FORMS, "click","FORMS");
  	}
	public String FORMS_GETTEXT(){
	    return driver.findElement(FORMS).getText();	}

   // ALERTS_FRAME_WINDOWS
	public boolean ALERTS_FRAME_WINDOWS_DISPLAYED(){
	    return VerifyElement(ALERTS_FRAME_WINDOWS,"displayed","ALERTS_FRAME_WINDOWS");
	}
	public boolean ALERTS_FRAME_WINDOWS_ENABLED(){
	    return VerifyElement(ALERTS_FRAME_WINDOWS,"enabled","ALERTS_FRAME_WINDOWS");
	}
	public boolean ALERTS_FRAME_WINDOWS_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(ALERTS_FRAME_WINDOWS);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean ALERTS_FRAME_WINDOWS_MOVETOANDCLICK(){
	    return Element_Click(ALERTS_FRAME_WINDOWS, "moveToAndClick","ALERTS_FRAME_WINDOWS");
 	}
	public boolean ALERTS_FRAME_WINDOWS_CLICK_JAVASCRIPT(){
	    return Element_Click(ALERTS_FRAME_WINDOWS, "javaClick","ALERTS_FRAME_WINDOWS");
  	}
	public boolean ALERTS_FRAME_WINDOWS_CLICK(){
	    return Element_Click(ALERTS_FRAME_WINDOWS, "click","ALERTS_FRAME_WINDOWS");
  	}
	public String ALERTS_FRAME_WINDOWS_GETTEXT(){
	    return driver.findElement(ALERTS_FRAME_WINDOWS).getText();	}

   // WIDGETS
	public boolean WIDGETS_DISPLAYED(){
	    return VerifyElement(WIDGETS,"displayed","WIDGETS");
	}
	public boolean WIDGETS_ENABLED(){
	    return VerifyElement(WIDGETS,"enabled","WIDGETS");
	}
	public boolean WIDGETS_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(WIDGETS);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean WIDGETS_MOVETOANDCLICK(){
	    return Element_Click(WIDGETS, "moveToAndClick","WIDGETS");
 	}
	public boolean WIDGETS_CLICK_JAVASCRIPT(){
	    return Element_Click(WIDGETS, "javaClick","WIDGETS");
  	}
	public boolean WIDGETS_CLICK(){
	    return Element_Click(WIDGETS, "click","WIDGETS");
  	}
	public String WIDGETS_GETTEXT(){
	    return driver.findElement(WIDGETS).getText();	}

   // INTERACTIONS
	public boolean INTERACTIONS_DISPLAYED(){
	    return VerifyElement(INTERACTIONS,"displayed","INTERACTIONS");
	}
	public boolean INTERACTIONS_ENABLED(){
	    return VerifyElement(INTERACTIONS,"enabled","INTERACTIONS");
	}
	public boolean INTERACTIONS_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(INTERACTIONS);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean INTERACTIONS_MOVETOANDCLICK(){
	    return Element_Click(INTERACTIONS, "moveToAndClick","INTERACTIONS");
 	}
	public boolean INTERACTIONS_CLICK_JAVASCRIPT(){
	    return Element_Click(INTERACTIONS, "javaClick","INTERACTIONS");
  	}
	public boolean INTERACTIONS_CLICK(){
	    return Element_Click(INTERACTIONS, "click","INTERACTIONS");
  	}
	public String INTERACTIONS_GETTEXT(){
	    return driver.findElement(INTERACTIONS).getText();	}

   // BOOK_STORE_APPLICATION
	public boolean BOOK_STORE_APPLICATION_DISPLAYED(){
	    return VerifyElement(BOOK_STORE_APPLICATION,"displayed","BOOK_STORE_APPLICATION");
	}
	public boolean BOOK_STORE_APPLICATION_ENABLED(){
	    return VerifyElement(BOOK_STORE_APPLICATION,"enabled","BOOK_STORE_APPLICATION");
	}
	public boolean BOOK_STORE_APPLICATION_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(BOOK_STORE_APPLICATION);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean BOOK_STORE_APPLICATION_MOVETOANDCLICK(){
	    return Element_Click(BOOK_STORE_APPLICATION, "moveToAndClick","BOOK_STORE_APPLICATION");
 	}
	public boolean BOOK_STORE_APPLICATION_CLICK_JAVASCRIPT(){
	    return Element_Click(BOOK_STORE_APPLICATION, "javaClick","BOOK_STORE_APPLICATION");
  	}
	public boolean BOOK_STORE_APPLICATION_CLICK(){
	    return Element_Click(BOOK_STORE_APPLICATION, "click","BOOK_STORE_APPLICATION");
  	}
	public String BOOK_STORE_APPLICATION_GETTEXT(){
	    return driver.findElement(BOOK_STORE_APPLICATION).getText();	}

   // Text_Box
	public boolean Text_Box_DISPLAYED(){
	    return VerifyElement(Text_Box,"displayed","Text_Box");
	}
	public boolean Text_Box_ENABLED(){
	    return VerifyElement(Text_Box,"enabled","Text_Box");
	}
	public boolean Text_Box_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Text_Box);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Text_Box_MOVETOANDCLICK(){
	    return Element_Click(Text_Box, "moveToAndClick","Text_Box");
 	}
	public boolean Text_Box_CLICK_JAVASCRIPT(){
	    return Element_Click(Text_Box, "javaClick","Text_Box");
  	}
	public boolean Text_Box_CLICK(){
	    return Element_Click(Text_Box, "click","Text_Box");
  	}
	public String Text_Box_GETTEXT(){
	    return driver.findElement(Text_Box).getText();	}

   // Check_Box
	public boolean Check_Box_DISPLAYED(){
	    return VerifyElement(Check_Box,"displayed","Check_Box");
	}
	public boolean Check_Box_ENABLED(){
	    return VerifyElement(Check_Box,"enabled","Check_Box");
	}
	public boolean Check_Box_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Check_Box);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Check_Box_MOVETOANDCLICK(){
	    return Element_Click(Check_Box, "moveToAndClick","Check_Box");
 	}
	public boolean Check_Box_CLICK_JAVASCRIPT(){
	    return Element_Click(Check_Box, "javaClick","Check_Box");
  	}
	public boolean Check_Box_CLICK(){
	    return Element_Click(Check_Box, "click","Check_Box");
  	}
	public String Check_Box_GETTEXT(){
	    return driver.findElement(Check_Box).getText();	}

   // Radio_Button
	public boolean Radio_Button_DISPLAYED(){
	    return VerifyElement(Radio_Button,"displayed","Radio_Button");
	}
	public boolean Radio_Button_ENABLED(){
	    return VerifyElement(Radio_Button,"enabled","Radio_Button");
	}
	public boolean Radio_Button_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Radio_Button);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Radio_Button_MOVETOANDCLICK(){
	    return Element_Click(Radio_Button, "moveToAndClick","Radio_Button");
 	}
	public boolean Radio_Button_CLICK_JAVASCRIPT(){
	    return Element_Click(Radio_Button, "javaClick","Radio_Button");
  	}
	public boolean Radio_Button_CLICK(){
	    return Element_Click(Radio_Button, "click","Radio_Button");
  	}
	public String Radio_Button_GETTEXT(){
	    return driver.findElement(Radio_Button).getText();	}

   // Web_Tables
	public boolean Web_Tables_DISPLAYED(){
	    return VerifyElement(Web_Tables,"displayed","Web_Tables");
	}
	public boolean Web_Tables_ENABLED(){
	    return VerifyElement(Web_Tables,"enabled","Web_Tables");
	}
	public boolean Web_Tables_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Web_Tables);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Web_Tables_MOVETOANDCLICK(){
	    return Element_Click(Web_Tables, "moveToAndClick","Web_Tables");
 	}
	public boolean Web_Tables_CLICK_JAVASCRIPT(){
	    return Element_Click(Web_Tables, "javaClick","Web_Tables");
  	}
	public boolean Web_Tables_CLICK(){
	    return Element_Click(Web_Tables, "click","Web_Tables");
  	}
	public String Web_Tables_GETTEXT(){
	    return driver.findElement(Web_Tables).getText();	}

   // Buttons
	public boolean Buttons_DISPLAYED(){
	    return VerifyElement(Buttons,"displayed","Buttons");
	}
	public boolean Buttons_ENABLED(){
	    return VerifyElement(Buttons,"enabled","Buttons");
	}
	public boolean Buttons_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Buttons);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Buttons_MOVETOANDCLICK(){
	    return Element_Click(Buttons, "moveToAndClick","Buttons");
 	}
	public boolean Buttons_CLICK_JAVASCRIPT(){
	    return Element_Click(Buttons, "javaClick","Buttons");
  	}
	public boolean Buttons_CLICK(){
	    return Element_Click(Buttons, "click","Buttons");
  	}
	public String Buttons_GETTEXT(){
	    return driver.findElement(Buttons).getText();	}

   // Links
	public boolean Links_DISPLAYED(){
	    return VerifyElement(Links,"displayed","Links");
	}
	public boolean Links_ENABLED(){
	    return VerifyElement(Links,"enabled","Links");
	}
	public boolean Links_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Links);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Links_MOVETOANDCLICK(){
	    return Element_Click(Links, "moveToAndClick","Links");
 	}
	public boolean Links_CLICK_JAVASCRIPT(){
	    return Element_Click(Links, "javaClick","Links");
  	}
	public boolean Links_CLICK(){
	    return Element_Click(Links, "click","Links");
  	}
	public String Links_GETTEXT(){
	    return driver.findElement(Links).getText();	}

   // Broken_Links_Images
	public boolean Broken_Links_Images_DISPLAYED(){
	    return VerifyElement(Broken_Links_Images,"displayed","Broken_Links_Images");
	}
	public boolean Broken_Links_Images_ENABLED(){
	    return VerifyElement(Broken_Links_Images,"enabled","Broken_Links_Images");
	}
	public boolean Broken_Links_Images_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Broken_Links_Images);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Broken_Links_Images_MOVETOANDCLICK(){
	    return Element_Click(Broken_Links_Images, "moveToAndClick","Broken_Links_Images");
 	}
	public boolean Broken_Links_Images_CLICK_JAVASCRIPT(){
	    return Element_Click(Broken_Links_Images, "javaClick","Broken_Links_Images");
  	}
	public boolean Broken_Links_Images_CLICK(){
	    return Element_Click(Broken_Links_Images, "click","Broken_Links_Images");
  	}
	public String Broken_Links_Images_GETTEXT(){
	    return driver.findElement(Broken_Links_Images).getText();	}

   // Upload_and_Download
	public boolean Upload_and_Download_DISPLAYED(){
	    return VerifyElement(Upload_and_Download,"displayed","Upload_and_Download");
	}
	public boolean Upload_and_Download_ENABLED(){
	    return VerifyElement(Upload_and_Download,"enabled","Upload_and_Download");
	}
	public boolean Upload_and_Download_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Upload_and_Download);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Upload_and_Download_MOVETOANDCLICK(){
	    return Element_Click(Upload_and_Download, "moveToAndClick","Upload_and_Download");
 	}
	public boolean Upload_and_Download_CLICK_JAVASCRIPT(){
	    return Element_Click(Upload_and_Download, "javaClick","Upload_and_Download");
  	}
	public boolean Upload_and_Download_CLICK(){
	    return Element_Click(Upload_and_Download, "click","Upload_and_Download");
  	}
	public String Upload_and_Download_GETTEXT(){
	    return driver.findElement(Upload_and_Download).getText();	}

   // Dynamic_Properties
	public boolean Dynamic_Properties_DISPLAYED(){
	    return VerifyElement(Dynamic_Properties,"displayed","Dynamic_Properties");
	}
	public boolean Dynamic_Properties_ENABLED(){
	    return VerifyElement(Dynamic_Properties,"enabled","Dynamic_Properties");
	}
	public boolean Dynamic_Properties_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Dynamic_Properties);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Dynamic_Properties_MOVETOANDCLICK(){
	    return Element_Click(Dynamic_Properties, "moveToAndClick","Dynamic_Properties");
 	}
	public boolean Dynamic_Properties_CLICK_JAVASCRIPT(){
	    return Element_Click(Dynamic_Properties, "javaClick","Dynamic_Properties");
  	}
	public boolean Dynamic_Properties_CLICK(){
	    return Element_Click(Dynamic_Properties, "click","Dynamic_Properties");
  	}
	public String Dynamic_Properties_GETTEXT(){
	    return driver.findElement(Dynamic_Properties).getText();	}

   // Practice_Form
	public boolean Practice_Form_DISPLAYED(){
	    return VerifyElement(Practice_Form,"displayed","Practice_Form");
	}
	public boolean Practice_Form_ENABLED(){
	    return VerifyElement(Practice_Form,"enabled","Practice_Form");
	}
	public boolean Practice_Form_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Practice_Form);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Practice_Form_MOVETOANDCLICK(){
	    return Element_Click(Practice_Form, "moveToAndClick","Practice_Form");
 	}
	public boolean Practice_Form_CLICK_JAVASCRIPT(){
	    return Element_Click(Practice_Form, "javaClick","Practice_Form");
  	}
	public boolean Practice_Form_CLICK(){
	    return Element_Click(Practice_Form, "click","Practice_Form");
  	}
	public String Practice_Form_GETTEXT(){
	    return driver.findElement(Practice_Form).getText();	}

   // Browser_Windows
	public boolean Browser_Windows_DISPLAYED(){
	    return VerifyElement(Browser_Windows,"displayed","Browser_Windows");
	}
	public boolean Browser_Windows_ENABLED(){
	    return VerifyElement(Browser_Windows,"enabled","Browser_Windows");
	}
	public boolean Browser_Windows_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Browser_Windows);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Browser_Windows_MOVETOANDCLICK(){
	    return Element_Click(Browser_Windows, "moveToAndClick","Browser_Windows");
 	}
	public boolean Browser_Windows_CLICK_JAVASCRIPT(){
	    return Element_Click(Browser_Windows, "javaClick","Browser_Windows");
  	}
	public boolean Browser_Windows_CLICK(){
	    return Element_Click(Browser_Windows, "click","Browser_Windows");
  	}
	public String Browser_Windows_GETTEXT(){
	    return driver.findElement(Browser_Windows).getText();	}

   // Alerts
	public boolean Alerts_DISPLAYED(){
	    return VerifyElement(Alerts,"displayed","Alerts");
	}
	public boolean Alerts_ENABLED(){
	    return VerifyElement(Alerts,"enabled","Alerts");
	}
	public boolean Alerts_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Alerts);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Alerts_MOVETOANDCLICK(){
	    return Element_Click(Alerts, "moveToAndClick","Alerts");
 	}
	public boolean Alerts_CLICK_JAVASCRIPT(){
	    return Element_Click(Alerts, "javaClick","Alerts");
  	}
	public boolean Alerts_CLICK(){
	    return Element_Click(Alerts, "click","Alerts");
  	}
	public String Alerts_GETTEXT(){
	    return driver.findElement(Alerts).getText();	}

   // Frames
	public boolean Frames_DISPLAYED(){
	    return VerifyElement(Frames,"displayed","Frames");
	}
	public boolean Frames_ENABLED(){
	    return VerifyElement(Frames,"enabled","Frames");
	}
	public boolean Frames_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Frames);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Frames_MOVETOANDCLICK(){
	    return Element_Click(Frames, "moveToAndClick","Frames");
 	}
	public boolean Frames_CLICK_JAVASCRIPT(){
	    return Element_Click(Frames, "javaClick","Frames");
  	}
	public boolean Frames_CLICK(){
	    return Element_Click(Frames, "click","Frames");
  	}
	public String Frames_GETTEXT(){
	    return driver.findElement(Frames).getText();	}

   // Nested_Frames
	public boolean Nested_Frames_DISPLAYED(){
	    return VerifyElement(Nested_Frames,"displayed","Nested_Frames");
	}
	public boolean Nested_Frames_ENABLED(){
	    return VerifyElement(Nested_Frames,"enabled","Nested_Frames");
	}
	public boolean Nested_Frames_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Nested_Frames);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Nested_Frames_MOVETOANDCLICK(){
	    return Element_Click(Nested_Frames, "moveToAndClick","Nested_Frames");
 	}
	public boolean Nested_Frames_CLICK_JAVASCRIPT(){
	    return Element_Click(Nested_Frames, "javaClick","Nested_Frames");
  	}
	public boolean Nested_Frames_CLICK(){
	    return Element_Click(Nested_Frames, "click","Nested_Frames");
  	}
	public String Nested_Frames_GETTEXT(){
	    return driver.findElement(Nested_Frames).getText();	}

   // Modal_Dialogs
	public boolean Modal_Dialogs_DISPLAYED(){
	    return VerifyElement(Modal_Dialogs,"displayed","Modal_Dialogs");
	}
	public boolean Modal_Dialogs_ENABLED(){
	    return VerifyElement(Modal_Dialogs,"enabled","Modal_Dialogs");
	}
	public boolean Modal_Dialogs_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Modal_Dialogs);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Modal_Dialogs_MOVETOANDCLICK(){
	    return Element_Click(Modal_Dialogs, "moveToAndClick","Modal_Dialogs");
 	}
	public boolean Modal_Dialogs_CLICK_JAVASCRIPT(){
	    return Element_Click(Modal_Dialogs, "javaClick","Modal_Dialogs");
  	}
	public boolean Modal_Dialogs_CLICK(){
	    return Element_Click(Modal_Dialogs, "click","Modal_Dialogs");
  	}
	public String Modal_Dialogs_GETTEXT(){
	    return driver.findElement(Modal_Dialogs).getText();	}

   // Accordian
	public boolean Accordian_DISPLAYED(){
	    return VerifyElement(Accordian,"displayed","Accordian");
	}
	public boolean Accordian_ENABLED(){
	    return VerifyElement(Accordian,"enabled","Accordian");
	}
	public boolean Accordian_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Accordian);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Accordian_MOVETOANDCLICK(){
	    return Element_Click(Accordian, "moveToAndClick","Accordian");
 	}
	public boolean Accordian_CLICK_JAVASCRIPT(){
	    return Element_Click(Accordian, "javaClick","Accordian");
  	}
	public boolean Accordian_CLICK(){
	    return Element_Click(Accordian, "click","Accordian");
  	}
	public String Accordian_GETTEXT(){
	    return driver.findElement(Accordian).getText();	}

   // Auto_Complete
	public boolean Auto_Complete_DISPLAYED(){
	    return VerifyElement(Auto_Complete,"displayed","Auto_Complete");
	}
	public boolean Auto_Complete_ENABLED(){
	    return VerifyElement(Auto_Complete,"enabled","Auto_Complete");
	}
	public boolean Auto_Complete_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Auto_Complete);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Auto_Complete_MOVETOANDCLICK(){
	    return Element_Click(Auto_Complete, "moveToAndClick","Auto_Complete");
 	}
	public boolean Auto_Complete_CLICK_JAVASCRIPT(){
	    return Element_Click(Auto_Complete, "javaClick","Auto_Complete");
  	}
	public boolean Auto_Complete_CLICK(){
	    return Element_Click(Auto_Complete, "click","Auto_Complete");
  	}
	public String Auto_Complete_GETTEXT(){
	    return driver.findElement(Auto_Complete).getText();	}

   // Date_Picker
	public boolean Date_Picker_DISPLAYED(){
	    return VerifyElement(Date_Picker,"displayed","Date_Picker");
	}
	public boolean Date_Picker_ENABLED(){
	    return VerifyElement(Date_Picker,"enabled","Date_Picker");
	}
	public boolean Date_Picker_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Date_Picker);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Date_Picker_MOVETOANDCLICK(){
	    return Element_Click(Date_Picker, "moveToAndClick","Date_Picker");
 	}
	public boolean Date_Picker_CLICK_JAVASCRIPT(){
	    return Element_Click(Date_Picker, "javaClick","Date_Picker");
  	}
	public boolean Date_Picker_CLICK(){
	    return Element_Click(Date_Picker, "click","Date_Picker");
  	}
	public String Date_Picker_GETTEXT(){
	    return driver.findElement(Date_Picker).getText();	}

   // Slider
	public boolean Slider_DISPLAYED(){
	    return VerifyElement(Slider,"displayed","Slider");
	}
	public boolean Slider_ENABLED(){
	    return VerifyElement(Slider,"enabled","Slider");
	}
	public boolean Slider_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Slider);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Slider_MOVETOANDCLICK(){
	    return Element_Click(Slider, "moveToAndClick","Slider");
 	}
	public boolean Slider_CLICK_JAVASCRIPT(){
	    return Element_Click(Slider, "javaClick","Slider");
  	}
	public boolean Slider_CLICK(){
	    return Element_Click(Slider, "click","Slider");
  	}
	public String Slider_GETTEXT(){
	    return driver.findElement(Slider).getText();	}

   // Progress_Bar
	public boolean Progress_Bar_DISPLAYED(){
	    return VerifyElement(Progress_Bar,"displayed","Progress_Bar");
	}
	public boolean Progress_Bar_ENABLED(){
	    return VerifyElement(Progress_Bar,"enabled","Progress_Bar");
	}
	public boolean Progress_Bar_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Progress_Bar);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Progress_Bar_MOVETOANDCLICK(){
	    return Element_Click(Progress_Bar, "moveToAndClick","Progress_Bar");
 	}
	public boolean Progress_Bar_CLICK_JAVASCRIPT(){
	    return Element_Click(Progress_Bar, "javaClick","Progress_Bar");
  	}
	public boolean Progress_Bar_CLICK(){
	    return Element_Click(Progress_Bar, "click","Progress_Bar");
  	}
	public String Progress_Bar_GETTEXT(){
	    return driver.findElement(Progress_Bar).getText();	}

   // Tabs
	public boolean Tabs_DISPLAYED(){
	    return VerifyElement(Tabs,"displayed","Tabs");
	}
	public boolean Tabs_ENABLED(){
	    return VerifyElement(Tabs,"enabled","Tabs");
	}
	public boolean Tabs_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Tabs);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Tabs_MOVETOANDCLICK(){
	    return Element_Click(Tabs, "moveToAndClick","Tabs");
 	}
	public boolean Tabs_CLICK_JAVASCRIPT(){
	    return Element_Click(Tabs, "javaClick","Tabs");
  	}
	public boolean Tabs_CLICK(){
	    return Element_Click(Tabs, "click","Tabs");
  	}
	public String Tabs_GETTEXT(){
	    return driver.findElement(Tabs).getText();	}

   // Tool_Tips
	public boolean Tool_Tips_DISPLAYED(){
	    return VerifyElement(Tool_Tips,"displayed","Tool_Tips");
	}
	public boolean Tool_Tips_ENABLED(){
	    return VerifyElement(Tool_Tips,"enabled","Tool_Tips");
	}
	public boolean Tool_Tips_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Tool_Tips);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Tool_Tips_MOVETOANDCLICK(){
	    return Element_Click(Tool_Tips, "moveToAndClick","Tool_Tips");
 	}
	public boolean Tool_Tips_CLICK_JAVASCRIPT(){
	    return Element_Click(Tool_Tips, "javaClick","Tool_Tips");
  	}
	public boolean Tool_Tips_CLICK(){
	    return Element_Click(Tool_Tips, "click","Tool_Tips");
  	}
	public String Tool_Tips_GETTEXT(){
	    return driver.findElement(Tool_Tips).getText();	}

   // Menu
	public boolean Menu_DISPLAYED(){
	    return VerifyElement(Menu,"displayed","Menu");
	}
	public boolean Menu_ENABLED(){
	    return VerifyElement(Menu,"enabled","Menu");
	}
	public boolean Menu_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Menu);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Menu_MOVETOANDCLICK(){
	    return Element_Click(Menu, "moveToAndClick","Menu");
 	}
	public boolean Menu_CLICK_JAVASCRIPT(){
	    return Element_Click(Menu, "javaClick","Menu");
  	}
	public boolean Menu_CLICK(){
	    return Element_Click(Menu, "click","Menu");
  	}
	public String Menu_GETTEXT(){
	    return driver.findElement(Menu).getText();	}

   // Select_Menu
	public boolean Select_Menu_DISPLAYED(){
	    return VerifyElement(Select_Menu,"displayed","Select_Menu");
	}
	public boolean Select_Menu_ENABLED(){
	    return VerifyElement(Select_Menu,"enabled","Select_Menu");
	}
	public boolean Select_Menu_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Select_Menu);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Select_Menu_MOVETOANDCLICK(){
	    return Element_Click(Select_Menu, "moveToAndClick","Select_Menu");
 	}
	public boolean Select_Menu_CLICK_JAVASCRIPT(){
	    return Element_Click(Select_Menu, "javaClick","Select_Menu");
  	}
	public boolean Select_Menu_CLICK(){
	    return Element_Click(Select_Menu, "click","Select_Menu");
  	}
	public String Select_Menu_GETTEXT(){
	    return driver.findElement(Select_Menu).getText();	}

   // Sortable
	public boolean Sortable_DISPLAYED(){
	    return VerifyElement(Sortable,"displayed","Sortable");
	}
	public boolean Sortable_ENABLED(){
	    return VerifyElement(Sortable,"enabled","Sortable");
	}
	public boolean Sortable_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Sortable);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Sortable_MOVETOANDCLICK(){
	    return Element_Click(Sortable, "moveToAndClick","Sortable");
 	}
	public boolean Sortable_CLICK_JAVASCRIPT(){
	    return Element_Click(Sortable, "javaClick","Sortable");
  	}
	public boolean Sortable_CLICK(){
	    return Element_Click(Sortable, "click","Sortable");
  	}
	public String Sortable_GETTEXT(){
	    return driver.findElement(Sortable).getText();	}

   // Selectable
	public boolean Selectable_DISPLAYED(){
	    return VerifyElement(Selectable,"displayed","Selectable");
	}
	public boolean Selectable_ENABLED(){
	    return VerifyElement(Selectable,"enabled","Selectable");
	}
	public boolean Selectable_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Selectable);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Selectable_MOVETOANDCLICK(){
	    return Element_Click(Selectable, "moveToAndClick","Selectable");
 	}
	public boolean Selectable_CLICK_JAVASCRIPT(){
	    return Element_Click(Selectable, "javaClick","Selectable");
  	}
	public boolean Selectable_CLICK(){
	    return Element_Click(Selectable, "click","Selectable");
  	}
	public String Selectable_GETTEXT(){
	    return driver.findElement(Selectable).getText();	}

   // Resizable
	public boolean Resizable_DISPLAYED(){
	    return VerifyElement(Resizable,"displayed","Resizable");
	}
	public boolean Resizable_ENABLED(){
	    return VerifyElement(Resizable,"enabled","Resizable");
	}
	public boolean Resizable_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Resizable);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Resizable_MOVETOANDCLICK(){
	    return Element_Click(Resizable, "moveToAndClick","Resizable");
 	}
	public boolean Resizable_CLICK_JAVASCRIPT(){
	    return Element_Click(Resizable, "javaClick","Resizable");
  	}
	public boolean Resizable_CLICK(){
	    return Element_Click(Resizable, "click","Resizable");
  	}
	public String Resizable_GETTEXT(){
	    return driver.findElement(Resizable).getText();	}

   // Droppable
	public boolean Droppable_DISPLAYED(){
	    return VerifyElement(Droppable,"displayed","Droppable");
	}
	public boolean Droppable_ENABLED(){
	    return VerifyElement(Droppable,"enabled","Droppable");
	}
	public boolean Droppable_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Droppable);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Droppable_MOVETOANDCLICK(){
	    return Element_Click(Droppable, "moveToAndClick","Droppable");
 	}
	public boolean Droppable_CLICK_JAVASCRIPT(){
	    return Element_Click(Droppable, "javaClick","Droppable");
  	}
	public boolean Droppable_CLICK(){
	    return Element_Click(Droppable, "click","Droppable");
  	}
	public String Droppable_GETTEXT(){
	    return driver.findElement(Droppable).getText();	}

   // Dragabble
	public boolean Dragabble_DISPLAYED(){
	    return VerifyElement(Dragabble,"displayed","Dragabble");
	}
	public boolean Dragabble_ENABLED(){
	    return VerifyElement(Dragabble,"enabled","Dragabble");
	}
	public boolean Dragabble_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Dragabble);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Dragabble_MOVETOANDCLICK(){
	    return Element_Click(Dragabble, "moveToAndClick","Dragabble");
 	}
	public boolean Dragabble_CLICK_JAVASCRIPT(){
	    return Element_Click(Dragabble, "javaClick","Dragabble");
  	}
	public boolean Dragabble_CLICK(){
	    return Element_Click(Dragabble, "click","Dragabble");
  	}
	public String Dragabble_GETTEXT(){
	    return driver.findElement(Dragabble).getText();	}

   // Login
	public boolean Login_DISPLAYED(){
	    return VerifyElement(Login,"displayed","Login");
	}
	public boolean Login_ENABLED(){
	    return VerifyElement(Login,"enabled","Login");
	}
	public boolean Login_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Login);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Login_MOVETOANDCLICK(){
	    return Element_Click(Login, "moveToAndClick","Login");
 	}
	public boolean Login_CLICK_JAVASCRIPT(){
	    return Element_Click(Login, "javaClick","Login");
  	}
	public boolean Login_CLICK(){
	    return Element_Click(Login, "click","Login");
  	}
	public String Login_GETTEXT(){
	    return driver.findElement(Login).getText();	}

   // Book_Store
	public boolean Book_Store_DISPLAYED(){
	    return VerifyElement(Book_Store,"displayed","Book_Store");
	}
	public boolean Book_Store_ENABLED(){
	    return VerifyElement(Book_Store,"enabled","Book_Store");
	}
	public boolean Book_Store_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Book_Store);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Book_Store_MOVETOANDCLICK(){
	    return Element_Click(Book_Store, "moveToAndClick","Book_Store");
 	}
	public boolean Book_Store_CLICK_JAVASCRIPT(){
	    return Element_Click(Book_Store, "javaClick","Book_Store");
  	}
	public boolean Book_Store_CLICK(){
	    return Element_Click(Book_Store, "click","Book_Store");
  	}
	public String Book_Store_GETTEXT(){
	    return driver.findElement(Book_Store).getText();	}

   // Profile
	public boolean Profile_DISPLAYED(){
	    return VerifyElement(Profile,"displayed","Profile");
	}
	public boolean Profile_ENABLED(){
	    return VerifyElement(Profile,"enabled","Profile");
	}
	public boolean Profile_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Profile);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Profile_MOVETOANDCLICK(){
	    return Element_Click(Profile, "moveToAndClick","Profile");
 	}
	public boolean Profile_CLICK_JAVASCRIPT(){
	    return Element_Click(Profile, "javaClick","Profile");
  	}
	public boolean Profile_CLICK(){
	    return Element_Click(Profile, "click","Profile");
  	}
	public String Profile_GETTEXT(){
	    return driver.findElement(Profile).getText();	}

   // Book_Store_API
	public boolean Book_Store_API_DISPLAYED(){
	    return VerifyElement(Book_Store_API,"displayed","Book_Store_API");
	}
	public boolean Book_Store_API_ENABLED(){
	    return VerifyElement(Book_Store_API,"enabled","Book_Store_API");
	}
	public boolean Book_Store_API_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Book_Store_API);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Book_Store_API_MOVETOANDCLICK(){
	    return Element_Click(Book_Store_API, "moveToAndClick","Book_Store_API");
 	}
	public boolean Book_Store_API_CLICK_JAVASCRIPT(){
	    return Element_Click(Book_Store_API, "javaClick","Book_Store_API");
  	}
	public boolean Book_Store_API_CLICK(){
	    return Element_Click(Book_Store_API, "click","Book_Store_API");
  	}
	public String Book_Store_API_GETTEXT(){
	    return driver.findElement(Book_Store_API).getText();	}

}