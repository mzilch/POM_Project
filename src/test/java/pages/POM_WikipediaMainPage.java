package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import utility.SeleniumHelperBasic;

public class POM_WikipediaMainPage extends SeleniumHelperBasic{

   //Variables
	private Actions action;
	public String PAGE_Title = "Wikipedia, the free encyclopedia";
	public String PAGE_URL = "https://en.wikipedia.org/wiki/Main_Page";

   //Constructor
	public POM_WikipediaMainPage(WebDriver driver){
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}

   //Locators
	By Main_page = By.xpath("//a[@title='Visit the main page [alt-shift-z]']");
	By Contents = By.xpath("//a[@title='Guides to browsing Wikipedia']");
	By Current_events = By.xpath("//a[@title='Articles related to current events']");
	By Random_article = By.xpath("//a[@href='/wiki/Special:Random']");
	By Donate_to_Wikipedia = By.xpath("//a[@href='https://donate.wikimedia.org/wiki/Special:FundraiserRedirector?utm_source=donate&utm_medium=sidebar&utm_campaign=C13_en.wikipedia.org&uselang=en']");
	By AboutWikipedia = By.xpath("//a[@title='Learn about Wikipedia and how it works']");

   //Methods

   // Main_page
	public boolean Main_page_DISPLAYED(){
	    return VerifyElement(Main_page,"displayed","Main_page");
	}
	public boolean Main_page_ENABLED(){
	    return VerifyElement(Main_page,"enabled","Main_page");
	}
	public boolean Main_page_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Main_page);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Main_page_MOVETOANDCLICK(){
	    return Element_Click(Main_page, "moveToAndClick","Main_page");
 	}
	public boolean Main_page_CLICK_JAVASCRIPT(){
	    return Element_Click(Main_page, "javaClick","Main_page");
  	}
	public boolean Main_page_CLICK(){
	    return Element_Click(Main_page, "click","Main_page");
  	}
	public String Main_page_GETTEXT(){
	    return driver.findElement(Main_page).getText();	}

   // Contents
	public boolean Contents_DISPLAYED(){
	    return VerifyElement(Contents,"displayed","Contents");
	}
	public boolean Contents_ENABLED(){
	    return VerifyElement(Contents,"enabled","Contents");
	}
	public boolean Contents_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Contents);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Contents_MOVETOANDCLICK(){
	    return Element_Click(Contents, "moveToAndClick","Contents");
 	}
	public boolean Contents_CLICK_JAVASCRIPT(){
	    return Element_Click(Contents, "javaClick","Contents");
  	}
	public boolean Contents_CLICK(){
	    return Element_Click(Contents, "click","Contents");
  	}
	public String Contents_GETTEXT(){
	    return driver.findElement(Contents).getText();	}

   // Current_events
	public boolean Current_events_DISPLAYED(){
	    return VerifyElement(Current_events,"displayed","Current_events");
	}
	public boolean Current_events_ENABLED(){
	    return VerifyElement(Current_events,"enabled","Current_events");
	}
	public boolean Current_events_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Current_events);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Current_events_MOVETOANDCLICK(){
	    return Element_Click(Current_events, "moveToAndClick","Current_events");
 	}
	public boolean Current_events_CLICK_JAVASCRIPT(){
	    return Element_Click(Current_events, "javaClick","Current_events");
  	}
	public boolean Current_events_CLICK(){
	    return Element_Click(Current_events, "click","Current_events");
  	}
	public String Current_events_GETTEXT(){
	    return driver.findElement(Current_events).getText();	}

   // Random_article
	public boolean Random_article_DISPLAYED(){
	    return VerifyElement(Random_article,"displayed","Random_article");
	}
	public boolean Random_article_ENABLED(){
	    return VerifyElement(Random_article,"enabled","Random_article");
	}
	public boolean Random_article_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Random_article);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Random_article_MOVETOANDCLICK(){
	    return Element_Click(Random_article, "moveToAndClick","Random_article");
 	}
	public boolean Random_article_CLICK_JAVASCRIPT(){
	    return Element_Click(Random_article, "javaClick","Random_article");
  	}
	public boolean Random_article_CLICK(){
	    return Element_Click(Random_article, "click","Random_article");
  	}
	public String Random_article_GETTEXT(){
	    return driver.findElement(Random_article).getText();	}

   // Donate_to_Wikipedia
	public boolean Donate_to_Wikipedia_DISPLAYED(){
	    return VerifyElement(Donate_to_Wikipedia,"displayed","Donate_to_Wikipedia");
	}
	public boolean Donate_to_Wikipedia_ENABLED(){
	    return VerifyElement(Donate_to_Wikipedia,"enabled","Donate_to_Wikipedia");
	}
	public boolean Donate_to_Wikipedia_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Donate_to_Wikipedia);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Donate_to_Wikipedia_MOVETOANDCLICK(){
	    return Element_Click(Donate_to_Wikipedia, "moveToAndClick","Donate_to_Wikipedia");
 	}
	public boolean Donate_to_Wikipedia_CLICK_JAVASCRIPT(){
	    return Element_Click(Donate_to_Wikipedia, "javaClick","Donate_to_Wikipedia");
  	}
	public boolean Donate_to_Wikipedia_CLICK(){
	    return Element_Click(Donate_to_Wikipedia, "click","Donate_to_Wikipedia");
  	}
	public String Donate_to_Wikipedia_GETTEXT(){
	    return driver.findElement(Donate_to_Wikipedia).getText();	}

   // AboutWikipedia
	public boolean AboutWikipedia_DISPLAYED(){
	    return VerifyElement(AboutWikipedia,"displayed","AboutWikipedia");
	}
	public boolean AboutWikipedia_ENABLED(){
	    return VerifyElement(AboutWikipedia,"enabled","AboutWikipedia");
	}
	public boolean AboutWikipedia_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(AboutWikipedia);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean AboutWikipedia_MOVETOANDCLICK(){
	    return Element_Click(AboutWikipedia, "moveToAndClick","AboutWikipedia");
 	}
	public boolean AboutWikipedia_CLICK_JAVASCRIPT(){
	    return Element_Click(AboutWikipedia, "javaClick","AboutWikipedia");
  	}
	public boolean AboutWikipedia_CLICK(){
	    return Element_Click(AboutWikipedia, "click","AboutWikipedia");
  	}
	public String AboutWikipedia_GETTEXT(){
	    return driver.findElement(AboutWikipedia).getText();	}

}