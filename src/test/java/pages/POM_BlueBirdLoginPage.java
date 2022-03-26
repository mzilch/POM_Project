package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import utility.SeleniumHelperBasic;

public class POM_BlueBirdLoginPage extends SeleniumHelperBasic{

   //Variables
	private Actions action;
	public String PAGE_Title = "Login - Bluebird";
	public String PAGE_URL = "https://secure.bluebird.com/login";

   //Constructor
	public POM_BlueBirdLoginPage(WebDriver driver){
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
		ValidatePageTitle(PAGE_Title);
	}

   //Locators
	By UserName = By.xpath("//input[@id='bb-username']");
	By Password_Field = By.xpath("//input[@id='bb-password']");
	By RememberMe_Checkbox = By.xpath("//*[@id='rememberme']");
	By LogIn_Button = By.xpath("//button[@id='bb-submit']");
	By Create_an_Account = By.xpath("//a[text()[contains(.,'Create')]]");
	By UsernameSection = By.xpath("//*[contains(text(),'Username')]");
	By Legal = By.xpath("//a[@href='https://www.bluebird.com/legal']");
	By Privacy_Center_First = By.xpath("//a[@href='https://www.americanexpress.com/us/company/privacy-center/online-privacy-disclosures/']");

   //Methods 

   // UserName
	public boolean UserName_DISPLAYED(){
	    return VerifyElement(UserName,"displayed","UserName");
	}
	public boolean UserName_ENABLED(){
	    return VerifyElement(UserName,"enabled","UserName");
	}
	public boolean UserName_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(UserName);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean UserName_MOVETOANDCLICK(){
	    return Element_Click(UserName, "moveToAndClick","UserName");
 	}
	public boolean UserName_CLICK_JAVASCRIPT(){
	    return Element_Click(UserName, "javaClick","UserName");
  	}
	public boolean UserName_CLICK(){
	    return Element_Click(UserName, "click","UserName");
  	}
	public String UserName_GETTEXT(){
	    return driver.findElement(UserName).getText();	}
	public boolean UserName_SENDKEYS(String textToInput){
	    driver.findElement(UserName).clear();	    driver.findElement(UserName).sendKeys(textToInput);	    return true;
	}

   // Password_Field
	public boolean Password_Field_DISPLAYED(){
	    return VerifyElement(Password_Field,"displayed","Password_Field");
	}
	public boolean Password_Field_ENABLED(){
	    return VerifyElement(Password_Field,"enabled","Password_Field");
	}
	public boolean Password_Field_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Password_Field);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Password_Field_MOVETOANDCLICK(){
	    return Element_Click(Password_Field, "moveToAndClick","Password_Field");
 	}
	public boolean Password_Field_CLICK_JAVASCRIPT(){
	    return Element_Click(Password_Field, "javaClick","Password_Field");
  	}
	public boolean Password_Field_CLICK(){
	    return Element_Click(Password_Field, "click","Password_Field");
  	}
	public String Password_Field_GETTEXT(){
	    return driver.findElement(Password_Field).getText();	}
	public boolean Password_Field_SENDKEYS(String textToInput){
	    driver.findElement(Password_Field).clear();	    driver.findElement(Password_Field).sendKeys(textToInput);	    return true;
	}

   // RememberMe_Checkbox
	public boolean RememberMe_Checkbox_DISPLAYED(){
	    return VerifyElement(RememberMe_Checkbox,"displayed","RememberMe_Checkbox");
	}
	public boolean RememberMe_Checkbox_ENABLED(){
	    return VerifyElement(RememberMe_Checkbox,"enabled","RememberMe_Checkbox");
	}
	public boolean RememberMe_Checkbox_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(RememberMe_Checkbox);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean RememberMe_Checkbox_MOVETOANDCLICK(){
	    return Element_Click(RememberMe_Checkbox, "moveToAndClick","RememberMe_Checkbox");
 	}
	public boolean RememberMe_Checkbox_CLICK_JAVASCRIPT(){
	    return Element_Click(RememberMe_Checkbox, "javaClick","RememberMe_Checkbox");
  	}
	public boolean RememberMe_Checkbox_CLICK(){
	    return Element_Click(RememberMe_Checkbox, "click","RememberMe_Checkbox");
  	}
	public String RememberMe_Checkbox_GETTEXT(){
	    return driver.findElement(RememberMe_Checkbox).getText();	}
	public boolean RememberMe_Checkbox_SENDKEYS(String textToInput){
	    driver.findElement(RememberMe_Checkbox).clear();	    driver.findElement(RememberMe_Checkbox).sendKeys(textToInput);	    return true;
	}

   // LogIn_Button
	public boolean LogIn_Button_DISPLAYED(){
	    return VerifyElement(LogIn_Button,"displayed","LogIn_Button");
	}
	public boolean LogIn_Button_ENABLED(){
	    return VerifyElement(LogIn_Button,"enabled","LogIn_Button");
	}
	public boolean LogIn_Button_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(LogIn_Button);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean LogIn_Button_MOVETOANDCLICK(){
	    return Element_Click(LogIn_Button, "moveToAndClick","LogIn_Button");
 	}
	public boolean LogIn_Button_CLICK_JAVASCRIPT(){
	    return Element_Click(LogIn_Button, "javaClick","LogIn_Button");
  	}
	public boolean LogIn_Button_CLICK(){
	    return Element_Click(LogIn_Button, "click","LogIn_Button");
  	}
	public String LogIn_Button_GETTEXT(){
	    return driver.findElement(LogIn_Button).getText();	}
	public boolean LogIn_Button_SENDKEYS(String textToInput){
	    driver.findElement(LogIn_Button).clear();	    driver.findElement(LogIn_Button).sendKeys(textToInput);	    return true;
	}

   // Create_an_Account
	public boolean Create_an_Account_DISPLAYED(){
	    return VerifyElement(Create_an_Account,"displayed","Create_an_Account");
	}
	public boolean Create_an_Account_ENABLED(){
	    return VerifyElement(Create_an_Account,"enabled","Create_an_Account");
	}
	public boolean Create_an_Account_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Create_an_Account);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Create_an_Account_MOVETOANDCLICK(){
	    return Element_Click(Create_an_Account, "moveToAndClick","Create_an_Account");
 	}
	public boolean Create_an_Account_CLICK_JAVASCRIPT(){
	    return Element_Click(Create_an_Account, "javaClick","Create_an_Account");
  	}
	public boolean Create_an_Account_CLICK(){
	    return Element_Click(Create_an_Account, "click","Create_an_Account");
  	}
	public String Create_an_Account_GETTEXT(){
	    return driver.findElement(Create_an_Account).getText();	}

   // UsernameSection
	public boolean UsernameSection_DISPLAYED(){
	    return VerifyElement(UsernameSection,"displayed","UsernameSection");
	}
	public boolean UsernameSection_ENABLED(){
	    return VerifyElement(UsernameSection,"enabled","UsernameSection");
	}
	public boolean UsernameSection_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(UsernameSection);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean UsernameSection_MOVETOANDCLICK(){
	    return Element_Click(UsernameSection, "moveToAndClick","UsernameSection");
 	}
	public boolean UsernameSection_CLICK_JAVASCRIPT(){
	    return Element_Click(UsernameSection, "javaClick","UsernameSection");
  	}
	public boolean UsernameSection_CLICK(){
	    return Element_Click(UsernameSection, "click","UsernameSection");
  	}
	public String UsernameSection_GETTEXT(){
	    return driver.findElement(UsernameSection).getText();	}

   // Legal
	public boolean Legal_DISPLAYED(){
	    return VerifyElement(Legal,"displayed","Legal");
	}
	public boolean Legal_ENABLED(){
	    return VerifyElement(Legal,"enabled","Legal");
	}
	public boolean Legal_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Legal);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Legal_MOVETOANDCLICK(){
	    return Element_Click(Legal, "moveToAndClick","Legal");
 	}
	public boolean Legal_CLICK_JAVASCRIPT(){
	    return Element_Click(Legal, "javaClick","Legal");
  	}
	public boolean Legal_CLICK(){
	    return Element_Click(Legal, "click","Legal");
  	}
	public String Legal_GETTEXT(){
	    return driver.findElement(Legal).getText();	}

   // Privacy_Center_First
	public boolean Privacy_Center_First_DISPLAYED(){
	    return VerifyElement(Privacy_Center_First,"displayed","Privacy_Center_First");
	}
	public boolean Privacy_Center_First_ENABLED(){
	    return VerifyElement(Privacy_Center_First,"enabled","Privacy_Center_First");
	}
	public boolean Privacy_Center_First_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Privacy_Center_First);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Privacy_Center_First_MOVETOANDCLICK(){
	    return Element_Click(Privacy_Center_First, "moveToAndClick","Privacy_Center_First");
 	}
	public boolean Privacy_Center_First_CLICK_JAVASCRIPT(){
	    return Element_Click(Privacy_Center_First, "javaClick","Privacy_Center_First");
  	}
	public boolean Privacy_Center_First_CLICK(){
	    return Element_Click(Privacy_Center_First, "click","Privacy_Center_First");
  	}
	public String Privacy_Center_First_GETTEXT(){
	    return driver.findElement(Privacy_Center_First).getText();	}

}