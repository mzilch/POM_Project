package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import utility.SeleniumHelperBasic;

public class POM_HomeBluebirdTBD extends SeleniumHelperBasic{

   //Variables
	private Actions action;
	public String PAGE_Title = "Home - Bluebird";
	public String PAGE_URL = "https://secure.bluebird.com/dashboard";

   //Constructor
	public POM_HomeBluebirdTBD(WebDriver driver){
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}

   //Locators
	By Money_In_Side_Menuitem = By.xpath("//a[@data-testid='bb-side-navigation__nav-list--moneyIn']");
	By Marks_Account_Main_Account = By.xpath("//a[@data-testid='bb-accounts-list__link_toAccounts-0']");
	By Add_Money = By.xpath("//a[@data-keyboard-focus='false']");
	By Evelyns_Subaccount_Subaccount = By.xpath("//a[@data-testid='bb-accounts-list__link_toAccounts-1']");
	By Add_Money_1 = By.xpath("//*[@id='main']/div/div/div[2]/div[3]/div/div[1]/div/div[1]/div/div[2]/div/div/div/span[1]/a[1]");
	By Add_Subaccount = By.xpath("//a[@class='bb-accounts-list__slider-new-btn']");
	By Add_Goal = By.xpath("//a[@class='bb-goals-list__add-goal-btn-link']");
	By EnrollinDirectDepositHaveyourpaycheckorgo = By.xpath("//div[@class='bb-alert-box']");
	By Previous_Notification = By.xpath("//*[@class='d-flex inner-navigation']/button[1]");
	By Next_Notification = By.xpath("//*[@class='d-flex inner-navigation']/button[2]");
	By Enroll_Now_Button = By.xpath("//button[@data-testid='bb-alert-box__btn-main']");
	By Remind_Me_Later_Button = By.xpath("//button[@data-testid='bb-alert-box__btn-skip']");
	By Notification_Text = By.xpath("//p[@class='bb-alert-box__description']");
	By Notification_Header_Text = By.xpath("//span[@class='bb-alert-box__title']");

   //Methods

   // Money_In_Side_Menuitem
	public boolean Money_In_Side_Menuitem_DISPLAYED(){
	    return VerifyElement(Money_In_Side_Menuitem,"displayed","Money_In_Side_Menuitem");
	}
	public boolean Money_In_Side_Menuitem_ENABLED(){
	    return VerifyElement(Money_In_Side_Menuitem,"enabled","Money_In_Side_Menuitem");
	}
	public boolean Money_In_Side_Menuitem_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Money_In_Side_Menuitem);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Money_In_Side_Menuitem_MOVETOANDCLICK(){
	    return Element_Click(Money_In_Side_Menuitem, "moveToAndClick","Money_In_Side_Menuitem");
 	}
	public boolean Money_In_Side_Menuitem_CLICK_JAVASCRIPT(){
	    return Element_Click(Money_In_Side_Menuitem, "javaClick","Money_In_Side_Menuitem");
  	}
	public boolean Money_In_Side_Menuitem_CLICK(){
	    return Element_Click(Money_In_Side_Menuitem, "click","Money_In_Side_Menuitem");
  	}
	public String Money_In_Side_Menuitem_GETTEXT(){
	    return driver.findElement(Money_In_Side_Menuitem).getText();	}

   // Marks_Account_Main_Account
	public boolean Marks_Account_Main_Account_DISPLAYED(){
	    return VerifyElement(Marks_Account_Main_Account,"displayed","Marks_Account_Main_Account");
	}
	public boolean Marks_Account_Main_Account_ENABLED(){
	    return VerifyElement(Marks_Account_Main_Account,"enabled","Marks_Account_Main_Account");
	}
	public boolean Marks_Account_Main_Account_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Marks_Account_Main_Account);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Marks_Account_Main_Account_MOVETOANDCLICK(){
	    return Element_Click(Marks_Account_Main_Account, "moveToAndClick","Marks_Account_Main_Account");
 	}
	public boolean Marks_Account_Main_Account_CLICK_JAVASCRIPT(){
	    return Element_Click(Marks_Account_Main_Account, "javaClick","Marks_Account_Main_Account");
  	}
	public boolean Marks_Account_Main_Account_CLICK(){
	    return Element_Click(Marks_Account_Main_Account, "click","Marks_Account_Main_Account");
  	}
	public String Marks_Account_Main_Account_GETTEXT(){
	    return driver.findElement(Marks_Account_Main_Account).getText();	}

   // Add_Money
	public boolean Add_Money_DISPLAYED(){
	    return VerifyElement(Add_Money,"displayed","Add_Money");
	}
	public boolean Add_Money_ENABLED(){
	    return VerifyElement(Add_Money,"enabled","Add_Money");
	}
	public boolean Add_Money_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Add_Money);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Add_Money_MOVETOANDCLICK(){
	    return Element_Click(Add_Money, "moveToAndClick","Add_Money");
 	}
	public boolean Add_Money_CLICK_JAVASCRIPT(){
	    return Element_Click(Add_Money, "javaClick","Add_Money");
  	}
	public boolean Add_Money_CLICK(){
	    return Element_Click(Add_Money, "click","Add_Money");
  	}
	public String Add_Money_GETTEXT(){
	    return driver.findElement(Add_Money).getText();	}

   // Evelyns_Subaccount_Subaccount
	public boolean Evelyns_Subaccount_Subaccount_DISPLAYED(){
	    return VerifyElement(Evelyns_Subaccount_Subaccount,"displayed","Evelyns_Subaccount_Subaccount");
	}
	public boolean Evelyns_Subaccount_Subaccount_ENABLED(){
	    return VerifyElement(Evelyns_Subaccount_Subaccount,"enabled","Evelyns_Subaccount_Subaccount");
	}
	public boolean Evelyns_Subaccount_Subaccount_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Evelyns_Subaccount_Subaccount);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Evelyns_Subaccount_Subaccount_MOVETOANDCLICK(){
	    return Element_Click(Evelyns_Subaccount_Subaccount, "moveToAndClick","Evelyns_Subaccount_Subaccount");
 	}
	public boolean Evelyns_Subaccount_Subaccount_CLICK_JAVASCRIPT(){
	    return Element_Click(Evelyns_Subaccount_Subaccount, "javaClick","Evelyns_Subaccount_Subaccount");
  	}
	public boolean Evelyns_Subaccount_Subaccount_CLICK(){
	    return Element_Click(Evelyns_Subaccount_Subaccount, "click","Evelyns_Subaccount_Subaccount");
  	}
	public String Evelyns_Subaccount_Subaccount_GETTEXT(){
	    return driver.findElement(Evelyns_Subaccount_Subaccount).getText();	}

   // Add_Money_1
	public boolean Add_Money_1_DISPLAYED(){
	    return VerifyElement(Add_Money_1,"displayed","Add_Money_1");
	}
	public boolean Add_Money_1_ENABLED(){
	    return VerifyElement(Add_Money_1,"enabled","Add_Money_1");
	}
	public boolean Add_Money_1_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Add_Money_1);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Add_Money_1_MOVETOANDCLICK(){
	    return Element_Click(Add_Money_1, "moveToAndClick","Add_Money_1");
 	}
	public boolean Add_Money_1_CLICK_JAVASCRIPT(){
	    return Element_Click(Add_Money_1, "javaClick","Add_Money_1");
  	}
	public boolean Add_Money_1_CLICK(){
	    return Element_Click(Add_Money_1, "click","Add_Money_1");
  	}
	public String Add_Money_1_GETTEXT(){
	    return driver.findElement(Add_Money_1).getText();	}

   // Add_Subaccount
	public boolean Add_Subaccount_DISPLAYED(){
	    return VerifyElement(Add_Subaccount,"displayed","Add_Subaccount");
	}
	public boolean Add_Subaccount_ENABLED(){
	    return VerifyElement(Add_Subaccount,"enabled","Add_Subaccount");
	}
	public boolean Add_Subaccount_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Add_Subaccount);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Add_Subaccount_MOVETOANDCLICK(){
	    return Element_Click(Add_Subaccount, "moveToAndClick","Add_Subaccount");
 	}
	public boolean Add_Subaccount_CLICK_JAVASCRIPT(){
	    return Element_Click(Add_Subaccount, "javaClick","Add_Subaccount");
  	}
	public boolean Add_Subaccount_CLICK(){
	    return Element_Click(Add_Subaccount, "click","Add_Subaccount");
  	}
	public String Add_Subaccount_GETTEXT(){
	    return driver.findElement(Add_Subaccount).getText();	}

   // Add_Goal
	public boolean Add_Goal_DISPLAYED(){
	    return VerifyElement(Add_Goal,"displayed","Add_Goal");
	}
	public boolean Add_Goal_ENABLED(){
	    return VerifyElement(Add_Goal,"enabled","Add_Goal");
	}
	public boolean Add_Goal_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Add_Goal);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Add_Goal_MOVETOANDCLICK(){
	    return Element_Click(Add_Goal, "moveToAndClick","Add_Goal");
 	}
	public boolean Add_Goal_CLICK_JAVASCRIPT(){
	    return Element_Click(Add_Goal, "javaClick","Add_Goal");
  	}
	public boolean Add_Goal_CLICK(){
	    return Element_Click(Add_Goal, "click","Add_Goal");
  	}
	public String Add_Goal_GETTEXT(){
	    return driver.findElement(Add_Goal).getText();	}

   // EnrollinDirectDepositHaveyourpaycheckorgo
	public boolean EnrollinDirectDepositHaveyourpaycheckorgo_DISPLAYED(){
	    return VerifyElement(EnrollinDirectDepositHaveyourpaycheckorgo,"displayed","EnrollinDirectDepositHaveyourpaycheckorgo");
	}
	public boolean EnrollinDirectDepositHaveyourpaycheckorgo_ENABLED(){
	    return VerifyElement(EnrollinDirectDepositHaveyourpaycheckorgo,"enabled","EnrollinDirectDepositHaveyourpaycheckorgo");
	}
	public boolean EnrollinDirectDepositHaveyourpaycheckorgo_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(EnrollinDirectDepositHaveyourpaycheckorgo);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean EnrollinDirectDepositHaveyourpaycheckorgo_MOVETOANDCLICK(){
	    return Element_Click(EnrollinDirectDepositHaveyourpaycheckorgo, "moveToAndClick","EnrollinDirectDepositHaveyourpaycheckorgo");
 	}
	public boolean EnrollinDirectDepositHaveyourpaycheckorgo_CLICK_JAVASCRIPT(){
	    return Element_Click(EnrollinDirectDepositHaveyourpaycheckorgo, "javaClick","EnrollinDirectDepositHaveyourpaycheckorgo");
  	}
	public boolean EnrollinDirectDepositHaveyourpaycheckorgo_CLICK(){
	    return Element_Click(EnrollinDirectDepositHaveyourpaycheckorgo, "click","EnrollinDirectDepositHaveyourpaycheckorgo");
  	}
	public String EnrollinDirectDepositHaveyourpaycheckorgo_GETTEXT(){
	    return driver.findElement(EnrollinDirectDepositHaveyourpaycheckorgo).getText();	}

   // Previous_Notification
	public boolean Previous_Notification_DISPLAYED(){
	    return VerifyElement(Previous_Notification,"displayed","Previous_Notification");
	}
	public boolean Previous_Notification_ENABLED(){
	    return VerifyElement(Previous_Notification,"enabled","Previous_Notification");
	}
	public boolean Previous_Notification_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Previous_Notification);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Previous_Notification_MOVETOANDCLICK(){
	    return Element_Click(Previous_Notification, "moveToAndClick","Previous_Notification");
 	}
	public boolean Previous_Notification_CLICK_JAVASCRIPT(){
	    return Element_Click(Previous_Notification, "javaClick","Previous_Notification");
  	}
	public boolean Previous_Notification_CLICK(){
	    return Element_Click(Previous_Notification, "click","Previous_Notification");
  	}
	public String Previous_Notification_GETTEXT(){
	    return driver.findElement(Previous_Notification).getText();	}

   // Next_Notification
	public boolean Next_Notification_DISPLAYED(){
	    return VerifyElement(Next_Notification,"displayed","Next_Notification");
	}
	public boolean Next_Notification_ENABLED(){
	    return VerifyElement(Next_Notification,"enabled","Next_Notification");
	}
	public boolean Next_Notification_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Next_Notification);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Next_Notification_MOVETOANDCLICK(){
	    return Element_Click(Next_Notification, "moveToAndClick","Next_Notification");
 	}
	public boolean Next_Notification_CLICK_JAVASCRIPT(){
	    return Element_Click(Next_Notification, "javaClick","Next_Notification");
  	}
	public boolean Next_Notification_CLICK(){
	    return Element_Click(Next_Notification, "click","Next_Notification");
  	}
	public String Next_Notification_GETTEXT(){
	    return driver.findElement(Next_Notification).getText();	}

   // Enroll_Now_Button
	public boolean Enroll_Now_Button_DISPLAYED(){
	    return VerifyElement(Enroll_Now_Button,"displayed","Enroll_Now_Button");
	}
	public boolean Enroll_Now_Button_ENABLED(){
	    return VerifyElement(Enroll_Now_Button,"enabled","Enroll_Now_Button");
	}
	public boolean Enroll_Now_Button_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Enroll_Now_Button);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Enroll_Now_Button_MOVETOANDCLICK(){
	    return Element_Click(Enroll_Now_Button, "moveToAndClick","Enroll_Now_Button");
 	}
	public boolean Enroll_Now_Button_CLICK_JAVASCRIPT(){
	    return Element_Click(Enroll_Now_Button, "javaClick","Enroll_Now_Button");
  	}
	public boolean Enroll_Now_Button_CLICK(){
	    return Element_Click(Enroll_Now_Button, "click","Enroll_Now_Button");
  	}
	public String Enroll_Now_Button_GETTEXT(){
	    return driver.findElement(Enroll_Now_Button).getText();	}

   // Remind_Me_Later_Button
	public boolean Remind_Me_Later_Button_DISPLAYED(){
	    return VerifyElement(Remind_Me_Later_Button,"displayed","Remind_Me_Later_Button");
	}
	public boolean Remind_Me_Later_Button_ENABLED(){
	    return VerifyElement(Remind_Me_Later_Button,"enabled","Remind_Me_Later_Button");
	}
	public boolean Remind_Me_Later_Button_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Remind_Me_Later_Button);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Remind_Me_Later_Button_MOVETOANDCLICK(){
	    return Element_Click(Remind_Me_Later_Button, "moveToAndClick","Remind_Me_Later_Button");
 	}
	public boolean Remind_Me_Later_Button_CLICK_JAVASCRIPT(){
	    return Element_Click(Remind_Me_Later_Button, "javaClick","Remind_Me_Later_Button");
  	}
	public boolean Remind_Me_Later_Button_CLICK(){
	    return Element_Click(Remind_Me_Later_Button, "click","Remind_Me_Later_Button");
  	}
	public String Remind_Me_Later_Button_GETTEXT(){
	    return driver.findElement(Remind_Me_Later_Button).getText();	}

   // Notification_Text
	public boolean Notification_Text_DISPLAYED(){
	    return VerifyElement(Notification_Text,"displayed","Notification_Text");
	}
	public boolean Notification_Text_ENABLED(){
	    return VerifyElement(Notification_Text,"enabled","Notification_Text");
	}
	public boolean Notification_Text_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Notification_Text);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Notification_Text_MOVETOANDCLICK(){
	    return Element_Click(Notification_Text, "moveToAndClick","Notification_Text");
 	}
	public boolean Notification_Text_CLICK_JAVASCRIPT(){
	    return Element_Click(Notification_Text, "javaClick","Notification_Text");
  	}
	public boolean Notification_Text_CLICK(){
	    return Element_Click(Notification_Text, "click","Notification_Text");
  	}
	public String Notification_Text_GETTEXT(){
	    return driver.findElement(Notification_Text).getText();	}

   // Notification_Header_Text
	public boolean Notification_Header_Text_DISPLAYED(){
	    return VerifyElement(Notification_Header_Text,"displayed","Notification_Header_Text");
	}
	public boolean Notification_Header_Text_ENABLED(){
	    return VerifyElement(Notification_Header_Text,"enabled","Notification_Header_Text");
	}
	public boolean Notification_Header_Text_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Notification_Header_Text);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Notification_Header_Text_MOVETOANDCLICK(){
	    return Element_Click(Notification_Header_Text, "moveToAndClick","Notification_Header_Text");
 	}
	public boolean Notification_Header_Text_CLICK_JAVASCRIPT(){
	    return Element_Click(Notification_Header_Text, "javaClick","Notification_Header_Text");
  	}
	public boolean Notification_Header_Text_CLICK(){
	    return Element_Click(Notification_Header_Text, "click","Notification_Header_Text");
  	}
	public String Notification_Header_Text_GETTEXT(){
	    return driver.findElement(Notification_Header_Text).getText();	}

}