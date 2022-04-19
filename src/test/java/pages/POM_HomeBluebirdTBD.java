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
//	By Money_In_Side_Menuitem = By.xpath("//*[contains(text(),'Money In')]");
//	By Money_In_Side_Menuitem = By.xpath("//a/*[text()='Money In']");
//	By Money_In_Side_Menuitem = By.xpath("//*[@class='bb-side-navigation__nav-list']/li[2]/a");
//	By Money_In_Side_Menuitem = By.xpath("//*[@class='bb-side-navigation']/nav[1]/ul/li[2]/a");
//	By Money_In_Side_Menuitem = By.xpath("//*[@id='root']/div/div[2]/nav[1]/ul/li[2]/a");
//	By Money_In_Side_Menuitem = By.xpath("//html/body[1]/div[1]/div/div[2]/nav[1]/ul/li[2]/a");

	By Marks_Account_Main_Account = By.xpath("//a[@data-testid='bb-accounts-list__link_toAccounts-0']");
//	By Marks_Account_Main_Account = By.xpath("//a[@href='/accounts/5d86ed2bd4f84b799fb86d5237f8d9c9']");
//	By Marks_Account_Main_Account = By.xpath("//*[@id='main']/div/div/div[2]/div[3]/div/div[1]/div/div[1]/div/div[1]/div/div/div/a[1]");
//	By Marks_Account_Main_Account = By.xpath("//html/body[1]/div[1]/div/div[3]/div/div/div[2]/div[3]/div/div[1]/div/div[1]/div/div[1]/div/div/div/a[1]");

	By Add_Money = By.xpath("//a[@data-keyboard-focus='false']");
//	By Add_Money = By.xpath("//*[@id='main']/div/div/div[2]/div[3]/div/div[1]/div/div[1]/div/div[1]/div/div/div/span[1]/a[1]");
//	By Add_Money = By.xpath("//html/body[1]/div[1]/div/div[3]/div/div/div[2]/div[3]/div/div[1]/div/div[1]/div/div[1]/div/div/div/span[1]/a[1]");

	By Evelyns_Subaccount_Subaccount = By.xpath("//a[@data-testid='bb-accounts-list__link_toAccounts-1']");
//	By Evelyns_Subaccount_Subaccount = By.xpath("//a[@href='/accounts/8de66fdce66b4e878f94e3c404d9cba8']");
//	By Evelyns_Subaccount_Subaccount = By.xpath("//*[@id='main']/div/div/div[2]/div[3]/div/div[1]/div/div[1]/div/div[2]/div/div/div/a[1]");
//	By Evelyns_Subaccount_Subaccount = By.xpath("//html/body[1]/div[1]/div/div[3]/div/div/div[2]/div[3]/div/div[1]/div/div[1]/div/div[2]/div/div/div/a[1]");

	By Add_Money_1 = By.xpath("//*[@id='main']/div/div/div[2]/div[3]/div/div[1]/div/div[1]/div/div[2]/div/div/div/span[1]/a[1]");
//	By Add_Money_1 = By.xpath("//html/body[1]/div[1]/div/div[3]/div/div/div[2]/div[3]/div/div[1]/div/div[1]/div/div[2]/div/div/div/span[1]/a[1]");

	By Add_Subaccount = By.xpath("//a[@class='bb-accounts-list__slider-new-btn']");
//	By Add_Subaccount = By.xpath("//a[@href='/accounts/add-family-account']");
//	By Add_Subaccount = By.xpath("//*[contains(text(),'Add Subaccount')]");
//	By Add_Subaccount = By.xpath("//a[text()[contains(.,'Add Subaccount')]]");
//	By Add_Subaccount = By.xpath("//*[@class='bb-accounts-list__slider-item bb-accounts-list__slider-new bb-accounts-list__slider-center']/a[1]");
//	By Add_Subaccount = By.xpath("//*[@id='main']/div/div/div[2]/div[3]/div/div[1]/div/div[1]/div/div[3]/div/div/div/a[1]");
//	By Add_Subaccount = By.xpath("//html/body[1]/div[1]/div/div[3]/div/div/div[2]/div[3]/div/div[1]/div/div[1]/div/div[3]/div/div/div/a[1]");

	By Add_Goal = By.xpath("//a[@class='bb-goals-list__add-goal-btn-link']");
//	By Add_Goal = By.xpath("//a[@href='/goals/add-goal']");
//	By Add_Goal = By.xpath("//*[contains(text(),'Add Goal')]");
//	By Add_Goal = By.xpath("//a[text()[contains(.,'Add Goal')]]");
//	By Add_Goal = By.xpath("//*[@class='bb-goals-list__add-goal-btn']/a[1]");
//	By Add_Goal = By.xpath("//*[@class='bb-goals-list__footer']/div/a[1]");
//	By Add_Goal = By.xpath("//*[@id='main']/div/div/div[2]/div[4]/div[2]/div/div[1]/div[2]/div/a[1]");
//	By Add_Goal = By.xpath("//html/body[1]/div[1]/div/div[3]/div/div/div[2]/div[4]/div[2]/div/div[1]/div[2]/div/a[1]");


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

}