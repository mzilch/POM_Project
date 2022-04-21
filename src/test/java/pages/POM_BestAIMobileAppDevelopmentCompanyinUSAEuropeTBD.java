package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import utility.SeleniumHelperBasic;

public class POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD extends SeleniumHelperBasic{

   //Variables
	private Actions action;
	public String PAGE_Title = "Best AI Mobile App Development Company in USA Europe";
	public String PAGE_URL = "https://usmsystems.com/";

   //Constructor
	public POM_BestAIMobileAppDevelopmentCompanyinUSAEuropeTBD(WebDriver driver){
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}

   //Locators
	By WORKFORCESERVICESBLOCK = By.xpath("//*[@id='home-usm']/div[1]/div[1]/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div[1]");
	By ReadMore = By.xpath("//a[@href='https://usmsystems.com/workforce-management-services/'][@title=''][@class='tt_button  btn_secondary_color']");
	By WorkforceServices = By.xpath("//h4[text()[contains(.,'Workforce')]]");
	By ProvideFulltimeRPOandContingentworkforces = By.xpath("//*[contains(text(),'Provide Full-time, RPO, and Contingent workforce services and launch the right talent at the right time to propel your business forward.')]");
	By IMG_V_Workforce_Services_IMG = By.xpath("//img[@title='Home USM 11']");
	By PAGEFOOTER = By.xpath("//div[@id='text-2']");
	By WorkforceManagement = By.xpath("//*[@id='menu-item-15846']/a");
	By DataQualitySolutions = By.xpath("//a[text()[contains(.,'Data Quality Solutions')]]");
	By CloudMigration = By.xpath("//*[@id='menu-item-15848']/a");
	By HRManagement = By.xpath("//*[@id='menu-item-15849']/a");
	By MobileAppDevelopment = By.xpath("//*[@id='menu-item-15850']/a");
	By AIServices = By.xpath("//*[@id='menu-item-15851']/a");
	By MachineLearning = By.xpath("//a[@href='https://usmsystems.com/ai-app-development-company/machine-learning-solutions-services/']");
	By DataScience = By.xpath("//a[@href='https://usmsystems.com/ai-app-development-company/data-science/']");
	By DeepLearning = By.xpath("//a[@href='https://usmsystems.com/ai-app-development-company/deep-learning-solutions-services/']");
	By AIinBanking = By.xpath("//a[@href='https://usmsystems.com/top-use-cases-of-ai-in-the-banking-sector/']");
	By AIinRetail = By.xpath("//a[@href='https://usmsystems.com/top-use-cases-of-artificial-intelligence-in-retail-industry/']");
	By AIinManufacturing = By.xpath("//a[@href='https://usmsystems.com/ai-in-manufacturing-use-cases/']");
	By AIineCommerce = By.xpath("//a[@href='https://usmsystems.com/example-use-cases-applications-of-ai-in-ecommerce/']");
	By AIinComputerVision = By.xpath("//a[@href='https://usmsystems.com/use-cases-of-computer-vision-in-manufacturing/']");
	By AIinPharma = By.xpath("//a[@href='https://usmsystems.com/ai-in-pharma-and-biomedicine/']");
	By ALandMLUseCases = By.xpath("//a[@href='https://usmsystems.com/ai-and-ml-use-cases/']");
	By A6ChallengesThatFintechStartupsWillFaceEff = By.xpath("//a[text()[contains(.,'6 Challenges')]]");
	By A7BestMobileBankingAppsInTheUSAIn2022 = By.xpath("//a[text()[contains(.,'7 Best')]]");
	By TopFinancialAppDevelopmentCompaniesInBahrain = By.xpath("//a[text()[contains(.,'Top')]]");
	By HowIoTPowersMobileAppDevelopmentIndustryIn = By.xpath("//a[@href='https://usmsystems.com/how-iot-powers-mobile-app-development-industry-in-upcoming-years/']");
	By HowNaturalLanguageProcessingMakesMobileApps = By.xpath("//a[@href='https://usmsystems.com/how-natural-language-processing-makes-mobile-apps-smarter/']");

   //Methods

   // WORKFORCESERVICESBLOCK
	public boolean WORKFORCESERVICESBLOCK_DISPLAYED(){
	    return VerifyElement(WORKFORCESERVICESBLOCK,"displayed","WORKFORCESERVICESBLOCK");
	}
	public boolean WORKFORCESERVICESBLOCK_ENABLED(){
	    return VerifyElement(WORKFORCESERVICESBLOCK,"enabled","WORKFORCESERVICESBLOCK");
	}
	public boolean WORKFORCESERVICESBLOCK_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(WORKFORCESERVICESBLOCK);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean WORKFORCESERVICESBLOCK_MOVETOANDCLICK(){
	    return Element_Click(WORKFORCESERVICESBLOCK, "moveToAndClick","WORKFORCESERVICESBLOCK");
 	}
	public boolean WORKFORCESERVICESBLOCK_CLICK_JAVASCRIPT(){
	    return Element_Click(WORKFORCESERVICESBLOCK, "javaClick","WORKFORCESERVICESBLOCK");
  	}
	public boolean WORKFORCESERVICESBLOCK_CLICK(){
	    return Element_Click(WORKFORCESERVICESBLOCK, "click","WORKFORCESERVICESBLOCK");
  	}
	public String WORKFORCESERVICESBLOCK_GETTEXT(){
	    return driver.findElement(WORKFORCESERVICESBLOCK).getText();	}

   // ReadMore
	public boolean ReadMore_DISPLAYED(){
	    return VerifyElement(ReadMore,"displayed","ReadMore");
	}
	public boolean ReadMore_ENABLED(){
	    return VerifyElement(ReadMore,"enabled","ReadMore");
	}
	public boolean ReadMore_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(ReadMore);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean ReadMore_MOVETOANDCLICK(){
	    return Element_Click(ReadMore, "moveToAndClick","ReadMore");
 	}
	public boolean ReadMore_CLICK_JAVASCRIPT(){
	    return Element_Click(ReadMore, "javaClick","ReadMore");
  	}
	public boolean ReadMore_CLICK(){
	    return Element_Click(ReadMore, "click","ReadMore");
  	}
	public String ReadMore_GETTEXT(){
	    return driver.findElement(ReadMore).getText();	}

   // WorkforceServices
	public boolean WorkforceServices_DISPLAYED(){
	    return VerifyElement(WorkforceServices,"displayed","WorkforceServices");
	}
	public boolean WorkforceServices_ENABLED(){
	    return VerifyElement(WorkforceServices,"enabled","WorkforceServices");
	}
	public boolean WorkforceServices_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(WorkforceServices);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean WorkforceServices_MOVETOANDCLICK(){
	    return Element_Click(WorkforceServices, "moveToAndClick","WorkforceServices");
 	}
	public boolean WorkforceServices_CLICK_JAVASCRIPT(){
	    return Element_Click(WorkforceServices, "javaClick","WorkforceServices");
  	}
	public boolean WorkforceServices_CLICK(){
	    return Element_Click(WorkforceServices, "click","WorkforceServices");
  	}
	public String WorkforceServices_GETTEXT(){
	    return driver.findElement(WorkforceServices).getText();	}

   // ProvideFulltimeRPOandContingentworkforces
	public boolean ProvideFulltimeRPOandContingentworkforces_DISPLAYED(){
	    return VerifyElement(ProvideFulltimeRPOandContingentworkforces,"displayed","ProvideFulltimeRPOandContingentworkforces");
	}
	public boolean ProvideFulltimeRPOandContingentworkforces_ENABLED(){
	    return VerifyElement(ProvideFulltimeRPOandContingentworkforces,"enabled","ProvideFulltimeRPOandContingentworkforces");
	}
	public boolean ProvideFulltimeRPOandContingentworkforces_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(ProvideFulltimeRPOandContingentworkforces);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean ProvideFulltimeRPOandContingentworkforces_MOVETOANDCLICK(){
	    return Element_Click(ProvideFulltimeRPOandContingentworkforces, "moveToAndClick","ProvideFulltimeRPOandContingentworkforces");
 	}
	public boolean ProvideFulltimeRPOandContingentworkforces_CLICK_JAVASCRIPT(){
	    return Element_Click(ProvideFulltimeRPOandContingentworkforces, "javaClick","ProvideFulltimeRPOandContingentworkforces");
  	}
	public boolean ProvideFulltimeRPOandContingentworkforces_CLICK(){
	    return Element_Click(ProvideFulltimeRPOandContingentworkforces, "click","ProvideFulltimeRPOandContingentworkforces");
  	}
	public String ProvideFulltimeRPOandContingentworkforces_GETTEXT(){
	    return driver.findElement(ProvideFulltimeRPOandContingentworkforces).getText();	}

   // IMG_V_Workforce_Services_IMG
	public boolean IMG_V_Workforce_Services_IMG_DISPLAYED(){
	    return VerifyElement(IMG_V_Workforce_Services_IMG,"displayed","IMG_V_Workforce_Services_IMG");
	}
	public boolean IMG_V_Workforce_Services_IMG_ENABLED(){
	    return VerifyElement(IMG_V_Workforce_Services_IMG,"enabled","IMG_V_Workforce_Services_IMG");
	}
	public boolean IMG_V_Workforce_Services_IMG_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(IMG_V_Workforce_Services_IMG);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean IMG_V_Workforce_Services_IMG_MOVETOANDCLICK(){
	    return Element_Click(IMG_V_Workforce_Services_IMG, "moveToAndClick","IMG_V_Workforce_Services_IMG");
 	}
	public boolean IMG_V_Workforce_Services_IMG_CLICK_JAVASCRIPT(){
	    return Element_Click(IMG_V_Workforce_Services_IMG, "javaClick","IMG_V_Workforce_Services_IMG");
  	}
	public boolean IMG_V_Workforce_Services_IMG_CLICK(){
	    return Element_Click(IMG_V_Workforce_Services_IMG, "click","IMG_V_Workforce_Services_IMG");
  	}
	public String IMG_V_Workforce_Services_IMG_GETTEXT(){
	    return driver.findElement(IMG_V_Workforce_Services_IMG).getText();	}

   // PAGEFOOTER
	public boolean PAGEFOOTER_DISPLAYED(){
	    return VerifyElement(PAGEFOOTER,"displayed","PAGEFOOTER");
	}
	public boolean PAGEFOOTER_ENABLED(){
	    return VerifyElement(PAGEFOOTER,"enabled","PAGEFOOTER");
	}
	public boolean PAGEFOOTER_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(PAGEFOOTER);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean PAGEFOOTER_MOVETOANDCLICK(){
	    return Element_Click(PAGEFOOTER, "moveToAndClick","PAGEFOOTER");
 	}
	public boolean PAGEFOOTER_CLICK_JAVASCRIPT(){
	    return Element_Click(PAGEFOOTER, "javaClick","PAGEFOOTER");
  	}
	public boolean PAGEFOOTER_CLICK(){
	    return Element_Click(PAGEFOOTER, "click","PAGEFOOTER");
  	}
	public String PAGEFOOTER_GETTEXT(){
	    return driver.findElement(PAGEFOOTER).getText();	}

   // WorkforceManagement
	public boolean WorkforceManagement_DISPLAYED(){
	    return VerifyElement(WorkforceManagement,"displayed","WorkforceManagement");
	}
	public boolean WorkforceManagement_ENABLED(){
	    return VerifyElement(WorkforceManagement,"enabled","WorkforceManagement");
	}
	public boolean WorkforceManagement_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(WorkforceManagement);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean WorkforceManagement_MOVETOANDCLICK(){
	    return Element_Click(WorkforceManagement, "moveToAndClick","WorkforceManagement");
 	}
	public boolean WorkforceManagement_CLICK_JAVASCRIPT(){
	    return Element_Click(WorkforceManagement, "javaClick","WorkforceManagement");
  	}
	public boolean WorkforceManagement_CLICK(){
	    return Element_Click(WorkforceManagement, "click","WorkforceManagement");
  	}
	public String WorkforceManagement_GETTEXT(){
	    return driver.findElement(WorkforceManagement).getText();	}

   // DataQualitySolutions
	public boolean DataQualitySolutions_DISPLAYED(){
	    return VerifyElement(DataQualitySolutions,"displayed","DataQualitySolutions");
	}
	public boolean DataQualitySolutions_ENABLED(){
	    return VerifyElement(DataQualitySolutions,"enabled","DataQualitySolutions");
	}
	public boolean DataQualitySolutions_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(DataQualitySolutions);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean DataQualitySolutions_MOVETOANDCLICK(){
	    return Element_Click(DataQualitySolutions, "moveToAndClick","DataQualitySolutions");
 	}
	public boolean DataQualitySolutions_CLICK_JAVASCRIPT(){
	    return Element_Click(DataQualitySolutions, "javaClick","DataQualitySolutions");
  	}
	public boolean DataQualitySolutions_CLICK(){
	    return Element_Click(DataQualitySolutions, "click","DataQualitySolutions");
  	}
	public String DataQualitySolutions_GETTEXT(){
	    return driver.findElement(DataQualitySolutions).getText();	}

   // CloudMigration
	public boolean CloudMigration_DISPLAYED(){
	    return VerifyElement(CloudMigration,"displayed","CloudMigration");
	}
	public boolean CloudMigration_ENABLED(){
	    return VerifyElement(CloudMigration,"enabled","CloudMigration");
	}
	public boolean CloudMigration_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(CloudMigration);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean CloudMigration_MOVETOANDCLICK(){
	    return Element_Click(CloudMigration, "moveToAndClick","CloudMigration");
 	}
	public boolean CloudMigration_CLICK_JAVASCRIPT(){
	    return Element_Click(CloudMigration, "javaClick","CloudMigration");
  	}
	public boolean CloudMigration_CLICK(){
	    return Element_Click(CloudMigration, "click","CloudMigration");
  	}
	public String CloudMigration_GETTEXT(){
	    return driver.findElement(CloudMigration).getText();	}

   // HRManagement
	public boolean HRManagement_DISPLAYED(){
	    return VerifyElement(HRManagement,"displayed","HRManagement");
	}
	public boolean HRManagement_ENABLED(){
	    return VerifyElement(HRManagement,"enabled","HRManagement");
	}
	public boolean HRManagement_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(HRManagement);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean HRManagement_MOVETOANDCLICK(){
	    return Element_Click(HRManagement, "moveToAndClick","HRManagement");
 	}
	public boolean HRManagement_CLICK_JAVASCRIPT(){
	    return Element_Click(HRManagement, "javaClick","HRManagement");
  	}
	public boolean HRManagement_CLICK(){
	    return Element_Click(HRManagement, "click","HRManagement");
  	}
	public String HRManagement_GETTEXT(){
	    return driver.findElement(HRManagement).getText();	}

   // MobileAppDevelopment
	public boolean MobileAppDevelopment_DISPLAYED(){
	    return VerifyElement(MobileAppDevelopment,"displayed","MobileAppDevelopment");
	}
	public boolean MobileAppDevelopment_ENABLED(){
	    return VerifyElement(MobileAppDevelopment,"enabled","MobileAppDevelopment");
	}
	public boolean MobileAppDevelopment_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(MobileAppDevelopment);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean MobileAppDevelopment_MOVETOANDCLICK(){
	    return Element_Click(MobileAppDevelopment, "moveToAndClick","MobileAppDevelopment");
 	}
	public boolean MobileAppDevelopment_CLICK_JAVASCRIPT(){
	    return Element_Click(MobileAppDevelopment, "javaClick","MobileAppDevelopment");
  	}
	public boolean MobileAppDevelopment_CLICK(){
	    return Element_Click(MobileAppDevelopment, "click","MobileAppDevelopment");
  	}
	public String MobileAppDevelopment_GETTEXT(){
	    return driver.findElement(MobileAppDevelopment).getText();	}

   // AIServices
	public boolean AIServices_DISPLAYED(){
	    return VerifyElement(AIServices,"displayed","AIServices");
	}
	public boolean AIServices_ENABLED(){
	    return VerifyElement(AIServices,"enabled","AIServices");
	}
	public boolean AIServices_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(AIServices);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean AIServices_MOVETOANDCLICK(){
	    return Element_Click(AIServices, "moveToAndClick","AIServices");
 	}
	public boolean AIServices_CLICK_JAVASCRIPT(){
	    return Element_Click(AIServices, "javaClick","AIServices");
  	}
	public boolean AIServices_CLICK(){
	    return Element_Click(AIServices, "click","AIServices");
  	}
	public String AIServices_GETTEXT(){
	    return driver.findElement(AIServices).getText();	}

   // MachineLearning
	public boolean MachineLearning_DISPLAYED(){
	    return VerifyElement(MachineLearning,"displayed","MachineLearning");
	}
	public boolean MachineLearning_ENABLED(){
	    return VerifyElement(MachineLearning,"enabled","MachineLearning");
	}
	public boolean MachineLearning_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(MachineLearning);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean MachineLearning_MOVETOANDCLICK(){
	    return Element_Click(MachineLearning, "moveToAndClick","MachineLearning");
 	}
	public boolean MachineLearning_CLICK_JAVASCRIPT(){
	    return Element_Click(MachineLearning, "javaClick","MachineLearning");
  	}
	public boolean MachineLearning_CLICK(){
	    return Element_Click(MachineLearning, "click","MachineLearning");
  	}
	public String MachineLearning_GETTEXT(){
	    return driver.findElement(MachineLearning).getText();	}

   // DataScience
	public boolean DataScience_DISPLAYED(){
	    return VerifyElement(DataScience,"displayed","DataScience");
	}
	public boolean DataScience_ENABLED(){
	    return VerifyElement(DataScience,"enabled","DataScience");
	}
	public boolean DataScience_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(DataScience);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean DataScience_MOVETOANDCLICK(){
	    return Element_Click(DataScience, "moveToAndClick","DataScience");
 	}
	public boolean DataScience_CLICK_JAVASCRIPT(){
	    return Element_Click(DataScience, "javaClick","DataScience");
  	}
	public boolean DataScience_CLICK(){
	    return Element_Click(DataScience, "click","DataScience");
  	}
	public String DataScience_GETTEXT(){
	    return driver.findElement(DataScience).getText();	}

   // DeepLearning
	public boolean DeepLearning_DISPLAYED(){
	    return VerifyElement(DeepLearning,"displayed","DeepLearning");
	}
	public boolean DeepLearning_ENABLED(){
	    return VerifyElement(DeepLearning,"enabled","DeepLearning");
	}
	public boolean DeepLearning_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(DeepLearning);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean DeepLearning_MOVETOANDCLICK(){
	    return Element_Click(DeepLearning, "moveToAndClick","DeepLearning");
 	}
	public boolean DeepLearning_CLICK_JAVASCRIPT(){
	    return Element_Click(DeepLearning, "javaClick","DeepLearning");
  	}
	public boolean DeepLearning_CLICK(){
	    return Element_Click(DeepLearning, "click","DeepLearning");
  	}
	public String DeepLearning_GETTEXT(){
	    return driver.findElement(DeepLearning).getText();	}

   // AIinBanking
	public boolean AIinBanking_DISPLAYED(){
	    return VerifyElement(AIinBanking,"displayed","AIinBanking");
	}
	public boolean AIinBanking_ENABLED(){
	    return VerifyElement(AIinBanking,"enabled","AIinBanking");
	}
	public boolean AIinBanking_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(AIinBanking);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean AIinBanking_MOVETOANDCLICK(){
	    return Element_Click(AIinBanking, "moveToAndClick","AIinBanking");
 	}
	public boolean AIinBanking_CLICK_JAVASCRIPT(){
	    return Element_Click(AIinBanking, "javaClick","AIinBanking");
  	}
	public boolean AIinBanking_CLICK(){
	    return Element_Click(AIinBanking, "click","AIinBanking");
  	}
	public String AIinBanking_GETTEXT(){
	    return driver.findElement(AIinBanking).getText();	}

   // AIinRetail
	public boolean AIinRetail_DISPLAYED(){
	    return VerifyElement(AIinRetail,"displayed","AIinRetail");
	}
	public boolean AIinRetail_ENABLED(){
	    return VerifyElement(AIinRetail,"enabled","AIinRetail");
	}
	public boolean AIinRetail_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(AIinRetail);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean AIinRetail_MOVETOANDCLICK(){
	    return Element_Click(AIinRetail, "moveToAndClick","AIinRetail");
 	}
	public boolean AIinRetail_CLICK_JAVASCRIPT(){
	    return Element_Click(AIinRetail, "javaClick","AIinRetail");
  	}
	public boolean AIinRetail_CLICK(){
	    return Element_Click(AIinRetail, "click","AIinRetail");
  	}
	public String AIinRetail_GETTEXT(){
	    return driver.findElement(AIinRetail).getText();	}

   // AIinManufacturing
	public boolean AIinManufacturing_DISPLAYED(){
	    return VerifyElement(AIinManufacturing,"displayed","AIinManufacturing");
	}
	public boolean AIinManufacturing_ENABLED(){
	    return VerifyElement(AIinManufacturing,"enabled","AIinManufacturing");
	}
	public boolean AIinManufacturing_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(AIinManufacturing);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean AIinManufacturing_MOVETOANDCLICK(){
	    return Element_Click(AIinManufacturing, "moveToAndClick","AIinManufacturing");
 	}
	public boolean AIinManufacturing_CLICK_JAVASCRIPT(){
	    return Element_Click(AIinManufacturing, "javaClick","AIinManufacturing");
  	}
	public boolean AIinManufacturing_CLICK(){
	    return Element_Click(AIinManufacturing, "click","AIinManufacturing");
  	}
	public String AIinManufacturing_GETTEXT(){
	    return driver.findElement(AIinManufacturing).getText();	}

   // AIineCommerce
	public boolean AIineCommerce_DISPLAYED(){
	    return VerifyElement(AIineCommerce,"displayed","AIineCommerce");
	}
	public boolean AIineCommerce_ENABLED(){
	    return VerifyElement(AIineCommerce,"enabled","AIineCommerce");
	}
	public boolean AIineCommerce_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(AIineCommerce);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean AIineCommerce_MOVETOANDCLICK(){
	    return Element_Click(AIineCommerce, "moveToAndClick","AIineCommerce");
 	}
	public boolean AIineCommerce_CLICK_JAVASCRIPT(){
	    return Element_Click(AIineCommerce, "javaClick","AIineCommerce");
  	}
	public boolean AIineCommerce_CLICK(){
	    return Element_Click(AIineCommerce, "click","AIineCommerce");
  	}
	public String AIineCommerce_GETTEXT(){
	    return driver.findElement(AIineCommerce).getText();	}

   // AIinComputerVision
	public boolean AIinComputerVision_DISPLAYED(){
	    return VerifyElement(AIinComputerVision,"displayed","AIinComputerVision");
	}
	public boolean AIinComputerVision_ENABLED(){
	    return VerifyElement(AIinComputerVision,"enabled","AIinComputerVision");
	}
	public boolean AIinComputerVision_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(AIinComputerVision);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean AIinComputerVision_MOVETOANDCLICK(){
	    return Element_Click(AIinComputerVision, "moveToAndClick","AIinComputerVision");
 	}
	public boolean AIinComputerVision_CLICK_JAVASCRIPT(){
	    return Element_Click(AIinComputerVision, "javaClick","AIinComputerVision");
  	}
	public boolean AIinComputerVision_CLICK(){
	    return Element_Click(AIinComputerVision, "click","AIinComputerVision");
  	}
	public String AIinComputerVision_GETTEXT(){
	    return driver.findElement(AIinComputerVision).getText();	}

   // AIinPharma
	public boolean AIinPharma_DISPLAYED(){
	    return VerifyElement(AIinPharma,"displayed","AIinPharma");
	}
	public boolean AIinPharma_ENABLED(){
	    return VerifyElement(AIinPharma,"enabled","AIinPharma");
	}
	public boolean AIinPharma_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(AIinPharma);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean AIinPharma_MOVETOANDCLICK(){
	    return Element_Click(AIinPharma, "moveToAndClick","AIinPharma");
 	}
	public boolean AIinPharma_CLICK_JAVASCRIPT(){
	    return Element_Click(AIinPharma, "javaClick","AIinPharma");
  	}
	public boolean AIinPharma_CLICK(){
	    return Element_Click(AIinPharma, "click","AIinPharma");
  	}
	public String AIinPharma_GETTEXT(){
	    return driver.findElement(AIinPharma).getText();	}

   // ALandMLUseCases
	public boolean ALandMLUseCases_DISPLAYED(){
	    return VerifyElement(ALandMLUseCases,"displayed","ALandMLUseCases");
	}
	public boolean ALandMLUseCases_ENABLED(){
	    return VerifyElement(ALandMLUseCases,"enabled","ALandMLUseCases");
	}
	public boolean ALandMLUseCases_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(ALandMLUseCases);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean ALandMLUseCases_MOVETOANDCLICK(){
	    return Element_Click(ALandMLUseCases, "moveToAndClick","ALandMLUseCases");
 	}
	public boolean ALandMLUseCases_CLICK_JAVASCRIPT(){
	    return Element_Click(ALandMLUseCases, "javaClick","ALandMLUseCases");
  	}
	public boolean ALandMLUseCases_CLICK(){
	    return Element_Click(ALandMLUseCases, "click","ALandMLUseCases");
  	}
	public String ALandMLUseCases_GETTEXT(){
	    return driver.findElement(ALandMLUseCases).getText();	}

   // A6ChallengesThatFintechStartupsWillFaceEff
	public boolean A6ChallengesThatFintechStartupsWillFaceEff_DISPLAYED(){
	    return VerifyElement(A6ChallengesThatFintechStartupsWillFaceEff,"displayed","A6ChallengesThatFintechStartupsWillFaceEff");
	}
	public boolean A6ChallengesThatFintechStartupsWillFaceEff_ENABLED(){
	    return VerifyElement(A6ChallengesThatFintechStartupsWillFaceEff,"enabled","A6ChallengesThatFintechStartupsWillFaceEff");
	}
	public boolean A6ChallengesThatFintechStartupsWillFaceEff_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(A6ChallengesThatFintechStartupsWillFaceEff);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean A6ChallengesThatFintechStartupsWillFaceEff_MOVETOANDCLICK(){
	    return Element_Click(A6ChallengesThatFintechStartupsWillFaceEff, "moveToAndClick","A6ChallengesThatFintechStartupsWillFaceEff");
 	}
	public boolean A6ChallengesThatFintechStartupsWillFaceEff_CLICK_JAVASCRIPT(){
	    return Element_Click(A6ChallengesThatFintechStartupsWillFaceEff, "javaClick","A6ChallengesThatFintechStartupsWillFaceEff");
  	}
	public boolean A6ChallengesThatFintechStartupsWillFaceEff_CLICK(){
	    return Element_Click(A6ChallengesThatFintechStartupsWillFaceEff, "click","A6ChallengesThatFintechStartupsWillFaceEff");
  	}
	public String A6ChallengesThatFintechStartupsWillFaceEff_GETTEXT(){
	    return driver.findElement(A6ChallengesThatFintechStartupsWillFaceEff).getText();	}

   // A7BestMobileBankingAppsInTheUSAIn2022
	public boolean A7BestMobileBankingAppsInTheUSAIn2022_DISPLAYED(){
	    return VerifyElement(A7BestMobileBankingAppsInTheUSAIn2022,"displayed","A7BestMobileBankingAppsInTheUSAIn2022");
	}
	public boolean A7BestMobileBankingAppsInTheUSAIn2022_ENABLED(){
	    return VerifyElement(A7BestMobileBankingAppsInTheUSAIn2022,"enabled","A7BestMobileBankingAppsInTheUSAIn2022");
	}
	public boolean A7BestMobileBankingAppsInTheUSAIn2022_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(A7BestMobileBankingAppsInTheUSAIn2022);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean A7BestMobileBankingAppsInTheUSAIn2022_MOVETOANDCLICK(){
	    return Element_Click(A7BestMobileBankingAppsInTheUSAIn2022, "moveToAndClick","A7BestMobileBankingAppsInTheUSAIn2022");
 	}
	public boolean A7BestMobileBankingAppsInTheUSAIn2022_CLICK_JAVASCRIPT(){
	    return Element_Click(A7BestMobileBankingAppsInTheUSAIn2022, "javaClick","A7BestMobileBankingAppsInTheUSAIn2022");
  	}
	public boolean A7BestMobileBankingAppsInTheUSAIn2022_CLICK(){
	    return Element_Click(A7BestMobileBankingAppsInTheUSAIn2022, "click","A7BestMobileBankingAppsInTheUSAIn2022");
  	}
	public String A7BestMobileBankingAppsInTheUSAIn2022_GETTEXT(){
	    return driver.findElement(A7BestMobileBankingAppsInTheUSAIn2022).getText();	}

   // TopFinancialAppDevelopmentCompaniesInBahrain
	public boolean TopFinancialAppDevelopmentCompaniesInBahrain_DISPLAYED(){
	    return VerifyElement(TopFinancialAppDevelopmentCompaniesInBahrain,"displayed","TopFinancialAppDevelopmentCompaniesInBahrain");
	}
	public boolean TopFinancialAppDevelopmentCompaniesInBahrain_ENABLED(){
	    return VerifyElement(TopFinancialAppDevelopmentCompaniesInBahrain,"enabled","TopFinancialAppDevelopmentCompaniesInBahrain");
	}
	public boolean TopFinancialAppDevelopmentCompaniesInBahrain_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(TopFinancialAppDevelopmentCompaniesInBahrain);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean TopFinancialAppDevelopmentCompaniesInBahrain_MOVETOANDCLICK(){
	    return Element_Click(TopFinancialAppDevelopmentCompaniesInBahrain, "moveToAndClick","TopFinancialAppDevelopmentCompaniesInBahrain");
 	}
	public boolean TopFinancialAppDevelopmentCompaniesInBahrain_CLICK_JAVASCRIPT(){
	    return Element_Click(TopFinancialAppDevelopmentCompaniesInBahrain, "javaClick","TopFinancialAppDevelopmentCompaniesInBahrain");
  	}
	public boolean TopFinancialAppDevelopmentCompaniesInBahrain_CLICK(){
	    return Element_Click(TopFinancialAppDevelopmentCompaniesInBahrain, "click","TopFinancialAppDevelopmentCompaniesInBahrain");
  	}
	public String TopFinancialAppDevelopmentCompaniesInBahrain_GETTEXT(){
	    return driver.findElement(TopFinancialAppDevelopmentCompaniesInBahrain).getText();	}

   // HowIoTPowersMobileAppDevelopmentIndustryIn
	public boolean HowIoTPowersMobileAppDevelopmentIndustryIn_DISPLAYED(){
	    return VerifyElement(HowIoTPowersMobileAppDevelopmentIndustryIn,"displayed","HowIoTPowersMobileAppDevelopmentIndustryIn");
	}
	public boolean HowIoTPowersMobileAppDevelopmentIndustryIn_ENABLED(){
	    return VerifyElement(HowIoTPowersMobileAppDevelopmentIndustryIn,"enabled","HowIoTPowersMobileAppDevelopmentIndustryIn");
	}
	public boolean HowIoTPowersMobileAppDevelopmentIndustryIn_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(HowIoTPowersMobileAppDevelopmentIndustryIn);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean HowIoTPowersMobileAppDevelopmentIndustryIn_MOVETOANDCLICK(){
	    return Element_Click(HowIoTPowersMobileAppDevelopmentIndustryIn, "moveToAndClick","HowIoTPowersMobileAppDevelopmentIndustryIn");
 	}
	public boolean HowIoTPowersMobileAppDevelopmentIndustryIn_CLICK_JAVASCRIPT(){
	    return Element_Click(HowIoTPowersMobileAppDevelopmentIndustryIn, "javaClick","HowIoTPowersMobileAppDevelopmentIndustryIn");
  	}
	public boolean HowIoTPowersMobileAppDevelopmentIndustryIn_CLICK(){
	    return Element_Click(HowIoTPowersMobileAppDevelopmentIndustryIn, "click","HowIoTPowersMobileAppDevelopmentIndustryIn");
  	}
	public String HowIoTPowersMobileAppDevelopmentIndustryIn_GETTEXT(){
	    return driver.findElement(HowIoTPowersMobileAppDevelopmentIndustryIn).getText();	}

   // HowNaturalLanguageProcessingMakesMobileApps
	public boolean HowNaturalLanguageProcessingMakesMobileApps_DISPLAYED(){
	    return VerifyElement(HowNaturalLanguageProcessingMakesMobileApps,"displayed","HowNaturalLanguageProcessingMakesMobileApps");
	}
	public boolean HowNaturalLanguageProcessingMakesMobileApps_ENABLED(){
	    return VerifyElement(HowNaturalLanguageProcessingMakesMobileApps,"enabled","HowNaturalLanguageProcessingMakesMobileApps");
	}
	public boolean HowNaturalLanguageProcessingMakesMobileApps_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(HowNaturalLanguageProcessingMakesMobileApps);
	    action.moveToElement(we).build().perform();
	    return true;
	}
	public boolean HowNaturalLanguageProcessingMakesMobileApps_MOVETOANDCLICK(){
	    return Element_Click(HowNaturalLanguageProcessingMakesMobileApps, "moveToAndClick","HowNaturalLanguageProcessingMakesMobileApps");
 	}
	public boolean HowNaturalLanguageProcessingMakesMobileApps_CLICK_JAVASCRIPT(){
	    return Element_Click(HowNaturalLanguageProcessingMakesMobileApps, "javaClick","HowNaturalLanguageProcessingMakesMobileApps");
  	}
	public boolean HowNaturalLanguageProcessingMakesMobileApps_CLICK(){
	    return Element_Click(HowNaturalLanguageProcessingMakesMobileApps, "click","HowNaturalLanguageProcessingMakesMobileApps");
  	}
	public String HowNaturalLanguageProcessingMakesMobileApps_GETTEXT(){
	    return driver.findElement(HowNaturalLanguageProcessingMakesMobileApps).getText();	}

}