package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.SeleniumHelperBasic;

import org.openqa.selenium.interactions.Actions;


public class POM_APIPage extends SeleniumHelperBasic{

   //Variables
	private Actions action;
	public String PAGE_Title = "Overview - LiteDB :: A .NET embedded NoSQL database";
	public String PAGE_URL = "http://www.litedb.org/api/";

   //Constructor
	public POM_APIPage(WebDriver driver){
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
		ValidatePageTitle(PAGE_Title);
	}

   //Locators
	By Misc = By.xpath("//*[@class='docs-menu']/ul[1]/li[6]/a[1]");
	By Functions = By.xpath("//*[@class='docs-menu']/ul[1]/li[5]/a[1]");
	By UPDATE = By.xpath("//*[@class='docs-menu']/ul[1]/li[4]/a[1]");
	By INSERT = By.xpath("//*[@class='docs-menu']/ul[1]/li[3]/a[1]");
	By DELETE = By.xpath("//*[@class='docs-menu']/ul[1]/li[2]/a[1]");
	By SELECT = By.xpath("//*[@class='docs-menu']/ul[1]/li[1]/a[1]");
	By HOME = By.xpath("//*[@id='main-menu']/ul[1]/li[1]/a[1]");
	By DOCS = By.xpath("//*[@id='main-menu']/ul[1]/li[2]/a[1]");
	By API = By.xpath("//*[@id='main-menu']/ul[1]/li[3]/a[1]");
	By DOWNLOAD = By.xpath("//*[@id='main-menu']/ul[1]/li[4]/a[1]");

   //Methods

   // Misc
	public boolean Misc_DISPLAYED(){
	    return VerifyElement(Misc,"displayed","Misc");
	}
	public boolean Misc_ENABLED(){
	    return VerifyElement(Misc,"enabled","Misc");
	}
	public boolean Misc_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Misc);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Misc_MOVETOANDCLICK(){
	    return Element_Click(Misc, "moveToAndClick","Misc");
 	}
	public boolean Misc_CLICK_JAVASCRIPT(){
	    return Element_Click(Misc, "javaClick","Misc");
  	}
	public boolean Misc_CLICK(){
	    return Element_Click(Misc, "click","Misc");
  	}
	public String Misc_GETTEXT(){
	    return driver.findElement(Misc).getText();	}

   // Functions
	public boolean Functions_DISPLAYED(){
	    return VerifyElement(Functions,"displayed","Functions");
	}
	public boolean Functions_ENABLED(){
	    return VerifyElement(Functions,"enabled","Functions");
	}
	public boolean Functions_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Functions);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Functions_MOVETOANDCLICK(){
	    return Element_Click(Functions, "moveToAndClick","Functions");
 	}
	public boolean Functions_CLICK_JAVASCRIPT(){
	    return Element_Click(Functions, "javaClick","Functions");
  	}
	public boolean Functions_CLICK(){
	    return Element_Click(Functions, "click","Functions");
  	}
	public String Functions_GETTEXT(){
	    return driver.findElement(Functions).getText();	}

   // UPDATE
	public boolean UPDATE_DISPLAYED(){
	    return VerifyElement(UPDATE,"displayed","UPDATE");
	}
	public boolean UPDATE_ENABLED(){
	    return VerifyElement(UPDATE,"enabled","UPDATE");
	}
	public boolean UPDATE_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(UPDATE);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean UPDATE_MOVETOANDCLICK(){
	    return Element_Click(UPDATE, "moveToAndClick","UPDATE");
 	}
	public boolean UPDATE_CLICK_JAVASCRIPT(){
	    return Element_Click(UPDATE, "javaClick","UPDATE");
  	}
	public boolean UPDATE_CLICK(){
	    return Element_Click(UPDATE, "click","UPDATE");
  	}
	public String UPDATE_GETTEXT(){
	    return driver.findElement(UPDATE).getText();	}

   // INSERT
	public boolean INSERT_DISPLAYED(){
	    return VerifyElement(INSERT,"displayed","INSERT");
	}
	public boolean INSERT_ENABLED(){
	    return VerifyElement(INSERT,"enabled","INSERT");
	}
	public boolean INSERT_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(INSERT);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean INSERT_MOVETOANDCLICK(){
	    return Element_Click(INSERT, "moveToAndClick","INSERT");
 	}
	public boolean INSERT_CLICK_JAVASCRIPT(){
	    return Element_Click(INSERT, "javaClick","INSERT");
  	}
	public boolean INSERT_CLICK(){
	    return Element_Click(INSERT, "click","INSERT");
  	}
	public String INSERT_GETTEXT(){
	    return driver.findElement(INSERT).getText();	}

   // DELETE
	public boolean DELETE_DISPLAYED(){
	    return VerifyElement(DELETE,"displayed","DELETE");
	}
	public boolean DELETE_ENABLED(){
	    return VerifyElement(DELETE,"enabled","DELETE");
	}
	public boolean DELETE_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(DELETE);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean DELETE_MOVETOANDCLICK(){
	    return Element_Click(DELETE, "moveToAndClick","DELETE");
 	}
	public boolean DELETE_CLICK_JAVASCRIPT(){
	    return Element_Click(DELETE, "javaClick","DELETE");
  	}
	public boolean DELETE_CLICK(){
	    return Element_Click(DELETE, "click","DELETE");
  	}
	public String DELETE_GETTEXT(){
	    return driver.findElement(DELETE).getText();	}

   // SELECT
	public boolean SELECT_DISPLAYED(){
	    return VerifyElement(SELECT,"displayed","SELECT");
	}
	public boolean SELECT_ENABLED(){
	    return VerifyElement(SELECT,"enabled","SELECT");
	}
	public boolean SELECT_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(SELECT);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean SELECT_MOVETOANDCLICK(){
	    return Element_Click(SELECT, "moveToAndClick","SELECT");
 	}
	public boolean SELECT_CLICK_JAVASCRIPT(){
	    return Element_Click(SELECT, "javaClick","SELECT");
  	}
	public boolean SELECT_CLICK(){
	    return Element_Click(SELECT, "click","SELECT");
  	}
	public String SELECT_GETTEXT(){
	    return driver.findElement(SELECT).getText();	}

   // HOME
	public boolean HOME_DISPLAYED(){
	    return VerifyElement(HOME,"displayed","HOME");
	}
	public boolean HOME_ENABLED(){
	    return VerifyElement(HOME,"enabled","HOME");
	}
	public boolean HOME_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(HOME);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean HOME_MOVETOANDCLICK(){
	    return Element_Click(HOME, "moveToAndClick","HOME");
 	}
	public boolean HOME_CLICK_JAVASCRIPT(){
	    return Element_Click(HOME, "javaClick","HOME");
  	}
	public boolean HOME_CLICK(){
	    return Element_Click(HOME, "click","HOME");
  	}
	public String HOME_GETTEXT(){
	    return driver.findElement(HOME).getText();	}

   // DOCS
	public boolean DOCS_DISPLAYED(){
	    return VerifyElement(DOCS,"displayed","DOCS");
	}
	public boolean DOCS_ENABLED(){
	    return VerifyElement(DOCS,"enabled","DOCS");
	}
	public boolean DOCS_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(DOCS);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean DOCS_MOVETOANDCLICK(){
	    return Element_Click(DOCS, "moveToAndClick","DOCS");
 	}
	public boolean DOCS_CLICK_JAVASCRIPT(){
	    return Element_Click(DOCS, "javaClick","DOCS");
  	}
	public boolean DOCS_CLICK(){
	    return Element_Click(DOCS, "click","DOCS");
  	}
	public String DOCS_GETTEXT(){
	    return driver.findElement(DOCS).getText();	}

   // API
	public boolean API_DISPLAYED(){
	    return VerifyElement(API,"displayed","API");
	}
	public boolean API_ENABLED(){
	    return VerifyElement(API,"enabled","API");
	}
	public boolean API_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(API);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean API_MOVETOANDCLICK(){
	    return Element_Click(API, "moveToAndClick","API");
 	}
	public boolean API_CLICK_JAVASCRIPT(){
	    return Element_Click(API, "javaClick","API");
  	}
	public boolean API_CLICK(){
	    return Element_Click(API, "click","API");
  	}
	public String API_GETTEXT(){
	    return driver.findElement(API).getText();	}

   // DOWNLOAD
	public boolean DOWNLOAD_DISPLAYED(){
	    return VerifyElement(DOWNLOAD,"displayed","DOWNLOAD");
	}
	public boolean DOWNLOAD_ENABLED(){
	    return VerifyElement(DOWNLOAD,"enabled","DOWNLOAD");
	}
	public boolean DOWNLOAD_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(DOWNLOAD);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean DOWNLOAD_MOVETOANDCLICK(){
	    return Element_Click(DOWNLOAD, "moveToAndClick","DOWNLOAD");
 	}
	public boolean DOWNLOAD_CLICK_JAVASCRIPT(){
	    return Element_Click(DOWNLOAD, "javaClick","DOWNLOAD");
  	}
	public boolean DOWNLOAD_CLICK(){
	    return Element_Click(DOWNLOAD, "click","DOWNLOAD");
  	}
	public String DOWNLOAD_GETTEXT(){
	    return driver.findElement(DOWNLOAD).getText();	}

}