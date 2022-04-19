package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import utility.SeleniumHelperBasic;

public class POM_LoginBluebirdTBD extends SeleniumHelperBasic{

   //Variables
	private Actions action;
	public String PAGE_Title = "Login - Bluebird";
	public String PAGE_URL = "https://secure.bluebird.com/login?intlink=us-bluebird-marketing-home-prospectslp-incomm2018-header-login";

   //Constructor
	public POM_LoginBluebirdTBD(WebDriver driver){
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}

   //Locators
	By Username_input = By.xpath("//input[@name='bb-username']");
//	By Username_input = By.xpath("//input[@type='text']");
//	By Username_input = By.xpath("//input[@id='bb-username']");
//	By Username_input = By.xpath("//input[@class='textfield__form-control invalid']");
//	By Username_input = By.xpath("//input[@maxlength='20']");
//	By Username_input = By.xpath("//input[@data-testid='page-login__textField_userName']");
//	By Username_input = By.xpath("//input[@data-keyboard-focus='false']");
//	By Username_input = By.xpath("//*[@class='page-login__wrapper']/div[1]/div[1]/input[1]");
//	By Username_input = By.xpath("//*[@id='main']/div/div/form[1]/div[1]/div[1]/input[1]");
//	By Username_input = By.xpath("//html/body[1]/div[1]/div/div[2]/div/div/form[1]/div[1]/div[1]/input[1]");

	By passwordbbpasswordbbpassword = By.xpath("//input[@name='bb-password']");
//	By passwordbbpasswordbbpassword = By.xpath("//input[@type='password']");
//	By passwordbbpasswordbbpassword = By.xpath("//input[@id='bb-password']");
//	By passwordbbpasswordbbpassword = By.xpath("//input[@maxlength='32']");
//	By passwordbbpasswordbbpassword = By.xpath("//input[@data-testid='page-login__textField_password']");
//	By passwordbbpasswordbbpassword = By.xpath("//*[@class='page-login__password-wrapper']/div/input[1]");
//	By passwordbbpasswordbbpassword = By.xpath("//*[@id='main']/div/div/form[1]/div[1]/div[2]/div/input[1]");
//	By passwordbbpasswordbbpassword = By.xpath("//html/body[1]/div[1]/div/div[2]/div/div/form[1]/div[1]/div[2]/div/input[1]");

	By RememberMe_Checkbox = By.xpath("//label[@for='rememberme']");
//	By RememberMe_Checkbox = By.xpath("//label[@data-keyboard-focus='false']");
//	By RememberMe_Checkbox = By.xpath("//*[contains(text(),'Remember my username')]");
//	By RememberMe_Checkbox = By.xpath("//label[text()[contains(.,'Remember')]]");
//	By RememberMe_Checkbox = By.xpath("//label[text()[contains(.,'Remember my')]]");
//	By RememberMe_Checkbox = By.xpath("//label[text()[contains(.,'Remember my username')]]");
//	By RememberMe_Checkbox = By.xpath("//*[@class='page-login__form-group-checkbox']/label[1]");
//	By RememberMe_Checkbox = By.xpath("//*[@class='page-login__wrapper']/div[1]/div[3]/label[1]");
//	By RememberMe_Checkbox = By.xpath("//*[@id='main']/div/div/form[1]/div[1]/div[3]/label[1]");
//	By RememberMe_Checkbox = By.xpath("//html/body[1]/div[1]/div/div[2]/div/div/form[1]/div[1]/div[3]/label[1]");

	By Log_In_Button = By.xpath("//button[@data-testid='page-login__btn']");
//	By Log_In_Button = By.xpath("//button[@data-keyboard-focus='false']");
//	By Log_In_Button = By.xpath("//*[contains(text(),'Log In')]");
//	By Log_In_Button = By.xpath("//button[text()[contains(.,'Log')]]");
//	By Log_In_Button = By.xpath("//button[text()[contains(.,'Log In')]]");
//	By Log_In_Button = By.xpath("//*[@class='page-login__cta-container']/button[1]");
//	By Log_In_Button = By.xpath("//*[@class='page-login__wrapper']/div[1]/div[4]/button[1]");
//	By Log_In_Button = By.xpath("//*[@id='main']/div/div/form[1]/div[1]/div[4]/button[1]");
//	By Log_In_Button = By.xpath("//html/body[1]/div[1]/div/div[2]/div/div/form[1]/div[1]/div[4]/button[1]");

	By Bluebird_Bank_Account_Link = By.xpath("//a[@href='https://www.bluebird.com/bankaccount']");
//	By Bluebird_Bank_Account_Link = By.xpath("//a[@data-keyboard-focus='false']");
//	By Bluebird_Bank_Account_Link = By.xpath("//*[@class='bb-footer__footer-column-group']/div[1]/a[1]");
//	By Bluebird_Bank_Account_Link = By.xpath("//*[@id='main']/div/div/div[1]/footer/div[1]/div[2]/div/div[1]/a[1]");
//	By Bluebird_Bank_Account_Link = By.xpath("//html/body[1]/div[1]/div/div[2]/div/div/div[1]/footer/div[1]/div[2]/div/div[1]/a[1]");

	By Skip_to_Main_Content = By.xpath("//a[@href='#main']");
//	By Skip_to_Main_Content = By.xpath("//a[@data-testid='bb-header__skip-link--skip-to-main']");
//	By Skip_to_Main_Content = By.xpath("//*[contains(text(),'Skip to Main Content')]");
//	By Skip_to_Main_Content = By.xpath("//*[contains(text(),'Sk')]");
//	By Skip_to_Main_Content = By.xpath("//a[text()[contains(.,'Skip')]]");
//	By Skip_to_Main_Content = By.xpath("//a[text()[contains(.,'Skip to')]]");
//	By Skip_to_Main_Content = By.xpath("//a[text()[contains(.,'Skip to Main')]]");
//	By Skip_to_Main_Content = By.xpath("//a[text()[contains(.,'Content')]]");
//	By Skip_to_Main_Content = By.xpath("//a[text()[contains(.,'Main Content')]]");
//	By Skip_to_Main_Content = By.xpath("//a[text()[contains(.,'to Main Content')]]");
//	By Skip_to_Main_Content = By.xpath("//*[@class='bb-header__container d-flex align-center']/a[1]");
//	By Skip_to_Main_Content = By.xpath("//*[@class='bb-header']/div/a[1]");
//	By Skip_to_Main_Content = By.xpath("//*[@id='root']/div/header[1]/div/a[1]");
//	By Skip_to_Main_Content = By.xpath("//html/body[1]/div[1]/div/header[1]/div/a[1]");

	By A_Link_V_ = By.xpath("//a[@href='/']");
//	By A_Link_V_ = By.xpath("//*[@class='bb-header__container d-flex align-center']/a[2]");
//	By A_Link_V_ = By.xpath("//*[@class='bb-header']/div/a[2]");
//	By A_Link_V_ = By.xpath("//*[@id='root']/div/header[1]/div/a[2]");
//	By A_Link_V_ = By.xpath("//html/body[1]/div[1]/div/header[1]/div/a[2]");

	By Create_one_today = By.xpath("//a[@data-testid='bb-header__right-area__btn-link']");
//	By Create_one_today = By.xpath("//a[@target='']");
//	By Create_one_today = By.xpath("//a[@href='/signup4']");
//	By Create_one_today = By.xpath("//*[contains(text(),'Create one today!')]");
//	By Create_one_today = By.xpath("//*[contains(text(),'Cr')]");
//	By Create_one_today = By.xpath("//a[text()[contains(.,'Create')]]");
//	By Create_one_today = By.xpath("//a[text()[contains(.,'Create one')]]");
//	By Create_one_today = By.xpath("//a[text()[contains(.,'Create one today!')]]");
//	By Create_one_today = By.xpath("//*[@class='bb-header__right-area']/a[1]");
//	By Create_one_today = By.xpath("//*[@class='bb-header__container d-flex align-center']/div[1]/a[1]");
//	By Create_one_today = By.xpath("//*[@id='root']/div/header[1]/div/div[1]/a[1]");
//	By Create_one_today = By.xpath("//html/body[1]/div[1]/div/header[1]/div/div[1]/a[1]");

	By Forgot_usernamepassword = By.xpath("//a[@class='page-login__link']");
//	By Forgot_usernamepassword = By.xpath("//a[@href='/login/forgotcredentials']");
//	By Forgot_usernamepassword = By.xpath("//*[contains(text(),'Forgot username/password?')]");
//	By Forgot_usernamepassword = By.xpath("//a[text()[contains(.,'Forgot')]]");
//	By Forgot_usernamepassword = By.xpath("//a[text()[contains(.,'Forgot username/password?')]]");
//	By Forgot_usernamepassword = By.xpath("//*[@class='page-login__cta-container']/a[1]");
//	By Forgot_usernamepassword = By.xpath("//*[@class='page-login__wrapper']/div[1]/div[4]/a[1]");
//	By Forgot_usernamepassword = By.xpath("//*[@id='main']/div/div/form[1]/div[1]/div[4]/a[1]");
//	By Forgot_usernamepassword = By.xpath("//html/body[1]/div[1]/div/div[2]/div/div/form[1]/div[1]/div[4]/a[1]");

	By Bluebird_Bank_Account = By.xpath("//a[@href='https://www.bluebird.com/bankaccount']");
//	By Bluebird_Bank_Account = By.xpath("//*[@class='bb-footer__footer-column-group']/div[1]/a[1]");
//	By Bluebird_Bank_Account = By.xpath("//*[@id='main']/div/div/div[1]/footer/div[1]/div[2]/div/div[1]/a[1]");
//	By Bluebird_Bank_Account = By.xpath("//html/body[1]/div[1]/div/div[2]/div/div/div[1]/footer/div[1]/div[2]/div/div[1]/a[1]");

	By Bluebird_Prepaid_Debit_Account = By.xpath("//a[@href='https://www.bluebird.com/prepaidaccount']");
//	By Bluebird_Prepaid_Debit_Account = By.xpath("//a[text()[contains(.,'Debit Account')]]");
//	By Bluebird_Prepaid_Debit_Account = By.xpath("//a[text()[contains(.,'Prepaid Debit Account')]]");
//	By Bluebird_Prepaid_Debit_Account = By.xpath("//*[@class='bb-footer__footer-column-group']/div[1]/a[2]");
//	By Bluebird_Prepaid_Debit_Account = By.xpath("//*[@id='main']/div/div/div[1]/footer/div[1]/div[2]/div/div[1]/a[2]");
//	By Bluebird_Prepaid_Debit_Account = By.xpath("//html/body[1]/div[1]/div/div[2]/div/div/div[1]/footer/div[1]/div[2]/div/div[1]/a[2]");

	By Activate_My_Card = By.xpath("//a[@href='https://secure.bluebird.com/activate']");
//	By Activate_My_Card = By.xpath("//*[contains(text(),'Activate My Card')]");
//	By Activate_My_Card = By.xpath("//a[text()[contains(.,'Activate')]]");
//	By Activate_My_Card = By.xpath("//a[text()[contains(.,'Activate My')]]");
//	By Activate_My_Card = By.xpath("//a[text()[contains(.,'Activate My Card')]]");
//	By Activate_My_Card = By.xpath("//*[@class='bb-footer__footer-column-group']/div[2]/a[1]");
//	By Activate_My_Card = By.xpath("//*[@id='main']/div/div/div[1]/footer/div[1]/div[2]/div/div[2]/a[1]");
//	By Activate_My_Card = By.xpath("//html/body[1]/div[1]/div/div[2]/div/div/div[1]/footer/div[1]/div[2]/div/div[2]/a[1]");

	By Check_Temporary_Card_Balance = By.xpath("//a[@href='https://secure.bluebird.com/retailcard']");
//	By Check_Temporary_Card_Balance = By.xpath("//*[contains(text(),'Check Temporary Card Balance')]");
//	By Check_Temporary_Card_Balance = By.xpath("//a[text()[contains(.,'Check')]]");
//	By Check_Temporary_Card_Balance = By.xpath("//a[text()[contains(.,'Check Temporary')]]");
//	By Check_Temporary_Card_Balance = By.xpath("//a[text()[contains(.,'Check Temporary Card')]]");
//	By Check_Temporary_Card_Balance = By.xpath("//a[text()[contains(.,'Balance')]]");
//	By Check_Temporary_Card_Balance = By.xpath("//a[text()[contains(.,'Card Balance')]]");
//	By Check_Temporary_Card_Balance = By.xpath("//a[text()[contains(.,'Temporary Card Balance')]]");
//	By Check_Temporary_Card_Balance = By.xpath("//*[@class='bb-footer__footer-column-group']/div[2]/a[2]");
//	By Check_Temporary_Card_Balance = By.xpath("//*[@id='main']/div/div/div[1]/footer/div[1]/div[2]/div/div[2]/a[2]");
//	By Check_Temporary_Card_Balance = By.xpath("//html/body[1]/div[1]/div/div[2]/div/div/div[1]/footer/div[1]/div[2]/div/div[2]/a[2]");

	By ATM_Finder = By.xpath("//*[contains(text(),'ATM Finder')]");
//	By ATM_Finder = By.xpath("//*[contains(text(),'AT')]");
//	By ATM_Finder = By.xpath("//a[text()[contains(.,'ATM')]]");
//	By ATM_Finder = By.xpath("//a[text()[contains(.,'ATM Finder')]]");
//	By ATM_Finder = By.xpath("//*[@class='bb-footer__footer-column bb-footer__footer-column--links']/a[3]");
//	By ATM_Finder = By.xpath("//*[@class='bb-footer__footer-column-group']/div[2]/a[3]");
//	By ATM_Finder = By.xpath("//*[@id='main']/div/div/div[1]/footer/div[1]/div[2]/div/div[2]/a[3]");
//	By ATM_Finder = By.xpath("//html/body[1]/div[1]/div/div[2]/div/div/div[1]/footer/div[1]/div[2]/div/div[2]/a[3]");

	By LegalPrivacy = By.xpath("//a[@href='https://www.bluebird.com/legal']");
//	By LegalPrivacy = By.xpath("//*[contains(text(),'Legal/Privacy')]");
//	By LegalPrivacy = By.xpath("//a[text()[contains(.,'Legal/Privacy')]]");
//	By LegalPrivacy = By.xpath("//*[@class='bb-footer__footer-column bb-footer__footer-column--links']/a[4]");
//	By LegalPrivacy = By.xpath("//*[@class='bb-footer__footer-column-group']/div[2]/a[4]");
//	By LegalPrivacy = By.xpath("//*[@id='main']/div/div/div[1]/footer/div[1]/div[2]/div/div[2]/a[4]");
//	By LegalPrivacy = By.xpath("//html/body[1]/div[1]/div/div[2]/div/div/div[1]/footer/div[1]/div[2]/div/div[2]/a[4]");

	By FAQs = By.xpath("//a[@href='https://www.bluebird.com/faqs']");
//	By FAQs = By.xpath("//*[contains(text(),'FAQs')]");
//	By FAQs = By.xpath("//*[contains(text(),'FA')]");
//	By FAQs = By.xpath("//a[text()[contains(.,'FAQs')]]");
//	By FAQs = By.xpath("//*[@class='bb-footer__footer-column-group']/div[3]/a[1]");
//	By FAQs = By.xpath("//*[@id='main']/div/div/div[1]/footer/div[1]/div[2]/div/div[3]/a[1]");
//	By FAQs = By.xpath("//html/body[1]/div[1]/div/div[2]/div/div/div[1]/footer/div[1]/div[2]/div/div[3]/a[1]");

	By Contact_Us = By.xpath("//a[@href='https://www.bluebird.com/faqs#contact-us']");
//	By Contact_Us = By.xpath("//*[contains(text(),'Contact Us')]");
//	By Contact_Us = By.xpath("//a[text()[contains(.,'Contact')]]");
//	By Contact_Us = By.xpath("//a[text()[contains(.,'Contact Us')]]");
//	By Contact_Us = By.xpath("//*[@class='bb-footer__footer-column-group']/div[3]/a[2]");
//	By Contact_Us = By.xpath("//*[@id='main']/div/div/div[1]/footer/div[1]/div[2]/div/div[3]/a[2]");
//	By Contact_Us = By.xpath("//html/body[1]/div[1]/div/div[2]/div/div/div[1]/footer/div[1]/div[2]/div/div[3]/a[2]");

	By Member_Agreement = By.xpath("//a[@href='https://www.bluebird.com/legal/member-agreement']");
//	By Member_Agreement = By.xpath("//*[contains(text(),'Member Agreement')]");
//	By Member_Agreement = By.xpath("//a[text()[contains(.,'Member')]]");
//	By Member_Agreement = By.xpath("//a[text()[contains(.,'Member Agreement')]]");
//	By Member_Agreement = By.xpath("//*[@class='bb-footer__footer-section--disclaimer']/p[2]/a[1]");
//	By Member_Agreement = By.xpath("//*[@class='bb-footer__footer-section']/div/p[2]/a[1]");
//	By Member_Agreement = By.xpath("//*[@id='main']/div/div/div[1]/footer/div[3]/div/p[2]/a[1]");
//	By Member_Agreement = By.xpath("//html/body[1]/div[1]/div/div[2]/div/div/div[1]/footer/div[3]/div/p[2]/a[1]");

	By Click_here = By.xpath("//a[@href='https://www.americanexpress.com/us/prepaid/state-licensing.html']");
//	By Click_here = By.xpath("//*[@class='bb-footer__footer-section--disclaimer']/p[3]/a[1]");
//	By Click_here = By.xpath("//*[@class='bb-footer__footer-section']/div/p[3]/a[1]");
//	By Click_here = By.xpath("//*[@id='main']/div/div/div[1]/footer/div[3]/div/p[3]/a[1]");
//	By Click_here = By.xpath("//html/body[1]/div[1]/div/div[2]/div/div/div[1]/footer/div[3]/div/p[3]/a[1]");

	By Click_here_1 = By.xpath("//a[@href='https://www.bluebird.com/faqs/stay-in-the-know']");
//	By Click_here_1 = By.xpath("//*[@class='bb-footer__footer-section--disclaimer']/p[4]/a[1]");
//	By Click_here_1 = By.xpath("//*[@class='bb-footer__footer-section']/div/p[4]/a[1]");
//	By Click_here_1 = By.xpath("//*[@id='main']/div/div/div[1]/footer/div[3]/div/p[4]/a[1]");
//	By Click_here_1 = By.xpath("//html/body[1]/div[1]/div/div[2]/div/div/div[1]/footer/div[3]/div/p[4]/a[1]");

	By Privacy_Statement = By.xpath("//a[@href='https://www.americanexpress.com/us/company/privacy-center/online-privacy-disclosures/']");
//	By Privacy_Statement = By.xpath("//*[@class='bb-footer__footer-section--disclaimer']/p[5]/a[1]");
//	By Privacy_Statement = By.xpath("//*[@class='bb-footer__footer-section']/div/p[5]/a[1]");
//	By Privacy_Statement = By.xpath("//*[@id='main']/div/div/div[1]/footer/div[3]/div/p[5]/a[1]");
//	By Privacy_Statement = By.xpath("//html/body[1]/div[1]/div/div[2]/div/div/div[1]/footer/div[3]/div/p[5]/a[1]");

	By Privacy_Statement_1 = By.xpath("//a[@href='https://www.bluebird.com/legal/bankaccount-privacy']");
//	By Privacy_Statement_1 = By.xpath("//*[@class='bb-footer__footer-section--disclaimer']/p[7]/a[1]");
//	By Privacy_Statement_1 = By.xpath("//*[@class='bb-footer__footer-section']/div/p[7]/a[1]");
//	By Privacy_Statement_1 = By.xpath("//*[@id='main']/div/div/div[1]/footer/div[3]/div/p[7]/a[1]");
//	By Privacy_Statement_1 = By.xpath("//html/body[1]/div[1]/div/div[2]/div/div/div[1]/footer/div[3]/div/p[7]/a[1]");

	By Terms_of_Use = By.xpath("//a[@href='https://www.bluebird.com/legal/terms-of-use']");
//	By Terms_of_Use = By.xpath("//*[contains(text(),'Terms of Use')]");
//	By Terms_of_Use = By.xpath("//a[text()[contains(.,'Terms')]]");
//	By Terms_of_Use = By.xpath("//a[text()[contains(.,'Terms of')]]");
//	By Terms_of_Use = By.xpath("//a[text()[contains(.,'Terms of Use')]]");
//	By Terms_of_Use = By.xpath("//*[@class='bb-footer__footer-section--disclaimer']/p[10]/a[1]");
//	By Terms_of_Use = By.xpath("//*[@class='bb-footer__footer-section']/div/p[10]/a[1]");
//	By Terms_of_Use = By.xpath("//*[@id='main']/div/div/div[1]/footer/div[3]/div/p[10]/a[1]");
//	By Terms_of_Use = By.xpath("//html/body[1]/div[1]/div/div[2]/div/div/div[1]/footer/div[3]/div/p[10]/a[1]");

	By Google_Play = By.xpath("//button[@data-testid='bb-footer__buttonId-outline-google-logo']");
//	By Google_Play = By.xpath("//button[text()[contains(.,'Google')]]");
//	By Google_Play = By.xpath("//button[text()[contains(.,'Google Play')]]");
//	By Google_Play = By.xpath("//*[@class='bb-footer__buttons-block d-flex']/button[2]");
//	By Google_Play = By.xpath("//*[@class='bb-footer__footer-section--buttons']/div/button[2]");
//	By Google_Play = By.xpath("//*[@id='main']/div/div/div[1]/footer/div[2]/div/div/button[2]");
//	By Google_Play = By.xpath("//html/body[1]/div[1]/div/div[2]/div/div/div[1]/footer/div[2]/div/div/button[2]");

	By App_Store = By.xpath("//button[@data-testid='bb-footer__buttonId-outline-apple-logo']");
//	By App_Store = By.xpath("//button[text()[contains(.,'App')]]");
//	By App_Store = By.xpath("//button[text()[contains(.,'App Store')]]");
//	By App_Store = By.xpath("//*[@class='bb-footer__buttons-block d-flex']/button[1]");
//	By App_Store = By.xpath("//*[@class='bb-footer__footer-section--buttons']/div/button[1]");
//	By App_Store = By.xpath("//*[@id='main']/div/div/div[1]/footer/div[2]/div/div/button[1]");
//	By App_Store = By.xpath("//html/body[1]/div[1]/div/div[2]/div/div/div[1]/footer/div[2]/div/div/button[1]");

	By Log_In = By.xpath("//button[@data-testid='page-login__btn']");
//	By Log_In = By.xpath("//*[contains(text(),'Log In')]");
//	By Log_In = By.xpath("//button[text()[contains(.,'Log')]]");
//	By Log_In = By.xpath("//button[text()[contains(.,'Log In')]]");
//	By Log_In = By.xpath("//*[@class='page-login__cta-container']/button[1]");
//	By Log_In = By.xpath("//*[@class='page-login__wrapper']/div[1]/div[4]/button[1]");
//	By Log_In = By.xpath("//*[@id='main']/div/div/form[1]/div[1]/div[4]/button[1]");
//	By Log_In = By.xpath("//html/body[1]/div[1]/div/div[2]/div/div/form[1]/div[1]/div[4]/button[1]");


   //Methods

   // Username_input
	public boolean Username_input_DISPLAYED(){
	    return VerifyElement(Username_input,"displayed","Username_input");
	}
	public boolean Username_input_ENABLED(){
	    return VerifyElement(Username_input,"enabled","Username_input");
	}
	public boolean Username_input_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Username_input);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Username_input_MOVETOANDCLICK(){
	    return Element_Click(Username_input, "moveToAndClick","Username_input");
 	}
	public boolean Username_input_CLICK_JAVASCRIPT(){
	    return Element_Click(Username_input, "javaClick","Username_input");
  	}
	public boolean Username_input_CLICK(){
	    return Element_Click(Username_input, "click","Username_input");
  	}
	public String Username_input_GETTEXT(){
	    return driver.findElement(Username_input).getText();	}
	public boolean Username_input_SENDKEYS(String textToInput){
	    driver.findElement(Username_input).clear();	    driver.findElement(Username_input).sendKeys(textToInput);	    return true;
	}

   // passwordbbpasswordbbpassword
	public boolean passwordbbpasswordbbpassword_DISPLAYED(){
	    return VerifyElement(passwordbbpasswordbbpassword,"displayed","passwordbbpasswordbbpassword");
	}
	public boolean passwordbbpasswordbbpassword_ENABLED(){
	    return VerifyElement(passwordbbpasswordbbpassword,"enabled","passwordbbpasswordbbpassword");
	}
	public boolean passwordbbpasswordbbpassword_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(passwordbbpasswordbbpassword);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean passwordbbpasswordbbpassword_MOVETOANDCLICK(){
	    return Element_Click(passwordbbpasswordbbpassword, "moveToAndClick","passwordbbpasswordbbpassword");
 	}
	public boolean passwordbbpasswordbbpassword_CLICK_JAVASCRIPT(){
	    return Element_Click(passwordbbpasswordbbpassword, "javaClick","passwordbbpasswordbbpassword");
  	}
	public boolean passwordbbpasswordbbpassword_CLICK(){
	    return Element_Click(passwordbbpasswordbbpassword, "click","passwordbbpasswordbbpassword");
  	}
	public String passwordbbpasswordbbpassword_GETTEXT(){
	    return driver.findElement(passwordbbpasswordbbpassword).getText();	}
	public boolean passwordbbpasswordbbpassword_SENDKEYS(String textToInput){
	    driver.findElement(passwordbbpasswordbbpassword).clear();	    driver.findElement(passwordbbpasswordbbpassword).sendKeys(textToInput);	    return true;
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

   // Bluebird_Bank_Account_Link
	public boolean Bluebird_Bank_Account_Link_DISPLAYED(){
	    return VerifyElement(Bluebird_Bank_Account_Link,"displayed","Bluebird_Bank_Account_Link");
	}
	public boolean Bluebird_Bank_Account_Link_ENABLED(){
	    return VerifyElement(Bluebird_Bank_Account_Link,"enabled","Bluebird_Bank_Account_Link");
	}
	public boolean Bluebird_Bank_Account_Link_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Bluebird_Bank_Account_Link);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Bluebird_Bank_Account_Link_MOVETOANDCLICK(){
	    return Element_Click(Bluebird_Bank_Account_Link, "moveToAndClick","Bluebird_Bank_Account_Link");
 	}
	public boolean Bluebird_Bank_Account_Link_CLICK_JAVASCRIPT(){
	    return Element_Click(Bluebird_Bank_Account_Link, "javaClick","Bluebird_Bank_Account_Link");
  	}
	public boolean Bluebird_Bank_Account_Link_CLICK(){
	    return Element_Click(Bluebird_Bank_Account_Link, "click","Bluebird_Bank_Account_Link");
  	}
	public String Bluebird_Bank_Account_Link_GETTEXT(){
	    return driver.findElement(Bluebird_Bank_Account_Link).getText();	}

   // Skip_to_Main_Content
	public boolean Skip_to_Main_Content_DISPLAYED(){
	    return VerifyElement(Skip_to_Main_Content,"displayed","Skip_to_Main_Content");
	}
	public boolean Skip_to_Main_Content_ENABLED(){
	    return VerifyElement(Skip_to_Main_Content,"enabled","Skip_to_Main_Content");
	}
	public boolean Skip_to_Main_Content_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Skip_to_Main_Content);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Skip_to_Main_Content_MOVETOANDCLICK(){
	    return Element_Click(Skip_to_Main_Content, "moveToAndClick","Skip_to_Main_Content");
 	}
	public boolean Skip_to_Main_Content_CLICK_JAVASCRIPT(){
	    return Element_Click(Skip_to_Main_Content, "javaClick","Skip_to_Main_Content");
  	}
	public boolean Skip_to_Main_Content_CLICK(){
	    return Element_Click(Skip_to_Main_Content, "click","Skip_to_Main_Content");
  	}
	public String Skip_to_Main_Content_GETTEXT(){
	    return driver.findElement(Skip_to_Main_Content).getText();	}

   // A_Link_V_
	public boolean A_Link_V__DISPLAYED(){
	    return VerifyElement(A_Link_V_,"displayed","A_Link_V_");
	}
	public boolean A_Link_V__ENABLED(){
	    return VerifyElement(A_Link_V_,"enabled","A_Link_V_");
	}
	public boolean A_Link_V__MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(A_Link_V_);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean A_Link_V__MOVETOANDCLICK(){
	    return Element_Click(A_Link_V_, "moveToAndClick","A_Link_V_");
 	}
	public boolean A_Link_V__CLICK_JAVASCRIPT(){
	    return Element_Click(A_Link_V_, "javaClick","A_Link_V_");
  	}
	public boolean A_Link_V__CLICK(){
	    return Element_Click(A_Link_V_, "click","A_Link_V_");
  	}
	public String A_Link_V__GETTEXT(){
	    return driver.findElement(A_Link_V_).getText();	}

   // Create_one_today
	public boolean Create_one_today_DISPLAYED(){
	    return VerifyElement(Create_one_today,"displayed","Create_one_today");
	}
	public boolean Create_one_today_ENABLED(){
	    return VerifyElement(Create_one_today,"enabled","Create_one_today");
	}
	public boolean Create_one_today_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Create_one_today);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Create_one_today_MOVETOANDCLICK(){
	    return Element_Click(Create_one_today, "moveToAndClick","Create_one_today");
 	}
	public boolean Create_one_today_CLICK_JAVASCRIPT(){
	    return Element_Click(Create_one_today, "javaClick","Create_one_today");
  	}
	public boolean Create_one_today_CLICK(){
	    return Element_Click(Create_one_today, "click","Create_one_today");
  	}
	public String Create_one_today_GETTEXT(){
	    return driver.findElement(Create_one_today).getText();	}

   // Forgot_usernamepassword
	public boolean Forgot_usernamepassword_DISPLAYED(){
	    return VerifyElement(Forgot_usernamepassword,"displayed","Forgot_usernamepassword");
	}
	public boolean Forgot_usernamepassword_ENABLED(){
	    return VerifyElement(Forgot_usernamepassword,"enabled","Forgot_usernamepassword");
	}
	public boolean Forgot_usernamepassword_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Forgot_usernamepassword);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Forgot_usernamepassword_MOVETOANDCLICK(){
	    return Element_Click(Forgot_usernamepassword, "moveToAndClick","Forgot_usernamepassword");
 	}
	public boolean Forgot_usernamepassword_CLICK_JAVASCRIPT(){
	    return Element_Click(Forgot_usernamepassword, "javaClick","Forgot_usernamepassword");
  	}
	public boolean Forgot_usernamepassword_CLICK(){
	    return Element_Click(Forgot_usernamepassword, "click","Forgot_usernamepassword");
  	}
	public String Forgot_usernamepassword_GETTEXT(){
	    return driver.findElement(Forgot_usernamepassword).getText();	}

   // Bluebird_Bank_Account
	public boolean Bluebird_Bank_Account_DISPLAYED(){
	    return VerifyElement(Bluebird_Bank_Account,"displayed","Bluebird_Bank_Account");
	}
	public boolean Bluebird_Bank_Account_ENABLED(){
	    return VerifyElement(Bluebird_Bank_Account,"enabled","Bluebird_Bank_Account");
	}
	public boolean Bluebird_Bank_Account_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Bluebird_Bank_Account);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Bluebird_Bank_Account_MOVETOANDCLICK(){
	    return Element_Click(Bluebird_Bank_Account, "moveToAndClick","Bluebird_Bank_Account");
 	}
	public boolean Bluebird_Bank_Account_CLICK_JAVASCRIPT(){
	    return Element_Click(Bluebird_Bank_Account, "javaClick","Bluebird_Bank_Account");
  	}
	public boolean Bluebird_Bank_Account_CLICK(){
	    return Element_Click(Bluebird_Bank_Account, "click","Bluebird_Bank_Account");
  	}
	public String Bluebird_Bank_Account_GETTEXT(){
	    return driver.findElement(Bluebird_Bank_Account).getText();	}

   // Bluebird_Prepaid_Debit_Account
	public boolean Bluebird_Prepaid_Debit_Account_DISPLAYED(){
	    return VerifyElement(Bluebird_Prepaid_Debit_Account,"displayed","Bluebird_Prepaid_Debit_Account");
	}
	public boolean Bluebird_Prepaid_Debit_Account_ENABLED(){
	    return VerifyElement(Bluebird_Prepaid_Debit_Account,"enabled","Bluebird_Prepaid_Debit_Account");
	}
	public boolean Bluebird_Prepaid_Debit_Account_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Bluebird_Prepaid_Debit_Account);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Bluebird_Prepaid_Debit_Account_MOVETOANDCLICK(){
	    return Element_Click(Bluebird_Prepaid_Debit_Account, "moveToAndClick","Bluebird_Prepaid_Debit_Account");
 	}
	public boolean Bluebird_Prepaid_Debit_Account_CLICK_JAVASCRIPT(){
	    return Element_Click(Bluebird_Prepaid_Debit_Account, "javaClick","Bluebird_Prepaid_Debit_Account");
  	}
	public boolean Bluebird_Prepaid_Debit_Account_CLICK(){
	    return Element_Click(Bluebird_Prepaid_Debit_Account, "click","Bluebird_Prepaid_Debit_Account");
  	}
	public String Bluebird_Prepaid_Debit_Account_GETTEXT(){
	    return driver.findElement(Bluebird_Prepaid_Debit_Account).getText();	}

   // Activate_My_Card
	public boolean Activate_My_Card_DISPLAYED(){
	    return VerifyElement(Activate_My_Card,"displayed","Activate_My_Card");
	}
	public boolean Activate_My_Card_ENABLED(){
	    return VerifyElement(Activate_My_Card,"enabled","Activate_My_Card");
	}
	public boolean Activate_My_Card_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Activate_My_Card);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Activate_My_Card_MOVETOANDCLICK(){
	    return Element_Click(Activate_My_Card, "moveToAndClick","Activate_My_Card");
 	}
	public boolean Activate_My_Card_CLICK_JAVASCRIPT(){
	    return Element_Click(Activate_My_Card, "javaClick","Activate_My_Card");
  	}
	public boolean Activate_My_Card_CLICK(){
	    return Element_Click(Activate_My_Card, "click","Activate_My_Card");
  	}
	public String Activate_My_Card_GETTEXT(){
	    return driver.findElement(Activate_My_Card).getText();	}

   // Check_Temporary_Card_Balance
	public boolean Check_Temporary_Card_Balance_DISPLAYED(){
	    return VerifyElement(Check_Temporary_Card_Balance,"displayed","Check_Temporary_Card_Balance");
	}
	public boolean Check_Temporary_Card_Balance_ENABLED(){
	    return VerifyElement(Check_Temporary_Card_Balance,"enabled","Check_Temporary_Card_Balance");
	}
	public boolean Check_Temporary_Card_Balance_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Check_Temporary_Card_Balance);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Check_Temporary_Card_Balance_MOVETOANDCLICK(){
	    return Element_Click(Check_Temporary_Card_Balance, "moveToAndClick","Check_Temporary_Card_Balance");
 	}
	public boolean Check_Temporary_Card_Balance_CLICK_JAVASCRIPT(){
	    return Element_Click(Check_Temporary_Card_Balance, "javaClick","Check_Temporary_Card_Balance");
  	}
	public boolean Check_Temporary_Card_Balance_CLICK(){
	    return Element_Click(Check_Temporary_Card_Balance, "click","Check_Temporary_Card_Balance");
  	}
	public String Check_Temporary_Card_Balance_GETTEXT(){
	    return driver.findElement(Check_Temporary_Card_Balance).getText();	}

   // ATM_Finder
	public boolean ATM_Finder_DISPLAYED(){
	    return VerifyElement(ATM_Finder,"displayed","ATM_Finder");
	}
	public boolean ATM_Finder_ENABLED(){
	    return VerifyElement(ATM_Finder,"enabled","ATM_Finder");
	}
	public boolean ATM_Finder_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(ATM_Finder);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean ATM_Finder_MOVETOANDCLICK(){
	    return Element_Click(ATM_Finder, "moveToAndClick","ATM_Finder");
 	}
	public boolean ATM_Finder_CLICK_JAVASCRIPT(){
	    return Element_Click(ATM_Finder, "javaClick","ATM_Finder");
  	}
	public boolean ATM_Finder_CLICK(){
	    return Element_Click(ATM_Finder, "click","ATM_Finder");
  	}
	public String ATM_Finder_GETTEXT(){
	    return driver.findElement(ATM_Finder).getText();	}

   // LegalPrivacy
	public boolean LegalPrivacy_DISPLAYED(){
	    return VerifyElement(LegalPrivacy,"displayed","LegalPrivacy");
	}
	public boolean LegalPrivacy_ENABLED(){
	    return VerifyElement(LegalPrivacy,"enabled","LegalPrivacy");
	}
	public boolean LegalPrivacy_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(LegalPrivacy);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean LegalPrivacy_MOVETOANDCLICK(){
	    return Element_Click(LegalPrivacy, "moveToAndClick","LegalPrivacy");
 	}
	public boolean LegalPrivacy_CLICK_JAVASCRIPT(){
	    return Element_Click(LegalPrivacy, "javaClick","LegalPrivacy");
  	}
	public boolean LegalPrivacy_CLICK(){
	    return Element_Click(LegalPrivacy, "click","LegalPrivacy");
  	}
	public String LegalPrivacy_GETTEXT(){
	    return driver.findElement(LegalPrivacy).getText();	}

   // FAQs
	public boolean FAQs_DISPLAYED(){
	    return VerifyElement(FAQs,"displayed","FAQs");
	}
	public boolean FAQs_ENABLED(){
	    return VerifyElement(FAQs,"enabled","FAQs");
	}
	public boolean FAQs_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(FAQs);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean FAQs_MOVETOANDCLICK(){
	    return Element_Click(FAQs, "moveToAndClick","FAQs");
 	}
	public boolean FAQs_CLICK_JAVASCRIPT(){
	    return Element_Click(FAQs, "javaClick","FAQs");
  	}
	public boolean FAQs_CLICK(){
	    return Element_Click(FAQs, "click","FAQs");
  	}
	public String FAQs_GETTEXT(){
	    return driver.findElement(FAQs).getText();	}

   // Contact_Us
	public boolean Contact_Us_DISPLAYED(){
	    return VerifyElement(Contact_Us,"displayed","Contact_Us");
	}
	public boolean Contact_Us_ENABLED(){
	    return VerifyElement(Contact_Us,"enabled","Contact_Us");
	}
	public boolean Contact_Us_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Contact_Us);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Contact_Us_MOVETOANDCLICK(){
	    return Element_Click(Contact_Us, "moveToAndClick","Contact_Us");
 	}
	public boolean Contact_Us_CLICK_JAVASCRIPT(){
	    return Element_Click(Contact_Us, "javaClick","Contact_Us");
  	}
	public boolean Contact_Us_CLICK(){
	    return Element_Click(Contact_Us, "click","Contact_Us");
  	}
	public String Contact_Us_GETTEXT(){
	    return driver.findElement(Contact_Us).getText();	}

   // Member_Agreement
	public boolean Member_Agreement_DISPLAYED(){
	    return VerifyElement(Member_Agreement,"displayed","Member_Agreement");
	}
	public boolean Member_Agreement_ENABLED(){
	    return VerifyElement(Member_Agreement,"enabled","Member_Agreement");
	}
	public boolean Member_Agreement_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Member_Agreement);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Member_Agreement_MOVETOANDCLICK(){
	    return Element_Click(Member_Agreement, "moveToAndClick","Member_Agreement");
 	}
	public boolean Member_Agreement_CLICK_JAVASCRIPT(){
	    return Element_Click(Member_Agreement, "javaClick","Member_Agreement");
  	}
	public boolean Member_Agreement_CLICK(){
	    return Element_Click(Member_Agreement, "click","Member_Agreement");
  	}
	public String Member_Agreement_GETTEXT(){
	    return driver.findElement(Member_Agreement).getText();	}

   // Click_here
	public boolean Click_here_DISPLAYED(){
	    return VerifyElement(Click_here,"displayed","Click_here");
	}
	public boolean Click_here_ENABLED(){
	    return VerifyElement(Click_here,"enabled","Click_here");
	}
	public boolean Click_here_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Click_here);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Click_here_MOVETOANDCLICK(){
	    return Element_Click(Click_here, "moveToAndClick","Click_here");
 	}
	public boolean Click_here_CLICK_JAVASCRIPT(){
	    return Element_Click(Click_here, "javaClick","Click_here");
  	}
	public boolean Click_here_CLICK(){
	    return Element_Click(Click_here, "click","Click_here");
  	}
	public String Click_here_GETTEXT(){
	    return driver.findElement(Click_here).getText();	}

   // Click_here_1
	public boolean Click_here_1_DISPLAYED(){
	    return VerifyElement(Click_here_1,"displayed","Click_here_1");
	}
	public boolean Click_here_1_ENABLED(){
	    return VerifyElement(Click_here_1,"enabled","Click_here_1");
	}
	public boolean Click_here_1_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Click_here_1);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Click_here_1_MOVETOANDCLICK(){
	    return Element_Click(Click_here_1, "moveToAndClick","Click_here_1");
 	}
	public boolean Click_here_1_CLICK_JAVASCRIPT(){
	    return Element_Click(Click_here_1, "javaClick","Click_here_1");
  	}
	public boolean Click_here_1_CLICK(){
	    return Element_Click(Click_here_1, "click","Click_here_1");
  	}
	public String Click_here_1_GETTEXT(){
	    return driver.findElement(Click_here_1).getText();	}

   // Privacy_Statement
	public boolean Privacy_Statement_DISPLAYED(){
	    return VerifyElement(Privacy_Statement,"displayed","Privacy_Statement");
	}
	public boolean Privacy_Statement_ENABLED(){
	    return VerifyElement(Privacy_Statement,"enabled","Privacy_Statement");
	}
	public boolean Privacy_Statement_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Privacy_Statement);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Privacy_Statement_MOVETOANDCLICK(){
	    return Element_Click(Privacy_Statement, "moveToAndClick","Privacy_Statement");
 	}
	public boolean Privacy_Statement_CLICK_JAVASCRIPT(){
	    return Element_Click(Privacy_Statement, "javaClick","Privacy_Statement");
  	}
	public boolean Privacy_Statement_CLICK(){
	    return Element_Click(Privacy_Statement, "click","Privacy_Statement");
  	}
	public String Privacy_Statement_GETTEXT(){
	    return driver.findElement(Privacy_Statement).getText();	}

   // Privacy_Statement_1
	public boolean Privacy_Statement_1_DISPLAYED(){
	    return VerifyElement(Privacy_Statement_1,"displayed","Privacy_Statement_1");
	}
	public boolean Privacy_Statement_1_ENABLED(){
	    return VerifyElement(Privacy_Statement_1,"enabled","Privacy_Statement_1");
	}
	public boolean Privacy_Statement_1_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Privacy_Statement_1);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Privacy_Statement_1_MOVETOANDCLICK(){
	    return Element_Click(Privacy_Statement_1, "moveToAndClick","Privacy_Statement_1");
 	}
	public boolean Privacy_Statement_1_CLICK_JAVASCRIPT(){
	    return Element_Click(Privacy_Statement_1, "javaClick","Privacy_Statement_1");
  	}
	public boolean Privacy_Statement_1_CLICK(){
	    return Element_Click(Privacy_Statement_1, "click","Privacy_Statement_1");
  	}
	public String Privacy_Statement_1_GETTEXT(){
	    return driver.findElement(Privacy_Statement_1).getText();	}

   // Terms_of_Use
	public boolean Terms_of_Use_DISPLAYED(){
	    return VerifyElement(Terms_of_Use,"displayed","Terms_of_Use");
	}
	public boolean Terms_of_Use_ENABLED(){
	    return VerifyElement(Terms_of_Use,"enabled","Terms_of_Use");
	}
	public boolean Terms_of_Use_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Terms_of_Use);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Terms_of_Use_MOVETOANDCLICK(){
	    return Element_Click(Terms_of_Use, "moveToAndClick","Terms_of_Use");
 	}
	public boolean Terms_of_Use_CLICK_JAVASCRIPT(){
	    return Element_Click(Terms_of_Use, "javaClick","Terms_of_Use");
  	}
	public boolean Terms_of_Use_CLICK(){
	    return Element_Click(Terms_of_Use, "click","Terms_of_Use");
  	}
	public String Terms_of_Use_GETTEXT(){
	    return driver.findElement(Terms_of_Use).getText();	}

   // Google_Play
	public boolean Google_Play_DISPLAYED(){
	    return VerifyElement(Google_Play,"displayed","Google_Play");
	}
	public boolean Google_Play_ENABLED(){
	    return VerifyElement(Google_Play,"enabled","Google_Play");
	}
	public boolean Google_Play_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Google_Play);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Google_Play_MOVETOANDCLICK(){
	    return Element_Click(Google_Play, "moveToAndClick","Google_Play");
 	}
	public boolean Google_Play_CLICK_JAVASCRIPT(){
	    return Element_Click(Google_Play, "javaClick","Google_Play");
  	}
	public boolean Google_Play_CLICK(){
	    return Element_Click(Google_Play, "click","Google_Play");
  	}
	public String Google_Play_GETTEXT(){
	    return driver.findElement(Google_Play).getText();	}

   // App_Store
	public boolean App_Store_DISPLAYED(){
	    return VerifyElement(App_Store,"displayed","App_Store");
	}
	public boolean App_Store_ENABLED(){
	    return VerifyElement(App_Store,"enabled","App_Store");
	}
	public boolean App_Store_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(App_Store);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean App_Store_MOVETOANDCLICK(){
	    return Element_Click(App_Store, "moveToAndClick","App_Store");
 	}
	public boolean App_Store_CLICK_JAVASCRIPT(){
	    return Element_Click(App_Store, "javaClick","App_Store");
  	}
	public boolean App_Store_CLICK(){
	    return Element_Click(App_Store, "click","App_Store");
  	}
	public String App_Store_GETTEXT(){
	    return driver.findElement(App_Store).getText();	}

   // Log_In
	public boolean Log_In_DISPLAYED(){
	    return VerifyElement(Log_In,"displayed","Log_In");
	}
	public boolean Log_In_ENABLED(){
	    return VerifyElement(Log_In,"enabled","Log_In");
	}
	public boolean Log_In_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Log_In);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Log_In_MOVETOANDCLICK(){
	    return Element_Click(Log_In, "moveToAndClick","Log_In");
 	}
	public boolean Log_In_CLICK_JAVASCRIPT(){
	    return Element_Click(Log_In, "javaClick","Log_In");
  	}
	public boolean Log_In_CLICK(){
	    return Element_Click(Log_In, "click","Log_In");
  	}
	public String Log_In_GETTEXT(){
	    return driver.findElement(Log_In).getText();	}

}