package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import utility.SeleniumHelperBasic;

public class POM_PNCSmallBusinessPage extends SeleniumHelperBasic{

   //Variables
	private Actions action;
	public String PAGE_Title = "SMALL BUSINESS BANKING | PNC";
	public String PAGE_URL = "https://www.pnc.com/en/small-business.html?lnksrc=topnav";

   //Constructor
	public POM_PNCSmallBusinessPage(WebDriver driver){
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}

   //Locators
	By PRODUCTS_SERVICES = By.xpath("//span[contains(text(),'Products & Services')]");
	By Business_Checking = By.xpath("//a[@href='/en/small-business/banking/business-checking-overview.html?lnksrc=topnav']");
	By Online_Mobile_Services = By.xpath("//a[@href='/en/small-business/banking/online-business-services.html?lnksrc=topnav']");
	By Cash_Flow_Insight = By.xpath("//a[@href='/en/small-business/banking/CashFlowInsight.html?lnksrc=topnav']");
	By Business_Credit_Cards = By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/span[1]");
	By Savings = By.xpath("//a[@href='/en/small-business/banking/savings-and-liquidity-management.html?lnksrc=topnav']");
	By LEARNING = By.xpath("//span[contains(text(),'Learning')]");
	By Starting_Your_Business = By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[1]");
	By Supplier_Diversity_Program = By.xpath("//span[contains(text(),'Supplier Diversity Program')]");
	By Managing_Your_Businesss_Finances = By.xpath("//a[@href='/insights/small-business/manage-business-finances.html?lnksrc=topnav']");
	By Running_Your_Business = By.xpath("//a[@href='/insights/small-business/running-your-business.html?lnksrc=topnav']");
	By Growing_Your_Business = By.xpath("//a[@href='/insights/small-business/growing-your-business.html?lnksrc=topnav']");
	By Business_Planning = By.xpath("//*[contains(text(),'Business Planning')]");
	By Corporate_Institutional = By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]/span[1]");

   //Methods

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

   // Business_Checking
	public boolean Business_Checking_DISPLAYED(){
	    return VerifyElement(Business_Checking,"displayed","Business_Checking");
	}
	public boolean Business_Checking_ENABLED(){
	    return VerifyElement(Business_Checking,"enabled","Business_Checking");
	}
	public boolean Business_Checking_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Business_Checking);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Business_Checking_MOVETOANDCLICK(){
	    return Element_Click(Business_Checking, "moveToAndClick","Business_Checking");
 	}
	public boolean Business_Checking_CLICK_JAVASCRIPT(){
	    return Element_Click(Business_Checking, "javaClick","Business_Checking");
  	}
	public boolean Business_Checking_CLICK(){
	    return Element_Click(Business_Checking, "click","Business_Checking");
  	}
	public String Business_Checking_GETTEXT(){
	    return driver.findElement(Business_Checking).getText();	}

   // Online_Mobile_Services
	public boolean Online_Mobile_Services_DISPLAYED(){
	    return VerifyElement(Online_Mobile_Services,"displayed","Online_Mobile_Services");
	}
	public boolean Online_Mobile_Services_ENABLED(){
	    return VerifyElement(Online_Mobile_Services,"enabled","Online_Mobile_Services");
	}
	public boolean Online_Mobile_Services_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Online_Mobile_Services);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Online_Mobile_Services_MOVETOANDCLICK(){
	    return Element_Click(Online_Mobile_Services, "moveToAndClick","Online_Mobile_Services");
 	}
	public boolean Online_Mobile_Services_CLICK_JAVASCRIPT(){
	    return Element_Click(Online_Mobile_Services, "javaClick","Online_Mobile_Services");
  	}
	public boolean Online_Mobile_Services_CLICK(){
	    return Element_Click(Online_Mobile_Services, "click","Online_Mobile_Services");
  	}
	public String Online_Mobile_Services_GETTEXT(){
	    return driver.findElement(Online_Mobile_Services).getText();	}

   // Cash_Flow_Insight
	public boolean Cash_Flow_Insight_DISPLAYED(){
	    return VerifyElement(Cash_Flow_Insight,"displayed","Cash_Flow_Insight");
	}
	public boolean Cash_Flow_Insight_ENABLED(){
	    return VerifyElement(Cash_Flow_Insight,"enabled","Cash_Flow_Insight");
	}
	public boolean Cash_Flow_Insight_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Cash_Flow_Insight);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Cash_Flow_Insight_MOVETOANDCLICK(){
	    return Element_Click(Cash_Flow_Insight, "moveToAndClick","Cash_Flow_Insight");
 	}
	public boolean Cash_Flow_Insight_CLICK_JAVASCRIPT(){
	    return Element_Click(Cash_Flow_Insight, "javaClick","Cash_Flow_Insight");
  	}
	public boolean Cash_Flow_Insight_CLICK(){
	    return Element_Click(Cash_Flow_Insight, "click","Cash_Flow_Insight");
  	}
	public String Cash_Flow_Insight_GETTEXT(){
	    return driver.findElement(Cash_Flow_Insight).getText();	}

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

   // Savings
	public boolean Savings_DISPLAYED(){
	    return VerifyElement(Savings,"displayed","Savings");
	}
	public boolean Savings_ENABLED(){
	    return VerifyElement(Savings,"enabled","Savings");
	}
	public boolean Savings_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Savings);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Savings_MOVETOANDCLICK(){
	    return Element_Click(Savings, "moveToAndClick","Savings");
 	}
	public boolean Savings_CLICK_JAVASCRIPT(){
	    return Element_Click(Savings, "javaClick","Savings");
  	}
	public boolean Savings_CLICK(){
	    return Element_Click(Savings, "click","Savings");
  	}
	public String Savings_GETTEXT(){
	    return driver.findElement(Savings).getText();	}

   // LEARNING
	public boolean LEARNING_DISPLAYED(){
	    return VerifyElement(LEARNING,"displayed","LEARNING");
	}
	public boolean LEARNING_ENABLED(){
	    return VerifyElement(LEARNING,"enabled","LEARNING");
	}
	public boolean LEARNING_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(LEARNING);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean LEARNING_MOVETOANDCLICK(){
	    return Element_Click(LEARNING, "moveToAndClick","LEARNING");
 	}
	public boolean LEARNING_CLICK_JAVASCRIPT(){
	    return Element_Click(LEARNING, "javaClick","LEARNING");
  	}
	public boolean LEARNING_CLICK(){
	    return Element_Click(LEARNING, "click","LEARNING");
  	}
	public String LEARNING_GETTEXT(){
	    return driver.findElement(LEARNING).getText();	}

   // Starting_Your_Business
	public boolean Starting_Your_Business_DISPLAYED(){
	    return VerifyElement(Starting_Your_Business,"displayed","Starting_Your_Business");
	}
	public boolean Starting_Your_Business_ENABLED(){
	    return VerifyElement(Starting_Your_Business,"enabled","Starting_Your_Business");
	}
	public boolean Starting_Your_Business_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Starting_Your_Business);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Starting_Your_Business_MOVETOANDCLICK(){
	    return Element_Click(Starting_Your_Business, "moveToAndClick","Starting_Your_Business");
 	}
	public boolean Starting_Your_Business_CLICK_JAVASCRIPT(){
	    return Element_Click(Starting_Your_Business, "javaClick","Starting_Your_Business");
  	}
	public boolean Starting_Your_Business_CLICK(){
	    return Element_Click(Starting_Your_Business, "click","Starting_Your_Business");
  	}
	public String Starting_Your_Business_GETTEXT(){
	    return driver.findElement(Starting_Your_Business).getText();	}

   // Supplier_Diversity_Program
	public boolean Supplier_Diversity_Program_DISPLAYED(){
	    return VerifyElement(Supplier_Diversity_Program,"displayed","Supplier_Diversity_Program");
	}
	public boolean Supplier_Diversity_Program_ENABLED(){
	    return VerifyElement(Supplier_Diversity_Program,"enabled","Supplier_Diversity_Program");
	}
	public boolean Supplier_Diversity_Program_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Supplier_Diversity_Program);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Supplier_Diversity_Program_MOVETOANDCLICK(){
	    return Element_Click(Supplier_Diversity_Program, "moveToAndClick","Supplier_Diversity_Program");
 	}
	public boolean Supplier_Diversity_Program_CLICK_JAVASCRIPT(){
	    return Element_Click(Supplier_Diversity_Program, "javaClick","Supplier_Diversity_Program");
  	}
	public boolean Supplier_Diversity_Program_CLICK(){
	    return Element_Click(Supplier_Diversity_Program, "click","Supplier_Diversity_Program");
  	}
	public String Supplier_Diversity_Program_GETTEXT(){
	    return driver.findElement(Supplier_Diversity_Program).getText();	}

   // Managing_Your_Businesss_Finances
	public boolean Managing_Your_Businesss_Finances_DISPLAYED(){
	    return VerifyElement(Managing_Your_Businesss_Finances,"displayed","Managing_Your_Businesss_Finances");
	}
	public boolean Managing_Your_Businesss_Finances_ENABLED(){
	    return VerifyElement(Managing_Your_Businesss_Finances,"enabled","Managing_Your_Businesss_Finances");
	}
	public boolean Managing_Your_Businesss_Finances_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Managing_Your_Businesss_Finances);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Managing_Your_Businesss_Finances_MOVETOANDCLICK(){
	    return Element_Click(Managing_Your_Businesss_Finances, "moveToAndClick","Managing_Your_Businesss_Finances");
 	}
	public boolean Managing_Your_Businesss_Finances_CLICK_JAVASCRIPT(){
	    return Element_Click(Managing_Your_Businesss_Finances, "javaClick","Managing_Your_Businesss_Finances");
  	}
	public boolean Managing_Your_Businesss_Finances_CLICK(){
	    return Element_Click(Managing_Your_Businesss_Finances, "click","Managing_Your_Businesss_Finances");
  	}
	public String Managing_Your_Businesss_Finances_GETTEXT(){
	    return driver.findElement(Managing_Your_Businesss_Finances).getText();	}

   // Running_Your_Business
	public boolean Running_Your_Business_DISPLAYED(){
	    return VerifyElement(Running_Your_Business,"displayed","Running_Your_Business");
	}
	public boolean Running_Your_Business_ENABLED(){
	    return VerifyElement(Running_Your_Business,"enabled","Running_Your_Business");
	}
	public boolean Running_Your_Business_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Running_Your_Business);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Running_Your_Business_MOVETOANDCLICK(){
	    return Element_Click(Running_Your_Business, "moveToAndClick","Running_Your_Business");
 	}
	public boolean Running_Your_Business_CLICK_JAVASCRIPT(){
	    return Element_Click(Running_Your_Business, "javaClick","Running_Your_Business");
  	}
	public boolean Running_Your_Business_CLICK(){
	    return Element_Click(Running_Your_Business, "click","Running_Your_Business");
  	}
	public String Running_Your_Business_GETTEXT(){
	    return driver.findElement(Running_Your_Business).getText();	}

   // Growing_Your_Business
	public boolean Growing_Your_Business_DISPLAYED(){
	    return VerifyElement(Growing_Your_Business,"displayed","Growing_Your_Business");
	}
	public boolean Growing_Your_Business_ENABLED(){
	    return VerifyElement(Growing_Your_Business,"enabled","Growing_Your_Business");
	}
	public boolean Growing_Your_Business_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Growing_Your_Business);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Growing_Your_Business_MOVETOANDCLICK(){
	    return Element_Click(Growing_Your_Business, "moveToAndClick","Growing_Your_Business");
 	}
	public boolean Growing_Your_Business_CLICK_JAVASCRIPT(){
	    return Element_Click(Growing_Your_Business, "javaClick","Growing_Your_Business");
  	}
	public boolean Growing_Your_Business_CLICK(){
	    return Element_Click(Growing_Your_Business, "click","Growing_Your_Business");
  	}
	public String Growing_Your_Business_GETTEXT(){
	    return driver.findElement(Growing_Your_Business).getText();	}

   // Business_Planning
	public boolean Business_Planning_DISPLAYED(){
	    return VerifyElement(Business_Planning,"displayed","Business_Planning");
	}
	public boolean Business_Planning_ENABLED(){
	    return VerifyElement(Business_Planning,"enabled","Business_Planning");
	}
	public boolean Business_Planning_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Business_Planning);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Business_Planning_MOVETOANDCLICK(){
	    return Element_Click(Business_Planning, "moveToAndClick","Business_Planning");
 	}
	public boolean Business_Planning_CLICK_JAVASCRIPT(){
	    return Element_Click(Business_Planning, "javaClick","Business_Planning");
  	}
	public boolean Business_Planning_CLICK(){
	    return Element_Click(Business_Planning, "click","Business_Planning");
  	}
	public String Business_Planning_GETTEXT(){
	    return driver.findElement(Business_Planning).getText();	}

   // Corporate_Institutional
	public boolean Corporate_Institutional_DISPLAYED(){
	    return VerifyElement(Corporate_Institutional,"displayed","Corporate_Institutional");
	}
	public boolean Corporate_Institutional_ENABLED(){
	    return VerifyElement(Corporate_Institutional,"enabled","Corporate_Institutional");
	}
	public boolean Corporate_Institutional_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Corporate_Institutional);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Corporate_Institutional_MOVETOANDCLICK(){
	    return Element_Click(Corporate_Institutional, "moveToAndClick","Corporate_Institutional");
 	}
	public boolean Corporate_Institutional_CLICK_JAVASCRIPT(){
	    return Element_Click(Corporate_Institutional, "javaClick","Corporate_Institutional");
  	}
	public boolean Corporate_Institutional_CLICK(){
	    return Element_Click(Corporate_Institutional, "click","Corporate_Institutional");
  	}
	public String Corporate_Institutional_GETTEXT(){
	    return driver.findElement(Corporate_Institutional).getText();	}

}