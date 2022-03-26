package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import utility.SeleniumHelperBasic;

public class POM_HomePage extends SeleniumHelperBasic{

   //Variables
	private Actions action;
	public String PAGE_Title = "LiteDB :: A .NET embedded NoSQL database";
	public String PAGE_URL = "http://www.litedb.org/";

   //Constructor
	public POM_HomePage(WebDriver driver){
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
		ValidatePageTitle(PAGE_Title);
	}

   //Locators
	By _Github = By.xpath("//a[@href='https://github.com/mbdavid/LiteDB/issues']");
	By _Gitter = By.xpath("//a[@href='https://gitter.im/mbdavid/LiteDB']");
	By _StackOverflow = By.xpath("//*[contains(text(),'StackOverflow')]");
	By _few_questions_about_how_you_use_LiteDB = By.xpath("//a[@href='https://docs.google.com/forms/d/e/1FAIpQLSc4cNG7wyLKXXcOLIt7Ea4TlXCG6s-51_EfHPu2p5WZ2dIx7A/viewform?usp=sf_link']");
	By _Twitter = By.xpath("//*[contains(text(),'Twitter')]");

   //Methods

   // _Github
	public boolean _Github_DISPLAYED(){
	    return VerifyElement(_Github,"displayed","_Github");
	}
	public boolean _Github_ENABLED(){
	    return VerifyElement(_Github,"enabled","_Github");
	}
	public boolean _Github_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(_Github);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean _Github_MOVETOANDCLICK(){
	    return Element_Click(_Github, "moveToAndClick","_Github");
 	}
	public boolean _Github_CLICK_JAVASCRIPT(){
	    return Element_Click(_Github, "javaClick","_Github");
  	}
	public boolean _Github_CLICK(){
	    return Element_Click(_Github, "click","_Github");
  	}
	public String _Github_GETTEXT(){
	    return driver.findElement(_Github).getText();	}

   // _Gitter
	public boolean _Gitter_DISPLAYED(){
	    return VerifyElement(_Gitter,"displayed","_Gitter");
	}
	public boolean _Gitter_ENABLED(){
	    return VerifyElement(_Gitter,"enabled","_Gitter");
	}
	public boolean _Gitter_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(_Gitter);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean _Gitter_MOVETOANDCLICK(){
	    return Element_Click(_Gitter, "moveToAndClick","_Gitter");
 	}
	public boolean _Gitter_CLICK_JAVASCRIPT(){
	    return Element_Click(_Gitter, "javaClick","_Gitter");
  	}
	public boolean _Gitter_CLICK(){
	    return Element_Click(_Gitter, "click","_Gitter");
  	}
	public String _Gitter_GETTEXT(){
	    return driver.findElement(_Gitter).getText();	}

   // _StackOverflow
	public boolean _StackOverflow_DISPLAYED(){
	    return VerifyElement(_StackOverflow,"displayed","_StackOverflow");
	}
	public boolean _StackOverflow_ENABLED(){
	    return VerifyElement(_StackOverflow,"enabled","_StackOverflow");
	}
	public boolean _StackOverflow_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(_StackOverflow);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean _StackOverflow_MOVETOANDCLICK(){
	    return Element_Click(_StackOverflow, "moveToAndClick","_StackOverflow");
 	}
	public boolean _StackOverflow_CLICK_JAVASCRIPT(){
	    return Element_Click(_StackOverflow, "javaClick","_StackOverflow");
  	}
	public boolean _StackOverflow_CLICK(){
	    return Element_Click(_StackOverflow, "click","_StackOverflow");
  	}
	public String _StackOverflow_GETTEXT(){
	    return driver.findElement(_StackOverflow).getText();	}

   // _few_questions_about_how_you_use_LiteDB
	public boolean _few_questions_about_how_you_use_LiteDB_DISPLAYED(){
	    return VerifyElement(_few_questions_about_how_you_use_LiteDB,"displayed","_few_questions_about_how_you_use_LiteDB");
	}
	public boolean _few_questions_about_how_you_use_LiteDB_ENABLED(){
	    return VerifyElement(_few_questions_about_how_you_use_LiteDB,"enabled","_few_questions_about_how_you_use_LiteDB");
	}
	public boolean _few_questions_about_how_you_use_LiteDB_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(_few_questions_about_how_you_use_LiteDB);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean _few_questions_about_how_you_use_LiteDB_MOVETOANDCLICK(){
	    return Element_Click(_few_questions_about_how_you_use_LiteDB, "moveToAndClick","_few_questions_about_how_you_use_LiteDB");
 	}
	public boolean _few_questions_about_how_you_use_LiteDB_CLICK_JAVASCRIPT(){
	    return Element_Click(_few_questions_about_how_you_use_LiteDB, "javaClick","_few_questions_about_how_you_use_LiteDB");
  	}
	public boolean _few_questions_about_how_you_use_LiteDB_CLICK(){
	    return Element_Click(_few_questions_about_how_you_use_LiteDB, "click","_few_questions_about_how_you_use_LiteDB");
  	}
	public String _few_questions_about_how_you_use_LiteDB_GETTEXT(){
	    return driver.findElement(_few_questions_about_how_you_use_LiteDB).getText();	}

   // _Twitter
	public boolean _Twitter_DISPLAYED(){
	    return VerifyElement(_Twitter,"displayed","_Twitter");
	}
	public boolean _Twitter_ENABLED(){
	    return VerifyElement(_Twitter,"enabled","_Twitter");
	}
	public boolean _Twitter_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(_Twitter);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean _Twitter_MOVETOANDCLICK(){
	    return Element_Click(_Twitter, "moveToAndClick","_Twitter");
 	}
	public boolean _Twitter_CLICK_JAVASCRIPT(){
	    return Element_Click(_Twitter, "javaClick","_Twitter");
  	}
	public boolean _Twitter_CLICK(){
	    return Element_Click(_Twitter, "click","_Twitter");
  	}
	public String _Twitter_GETTEXT(){
	    return driver.findElement(_Twitter).getText();	}

}