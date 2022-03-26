package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClassBasic {

	public WebDriver driver;
	public WebDriverWait wait;
	public Actions action;
	public ExcelDataProvider excel;
	public ConfigDataProvider configdata;
	public ExtentReports report;
	public ExtentTest logger;
	//public String browser;
	//private ExtentHtmlReporter extent;

	/*
	 * public synchronized static ExtentHtmlReporter getReporter() { if (extent ==
	 * null) { //Set HTML reporting file location ExtentHtmlReporter extent= new
	 * ExtentHtmlReporter(new File(System.getProperty("user.dir") +
	 * "/Reports/FreeCRM_" + Helper.getCurrentDateTime() + ".html")); report = new
	 * ExtentReports(); report.attachReporter(extent); } return extent; }
	 */

	@BeforeSuite
	public void setUpSuite() {
		Reporter.log("Inside setUpSuite", true);

		//excel = new ExcelDataProvider();
		//configdata = new ConfigDataProvider();

	}

	@Parameters("browser")
	@BeforeClass
	public void presetup(String browser) {
		Reporter.log("Inside presetup",true);
		
		//Get Browser Info from Data.xlsx
		//excel = new ExcelDataProvider();
		configdata = new ConfigDataProvider();
		//browser = configdata.getBrowser();	
		System.out.println("--- Launching " + browser + " browser");
		driver = BrowserFactory.startBrowser(driver, browser);
	}

	
	  @AfterClass public void tearDown() { 
		  Reporter.log("Inside tearDown", true);
	      BrowserFactory.quitBrowser(driver); 
	  }
	 

	/*
	 * @AfterMethod public void tearDownMethod(ITestResult result) {
	 * 
	 * Reporter.log("Inside tearDownMethod",true); String pngpath =
	 * Helper.captureScreenshot(driver,"LastPage");
	 * if(result.getStatus()==ITestResult.FAILURE) { try {
	 * logger.fail("Test Failed",
	 * MediaEntityBuilder.createScreenCaptureFromPath(pngpath).build()); } catch
	 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); } }
	 * else if(result.getStatus()==ITestResult.SUCCESS) { try {
	 * logger.pass("Test Passed",
	 * MediaEntityBuilder.createScreenCaptureFromPath(pngpath).build()); } catch
	 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); } }
	 * 
	 * report.flush();
	 * 
	 * 
	 * }
	 */

}
