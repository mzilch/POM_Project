package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import utility.SeleniumHelperBasic;

public class POM_AmexHomePage extends SeleniumHelperBasic{

   //Variables
	private Actions action;
	public String PAGE_Title = "American Express Credit Cards, Rewards & Banking";
	public String PAGE_URL = "https://www.americanexpress.com/";

   //Constructor
	public POM_AmexHomePage(WebDriver driver){
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
		ValidatePageTitle(PAGE_Title);
	}

   //Locators
	By Log_In_Button = By.xpath("//*[@id='gnav_login']");
	By About_American_Express = By.xpath("//a[@class='axp-footer__dls-module__textWrap___3wMeN'][@href='https://about.americanexpress.com/?inav=footer_about_american_express']");
	By Investor_Relations = By.xpath("//a[@class='axp-footer__dls-module__textWrap___3wMeN'][@href='http://ir.americanexpress.com/?inav=footer_about_investor_relations']");
	By Careers = By.xpath("//a[@class='axp-footer__dls-module__textWrap___3wMeN'][@href='https://www.americanexpress.com/en-us/careers/?inav=footer_careers']");
	By Site_Map = By.xpath("//a[@class='axp-footer__dls-module__textWrap___3wMeN'][@href='https://www.americanexpress.com/us/sitemap.html?inav=footer_sitemap']");
	By Contact_Us = By.xpath("//a[@class='axp-footer__dls-module__textWrap___3wMeN'][@href='https://global.americanexpress.com/help?inav=footer_contact'][@rel=''][@target=''][@title='Contact Us'][@tracking='footer_contact']");
	By ABOUT = By.xpath("//*[@class='axp-footer__dls-module__pad3B___1J3uF axp-footer__dls-module__row___3H3xq']/div[1]/h2[1]");
	By Credit_Cards = By.xpath("//a[@class='axp-footer__dls-module__textWrap___3wMeN'][@href='https://www.americanexpress.com/us/credit-cards/?inav=footer_sitemap']");
	By Business_Credit_Cards = By.xpath("//a[@class='axp-footer__dls-module__textWrap___3wMeN'][@href='https://www.americanexpress.com/us/credit-cards/business/business-credit-cards/?inav=footer_cards_bus_crdt_crd']");
	By Corporate_Programs = By.xpath("//a[@class='axp-footer__dls-module__textWrap___3wMeN'][@href='https://www.americanexpress.com/us/credit-cards/business/corporate-credit-cards/?inav=footer_corp_prg']");
	By Prepaid_Cards = By.xpath("//*[@id='amex-footer']/div[1]/div/footer/div[1]/div/div[2]/ul[1]/li[4]/a");
	By Savings_Accounts_CDs = By.xpath("//*[@id='amex-footer']/div[1]/div/footer/div[1]/div/div[2]/ul[1]/li[5]/a");
	By Gift_Cards = By.xpath("//a[@class='axp-footer__dls-module__textWrap___3wMeN'][@href='https://www.americanexpress.com/gift-cards/?inav=menu_cards_giftcards']");
	By PRODUCTS_SERVICES = By.xpath("//*[@class='axp-footer__dls-module__pad3B___1J3uF axp-footer__dls-module__row___3H3xq']/div[2]/h2[1]");
	By Free_Credit_Score_Report = By.xpath("//a[@class='axp-footer__dls-module__textWrap___3wMeN'][@href='https://www.americanexpress.com/us/credit-cards/features-benefits/free-credit-score?inav=footer_credit_score']");
	By CreditSecure = By.xpath("//a[@class='axp-footer__dls-module__textWrap___3wMeN'][@href='https://feeservices.americanexpress.com/premium/credit-report-monitoring/home.do?inav=footer_creditsecure']");
	By Bluebird = By.xpath("//*[@id='amex-footer']/div[1]/div/footer/div[1]/div/div[3]/ul[1]/li[4]/a");
	By Accept_Amex_Cards = By.xpath("//*[@id='amex-footer']/div[1]/div/footer/div[1]/div/div[3]/ul[1]/li[5]/a");
	By Refer_A_Friend = By.xpath("//*[@id='amex-footer']/div[1]/div/footer/div[1]/div/div[3]/ul[1]/li[6]/a");
	By LINKS_YOU_MAY_LIKE = By.xpath("//*[@class='axp-footer__dls-module__pad3B___1J3uF axp-footer__dls-module__row___3H3xq']/div[3]/h2[1]");

   //Methods

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

   // About_American_Express
	public boolean About_American_Express_DISPLAYED(){
	    return VerifyElement(About_American_Express,"displayed","About_American_Express");
	}
	public boolean About_American_Express_ENABLED(){
	    return VerifyElement(About_American_Express,"enabled","About_American_Express");
	}
	public boolean About_American_Express_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(About_American_Express);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean About_American_Express_MOVETOANDCLICK(){
	    return Element_Click(About_American_Express, "moveToAndClick","About_American_Express");
 	}
	public boolean About_American_Express_CLICK_JAVASCRIPT(){
	    return Element_Click(About_American_Express, "javaClick","About_American_Express");
  	}
	public boolean About_American_Express_CLICK(){
	    return Element_Click(About_American_Express, "click","About_American_Express");
  	}
	public String About_American_Express_GETTEXT(){
	    return driver.findElement(About_American_Express).getText();	}

   // Investor_Relations
	public boolean Investor_Relations_DISPLAYED(){
	    return VerifyElement(Investor_Relations,"displayed","Investor_Relations");
	}
	public boolean Investor_Relations_ENABLED(){
	    return VerifyElement(Investor_Relations,"enabled","Investor_Relations");
	}
	public boolean Investor_Relations_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Investor_Relations);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Investor_Relations_MOVETOANDCLICK(){
	    return Element_Click(Investor_Relations, "moveToAndClick","Investor_Relations");
 	}
	public boolean Investor_Relations_CLICK_JAVASCRIPT(){
	    return Element_Click(Investor_Relations, "javaClick","Investor_Relations");
  	}
	public boolean Investor_Relations_CLICK(){
	    return Element_Click(Investor_Relations, "click","Investor_Relations");
  	}
	public String Investor_Relations_GETTEXT(){
	    return driver.findElement(Investor_Relations).getText();	}

   // Careers
	public boolean Careers_DISPLAYED(){
	    return VerifyElement(Careers,"displayed","Careers");
	}
	public boolean Careers_ENABLED(){
	    return VerifyElement(Careers,"enabled","Careers");
	}
	public boolean Careers_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Careers);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Careers_MOVETOANDCLICK(){
	    return Element_Click(Careers, "moveToAndClick","Careers");
 	}
	public boolean Careers_CLICK_JAVASCRIPT(){
	    return Element_Click(Careers, "javaClick","Careers");
  	}
	public boolean Careers_CLICK(){
	    return Element_Click(Careers, "click","Careers");
  	}
	public String Careers_GETTEXT(){
	    return driver.findElement(Careers).getText();	}

   // Site_Map
	public boolean Site_Map_DISPLAYED(){
	    return VerifyElement(Site_Map,"displayed","Site_Map");
	}
	public boolean Site_Map_ENABLED(){
	    return VerifyElement(Site_Map,"enabled","Site_Map");
	}
	public boolean Site_Map_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Site_Map);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Site_Map_MOVETOANDCLICK(){
	    return Element_Click(Site_Map, "moveToAndClick","Site_Map");
 	}
	public boolean Site_Map_CLICK_JAVASCRIPT(){
	    return Element_Click(Site_Map, "javaClick","Site_Map");
  	}
	public boolean Site_Map_CLICK(){
	    return Element_Click(Site_Map, "click","Site_Map");
  	}
	public String Site_Map_GETTEXT(){
	    return driver.findElement(Site_Map).getText();	}

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

   // ABOUT
	public boolean ABOUT_DISPLAYED(){
	    return VerifyElement(ABOUT,"displayed","ABOUT");
	}
	public boolean ABOUT_ENABLED(){
	    return VerifyElement(ABOUT,"enabled","ABOUT");
	}
	public boolean ABOUT_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(ABOUT);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean ABOUT_MOVETOANDCLICK(){
	    return Element_Click(ABOUT, "moveToAndClick","ABOUT");
 	}
	public boolean ABOUT_CLICK_JAVASCRIPT(){
	    return Element_Click(ABOUT, "javaClick","ABOUT");
  	}
	public boolean ABOUT_CLICK(){
	    return Element_Click(ABOUT, "click","ABOUT");
  	}
	public String ABOUT_GETTEXT(){
	    return driver.findElement(ABOUT).getText();	}

   // Credit_Cards
	public boolean Credit_Cards_DISPLAYED(){
	    return VerifyElement(Credit_Cards,"displayed","Credit_Cards");
	}
	public boolean Credit_Cards_ENABLED(){
	    return VerifyElement(Credit_Cards,"enabled","Credit_Cards");
	}
	public boolean Credit_Cards_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Credit_Cards);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Credit_Cards_MOVETOANDCLICK(){
	    return Element_Click(Credit_Cards, "moveToAndClick","Credit_Cards");
 	}
	public boolean Credit_Cards_CLICK_JAVASCRIPT(){
	    return Element_Click(Credit_Cards, "javaClick","Credit_Cards");
  	}
	public boolean Credit_Cards_CLICK(){
	    return Element_Click(Credit_Cards, "click","Credit_Cards");
  	}
	public String Credit_Cards_GETTEXT(){
	    return driver.findElement(Credit_Cards).getText();	}

   // Business_Credit_Cards
	public boolean Business_Credit_Cards_DISPLAYED(){
	    return VerifyElement(Business_Credit_Cards,"displayed","Business_Credit_Cards");
	}
	public boolean Business_Credit_Cards_ENABLED(){
	    return VerifyElement(Business_Credit_Cards,"enabled","Business_Credit_Cards");
	}
	public boolean Business_Credit_Cards_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Business_Credit_Cards);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Business_Credit_Cards_MOVETOANDCLICK(){
	    return Element_Click(Business_Credit_Cards, "moveToAndClick","Business_Credit_Cards");
 	}
	public boolean Business_Credit_Cards_CLICK_JAVASCRIPT(){
	    return Element_Click(Business_Credit_Cards, "javaClick","Business_Credit_Cards");
  	}
	public boolean Business_Credit_Cards_CLICK(){
	    return Element_Click(Business_Credit_Cards, "click","Business_Credit_Cards");
  	}
	public String Business_Credit_Cards_GETTEXT(){
	    return driver.findElement(Business_Credit_Cards).getText();	}

   // Corporate_Programs
	public boolean Corporate_Programs_DISPLAYED(){
	    return VerifyElement(Corporate_Programs,"displayed","Corporate_Programs");
	}
	public boolean Corporate_Programs_ENABLED(){
	    return VerifyElement(Corporate_Programs,"enabled","Corporate_Programs");
	}
	public boolean Corporate_Programs_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Corporate_Programs);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Corporate_Programs_MOVETOANDCLICK(){
	    return Element_Click(Corporate_Programs, "moveToAndClick","Corporate_Programs");
 	}
	public boolean Corporate_Programs_CLICK_JAVASCRIPT(){
	    return Element_Click(Corporate_Programs, "javaClick","Corporate_Programs");
  	}
	public boolean Corporate_Programs_CLICK(){
	    return Element_Click(Corporate_Programs, "click","Corporate_Programs");
  	}
	public String Corporate_Programs_GETTEXT(){
	    return driver.findElement(Corporate_Programs).getText();	}

   // Prepaid_Cards
	public boolean Prepaid_Cards_DISPLAYED(){
	    return VerifyElement(Prepaid_Cards,"displayed","Prepaid_Cards");
	}
	public boolean Prepaid_Cards_ENABLED(){
	    return VerifyElement(Prepaid_Cards,"enabled","Prepaid_Cards");
	}
	public boolean Prepaid_Cards_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Prepaid_Cards);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Prepaid_Cards_MOVETOANDCLICK(){
	    return Element_Click(Prepaid_Cards, "moveToAndClick","Prepaid_Cards");
 	}
	public boolean Prepaid_Cards_CLICK_JAVASCRIPT(){
	    return Element_Click(Prepaid_Cards, "javaClick","Prepaid_Cards");
  	}
	public boolean Prepaid_Cards_CLICK(){
	    return Element_Click(Prepaid_Cards, "click","Prepaid_Cards");
  	}
	public String Prepaid_Cards_GETTEXT(){
	    return driver.findElement(Prepaid_Cards).getText();	}

   // Savings_Accounts_CDs
	public boolean Savings_Accounts_CDs_DISPLAYED(){
	    return VerifyElement(Savings_Accounts_CDs,"displayed","Savings_Accounts_CDs");
	}
	public boolean Savings_Accounts_CDs_ENABLED(){
	    return VerifyElement(Savings_Accounts_CDs,"enabled","Savings_Accounts_CDs");
	}
	public boolean Savings_Accounts_CDs_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Savings_Accounts_CDs);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Savings_Accounts_CDs_MOVETOANDCLICK(){
	    return Element_Click(Savings_Accounts_CDs, "moveToAndClick","Savings_Accounts_CDs");
 	}
	public boolean Savings_Accounts_CDs_CLICK_JAVASCRIPT(){
	    return Element_Click(Savings_Accounts_CDs, "javaClick","Savings_Accounts_CDs");
  	}
	public boolean Savings_Accounts_CDs_CLICK(){
	    return Element_Click(Savings_Accounts_CDs, "click","Savings_Accounts_CDs");
  	}
	public String Savings_Accounts_CDs_GETTEXT(){
	    return driver.findElement(Savings_Accounts_CDs).getText();	}

   // Gift_Cards
	public boolean Gift_Cards_DISPLAYED(){
	    return VerifyElement(Gift_Cards,"displayed","Gift_Cards");
	}
	public boolean Gift_Cards_ENABLED(){
	    return VerifyElement(Gift_Cards,"enabled","Gift_Cards");
	}
	public boolean Gift_Cards_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Gift_Cards);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Gift_Cards_MOVETOANDCLICK(){
	    return Element_Click(Gift_Cards, "moveToAndClick","Gift_Cards");
 	}
	public boolean Gift_Cards_CLICK_JAVASCRIPT(){
	    return Element_Click(Gift_Cards, "javaClick","Gift_Cards");
  	}
	public boolean Gift_Cards_CLICK(){
	    return Element_Click(Gift_Cards, "click","Gift_Cards");
  	}
	public String Gift_Cards_GETTEXT(){
	    return driver.findElement(Gift_Cards).getText();	}

   // PRODUCTS_SERVICES
	public boolean PRODUCTS_SERVICES_DISPLAYED(){
	    return VerifyElement(PRODUCTS_SERVICES,"displayed","PRODUCTS_SERVICES");
	}
	public boolean PRODUCTS_SERVICES_ENABLED(){
	    return VerifyElement(PRODUCTS_SERVICES,"enabled","PRODUCTS_SERVICES");
	}
	public boolean PRODUCTS_SERVICES_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(PRODUCTS_SERVICES);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean PRODUCTS_SERVICES_MOVETOANDCLICK(){
	    return Element_Click(PRODUCTS_SERVICES, "moveToAndClick","PRODUCTS_SERVICES");
 	}
	public boolean PRODUCTS_SERVICES_CLICK_JAVASCRIPT(){
	    return Element_Click(PRODUCTS_SERVICES, "javaClick","PRODUCTS_SERVICES");
  	}
	public boolean PRODUCTS_SERVICES_CLICK(){
	    return Element_Click(PRODUCTS_SERVICES, "click","PRODUCTS_SERVICES");
  	}
	public String PRODUCTS_SERVICES_GETTEXT(){
	    return driver.findElement(PRODUCTS_SERVICES).getText();	}

   // Free_Credit_Score_Report
	public boolean Free_Credit_Score_Report_DISPLAYED(){
	    return VerifyElement(Free_Credit_Score_Report,"displayed","Free_Credit_Score_Report");
	}
	public boolean Free_Credit_Score_Report_ENABLED(){
	    return VerifyElement(Free_Credit_Score_Report,"enabled","Free_Credit_Score_Report");
	}
	public boolean Free_Credit_Score_Report_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Free_Credit_Score_Report);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Free_Credit_Score_Report_MOVETOANDCLICK(){
	    return Element_Click(Free_Credit_Score_Report, "moveToAndClick","Free_Credit_Score_Report");
 	}
	public boolean Free_Credit_Score_Report_CLICK_JAVASCRIPT(){
	    return Element_Click(Free_Credit_Score_Report, "javaClick","Free_Credit_Score_Report");
  	}
	public boolean Free_Credit_Score_Report_CLICK(){
	    return Element_Click(Free_Credit_Score_Report, "click","Free_Credit_Score_Report");
  	}
	public String Free_Credit_Score_Report_GETTEXT(){
	    return driver.findElement(Free_Credit_Score_Report).getText();	}

   // CreditSecure
	public boolean CreditSecure_DISPLAYED(){
	    return VerifyElement(CreditSecure,"displayed","CreditSecure");
	}
	public boolean CreditSecure_ENABLED(){
	    return VerifyElement(CreditSecure,"enabled","CreditSecure");
	}
	public boolean CreditSecure_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(CreditSecure);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean CreditSecure_MOVETOANDCLICK(){
	    return Element_Click(CreditSecure, "moveToAndClick","CreditSecure");
 	}
	public boolean CreditSecure_CLICK_JAVASCRIPT(){
	    return Element_Click(CreditSecure, "javaClick","CreditSecure");
  	}
	public boolean CreditSecure_CLICK(){
	    return Element_Click(CreditSecure, "click","CreditSecure");
  	}
	public String CreditSecure_GETTEXT(){
	    return driver.findElement(CreditSecure).getText();	}

   // Bluebird
	public boolean Bluebird_DISPLAYED(){
	    return VerifyElement(Bluebird,"displayed","Bluebird");
	}
	public boolean Bluebird_ENABLED(){
	    return VerifyElement(Bluebird,"enabled","Bluebird");
	}
	public boolean Bluebird_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Bluebird);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Bluebird_MOVETOANDCLICK(){
	    return Element_Click(Bluebird, "moveToAndClick","Bluebird");
 	}
	public boolean Bluebird_CLICK_JAVASCRIPT(){
	    return Element_Click(Bluebird, "javaClick","Bluebird");
  	}
	public boolean Bluebird_CLICK(){
	    return Element_Click(Bluebird, "click","Bluebird");
  	}
	public String Bluebird_GETTEXT(){
	    return driver.findElement(Bluebird).getText();	}

   // Accept_Amex_Cards
	public boolean Accept_Amex_Cards_DISPLAYED(){
	    return VerifyElement(Accept_Amex_Cards,"displayed","Accept_Amex_Cards");
	}
	public boolean Accept_Amex_Cards_ENABLED(){
	    return VerifyElement(Accept_Amex_Cards,"enabled","Accept_Amex_Cards");
	}
	public boolean Accept_Amex_Cards_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Accept_Amex_Cards);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Accept_Amex_Cards_MOVETOANDCLICK(){
	    return Element_Click(Accept_Amex_Cards, "moveToAndClick","Accept_Amex_Cards");
 	}
	public boolean Accept_Amex_Cards_CLICK_JAVASCRIPT(){
	    return Element_Click(Accept_Amex_Cards, "javaClick","Accept_Amex_Cards");
  	}
	public boolean Accept_Amex_Cards_CLICK(){
	    return Element_Click(Accept_Amex_Cards, "click","Accept_Amex_Cards");
  	}
	public String Accept_Amex_Cards_GETTEXT(){
	    return driver.findElement(Accept_Amex_Cards).getText();	}

   // Refer_A_Friend
	public boolean Refer_A_Friend_DISPLAYED(){
	    return VerifyElement(Refer_A_Friend,"displayed","Refer_A_Friend");
	}
	public boolean Refer_A_Friend_ENABLED(){
	    return VerifyElement(Refer_A_Friend,"enabled","Refer_A_Friend");
	}
	public boolean Refer_A_Friend_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Refer_A_Friend);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Refer_A_Friend_MOVETOANDCLICK(){
	    return Element_Click(Refer_A_Friend, "moveToAndClick","Refer_A_Friend");
 	}
	public boolean Refer_A_Friend_CLICK_JAVASCRIPT(){
	    return Element_Click(Refer_A_Friend, "javaClick","Refer_A_Friend");
  	}
	public boolean Refer_A_Friend_CLICK(){
	    return Element_Click(Refer_A_Friend, "click","Refer_A_Friend");
  	}
	public String Refer_A_Friend_GETTEXT(){
	    return driver.findElement(Refer_A_Friend).getText();	}

   // LINKS_YOU_MAY_LIKE
	public boolean LINKS_YOU_MAY_LIKE_DISPLAYED(){
	    return VerifyElement(LINKS_YOU_MAY_LIKE,"displayed","LINKS_YOU_MAY_LIKE");
	}
	public boolean LINKS_YOU_MAY_LIKE_ENABLED(){
	    return VerifyElement(LINKS_YOU_MAY_LIKE,"enabled","LINKS_YOU_MAY_LIKE");
	}
	public boolean LINKS_YOU_MAY_LIKE_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(LINKS_YOU_MAY_LIKE);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean LINKS_YOU_MAY_LIKE_MOVETOANDCLICK(){
	    return Element_Click(LINKS_YOU_MAY_LIKE, "moveToAndClick","LINKS_YOU_MAY_LIKE");
 	}
	public boolean LINKS_YOU_MAY_LIKE_CLICK_JAVASCRIPT(){
	    return Element_Click(LINKS_YOU_MAY_LIKE, "javaClick","LINKS_YOU_MAY_LIKE");
  	}
	public boolean LINKS_YOU_MAY_LIKE_CLICK(){
	    return Element_Click(LINKS_YOU_MAY_LIKE, "click","LINKS_YOU_MAY_LIKE");
  	}
	public String LINKS_YOU_MAY_LIKE_GETTEXT(){
	    return driver.findElement(LINKS_YOU_MAY_LIKE).getText();	}

}