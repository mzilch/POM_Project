package utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.Assert;

//import com.aventstack.extentreports.ExtentTest;


public class SeleniumHelperBasic extends BaseClassBasic{
	
	//public WebDriver driver;
	//public ExtentTest logger;
	private Actions action;
	//public WebDriverWait wait;
	private JavascriptExecutor executor;
	
	public boolean ValidatePageTitle(String PomPageTitle)
	{
		boolean pageTitlesMatch = false;
		String webdriverTitle = driver.getTitle();		
		if (webdriverTitle.equals(PomPageTitle))
		{			
			pageTitlesMatch = true;
			System.out.println("Page_Title Verified: '"  + webdriverTitle + "'");
		}
		else
		{	
			captureScreenshot("Page Titles DO NOT MATCH Screenshot");
			pageTitlesMatch = false;
			System.out.println("Page_Title DID NOT Verify\r\nRUN Page Title: '"  + webdriverTitle + "'\r\nEXPECTED Page Title: '" + PomPageTitle + "'");
		}

		return pageTitlesMatch;
	} 
	public String captureScreenshot(String picName)
	{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentTime = getCurrentDateTime();
		String screenshotPath=System.getProperty("user.dir")+ "\\Screeenshots\\" + currentTime + " --- " + picName + ".png";		
		try {
			FileHandler.copy(src, new File("./Screenshots/" + currentTime + " --- " + picName + ".png"));			
			System.out.println("Screenshot captured");
			return screenshotPath;
		} catch (IOException e) {
			System.out.println("Unable to capture screenshot\r\n" + e.getMessage());
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return screenshotPath;
	}
	
	public String getCurrentDateTime()
	{
		DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_H_m_ss");
		java.util.Date currentDate=new java.util.Date();
		return customFormat.format(currentDate);
		 
	}
	
	public String VerifyTextEquals(By InByLocator, String DataText, String eleName)
	{
		//this.driver = Indriver;
		wait = new WebDriverWait(driver, 5);
		String returnString = "";
		
	    try
	    {	    	
	        WebElement EllyMont = driver.findElement(InByLocator);
	        wait.until(ExpectedConditions.visibilityOf(EllyMont));
	    	String returnedText = EllyMont.getText();
	    	Assert.assertEquals(returnedText, DataText,"Expected: "+ DataText + "\r\nFound: " + returnedText);
	    	System.out.println("Expected: "+ DataText + "\r\nFound: " + returnedText);
	    	//InLogger.pass("Expected: "+ DataText + "\r\nFound: " + returnedText);
	    	Reporter.log("Expected: "+ DataText + "\r\nFound: " + returnedText,true);    	

	        return returnString;
	    }
	    catch (TimeoutException e)
	    {
	    	//InLogger.info("FAILED - " + eleName + " Wait for element has timed out XPath Failed: ");
	        //InLogger.info("'TimeOut' Exception - WebDriver Waited and couldn't locate the element");
	        System.out.println(e.getMessage());
	        return returnString;
	    }
	    catch (NoSuchElementException e1)
	    {
	    	//InLogger.info("FAILED - " + eleName + " element is NOT Displayed XPath Failed: ");
	        //InLogger.info("'NoSuchElementException' Exception - WebDriver couldn't locate the element");
	        System.out.println(e1.getMessage());
	        return returnString;
	    }
	    catch (ElementNotVisibleException e2)
	    {
	    	//InLogger.info("FAILED - " + eleName + " element is NOT Visible in the DOM XPath Found element: ");
	        //InLogger.info("'ElementNotVisibleException' Exception - Element present in the DOM but Not Visisble. May be hidden");
	        System.out.println(e2.getMessage());
	        return returnString;
	    }
	    catch (ElementNotSelectableException e3)
	    {
	    	//InLogger.info("FAILED - " + eleName + " element is NOT Selectable XPath Found element: ");
	        //InLogger.info("'ElementNotSelectableException' Exception - Element present in the DOM but not selectable");
	        System.out.println(e3.getMessage());
	        return returnString;
	    }
	    catch (StaleElementReferenceException e4)
	    {
	    	//InLogger.info("WARNING - " + eleName + " element is stale XPath Found element: ");
	       // InLogger.info("'ElementNotSelectableException' Exception - Element is no longer present on the DOM page");
	        System.out.println(e4.getMessage());
	        return returnString;
	    }
	}
	
	public String Element_GetText( By InByLocator, String eleName)
	{
		//this.driver = Indriver;
		wait = new WebDriverWait(driver, 5);
		String returnString = "";
		
	    try
	    {
	        WebElement EllyMont = driver.findElement(InByLocator);
	        wait.until(ExpectedConditions.visibilityOf(EllyMont));
	        returnString = EllyMont.getText();
	        //InLogger.pass("PASSED - '" + eleName + "' GETTEXT method completed");
	        Reporter.log("PASSED - '" + eleName + "' GETTEXT method completed",true);
	        System.out.println("PASSED - '" + eleName + "' GETTEXT method completed");
	        //InLogger.pass("Captured text = '" + returnString + "'");
	        Reporter.log("Captured text = '" + returnString + "'",true);
	        return returnString;
	    }
	    catch (TimeoutException e)
	    {
	    	//InLogger.info("FAILED - " + eleName + " Wait for element has timed out XPath Failed: ");
	        //InLogger.info("'TimeOut' Exception - WebDriver Waited and couldn't locate the element");
	        System.out.println(e.getMessage());
	        return returnString;
	    }
	    catch (NoSuchElementException e1)
	    {
	    	//InLogger.info("FAILED - " + eleName + " element is NOT Displayed XPath Failed: ");
	        //InLogger.info("'NoSuchElementException' Exception - WebDriver couldn't locate the element");
	        System.out.println(e1.getMessage());
	        return returnString;
	    }
	    catch (ElementNotVisibleException e2)
	    {
	    	//InLogger.info("FAILED - " + eleName + " element is NOT Visible in the DOM XPath Found element: ");
	        //InLogger.info("'ElementNotVisibleException' Exception - Element present in the DOM but Not Visisble. May be hidden");
	        System.out.println(e2.getMessage());
	        return returnString;
	    }
	    catch (ElementNotSelectableException e3)
	    {
	    	//InLogger.info("FAILED - " + eleName + " element is NOT Selectable XPath Found element: ");
	        //InLogger.info("'ElementNotSelectableException' Exception - Element present in the DOM but not selectable");
	        System.out.println(e3.getMessage());
	        return returnString;
	    }
	    catch (StaleElementReferenceException e4)
	    {
	    	//InLogger.info("WARNING - " + eleName + " element is stale XPath Found element: ");
	        //InLogger.info("'ElementNotSelectableException' Exception - Element is no longer present on the DOM page");
	        System.out.println(e4.getMessage());
	        return returnString;
	    }
	}

	public boolean MouseOver(By InByLocator, String eleName)
	{
		//this.driver = Indriver;	
		wait = new WebDriverWait(driver, 5);
		
		
		try {
			WebElement EllyMont = driver.findElement(InByLocator);
			wait.until(ExpectedConditions.visibilityOf(EllyMont));			
			action = new Actions(driver);     
			action.moveToElement(EllyMont).build().perform();	
			//InLogger.pass("PASSED - '" + eleName + "' was MOUSEOVERED");
			System.out.println("PASSED - '" + eleName + "' was MOUSEOVERED");
			Reporter.log("PASSED - '" + eleName + "' was MOUSEOVERED",true);
			return true;
		}
	    catch (TimeoutException e)
	    {
	    	//InLogger.info("FAILED - " + eleName + " Wait for element has timed out XPath Failed: ");
	        //InLogger.info("'TimeOut' Exception - WebDriver Waited and couldn't locate the element");
	        System.out.println(e.getMessage());
	        return false;
	    }
	    catch (NoSuchElementException e1)
	    {
	    	//InLogger.info("FAILED - " + eleName + " element is NOT Displayed XPath Failed: ");
	        //InLogger.info("'NoSuchElementException' Exception - WebDriver couldn't locate the element");
	        System.out.println(e1.getMessage());
	        return false;
	    }
	    catch (ElementNotVisibleException e2)
	    {
	    	//InLogger.info("FAILED - " + eleName + " element is NOT Visible in the DOM XPath Found element: ");
	        //InLogger.info("'ElementNotVisibleException' Exception - Element present in the DOM but Not Visisble. May be hidden");
	        System.out.println(e2.getMessage());
	        return false;
	    }
	    catch (ElementNotSelectableException e3)
	    {
	    	//InLogger.info("FAILED - " + eleName + " element is NOT Selectable XPath Found element: ");
	        //InLogger.info("'ElementNotSelectableException' Exception - Element present in the DOM but not selectable");
	        System.out.println(e3.getMessage());
	        return false;
	    }
	    catch (StaleElementReferenceException e4)
	    {
	    	//InLogger.info("WARNING - " + eleName + " element is stale XPath Found element: ");
	        //InLogger.info("'ElementNotSelectableException' Exception - Element is no longer present on the DOM page");
	        System.out.println(e4.getMessage());
	        return false;
	    }		
	}
	
	public boolean EnterText(By InByLocator, String strToType)
	{
		try {
		wait = new WebDriverWait(driver, 5);		
		WebElement EllyMont = driver.findElement(InByLocator);
        wait.until(ExpectedConditions.visibilityOf(EllyMont));
        EllyMont.clear();
        EllyMont.sendKeys(strToType);
		//InLogger.pass("PASSED - '" + strToType + "' TEXT was ENTERED");
        System.out.println("PASSED - '" + strToType + "' TEXT was ENTERED");
		Reporter.log("PASSED - '" + strToType + "' TEXT was ENTERED",true);
		return true;
		}
	    catch (TimeoutException e)
	    {
	    	//InLogger.info("FAILED - " + eleName + " Wait for element has timed out XPath Failed: ");
	        //InLogger.info("'TimeOut' Exception - WebDriver Waited and couldn't locate the element");
	        System.out.println(e.getMessage());
	        return false;
	    }
	    catch (NoSuchElementException e1)
	    {
	    	//InLogger.info("FAILED - " + eleName + " element is NOT Displayed XPath Failed: ");
	        //InLogger.info("'NoSuchElementException' Exception - WebDriver couldn't locate the element");
	        System.out.println(e1.getMessage());
	        return false;
	    }
	    catch (ElementNotVisibleException e2)
	    {
	    	//InLogger.info("FAILED - " + eleName + " element is NOT Visible in the DOM XPath Found element: ");
	        //InLogger.info("'ElementNotVisibleException' Exception - Element present in the DOM but Not Visisble. May be hidden");
	        System.out.println(e2.getMessage());
	        return false;
	    }
	    catch (ElementNotSelectableException e3)
	    {
	    	//nLogger.info("FAILED - " + eleName + " element is NOT Selectable XPath Found element: ");
	        //InLogger.info("'ElementNotSelectableException' Exception - Element present in the DOM but not selectable");
	        System.out.println(e3.getMessage());
	        return false;
	    }
	    catch (StaleElementReferenceException e4)
	    {
	    	//InLogger.info("WARNING - " + eleName + " element is stale XPath Found element: ");
	        //InLogger.info("'ElementNotSelectableException' Exception - Element is no longer present on the DOM page");
	        System.out.println(e4.getMessage());
	        return false;
	    }
		
	}

	public boolean VerifyElement(By InByLocator, String VerificationType, String eleName)
	{
	    try
	    {
	    	//wait = new WebDriverWait(driver, 20);
	        //wait.until(ExpectedConditions.visibilityOfElementLocated(InByLocator));
	    	
	    	//This code helps stop a "NoSuchElementException" occurring because if that error occurs the script will stop execution
	    	if(driver.findElements(InByLocator).size() != 0)
	        //if(!driver.findElements(InByLocator).isEmpty()) //This code will work as well as a substitute so NoSuchElementException occurs
	        {   
	        	WebElement EllyMont = driver.findElement(InByLocator);
	        
		        switch (VerificationType)
		        {
		            case "displayed":
		                if (EllyMont.isDisplayed())
		                {
		                    System.out.println("PASSED - " + eleName + " element is Displayed");
		                    return true;
		                }
		                else
		                {
		                    System.out.println("FAILED - " + eleName + " element is NOT Displayed");
		                    return false;
		                }
		            case "enabled":
		                if (EllyMont.isEnabled())
		                {
		                    System.out.println("PASSED - " + eleName + " element is Enabled");
		                    return true;
		                }
		                else
		                {
		                    System.out.println("FAILED - " + eleName + " element is NOT Enabled");
		                    return false;
		                }
		        }
		        return true;
	        }
	        return false;
	    }
	    catch (TimeoutException e)
	    {
	        System.out.println("FAILED - " + eleName + " Wait for element has timed out XPath Failed: ");
	        System.out.println("'TimeOut' Exception - WebDriver Waited and could not locate the element");
	        System.out.println(e.getMessage());
	        return false;
	    }
	    catch (NoSuchElementException e1)
	    {
	        System.out.println("FAILED - " + eleName + " element is NOT Displayed XPath Failed: ");
	        System.out.println("'NoSuchElementException' Exception - WebDriver could not locate the element");
	        System.out.println(e1.getMessage());
	        return false;
	    }
	    catch (ElementNotVisibleException e2)
	    {
	        System.out.println("FAILED - " + eleName + " element is NOT Visible in the DOM XPath Found element: ");
	        System.out.println("'ElementNotVisibleException' Exception - Element present in the DOM but Not Visisble. May be hidden");
	        System.out.println(e2.getMessage());
	        return false;
	    }
	    catch (ElementNotSelectableException e3)
	    {
	        System.out.println("FAILED - " + eleName + " element is NOT Selectable XPath Found element: ");
	        System.out.println("'ElementNotSelectableException' Exception - Element present in the DOM but not selectable");
	        System.out.println(e3.getMessage());
	        return false;
	    }
	    catch (StaleElementReferenceException e4)
	    {
	        System.out.println("WARNING - " + eleName + " element is stale XPath Found element: ");
	        System.out.println("'ElementNotSelectableException' Exception - Element is no longer present on the DOM page");
	        System.out.println(e4.getMessage());
	        return false;
	    }
	}

	public boolean Element_Click(By InByLocator, String Click_How, String eleName)
	{
	    try
	    {
	    	
	        switch (Click_How)
	        {
	            case "click":
	                driver.findElement(InByLocator).click();
	                System.out.println("PASSED - " + eleName + " element was Clicked");
	                return true;
	            case "javaClick":
	                executor = (JavascriptExecutor)driver;
	                WebElement we = driver.findElement(InByLocator);
	                executor.executeScript("arguments[0].click(); ", we);
	                System.out.println("PASSED - " + eleName + " element was javaClicked");
	                return true;
	            case "moveToAndClick":
	                action = new Actions(driver);
	                WebElement we1 = driver.findElement(InByLocator);
	                action.moveToElement(we1).click().build().perform();
	                System.out.println("PASSED - " + eleName + " element was movedToAndClicked");
	                return true;
	        }
	        return false;
	    }
	    catch (TimeoutException e)
	    {
	        System.out.println("FAILED - " + eleName + " Wait for element has timed out XPath Failed: ");
	        System.out.println("'TimeOut' Exception - WebDriver Waited and could not locate the element");
	        System.out.println(e.getMessage());
	        return false;
	    }
	    catch (NoSuchElementException e1)
	    {
	        System.out.println("FAILED - " + eleName + " element is NOT Displayed XPath Failed: ");
	        System.out.println("'NoSuchElementException' Exception - WebDriver could not locate the element");
	        System.out.println(e1.getMessage());
	        return false;
	    }
	    catch (ElementNotVisibleException e2)
	    {
	        System.out.println("FAILED - " + eleName + " element is NOT Visible in the DOM XPath Found element: ");
	        System.out.println("'ElementNotVisibleException' Exception - Element present in the DOM but Not Visisble. May be hidden");
	        System.out.println(e2.getMessage());
	        return false;
	    }
	    catch (ElementNotSelectableException e3)
	    {
	        System.out.println("FAILED - " + eleName + " element is NOT Selectable XPath Found element: ");
	        System.out.println("'ElementNotSelectableException' Exception - Element present in the DOM but not selectable");
	        System.out.println(e3.getMessage());
	        return false;
	    }
	    catch (StaleElementReferenceException e4)
	    {
	        System.out.println("WARNING - " + eleName + " element is stale XPath Found element: ");
	        System.out.println("'ElementNotSelectableException' Exception - Element is no longer present on the DOM page");
	        System.out.println(e4.getMessage());
	        return false;
	    }
	}
}
