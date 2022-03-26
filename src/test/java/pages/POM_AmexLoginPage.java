package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import utility.SeleniumHelperBasic;
import org.openqa.selenium.support.ui.Select;

public class POM_AmexLoginPage extends SeleniumHelperBasic{

   //Variables
	private Actions action;
	public String PAGE_Title = "American Express Credit Cards, Rewards, Travel and Business Services";
	public String PAGE_URL = "https://www.americanexpress.com/en-us/account/login?inav=iNavLnkLog";

   //Constructor
	public POM_AmexLoginPage(WebDriver driver){
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
		ValidatePageTitle(PAGE_Title);
	}

   //Locators
	By Cards_My_Account = By.xpath("//*[@class='form-control']/option[1]");
	By Membership_Rewards = By.xpath("//*[@class='form-control']/option[2]");
	By Merchant_Account = By.xpath("//*[@class='form-control']/option[3]");
	By American_Express_Work = By.xpath("//*[@class='form-control']/option[4]");
	By Dropdown_Account_Type = By.xpath("//select[@class='form-control']");
	By User_ID = By.xpath("//input[@id='eliloUserID']");
	By Password = By.xpath("//input[@type='password'][@id='eliloPassword'][@class='form-control']");
	By Remember_Me = By.xpath("//label[text()[contains(.,'Remember Me')]]");
	By Log_In_Button = By.xpath("//*[@id='loginSubmit']");

   //Methods

   // Cards_My_Account
	public boolean Cards_My_Account_DISPLAYED(){
	    return VerifyElement(Cards_My_Account,"displayed","Cards_My_Account");
	}
	public boolean Cards_My_Account_ENABLED(){
	    return VerifyElement(Cards_My_Account,"enabled","Cards_My_Account");
	}
	public boolean Cards_My_Account_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Cards_My_Account);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Cards_My_Account_MOVETOANDCLICK(){
	    return Element_Click(Cards_My_Account, "moveToAndClick","Cards_My_Account");
 	}
	public boolean Cards_My_Account_CLICK_JAVASCRIPT(){
	    return Element_Click(Cards_My_Account, "javaClick","Cards_My_Account");
  	}
	public boolean Cards_My_Account_CLICK(){
	    return Element_Click(Cards_My_Account, "click","Cards_My_Account");
  	}
	public String Cards_My_Account_GETTEXT(){
	    return driver.findElement(Cards_My_Account).getText();	}

   // Membership_Rewards
	public boolean Membership_Rewards_DISPLAYED(){
	    return VerifyElement(Membership_Rewards,"displayed","Membership_Rewards");
	}
	public boolean Membership_Rewards_ENABLED(){
	    return VerifyElement(Membership_Rewards,"enabled","Membership_Rewards");
	}
	public boolean Membership_Rewards_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Membership_Rewards);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Membership_Rewards_MOVETOANDCLICK(){
	    return Element_Click(Membership_Rewards, "moveToAndClick","Membership_Rewards");
 	}
	public boolean Membership_Rewards_CLICK_JAVASCRIPT(){
	    return Element_Click(Membership_Rewards, "javaClick","Membership_Rewards");
  	}
	public boolean Membership_Rewards_CLICK(){
	    return Element_Click(Membership_Rewards, "click","Membership_Rewards");
  	}
	public String Membership_Rewards_GETTEXT(){
	    return driver.findElement(Membership_Rewards).getText();	}

   // Merchant_Account
	public boolean Merchant_Account_DISPLAYED(){
	    return VerifyElement(Merchant_Account,"displayed","Merchant_Account");
	}
	public boolean Merchant_Account_ENABLED(){
	    return VerifyElement(Merchant_Account,"enabled","Merchant_Account");
	}
	public boolean Merchant_Account_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Merchant_Account);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Merchant_Account_MOVETOANDCLICK(){
	    return Element_Click(Merchant_Account, "moveToAndClick","Merchant_Account");
 	}
	public boolean Merchant_Account_CLICK_JAVASCRIPT(){
	    return Element_Click(Merchant_Account, "javaClick","Merchant_Account");
  	}
	public boolean Merchant_Account_CLICK(){
	    return Element_Click(Merchant_Account, "click","Merchant_Account");
  	}
	public String Merchant_Account_GETTEXT(){
	    return driver.findElement(Merchant_Account).getText();	}

   // American_Express_Work
	public boolean American_Express_Work_DISPLAYED(){
	    return VerifyElement(American_Express_Work,"displayed","American_Express_Work");
	}
	public boolean American_Express_Work_ENABLED(){
	    return VerifyElement(American_Express_Work,"enabled","American_Express_Work");
	}
	public boolean American_Express_Work_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(American_Express_Work);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean American_Express_Work_MOVETOANDCLICK(){
	    return Element_Click(American_Express_Work, "moveToAndClick","American_Express_Work");
 	}
	public boolean American_Express_Work_CLICK_JAVASCRIPT(){
	    return Element_Click(American_Express_Work, "javaClick","American_Express_Work");
  	}
	public boolean American_Express_Work_CLICK(){
	    return Element_Click(American_Express_Work, "click","American_Express_Work");
  	}
	public String American_Express_Work_GETTEXT(){
	    return driver.findElement(American_Express_Work).getText();	}

   // Dropdown_Account_Type
	public boolean Dropdown_Account_Type_DISPLAYED(){
	    return VerifyElement(Dropdown_Account_Type,"displayed","Dropdown_Account_Type");
	}
	public boolean Dropdown_Account_Type_ENABLED(){
	    return VerifyElement(Dropdown_Account_Type,"enabled","Dropdown_Account_Type");
	}
	public boolean Dropdown_Account_Type_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Dropdown_Account_Type);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Dropdown_Account_Type_MOVETOANDCLICK(){
	    return Element_Click(Dropdown_Account_Type, "moveToAndClick","Dropdown_Account_Type");
 	}
	public boolean Dropdown_Account_Type_CLICK_JAVASCRIPT(){
	    return Element_Click(Dropdown_Account_Type, "javaClick","Dropdown_Account_Type");
  	}
	public boolean Dropdown_Account_Type_CLICK(){
	    return Element_Click(Dropdown_Account_Type, "click","Dropdown_Account_Type");
  	}
	public String Dropdown_Account_Type_GETTEXT(){
	    return driver.findElement(Dropdown_Account_Type).getText();	}
	public boolean Dropdown_Account_Type_SENDKEYS(String textToInput){
	    driver.findElement(Dropdown_Account_Type).clear();	    driver.findElement(Dropdown_Account_Type).sendKeys(textToInput);	    return true;
	}
	public boolean Dropdown_Account_Type_SELECT_BY_TEXT(String textToInput){
	    Select SelectElement = new Select(driver.findElement(Dropdown_Account_Type));
	    SelectElement.selectByVisibleText(textToInput);
	    return true;
	}

   // User_ID
	public boolean User_ID_DISPLAYED(){
	    return VerifyElement(User_ID,"displayed","User_ID");
	}
	public boolean User_ID_ENABLED(){
	    return VerifyElement(User_ID,"enabled","User_ID");
	}
	public boolean User_ID_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(User_ID);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean User_ID_MOVETOANDCLICK(){
	    return Element_Click(User_ID, "moveToAndClick","User_ID");
 	}
	public boolean User_ID_CLICK_JAVASCRIPT(){
	    return Element_Click(User_ID, "javaClick","User_ID");
  	}
	public boolean User_ID_CLICK(){
	    return Element_Click(User_ID, "click","User_ID");
  	}
	public String User_ID_GETTEXT(){
	    return driver.findElement(User_ID).getText();	}
	public boolean User_ID_SENDKEYS(String textToInput){
	    driver.findElement(User_ID).clear();	    driver.findElement(User_ID).sendKeys(textToInput);	    return true;
	}

   // Password
	public boolean Password_DISPLAYED(){
	    return VerifyElement(Password,"displayed","Password");
	}
	public boolean Password_ENABLED(){
	    return VerifyElement(Password,"enabled","Password");
	}
	public boolean Password_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Password);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Password_MOVETOANDCLICK(){
	    return Element_Click(Password, "moveToAndClick","Password");
 	}
	public boolean Password_CLICK_JAVASCRIPT(){
	    return Element_Click(Password, "javaClick","Password");
  	}
	public boolean Password_CLICK(){
	    return Element_Click(Password, "click","Password");
  	}
	public String Password_GETTEXT(){
	    return driver.findElement(Password).getText();	}
	public boolean Password_SENDKEYS(String textToInput){
	    driver.findElement(Password).clear();	    driver.findElement(Password).sendKeys(textToInput);	    return true;
	}

   // Remember_Me
	public boolean Remember_Me_DISPLAYED(){
	    return VerifyElement(Remember_Me,"displayed","Remember_Me");
	}
	public boolean Remember_Me_ENABLED(){
	    return VerifyElement(Remember_Me,"enabled","Remember_Me");
	}
	public boolean Remember_Me_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Remember_Me);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Remember_Me_MOVETOANDCLICK(){
	    return Element_Click(Remember_Me, "moveToAndClick","Remember_Me");
 	}
	public boolean Remember_Me_CLICK_JAVASCRIPT(){
	    return Element_Click(Remember_Me, "javaClick","Remember_Me");
  	}
	public boolean Remember_Me_CLICK(){
	    return Element_Click(Remember_Me, "click","Remember_Me");
  	}
	public String Remember_Me_GETTEXT(){
	    return driver.findElement(Remember_Me).getText();	}

   // Log_In_Button
	public boolean Log_In_Button_DISPLAYED(){
	    return VerifyElement(Log_In_Button,"displayed","Log_In_Button");
	}
	public boolean Log_In_Button_ENABLED(){
	    return VerifyElement(Log_In_Button,"enabled","Log_In_Button");
	}
	public boolean Log_In_Button_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Log_In_Button);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Log_In_Button_MOVETOANDCLICK(){
	    return Element_Click(Log_In_Button, "moveToAndClick","Log_In_Button");
 	}
	public boolean Log_In_Button_CLICK_JAVASCRIPT(){
	    return Element_Click(Log_In_Button, "javaClick","Log_In_Button");
  	}
	public boolean Log_In_Button_CLICK(){
	    return Element_Click(Log_In_Button, "click","Log_In_Button");
  	}
	public String Log_In_Button_GETTEXT(){
	    return driver.findElement(Log_In_Button).getText();	}

}