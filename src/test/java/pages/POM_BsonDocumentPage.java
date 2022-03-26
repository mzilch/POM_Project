package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import utility.SeleniumHelperBasic;

public class POM_BsonDocumentPage extends SeleniumHelperBasic{

   //Variables
	private Actions action;
	public String PAGE_Title = "BsonDocument - LiteDB :: A .NET embedded NoSQL database";
	public String PAGE_URL = "http://www.litedb.org/docs/bsondocument/";

   //Constructor
	public POM_BsonDocumentPage(WebDriver driver){
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
		ValidatePageTitle(PAGE_Title);
	}

   //Locators
	By Getting_Started = By.xpath("//*[@class='docs-menu']/ul[1]/li[1]/a[1]");
	By Data_Structure = By.xpath("//*[@class='docs-menu']/ul[1]/li[2]/a[1]");
	By Object_Mapping = By.xpath("//*[@class='docs-menu']/ul[1]/li[3]/a[1]");
	By mbdavid = By.xpath("//*[@class='sub-footer-inner']/ul[1]/li[1]/a[1]");
	By Duplicate_keys_are_not_allowed = By.xpath("//*[@class='content']/ul[1]/li[2]");

   //Methods

   // Getting_Started
	public boolean Getting_Started_DISPLAYED(){
	    return VerifyElement(Getting_Started,"displayed","Getting_Started");
	}
	public boolean Getting_Started_ENABLED(){
	    return VerifyElement(Getting_Started,"enabled","Getting_Started");
	}
	public boolean Getting_Started_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Getting_Started);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Getting_Started_MOVETOANDCLICK(){
	    return Element_Click(Getting_Started, "moveToAndClick","Getting_Started");
 	}
	public boolean Getting_Started_CLICK_JAVASCRIPT(){
	    return Element_Click(Getting_Started, "javaClick","Getting_Started");
  	}
	public boolean Getting_Started_CLICK(){
	    return Element_Click(Getting_Started, "click","Getting_Started");
  	}
	public String Getting_Started_GETTEXT(){
	    return driver.findElement(Getting_Started).getText();	}

   // Data_Structure
	public boolean Data_Structure_DISPLAYED(){
	    return VerifyElement(Data_Structure,"displayed","Data_Structure");
	}
	public boolean Data_Structure_ENABLED(){
	    return VerifyElement(Data_Structure,"enabled","Data_Structure");
	}
	public boolean Data_Structure_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Data_Structure);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Data_Structure_MOVETOANDCLICK(){
	    return Element_Click(Data_Structure, "moveToAndClick","Data_Structure");
 	}
	public boolean Data_Structure_CLICK_JAVASCRIPT(){
	    return Element_Click(Data_Structure, "javaClick","Data_Structure");
  	}
	public boolean Data_Structure_CLICK(){
	    return Element_Click(Data_Structure, "click","Data_Structure");
  	}
	public String Data_Structure_GETTEXT(){
	    return driver.findElement(Data_Structure).getText();	}

   // Object_Mapping
	public boolean Object_Mapping_DISPLAYED(){
	    return VerifyElement(Object_Mapping,"displayed","Object_Mapping");
	}
	public boolean Object_Mapping_ENABLED(){
	    return VerifyElement(Object_Mapping,"enabled","Object_Mapping");
	}
	public boolean Object_Mapping_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Object_Mapping);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Object_Mapping_MOVETOANDCLICK(){
	    return Element_Click(Object_Mapping, "moveToAndClick","Object_Mapping");
 	}
	public boolean Object_Mapping_CLICK_JAVASCRIPT(){
	    return Element_Click(Object_Mapping, "javaClick","Object_Mapping");
  	}
	public boolean Object_Mapping_CLICK(){
	    return Element_Click(Object_Mapping, "click","Object_Mapping");
  	}
	public String Object_Mapping_GETTEXT(){
	    return driver.findElement(Object_Mapping).getText();	}

   // mbdavid
	public boolean mbdavid_DISPLAYED(){
	    return VerifyElement(mbdavid,"displayed","mbdavid");
	}
	public boolean mbdavid_ENABLED(){
	    return VerifyElement(mbdavid,"enabled","mbdavid");
	}
	public boolean mbdavid_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(mbdavid);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean mbdavid_MOVETOANDCLICK(){
	    return Element_Click(mbdavid, "moveToAndClick","mbdavid");
 	}
	public boolean mbdavid_CLICK_JAVASCRIPT(){
	    return Element_Click(mbdavid, "javaClick","mbdavid");
  	}
	public boolean mbdavid_CLICK(){
	    return Element_Click(mbdavid, "click","mbdavid");
  	}
	public String mbdavid_GETTEXT(){
	    return driver.findElement(mbdavid).getText();	}

   // Duplicate_keys_are_not_allowed
	public boolean Duplicate_keys_are_not_allowed_DISPLAYED(){
	    return VerifyElement(Duplicate_keys_are_not_allowed,"displayed","Duplicate_keys_are_not_allowed");
	}
	public boolean Duplicate_keys_are_not_allowed_ENABLED(){
	    return VerifyElement(Duplicate_keys_are_not_allowed,"enabled","Duplicate_keys_are_not_allowed");
	}
	public boolean Duplicate_keys_are_not_allowed_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Duplicate_keys_are_not_allowed);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Duplicate_keys_are_not_allowed_MOVETOANDCLICK(){
	    return Element_Click(Duplicate_keys_are_not_allowed, "moveToAndClick","Duplicate_keys_are_not_allowed");
 	}
	public boolean Duplicate_keys_are_not_allowed_CLICK_JAVASCRIPT(){
	    return Element_Click(Duplicate_keys_are_not_allowed, "javaClick","Duplicate_keys_are_not_allowed");
  	}
	public boolean Duplicate_keys_are_not_allowed_CLICK(){
	    return Element_Click(Duplicate_keys_are_not_allowed, "click","Duplicate_keys_are_not_allowed");
  	}
	public String Duplicate_keys_are_not_allowed_GETTEXT(){
	    return driver.findElement(Duplicate_keys_are_not_allowed).getText();	}

}