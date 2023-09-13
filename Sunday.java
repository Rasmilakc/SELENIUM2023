package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class saturday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\Rasmila\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		String url ="https://www.webdriveruniversity.com/Contact-Us/contactus.html";
		driver.get(url);
		  
		
		// test 1---login with valid credentilas
		WebElement firstname=driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		WebElement lastname=driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
		WebElement email=driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
		WebElement comment=driver.findElement(By.cssSelector("#contact_form > textarea"));
		WebElement submit=driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)"));
	
		firstname.sendKeys("Rasmila");
		lastname.sendKeys("Khatri Chhetri");
	    email.sendKeys("info.rasmila@gmail.com");
	    comment.sendKeys("learning selenium with rabindra dai and rita dijju");
	    submit.click();
	    
	   boolean a = driver.findElement(By.cssSelector("#contact_reply > h1")).isDisplayed();
	   if(a) {
		   System.out.println("test case pass");
	   }
	   else {
		   System.out.println("test case fail");
	   }
	   
	   
	   //test case 2----- invalid email id 
	   driver.get(url);
	   
	   WebElement firstname1=driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		WebElement lastname1=driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
		WebElement email1=driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
		WebElement comment1=driver.findElement(By.cssSelector("#contact_form > textarea"));
		WebElement submit1=driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)"));
	
		firstname1.sendKeys("Rasmila");
		lastname1.sendKeys("Khatri Chhetri");
	    email1.sendKeys("info.rasmilagmail.com");
	    comment1.sendKeys("learning selenium with rabindra dai and rita dijju");
	    submit1.click();
	    
	    boolean b = driver.findElement(By.cssSelector("body")).isDisplayed();
	    if(b) {
	    	System.out.println("test case 2 pass");
	    }
	    else {
	    	System.out.println("test case 2 fail");
	    	
	    }
	    
	   // test case 3-----reset
	    driver.get(url);
	    WebElement firstname2=driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		WebElement lastname2=driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
		WebElement email2=driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
		WebElement comment2=driver.findElement(By.cssSelector("#contact_form > textarea"));
		WebElement reset=driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)"));
	
		firstname2.sendKeys("Rasmila");
		lastname2.sendKeys("Khatri Chhetri");
	    email2.sendKeys("info.rasmila@gmail.com");
	    comment2.sendKeys("learning selenium with rabindra dai and rita dijju");
	    reset.click();
	    
	  String abc=driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1")).getText();
	  System.out.println(abc);
	  if(abc.isEmpty()) {
		  System.out.println("test case 3 pass");
	  } else {
		  System.out.println("test case 3 fail");
	  }
	    
	    //driver.close();
	    
	  // driver.quit();
	  
	        // driver.close()done
			// driver.quit()done
			// driver.getTitle()
			// driver.getCurrentUrl()done 42
			// driver.navigate()
			// driver.getPageSorce()
			// driver.findElement()done
			// driver.findElements()done
	    
	    
	    
	    
	  

	}

}
