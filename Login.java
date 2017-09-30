package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	 private static WebElement element = null;
	 
	 // Login Page Objects
	 
	 //Email Field
	 public static WebElement fld_Email(WebDriver driver){
	 
	    element = driver.findElement(By.id("user_email"));
	    return element;
	 
	    }
	 
	 //Password Field
	 public static WebElement fld_Pwd(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/form/div[2]/input"));
		    return element;
		 
		    }
	 
	 //Login Button
	 public static WebElement btn_Login(WebDriver driver){
		 
		    element = driver.findElement(By.className("btn btn-primary btn-block"));
		    return element;
	 }

}
