package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import utility.SeleniumHelperBasic;

public class POM_OneTimePasswordBluebirdTBD extends SeleniumHelperBasic{

   //Variables
	private Actions action;
	public String PAGE_Title = "One Time Password - Bluebird";
	public String PAGE_URL = "https://secure.bluebird.com/one-time-password";

   //Constructor
	public POM_OneTimePasswordBluebirdTBD(WebDriver driver){
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}

   //Locators
	By Send_via_text_to_XXXXXX1161 = By.xpath("//label[@data-testid='page-one-time-password__radio-label-verifyUsingPhone--checked']");
//	By Send_via_text_to_XXXXXX1161 = By.xpath("//label[@data-keyboard-focus='false']");
//	By Send_via_text_to_XXXXXX1161 = By.xpath("//*[contains(text(),'Send via text to XXX-XXX-1161')]");
//	By Send_via_text_to_XXXXXX1161 = By.xpath("//label[text()[contains(.,'Send via text')]]");
//	By Send_via_text_to_XXXXXX1161 = By.xpath("//label[text()[contains(.,'XXX-XXX-1161')]]");
//	By Send_via_text_to_XXXXXX1161 = By.xpath("//label[text()[contains(.,'to XXX-XXX-1161')]]");
//	By Send_via_text_to_XXXXXX1161 = By.xpath("//label[text()[contains(.,'text to XXX-XXX-1161')]]");
//	By Send_via_text_to_XXXXXX1161 = By.xpath("//*[@id='main']/div/div/div[1]/form[1]/div[1]/div[2]/div/label[1]");
//	By Send_via_text_to_XXXXXX1161 = By.xpath("//html/body[1]/div[1]/div/div[2]/div/div/div[1]/form[1]/div[1]/div[2]/div/label[1]");

	By numberinput = By.xpath("//input[@type='number']");
//	By numberinput = By.xpath("//input[@id='input-99facdef-b733-4503-a359-1e608e483884']");
//	By numberinput = By.xpath("//input[@name='']");
//	By numberinput = By.xpath("//input[@class='textfield__form-control textfield__form-control--number invalid']");
//	By numberinput = By.xpath("//input[@required='']");
//	By numberinput = By.xpath("//input[@autocomplete='off']");
//	By numberinput = By.xpath("//input[@placeholder='']");
//	By numberinput = By.xpath("//input[@maxlength='']");
//	By numberinput = By.xpath("//input[@data-testid='page-one-time-password__textField_verifyCode']");
//	By numberinput = By.xpath("//input[@value='']");
//	By numberinput = By.xpath("//input[@data-keyboard-focus='false']");
//	By numberinput = By.xpath("//*[@class='textfield__form-group']/input[1]");
//	By numberinput = By.xpath("//*[@class='page-one-time-password__wrapper']/form[1]/div[1]/input[1]");
//	By numberinput = By.xpath("//*[@id='main']/div/div/div[1]/form[1]/div[1]/input[1]");
//	By numberinput = By.xpath("//html/body[1]/div[1]/div/div[2]/div/div/div[1]/form[1]/div[1]/input[1]");

	By Verify_button = By.xpath("//button[@type='submit']");
//	By Verify_button = By.xpath("//button[@data-testid='submit-button__save-btn']");
//	By Verify_button = By.xpath("//button[text()[contains(.,'Verify')]]");
//	By Verify_button = By.xpath("//*[@class='bb-navigation-footer__buttons d-flex align-center']/button");
//	By Verify_button = By.xpath("//*[@class='bb-navigation-footer__wrapper']/div[2]/button");
//	By Verify_button = By.xpath("//*[@id='main']/div/div/div[1]/form[1]/div[2]/div/div/div[2]/button");
//	By Verify_button = By.xpath("//html/body[1]/div[1]/div/div[2]/div/div/div[1]/form[1]/div[2]/div/div/div[2]/button");


   //Methods

   // Send_via_text_to_XXXXXX1161
	public boolean Send_via_text_to_XXXXXX1161_DISPLAYED(){
	    return VerifyElement(Send_via_text_to_XXXXXX1161,"displayed","Send_via_text_to_XXXXXX1161");
	}
	public boolean Send_via_text_to_XXXXXX1161_ENABLED(){
	    return VerifyElement(Send_via_text_to_XXXXXX1161,"enabled","Send_via_text_to_XXXXXX1161");
	}
	public boolean Send_via_text_to_XXXXXX1161_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Send_via_text_to_XXXXXX1161);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Send_via_text_to_XXXXXX1161_MOVETOANDCLICK(){
	    return Element_Click(Send_via_text_to_XXXXXX1161, "moveToAndClick","Send_via_text_to_XXXXXX1161");
 	}
	public boolean Send_via_text_to_XXXXXX1161_CLICK_JAVASCRIPT(){
	    return Element_Click(Send_via_text_to_XXXXXX1161, "javaClick","Send_via_text_to_XXXXXX1161");
  	}
	public boolean Send_via_text_to_XXXXXX1161_CLICK(){
	    return Element_Click(Send_via_text_to_XXXXXX1161, "click","Send_via_text_to_XXXXXX1161");
  	}
	public String Send_via_text_to_XXXXXX1161_GETTEXT(){
	    return driver.findElement(Send_via_text_to_XXXXXX1161).getText();	}

   // numberinput
	public boolean numberinput_DISPLAYED(){
	    return VerifyElement(numberinput,"displayed","numberinput");
	}
	public boolean numberinput_ENABLED(){
	    return VerifyElement(numberinput,"enabled","numberinput");
	}
	public boolean numberinput_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(numberinput);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean numberinput_MOVETOANDCLICK(){
	    return Element_Click(numberinput, "moveToAndClick","numberinput");
 	}
	public boolean numberinput_CLICK_JAVASCRIPT(){
	    return Element_Click(numberinput, "javaClick","numberinput");
  	}
	public boolean numberinput_CLICK(){
	    return Element_Click(numberinput, "click","numberinput");
  	}
	public String numberinput_GETTEXT(){
	    return driver.findElement(numberinput).getText();	}
	public boolean numberinput_SENDKEYS(String textToInput){
	    driver.findElement(numberinput).clear();	    driver.findElement(numberinput).sendKeys(textToInput);	    return true;
	}

   // Verify_button
	public boolean Verify_button_DISPLAYED(){
	    return VerifyElement(Verify_button,"displayed","Verify_button");
	}
	public boolean Verify_button_ENABLED(){
	    return VerifyElement(Verify_button,"enabled","Verify_button");
	}
	public boolean Verify_button_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Verify_button);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Verify_button_MOVETOANDCLICK(){
	    return Element_Click(Verify_button, "moveToAndClick","Verify_button");
 	}
	public boolean Verify_button_CLICK_JAVASCRIPT(){
	    return Element_Click(Verify_button, "javaClick","Verify_button");
  	}
	public boolean Verify_button_CLICK(){
	    return Element_Click(Verify_button, "click","Verify_button");
  	}
	public String Verify_button_GETTEXT(){
	    return driver.findElement(Verify_button).getText();	}

}