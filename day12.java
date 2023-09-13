package seleniumtutorials;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class day12 {

	public static void main(String[] args) {
		// Waits in selenium--Functions in selenium to make webdriver wait for a specific time or for some condition to be true.
		//why waits are required in automation Testing 
		//..Sometimes the automation script is faster than browser than the browser loading time or object render time on browser.
		//..Different elements may load at different time interval
		//..So webdriver script and browser events may nit be synchoronous at all times
		
		//overall
		//Types of awaits
		//a. Implicit wait: useful when there is some gap in loading time of the web page and web elements.
		
 		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rasmila\\Desktop\\chromedriver\\chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     driver.get("https://www.google.com/");
	     driver.findElement(By.name("q")).sendKeys("automation step by step" + Keys.ENTER);
	     
	     //program 1
	     //implicit wait 
	  
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	     //program2
	   //explicit wait
	   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	   WebElement mylink = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Automation Step by Step: NEVER STOP LEARNING")));
	    mylink.click(); 
	    
	    
	    //program3
	     Wait<WebDriver>fluentWait=new FluentWait<WebDriver>(driver)
	     .withTimeout(Duration.ofSeconds(10))
	     .pollingEvery(Duration.ofSeconds(1))
	     .ignoring(java.util.NoSuchElementException.class);
	     
	  WebElement wait1  =fluentWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#mobile-menu")));
	  
	  
	  
	  
	
	     
	   


	     
	     
	     
	     
	    // driver.close();
	     //driver.quit();
	     


	}

	private static void ignoring() {
		// TODO Auto-generated method stub
		
	}

}
