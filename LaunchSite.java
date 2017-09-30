package sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.Home;


public class LaunchSite {
	
	
    public String driverPath =  "C:\\Users\\Callu\\Documents\\Automation";
	
	public WebDriver driver;
	  
	  @Test
	  // Test to launch the site and verify the correct page loads.
	  public WebDriver Launchsite() {
		    // Set system property and initiate browser
		    System.setProperty("webdriver.gecko.driver", driverPath+"\\geckodriver.exe");
			driver = new FirefoxDriver();
			Reporter.log("01. Step Passed: Browser was initiated");
			//Send the URL to the browser
			String URL = "https://www.ultimateqa.com/automation/";
			driver.get(URL);
			Reporter.log("02. Step Passed: URL was sent to the browser");
			// Verify that the correct page has loaded by finding the logo image in the header
			WebElement pageTitle = driver.findElement(By.id("logo"));
		    Assert.assertTrue(pageTitle.isDisplayed());
		    Reporter.log("Test Passed: Firefox browser was launched and correct page loads ");
		    return driver;
	  }
	  
	  @Test
	  // Test to ensure all header navigation items display
	  public void verifyheader() {
		  //Home Link
		  Assert.assertTrue(Home.lnk_Home(driver).isDisplayed());
		  Reporter.log("Step 01: Passed - Home Links Displays");
		  //Video Link
		  Assert.assertTrue(Home.lnk_Videos(driver).isDisplayed());
		  Reporter.log("Step 02: Passed - Video Links Displays");
		  //Blog Link
		  Assert.assertTrue(Home.lnk_Blog(driver).isDisplayed());
		  Reporter.log("Step 03: Passed - Blog Links Displays");
		  //Exercises Link
		  Assert.assertTrue(Home.lnk_Exercises(driver).isDisplayed());
		  Reporter.log("Step 04: Passed - Exercises Links Displays");
		  //About Link
		  Assert.assertTrue(Home.lnk_About(driver).isDisplayed());
		  Reporter.log("Step 05: Passed - About Links Displays");
		  //Confirm Entire Passed
		  Reporter.log("Test Passed: All links display in header");
	  }
  
}
