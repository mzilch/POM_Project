package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import utility.SeleniumHelperBasic;

public class POM_NugetPage extends SeleniumHelperBasic{

   //Variables
	private Actions action;
	public String PAGE_Title = "NuGet Gallery | LiteDB 5.0.11";
	public String PAGE_URL = "https://www.nuget.org/packages/LiteDB/";

   //Constructor
	public POM_NugetPage(WebDriver driver){
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
		ValidatePageTitle(PAGE_Title);
	}

   //Locators
	By httpswwwlitedborg = By.xpath("//a[@data-track='outbound-project-url']");
	By Source_repository = By.xpath("//a[@data-track='outbound-repository-url']");
	By Dependent_repositories = By.xpath("//*[@class='list-unstyled ms-Icon-ul']/li[4]/a[1]");
	By License_Info = By.xpath("//a[@data-track='outbound-license-url']");
	By Contact_owners = By.xpath("//a[@title='Ask the package owners a question']");
	By Report = By.xpath("//a[@title='Report the package as abusive']");

   //Methods

   // httpswwwlitedborg
	public boolean httpswwwlitedborg_DISPLAYED(){
	    return VerifyElement(httpswwwlitedborg,"displayed","httpswwwlitedborg");
	}
	public boolean httpswwwlitedborg_ENABLED(){
	    return VerifyElement(httpswwwlitedborg,"enabled","httpswwwlitedborg");
	}
	public boolean httpswwwlitedborg_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(httpswwwlitedborg);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean httpswwwlitedborg_MOVETOANDCLICK(){
	    return Element_Click(httpswwwlitedborg, "moveToAndClick","httpswwwlitedborg");
 	}
	public boolean httpswwwlitedborg_CLICK_JAVASCRIPT(){
	    return Element_Click(httpswwwlitedborg, "javaClick","httpswwwlitedborg");
  	}
	public boolean httpswwwlitedborg_CLICK(){
	    return Element_Click(httpswwwlitedborg, "click","httpswwwlitedborg");
  	}
	public String httpswwwlitedborg_GETTEXT(){
	    return driver.findElement(httpswwwlitedborg).getText();	}

   // Source_repository
	public boolean Source_repository_DISPLAYED(){
	    return VerifyElement(Source_repository,"displayed","Source_repository");
	}
	public boolean Source_repository_ENABLED(){
	    return VerifyElement(Source_repository,"enabled","Source_repository");
	}
	public boolean Source_repository_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Source_repository);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Source_repository_MOVETOANDCLICK(){
	    return Element_Click(Source_repository, "moveToAndClick","Source_repository");
 	}
	public boolean Source_repository_CLICK_JAVASCRIPT(){
	    return Element_Click(Source_repository, "javaClick","Source_repository");
  	}
	public boolean Source_repository_CLICK(){
	    return Element_Click(Source_repository, "click","Source_repository");
  	}
	public String Source_repository_GETTEXT(){
	    return driver.findElement(Source_repository).getText();	}

   // Dependent_repositories
	public boolean Dependent_repositories_DISPLAYED(){
	    return VerifyElement(Dependent_repositories,"displayed","Dependent_repositories");
	}
	public boolean Dependent_repositories_ENABLED(){
	    return VerifyElement(Dependent_repositories,"enabled","Dependent_repositories");
	}
	public boolean Dependent_repositories_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Dependent_repositories);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Dependent_repositories_MOVETOANDCLICK(){
	    return Element_Click(Dependent_repositories, "moveToAndClick","Dependent_repositories");
 	}
	public boolean Dependent_repositories_CLICK_JAVASCRIPT(){
	    return Element_Click(Dependent_repositories, "javaClick","Dependent_repositories");
  	}
	public boolean Dependent_repositories_CLICK(){
	    return Element_Click(Dependent_repositories, "click","Dependent_repositories");
  	}
	public String Dependent_repositories_GETTEXT(){
	    return driver.findElement(Dependent_repositories).getText();	}

   // License_Info
	public boolean License_Info_DISPLAYED(){
	    return VerifyElement(License_Info,"displayed","License_Info");
	}
	public boolean License_Info_ENABLED(){
	    return VerifyElement(License_Info,"enabled","License_Info");
	}
	public boolean License_Info_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(License_Info);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean License_Info_MOVETOANDCLICK(){
	    return Element_Click(License_Info, "moveToAndClick","License_Info");
 	}
	public boolean License_Info_CLICK_JAVASCRIPT(){
	    return Element_Click(License_Info, "javaClick","License_Info");
  	}
	public boolean License_Info_CLICK(){
	    return Element_Click(License_Info, "click","License_Info");
  	}
	public String License_Info_GETTEXT(){
	    return driver.findElement(License_Info).getText();	}

   // Contact_owners
	public boolean Contact_owners_DISPLAYED(){
	    return VerifyElement(Contact_owners,"displayed","Contact_owners");
	}
	public boolean Contact_owners_ENABLED(){
	    return VerifyElement(Contact_owners,"enabled","Contact_owners");
	}
	public boolean Contact_owners_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Contact_owners);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Contact_owners_MOVETOANDCLICK(){
	    return Element_Click(Contact_owners, "moveToAndClick","Contact_owners");
 	}
	public boolean Contact_owners_CLICK_JAVASCRIPT(){
	    return Element_Click(Contact_owners, "javaClick","Contact_owners");
  	}
	public boolean Contact_owners_CLICK(){
	    return Element_Click(Contact_owners, "click","Contact_owners");
  	}
	public String Contact_owners_GETTEXT(){
	    return driver.findElement(Contact_owners).getText();	}

   // Report
	public boolean Report_DISPLAYED(){
	    return VerifyElement(Report,"displayed","Report");
	}
	public boolean Report_ENABLED(){
	    return VerifyElement(Report,"enabled","Report");
	}
	public boolean Report_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Report);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean Report_MOVETOANDCLICK(){
	    return Element_Click(Report, "moveToAndClick","Report");
 	}
	public boolean Report_CLICK_JAVASCRIPT(){
	    return Element_Click(Report, "javaClick","Report");
  	}
	public boolean Report_CLICK(){
	    return Element_Click(Report, "click","Report");
  	}
	public String Report_GETTEXT(){
	    return driver.findElement(Report).getText();	}

}