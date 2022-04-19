package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import utility.SeleniumHelperBasic;

public class POM_YourDeviceHasBeenVerifiedBluebirdTBD extends SeleniumHelperBasic{

   //Variables
	private Actions action;
	public String PAGE_Title = "Your Device Has Been Verified. - Bluebird";
	public String PAGE_URL = "https://secure.bluebird.com/one-time-password/success";

   //Constructor
	public POM_YourDeviceHasBeenVerifiedBluebirdTBD(WebDriver driver){
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}

   //Locators
	By Go_To_Home_Button = By.xpath("//button[@type='button']");
//	By Go_To_Home_Button = By.xpath("//button[@data-testid='success-page__primary-button']");
//	By Go_To_Home_Button = By.xpath("//button[@data-keyboard-focus='false']");
//	By Go_To_Home_Button = By.xpath("//*[contains(text(),'Go To Home')]");
//	By Go_To_Home_Button = By.xpath("//button[text()[contains(.,'Go')]]");
//	By Go_To_Home_Button = By.xpath("//button[text()[contains(.,'Go To')]]");
//	By Go_To_Home_Button = By.xpath("//button[text()[contains(.,'Go To Home')]]");
//	By Go_To_Home_Button = By.xpath("//*[@class='success-page__content-wrapper success-page__content-wrapper-slim']/div[2]/button");
//	By Go_To_Home_Button = By.xpath("//*[@class='success-page success-page__container success-page--light fade-enter-done']/div/div[2]/button");
//	By Go_To_Home_Button = By.xpath("//*[@id='main']/div/div[1]/div/div[2]/button");
//	By Go_To_Home_Button = By.xpath("//html/body[1]/div[1]/div/div[2]/div/div[1]/div/div[2]/button");


   //Methods

   // Go_To_Home_Button
	public boolean Go_To_Home_Button_DISPLAYED(){
	    return VerifyElement(Go_To_Home_Button,"displayed","Go_To_Home_Button");
	}
	public boolean Go_To_Home_Button_ENABLED(){
	    return VerifyElement(Go_To_Home_Button,"enabled","Go_To_Home_Button");
	}
	public boolean Go_To_Home_Button_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Go_To_Home_Button);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Go_To_Home_Button_MOVETOANDCLICK(){
	    return Element_Click(Go_To_Home_Button, "moveToAndClick","Go_To_Home_Button");
 	}
	public boolean Go_To_Home_Button_CLICK_JAVASCRIPT(){
	    return Element_Click(Go_To_Home_Button, "javaClick","Go_To_Home_Button");
  	}
	public boolean Go_To_Home_Button_CLICK(){
	    return Element_Click(Go_To_Home_Button, "click","Go_To_Home_Button");
  	}
	public String Go_To_Home_Button_GETTEXT(){
	    return driver.findElement(Go_To_Home_Button).getText();	}

}