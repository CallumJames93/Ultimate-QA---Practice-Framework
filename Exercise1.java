package sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import pages.Home;

public class Exercise1 {
	
    public String driverPath =  "C:\\Users\\Callu\\Documents\\Automation";
	
	public WebDriver driver;
	
	/*
	 * This test will not actually submit the login page to do this use:
	 * Login.btn_Login(driver).submit();
	 * Note you will need to create valid credentials on Ultimate QA
	 */
	@Test
	public void Login(){
		// Call a new instance of the Firefox launch site method in Launch Site class
		LaunchSite siteLaunch = new LaunchSite();
		driver = siteLaunch.Launchsite();
		Reporter.log("01. Step Passed: Browser launched");
		// Select exercise one link from the 
		Home.lnk_Login(driver).click();
		Reporter.log("02. Step Passed: Login Button was selected");
		// Enter test data
		pages.Login.fld_Email(driver).sendKeys("test@hotmail.co.uk");
		Reporter.log("03. Step Passed: Email was entered correctly");
		pages.Login.fld_Pwd(driver).sendKeys("testpass123");
		Reporter.log("04. Step Passed: Password was entered correctly");
		// Check the remember me radio button
		pages.Login.cbox_Rmbr(driver).click();
		Reporter.log("05. Step Passed: Remember me was checked correctly");
		/* Here you would submit the form
		pages.Login.btn_Login(driver).submit();
		Reporter.log("Test Passed: Login was successfully completed");
		*/
	}
	
	@AfterClass
	public void end(){
		// Close browser once all tests are complete.
		driver.quit();
	}

}
