package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class Home {
	
	 private static WebElement element = null;
	 
	 /* Navbar Items - All links within the top navigation header.
	 
	 Home link*/
	 public static WebElement lnk_Home(WebDriver driver){
	 
	    element = driver.findElement(By.id("menu-item-471"));
	    return element;
	 
	    }
	 
	 // Video Tutorials Link
	 public static WebElement lnk_Videos(WebDriver driver){
		 
		    element = driver.findElement(By.id("menu-item-504"));
		    return element;
		 
		    }
	 
	 //Blog Link
	 public static WebElement lnk_Blog(WebDriver driver){
		 
		    element = driver.findElement(By.id("menu-item-477"));
		    return element;
		 
		    }
	 
	 // Automation Exercises Link
	 public static WebElement lnk_Exercises(WebDriver driver){
		 
		    element = driver.findElement(By.id("menu-item-587"));
		    return element;
		 
		    }
	 
	 // About Link
	 public static WebElement lnk_About(WebDriver driver){
		 
		    element = driver.findElement(By.id("menu-item-56"));
		    return element;
		 
		    }
	 
     /* 
      *  To be completed
      * 
      * This section contains the Exercise Links
      * Login Automation
      * Big Page Many Elements
      * Fill out forms
      * Automate Application over time
      * Interactions with simple elements
       */
	 
	 // Login exercise link
	 public static WebElement lnk_Login(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//*[@id='post-507']/div/div[2]/div/div[1]/div/div/div/ul/li[1]/a"));
		    return element;
		 
		    }
	 
	// Big Page exercise link
	 public static WebElement lnk_BigPge(WebDriver driver){
		 
		    element = driver.findElement(By.id(""));
		    return element;
		 
		    }
	 
	// Forms exercise link
	 public static WebElement lnk_Forms(WebDriver driver){
		 
		    element = driver.findElement(By.id(""));
		    return element;
		 
		    }
	 
	// Time exercise link
	 public static WebElement lnk_Time(WebDriver driver){
		 
		    element = driver.findElement(By.id(""));
		    return element;
		 
		    }
	 
	// Simple exercise link
	 public static WebElement lnk_Simple(WebDriver driver){
		 
		    element = driver.findElement(By.id(""));
		    return element;
		 
		    }
	 

}
