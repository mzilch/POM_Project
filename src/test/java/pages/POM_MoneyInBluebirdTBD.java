package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import utility.SeleniumHelperBasic;

public class POM_MoneyInBluebirdTBD extends SeleniumHelperBasic{

   //Variables
	private Actions action;
	public String PAGE_Title = "Money In - Bluebird";
	public String PAGE_URL = "https://secure.bluebird.com/transfer-in";

   //Constructor
	public POM_MoneyInBluebirdTBD(WebDriver driver){
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}

   //Locators
	By Transfer_Money_to_Main_Account_Move_money_from_a_S = By.xpath("//button[@data-testid='bb-move-money-grid__link-transfer_money']");
//	By Transfer_Money_to_Main_Account_Move_money_from_a_S = By.xpath("//button[@data-keyboard-focus='false']");
//	By Transfer_Money_to_Main_Account_Move_money_from_a_S = By.xpath("//*[@class='bb-move-money-grid']/li[2]/button");
//	By Transfer_Money_to_Main_Account_Move_money_from_a_S = By.xpath("//*[@id='main']/div/div/div[2]/ul[1]/li[2]/button");
//	By Transfer_Money_to_Main_Account_Move_money_from_a_S = By.xpath("//html/body[1]/div[1]/div/div[3]/div/div/div[2]/ul[1]/li[2]/button");

	By Transfer_Money_to_How_It_Works = By.xpath("//*[contains(text(),'How It Works')]");
//	By Transfer_Money_to_How_It_Works = By.xpath("//button[text()[contains(.,'How')]]");
//	By Transfer_Money_to_How_It_Works = By.xpath("//button[text()[contains(.,'How It')]]");
//	By Transfer_Money_to_How_It_Works = By.xpath("//button[text()[contains(.,'How It Works')]]");
//	By Transfer_Money_to_How_It_Works = By.xpath("//*[@class='bb-accordion__list']/li[1]/button[1]");
//	By Transfer_Money_to_How_It_Works = By.xpath("//html/body[1]/div[7]/div/div/div[2]/div/div[2]/div/ul[1]/li[1]/button[1]");

	By Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b = By.xpath("//div[text()[contains(.,'You can choose')]]");
//	By Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b = By.xpath("//*[contains(text(),'You can choose whether you want to reclaim money back from a subaccount or goal. Simply select the subaccount or goal you wish to transfer money from, then specify the amount of money you wish to transfer.')]");
//	By Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b = By.xpath("//div/*[text()='You can choose whether you want to reclaim money back from a subaccount or goal. Simply select the subaccount or goal you wish to transfer money from, then specify the amount of money you wish to transfer.']");
//	By Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b = By.xpath("//div[text()[contains(.,'You')]]");
//	By Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b = By.xpath("//div[text()[contains(.,'You can')]]");
//	By Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b = By.xpath("//div[text()[contains(.,'transfer.')]]");
//	By Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b = By.xpath("//div[text()[contains(.,'to transfer.')]]");
//	By Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b = By.xpath("//div[text()[contains(.,'wish to transfer.')]]");
//	By Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b = By.xpath("//*[@class='bb-accordion__body']/div");
//	By Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b = By.xpath("//html/body[1]/div[7]/div/div/div[2]/div/div[2]/div/ul[1]/li[1]/div[1]/div");

	By Transfer_Money_to_Button_V_X_2nd_CloseModal = By.xpath("//button[@type='button']");
//	By Transfer_Money_to_Button_V_X_2nd_CloseModal = By.xpath("//button[@class='bb-modal__close-button enter-button close-btn']");
//	By Transfer_Money_to_Button_V_X_2nd_CloseModal = By.xpath("//button[@aria-label='Close modal']");
//	By Transfer_Money_to_Button_V_X_2nd_CloseModal = By.xpath("//button[@data-testid='bb-modal__close-button']");
//	By Transfer_Money_to_Button_V_X_2nd_CloseModal = By.xpath("//*[@class='ReactModal__Content ReactModal__Content--after-open bb-modal__container bb-modal__container--fullscreen bb-flow-modal']/button[1]");
//	By Transfer_Money_to_Button_V_X_2nd_CloseModal = By.xpath("//*[@class='ReactModal__Overlay ReactModal__Overlay--after-open bb-modal__overlay bb-flow-modal__overlay']/div/button[1]");
//	By Transfer_Money_to_Button_V_X_2nd_CloseModal = By.xpath("//html/body[1]/div[7]/div/div/button[1]");

	By MoneyInBluebird_Logout = By.xpath("//button[@class='bb-side-navigation__nav-list-link d-flex']");
//	By MoneyInBluebird_Logout = By.xpath("//button[@data-testid='bb-side-navigation__nav-list-link--logout']");
//	By MoneyInBluebird_Logout = By.xpath("//*[contains(text(),'Logout')]");
//	By MoneyInBluebird_Logout = By.xpath("//button/*[text()='Logout']");
//	By MoneyInBluebird_Logout = By.xpath("//*[@class='bb-side-navigation__nav-list']/li[2]/button");
//	By MoneyInBluebird_Logout = By.xpath("//*[@class='bb-side-navigation__bottom-nav']/ul/li[2]/button");
//	By MoneyInBluebird_Logout = By.xpath("//*[@id='root']/div/div[2]/nav[2]/ul/li[2]/button");
//	By MoneyInBluebird_Logout = By.xpath("//html/body[1]/div[1]/div/div[2]/nav[2]/ul/li[2]/button");

	By Transfer_Money_to_Button_V_X1st_CloseModal = By.xpath("//button[@type='button']");
//	By Transfer_Money_to_Button_V_X1st_CloseModal = By.xpath("//button[@class='bb-modal__close-button enter-button close-btn']");
//	By Transfer_Money_to_Button_V_X1st_CloseModal = By.xpath("//button[@aria-label='Close modal']");
//	By Transfer_Money_to_Button_V_X1st_CloseModal = By.xpath("//button[@data-testid='bb-modal__close-button']");
//	By Transfer_Money_to_Button_V_X1st_CloseModal = By.xpath("//*[@class='ReactModal__Content ReactModal__Content--after-open bb-modal__container bb-modal__container--fullscreen bb-flow-modal close-btn']/button[1]");
//	By Transfer_Money_to_Button_V_X1st_CloseModal = By.xpath("//*[@class='ReactModal__Overlay ReactModal__Overlay--after-open bb-modal__overlay bb-flow-modal__overlay']/div/button[1]");
//	By Transfer_Money_to_Button_V_X1st_CloseModal = By.xpath("//html/body[1]/div[7]/div/div/button[1]");

	By Transfer_Money_to_Main_Account_Move_money_from_a_S_1 = By.xpath("//button[@data-testid='bb-move-money-grid__link-transfer_money']");
//	By Transfer_Money_to_Main_Account_Move_money_from_a_S_1 = By.xpath("//button[@data-keyboard-focus='false']");
//	By Transfer_Money_to_Main_Account_Move_money_from_a_S_1 = By.xpath("//*[@class='bb-move-money-grid']/li[2]/button");
//	By Transfer_Money_to_Main_Account_Move_money_from_a_S_1 = By.xpath("//*[@id='main']/div/div/div[2]/ul[1]/li[2]/button");
//	By Transfer_Money_to_Main_Account_Move_money_from_a_S_1 = By.xpath("//html/body[1]/div[1]/div/div[3]/div/div/div[2]/ul[1]/li[2]/button");

	By Okay = By.xpath("//button[@class='bb-flow-modal__help-continue-btn']");
//	By Okay = By.xpath("//button[@data-keyboard-focus='false']");
//	By Okay = By.xpath("//*[contains(text(),'Okay')]");
//	By Okay = By.xpath("//*[contains(text(),'Ok')]");
//	By Okay = By.xpath("//button[text()[contains(.,'Okay')]]");
//	By Okay = By.xpath("//*[@class='bb-flow-modal__fixed-footer-wrapper']/button");
//	By Okay = By.xpath("//*[@class='bb-flow-modal__fixed-footer']/div/button");
//	By Okay = By.xpath("//html/body[1]/div[7]/div/div/div[2]/div/div[3]/div/button");

	By To_Select_an_option = By.xpath("//*[contains(text(),'Select an option')]");
//	By To_Select_an_option = By.xpath("//p[text()[contains(.,'Select')]]");
//	By To_Select_an_option = By.xpath("//p[text()[contains(.,'Select an')]]");
//	By To_Select_an_option = By.xpath("//p[text()[contains(.,'Select an option')]]");
//	By To_Select_an_option = By.xpath("//*[@class='bb-account-select__single-value css-1uccc91-singleValue']/div/p[2]");
//	By To_Select_an_option = By.xpath("//html/body[1]/div[7]/div/div/div[2]/div/div[1]/form/div[1]/div[1]/div/div/div[1]/div[1]/div[1]/div/p[2]");

	By FromSelectanoption = By.xpath("//*[contains(text(),'From')]");
//	By FromSelectanoption = By.xpath("//*[contains(text(),'Fr')]");
//	By FromSelectanoption = By.xpath("//p[text()[contains(.,'From')]]");
//	By FromSelectanoption = By.xpath("//*[@class='bb-account-select__single-value css-1uccc91-singleValue']/div/p[1]");
//	By FromSelectanoption = By.xpath("//html/body[1]/div[7]/div/div/div[2]/div/div[1]/form/div[1]/div[1]/div/div/div[1]/div[1]/div[1]/div/p[1]");

	By InputDecimalAmount = By.xpath("//input[@type='text']");
//	By InputDecimalAmount = By.xpath("//input[@inputmode='decimal']");
//	By InputDecimalAmount = By.xpath("//input[@data-testid='bb-currency-input_amount']");
//	By InputDecimalAmount = By.xpath("//input[@class='bb-currency-input__input']");
//	By InputDecimalAmount = By.xpath("//input[@placeholder='0.00']");
//	By InputDecimalAmount = By.xpath("//input[@style='width: 16px;']");
//	By InputDecimalAmount = By.xpath("//input[@data-keyboard-focus='false']");
//	By InputDecimalAmount = By.xpath("//*[@class='bb-currency-input']/input[1]");
//	By InputDecimalAmount = By.xpath("//*[@class='bb-money-flow__form-block-input-wrapper transfer-money-input']/div[1]/input[1]");
//	By InputDecimalAmount = By.xpath("//html/body[1]/div[7]/div/div/div[2]/div/div[1]/form/div[1]/div[3]/div/div[1]/input[1]");

	By Transferbutton = By.xpath("//button[@type='submit']");
//	By Transferbutton = By.xpath("//button[@data-testid='submit-button__save-btn']");
//	By Transferbutton = By.xpath("//button[@data-keyboard-focus='false']");
//	By Transferbutton = By.xpath("//*[@class='submit-button']/button");
//	By Transferbutton = By.xpath("//*[@class='bb-money-flow__btn-footer']/div[1]/button");
//	By Transferbutton = By.xpath("//html/body[1]/div[7]/div/div/div[2]/div/div[1]/form/div[2]/div[1]/button");

	By Modal_AreyousureYes_leave_the_page = By.xpath("//button[@data-testid='bb-confirmation-modal__confirm-button']");
//	By Modal_AreyousureYes_leave_the_page = By.xpath("//*[contains(text(),'Yes, leave the page')]");
//	By Modal_AreyousureYes_leave_the_page = By.xpath("//*[contains(text(),'Ye')]");
//	By Modal_AreyousureYes_leave_the_page = By.xpath("//button[text()[contains(.,'Yes,')]]");
//	By Modal_AreyousureYes_leave_the_page = By.xpath("//button[text()[contains(.,'Yes, leave')]]");
//	By Modal_AreyousureYes_leave_the_page = By.xpath("//button[text()[contains(.,'Yes, leave the')]]");
//	By Modal_AreyousureYes_leave_the_page = By.xpath("//button[text()[contains(.,'leave the page')]]");
//	By Modal_AreyousureYes_leave_the_page = By.xpath("//*[@class='bb-confirmation-modal__cta-container']/button[2]");
//	By Modal_AreyousureYes_leave_the_page = By.xpath("//*[@class='bb-confirmation-modal__container']/div[2]/button[2]");
//	By Modal_AreyousureYes_leave_the_page = By.xpath("//html/body[1]/div[8]/div/div/div[1]/div[2]/button[2]");


   //Methods

   // Transfer_Money_to_Main_Account_Move_money_from_a_S
	public boolean Transfer_Money_to_Main_Account_Move_money_from_a_S_DISPLAYED(){
	    return VerifyElement(Transfer_Money_to_Main_Account_Move_money_from_a_S,"displayed","Transfer_Money_to_Main_Account_Move_money_from_a_S");
	}
	public boolean Transfer_Money_to_Main_Account_Move_money_from_a_S_ENABLED(){
	    return VerifyElement(Transfer_Money_to_Main_Account_Move_money_from_a_S,"enabled","Transfer_Money_to_Main_Account_Move_money_from_a_S");
	}
	public boolean Transfer_Money_to_Main_Account_Move_money_from_a_S_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Transfer_Money_to_Main_Account_Move_money_from_a_S);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Transfer_Money_to_Main_Account_Move_money_from_a_S_MOVETOANDCLICK(){
	    return Element_Click(Transfer_Money_to_Main_Account_Move_money_from_a_S, "moveToAndClick","Transfer_Money_to_Main_Account_Move_money_from_a_S");
 	}
	public boolean Transfer_Money_to_Main_Account_Move_money_from_a_S_CLICK_JAVASCRIPT(){
	    return Element_Click(Transfer_Money_to_Main_Account_Move_money_from_a_S, "javaClick","Transfer_Money_to_Main_Account_Move_money_from_a_S");
  	}
	public boolean Transfer_Money_to_Main_Account_Move_money_from_a_S_CLICK(){
	    return Element_Click(Transfer_Money_to_Main_Account_Move_money_from_a_S, "click","Transfer_Money_to_Main_Account_Move_money_from_a_S");
  	}
	public String Transfer_Money_to_Main_Account_Move_money_from_a_S_GETTEXT(){
	    return driver.findElement(Transfer_Money_to_Main_Account_Move_money_from_a_S).getText();	}

   // Transfer_Money_to_How_It_Works
	public boolean Transfer_Money_to_How_It_Works_DISPLAYED(){
	    return VerifyElement(Transfer_Money_to_How_It_Works,"displayed","Transfer_Money_to_How_It_Works");
	}
	public boolean Transfer_Money_to_How_It_Works_ENABLED(){
	    return VerifyElement(Transfer_Money_to_How_It_Works,"enabled","Transfer_Money_to_How_It_Works");
	}
	public boolean Transfer_Money_to_How_It_Works_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Transfer_Money_to_How_It_Works);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Transfer_Money_to_How_It_Works_MOVETOANDCLICK(){
	    return Element_Click(Transfer_Money_to_How_It_Works, "moveToAndClick","Transfer_Money_to_How_It_Works");
 	}
	public boolean Transfer_Money_to_How_It_Works_CLICK_JAVASCRIPT(){
	    return Element_Click(Transfer_Money_to_How_It_Works, "javaClick","Transfer_Money_to_How_It_Works");
  	}
	public boolean Transfer_Money_to_How_It_Works_CLICK(){
	    return Element_Click(Transfer_Money_to_How_It_Works, "click","Transfer_Money_to_How_It_Works");
  	}
	public String Transfer_Money_to_How_It_Works_GETTEXT(){
	    return driver.findElement(Transfer_Money_to_How_It_Works).getText();	}

   // Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b
	public boolean Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b_DISPLAYED(){
	    return VerifyElement(Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b,"displayed","Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b");
	}
	public boolean Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b_ENABLED(){
	    return VerifyElement(Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b,"enabled","Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b");
	}
	public boolean Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b_MOVETOANDCLICK(){
	    return Element_Click(Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b, "moveToAndClick","Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b");
 	}
	public boolean Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b_CLICK_JAVASCRIPT(){
	    return Element_Click(Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b, "javaClick","Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b");
  	}
	public boolean Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b_CLICK(){
	    return Element_Click(Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b, "click","Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b");
  	}
	public String Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b_GETTEXT(){
	    return driver.findElement(Transfer_Money_to_You_can_choose_whether_you_want_to_reclaim_money_b).getText();	}

   // Transfer_Money_to_Button_V_X_2nd_CloseModal
	public boolean Transfer_Money_to_Button_V_X_2nd_CloseModal_DISPLAYED(){
	    return VerifyElement(Transfer_Money_to_Button_V_X_2nd_CloseModal,"displayed","Transfer_Money_to_Button_V_X_2nd_CloseModal");
	}
	public boolean Transfer_Money_to_Button_V_X_2nd_CloseModal_ENABLED(){
	    return VerifyElement(Transfer_Money_to_Button_V_X_2nd_CloseModal,"enabled","Transfer_Money_to_Button_V_X_2nd_CloseModal");
	}
	public boolean Transfer_Money_to_Button_V_X_2nd_CloseModal_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Transfer_Money_to_Button_V_X_2nd_CloseModal);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Transfer_Money_to_Button_V_X_2nd_CloseModal_MOVETOANDCLICK(){
	    return Element_Click(Transfer_Money_to_Button_V_X_2nd_CloseModal, "moveToAndClick","Transfer_Money_to_Button_V_X_2nd_CloseModal");
 	}
	public boolean Transfer_Money_to_Button_V_X_2nd_CloseModal_CLICK_JAVASCRIPT(){
	    return Element_Click(Transfer_Money_to_Button_V_X_2nd_CloseModal, "javaClick","Transfer_Money_to_Button_V_X_2nd_CloseModal");
  	}
	public boolean Transfer_Money_to_Button_V_X_2nd_CloseModal_CLICK(){
	    return Element_Click(Transfer_Money_to_Button_V_X_2nd_CloseModal, "click","Transfer_Money_to_Button_V_X_2nd_CloseModal");
  	}
	public String Transfer_Money_to_Button_V_X_2nd_CloseModal_GETTEXT(){
	    return driver.findElement(Transfer_Money_to_Button_V_X_2nd_CloseModal).getText();	}

   // MoneyInBluebird_Logout
	public boolean MoneyInBluebird_Logout_DISPLAYED(){
	    return VerifyElement(MoneyInBluebird_Logout,"displayed","MoneyInBluebird_Logout");
	}
	public boolean MoneyInBluebird_Logout_ENABLED(){
	    return VerifyElement(MoneyInBluebird_Logout,"enabled","MoneyInBluebird_Logout");
	}
	public boolean MoneyInBluebird_Logout_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(MoneyInBluebird_Logout);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean MoneyInBluebird_Logout_MOVETOANDCLICK(){
	    return Element_Click(MoneyInBluebird_Logout, "moveToAndClick","MoneyInBluebird_Logout");
 	}
	public boolean MoneyInBluebird_Logout_CLICK_JAVASCRIPT(){
	    return Element_Click(MoneyInBluebird_Logout, "javaClick","MoneyInBluebird_Logout");
  	}
	public boolean MoneyInBluebird_Logout_CLICK(){
	    return Element_Click(MoneyInBluebird_Logout, "click","MoneyInBluebird_Logout");
  	}
	public String MoneyInBluebird_Logout_GETTEXT(){
	    return driver.findElement(MoneyInBluebird_Logout).getText();	}

   // Transfer_Money_to_Button_V_X1st_CloseModal
	public boolean Transfer_Money_to_Button_V_X1st_CloseModal_DISPLAYED(){
	    return VerifyElement(Transfer_Money_to_Button_V_X1st_CloseModal,"displayed","Transfer_Money_to_Button_V_X1st_CloseModal");
	}
	public boolean Transfer_Money_to_Button_V_X1st_CloseModal_ENABLED(){
	    return VerifyElement(Transfer_Money_to_Button_V_X1st_CloseModal,"enabled","Transfer_Money_to_Button_V_X1st_CloseModal");
	}
	public boolean Transfer_Money_to_Button_V_X1st_CloseModal_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Transfer_Money_to_Button_V_X1st_CloseModal);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Transfer_Money_to_Button_V_X1st_CloseModal_MOVETOANDCLICK(){
	    return Element_Click(Transfer_Money_to_Button_V_X1st_CloseModal, "moveToAndClick","Transfer_Money_to_Button_V_X1st_CloseModal");
 	}
	public boolean Transfer_Money_to_Button_V_X1st_CloseModal_CLICK_JAVASCRIPT(){
	    return Element_Click(Transfer_Money_to_Button_V_X1st_CloseModal, "javaClick","Transfer_Money_to_Button_V_X1st_CloseModal");
  	}
	public boolean Transfer_Money_to_Button_V_X1st_CloseModal_CLICK(){
	    return Element_Click(Transfer_Money_to_Button_V_X1st_CloseModal, "click","Transfer_Money_to_Button_V_X1st_CloseModal");
  	}
	public String Transfer_Money_to_Button_V_X1st_CloseModal_GETTEXT(){
	    return driver.findElement(Transfer_Money_to_Button_V_X1st_CloseModal).getText();	}

   // Transfer_Money_to_Main_Account_Move_money_from_a_S_1
	public boolean Transfer_Money_to_Main_Account_Move_money_from_a_S_1_DISPLAYED(){
	    return VerifyElement(Transfer_Money_to_Main_Account_Move_money_from_a_S_1,"displayed","Transfer_Money_to_Main_Account_Move_money_from_a_S_1");
	}
	public boolean Transfer_Money_to_Main_Account_Move_money_from_a_S_1_ENABLED(){
	    return VerifyElement(Transfer_Money_to_Main_Account_Move_money_from_a_S_1,"enabled","Transfer_Money_to_Main_Account_Move_money_from_a_S_1");
	}
	public boolean Transfer_Money_to_Main_Account_Move_money_from_a_S_1_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Transfer_Money_to_Main_Account_Move_money_from_a_S_1);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Transfer_Money_to_Main_Account_Move_money_from_a_S_1_MOVETOANDCLICK(){
	    return Element_Click(Transfer_Money_to_Main_Account_Move_money_from_a_S_1, "moveToAndClick","Transfer_Money_to_Main_Account_Move_money_from_a_S_1");
 	}
	public boolean Transfer_Money_to_Main_Account_Move_money_from_a_S_1_CLICK_JAVASCRIPT(){
	    return Element_Click(Transfer_Money_to_Main_Account_Move_money_from_a_S_1, "javaClick","Transfer_Money_to_Main_Account_Move_money_from_a_S_1");
  	}
	public boolean Transfer_Money_to_Main_Account_Move_money_from_a_S_1_CLICK(){
	    return Element_Click(Transfer_Money_to_Main_Account_Move_money_from_a_S_1, "click","Transfer_Money_to_Main_Account_Move_money_from_a_S_1");
  	}
	public String Transfer_Money_to_Main_Account_Move_money_from_a_S_1_GETTEXT(){
	    return driver.findElement(Transfer_Money_to_Main_Account_Move_money_from_a_S_1).getText();	}

   // Okay
	public boolean Okay_DISPLAYED(){
	    return VerifyElement(Okay,"displayed","Okay");
	}
	public boolean Okay_ENABLED(){
	    return VerifyElement(Okay,"enabled","Okay");
	}
	public boolean Okay_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Okay);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Okay_MOVETOANDCLICK(){
	    return Element_Click(Okay, "moveToAndClick","Okay");
 	}
	public boolean Okay_CLICK_JAVASCRIPT(){
	    return Element_Click(Okay, "javaClick","Okay");
  	}
	public boolean Okay_CLICK(){
	    return Element_Click(Okay, "click","Okay");
  	}
	public String Okay_GETTEXT(){
	    return driver.findElement(Okay).getText();	}

   // To_Select_an_option
	public boolean To_Select_an_option_DISPLAYED(){
	    return VerifyElement(To_Select_an_option,"displayed","To_Select_an_option");
	}
	public boolean To_Select_an_option_ENABLED(){
	    return VerifyElement(To_Select_an_option,"enabled","To_Select_an_option");
	}
	public boolean To_Select_an_option_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(To_Select_an_option);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean To_Select_an_option_MOVETOANDCLICK(){
	    return Element_Click(To_Select_an_option, "moveToAndClick","To_Select_an_option");
 	}
	public boolean To_Select_an_option_CLICK_JAVASCRIPT(){
	    return Element_Click(To_Select_an_option, "javaClick","To_Select_an_option");
  	}
	public boolean To_Select_an_option_CLICK(){
	    return Element_Click(To_Select_an_option, "click","To_Select_an_option");
  	}
	public String To_Select_an_option_GETTEXT(){
	    return driver.findElement(To_Select_an_option).getText();	}

   // FromSelectanoption
	public boolean FromSelectanoption_DISPLAYED(){
	    return VerifyElement(FromSelectanoption,"displayed","FromSelectanoption");
	}
	public boolean FromSelectanoption_ENABLED(){
	    return VerifyElement(FromSelectanoption,"enabled","FromSelectanoption");
	}
	public boolean FromSelectanoption_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(FromSelectanoption);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean FromSelectanoption_MOVETOANDCLICK(){
	    return Element_Click(FromSelectanoption, "moveToAndClick","FromSelectanoption");
 	}
	public boolean FromSelectanoption_CLICK_JAVASCRIPT(){
	    return Element_Click(FromSelectanoption, "javaClick","FromSelectanoption");
  	}
	public boolean FromSelectanoption_CLICK(){
	    return Element_Click(FromSelectanoption, "click","FromSelectanoption");
  	}
	public String FromSelectanoption_GETTEXT(){
	    return driver.findElement(FromSelectanoption).getText();	}

   // InputDecimalAmount
	public boolean InputDecimalAmount_DISPLAYED(){
	    return VerifyElement(InputDecimalAmount,"displayed","InputDecimalAmount");
	}
	public boolean InputDecimalAmount_ENABLED(){
	    return VerifyElement(InputDecimalAmount,"enabled","InputDecimalAmount");
	}
	public boolean InputDecimalAmount_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(InputDecimalAmount);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean InputDecimalAmount_MOVETOANDCLICK(){
	    return Element_Click(InputDecimalAmount, "moveToAndClick","InputDecimalAmount");
 	}
	public boolean InputDecimalAmount_CLICK_JAVASCRIPT(){
	    return Element_Click(InputDecimalAmount, "javaClick","InputDecimalAmount");
  	}
	public boolean InputDecimalAmount_CLICK(){
	    return Element_Click(InputDecimalAmount, "click","InputDecimalAmount");
  	}
	public String InputDecimalAmount_GETTEXT(){
	    return driver.findElement(InputDecimalAmount).getText();	}
	public boolean InputDecimalAmount_SENDKEYS(String textToInput){
	    driver.findElement(InputDecimalAmount).clear();	    driver.findElement(InputDecimalAmount).sendKeys(textToInput);	    return true;
	}

   // Transferbutton
	public boolean Transferbutton_DISPLAYED(){
	    return VerifyElement(Transferbutton,"displayed","Transferbutton");
	}
	public boolean Transferbutton_ENABLED(){
	    return VerifyElement(Transferbutton,"enabled","Transferbutton");
	}
	public boolean Transferbutton_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Transferbutton);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Transferbutton_MOVETOANDCLICK(){
	    return Element_Click(Transferbutton, "moveToAndClick","Transferbutton");
 	}
	public boolean Transferbutton_CLICK_JAVASCRIPT(){
	    return Element_Click(Transferbutton, "javaClick","Transferbutton");
  	}
	public boolean Transferbutton_CLICK(){
	    return Element_Click(Transferbutton, "click","Transferbutton");
  	}
	public String Transferbutton_GETTEXT(){
	    return driver.findElement(Transferbutton).getText();	}

   // Modal_AreyousureYes_leave_the_page
	public boolean Modal_AreyousureYes_leave_the_page_DISPLAYED(){
	    return VerifyElement(Modal_AreyousureYes_leave_the_page,"displayed","Modal_AreyousureYes_leave_the_page");
	}
	public boolean Modal_AreyousureYes_leave_the_page_ENABLED(){
	    return VerifyElement(Modal_AreyousureYes_leave_the_page,"enabled","Modal_AreyousureYes_leave_the_page");
	}
	public boolean Modal_AreyousureYes_leave_the_page_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Modal_AreyousureYes_leave_the_page);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Modal_AreyousureYes_leave_the_page_MOVETOANDCLICK(){
	    return Element_Click(Modal_AreyousureYes_leave_the_page, "moveToAndClick","Modal_AreyousureYes_leave_the_page");
 	}
	public boolean Modal_AreyousureYes_leave_the_page_CLICK_JAVASCRIPT(){
	    return Element_Click(Modal_AreyousureYes_leave_the_page, "javaClick","Modal_AreyousureYes_leave_the_page");
  	}
	public boolean Modal_AreyousureYes_leave_the_page_CLICK(){
	    return Element_Click(Modal_AreyousureYes_leave_the_page, "click","Modal_AreyousureYes_leave_the_page");
  	}
	public String Modal_AreyousureYes_leave_the_page_GETTEXT(){
	    return driver.findElement(Modal_AreyousureYes_leave_the_page).getText();	}

}