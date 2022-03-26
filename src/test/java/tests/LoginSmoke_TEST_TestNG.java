package tests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;

public class LoginSmoke_TEST_TestNG{

	WebDriver driver;
	JavascriptExecutor executor;
	String driverPath = ".\\Drivers";

	@Test()
	public void LoginSmoke() throws InterruptedException {

    	System.out.println("--- Started Test");

    	// Navigating To
    	driver.get("https://secure.bluebird.com/login");

    	// UserName
    	driver.findElement(By.xpath("//input[@id='bb-username']")).sendKeys("mzilchwbb");
    	// Password_Field
    	driver.findElement(By.xpath("//input[@id='bb-password']")).sendKeys("mzBBilch2019");
    	// Legal
    	driver.findElement(By.xpath("//a[@href='https://www.bluebird.com/legal']")).isDisplayed();
    	// Privacy_Center_First
    	driver.findElement(By.xpath("//a[@href='https://www.americanexpress.com/us/company/privacy-center/online-privacy-disclosures/']")).isDisplayed();
    	// LogIn_Button
    	driver.findElement(By.xpath("//button[@id='bb-submit']")).isDisplayed();
    	// RememberMe_Checkbox
    	WebElement we_0 = driver.findElement(By.xpath("//*[@id='rememberme']"));
    	executor = (JavascriptExecutor)driver;
    	executor.executeScript("arguments[0].click();", we_0);
    	Thread.sleep(3000);

	}

	@BeforeMethod
	public void beforeMethod() {
    	System.out.println("--- Launching Chrome browser");
     	System.setProperty("webdriver.chrome.driver",driverPath + "\\chromedriver.exe");
    	driver = new ChromeDriver();

    	// Manage browser and timeouts
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

 	@AfterMethod
	public void afterMethod() {
    	driver.close();
    	System.out.println("--- Finished Test");
	}
}
