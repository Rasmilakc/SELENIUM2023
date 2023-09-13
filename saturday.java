package seleniumtutorials;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sunday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Rasmila\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		String url="https://www.webdriveruniversity.com/Contact-Us/contactus.htm";
		driver.get(url);
		
		//Test case1----login with valid credentials
		driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		
//		WebElement FirstName = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
//		WebElement LastName = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
//		WebElement Email = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
//		WebElement comments  = driver.findElement(By.cssSelector("#contact_form > textarea"));
//		WebElement Submit  = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)"));
//		
//		
//		
//		 FirstName.sendKeys("Rasmila");
//		 LastName.sendKeys("Khatri Chhetri");
//		 Email.sendKeys("info.rasmila@gmail.com");
//		 comments.sendKeys("i am learning black magic");
//		 Submit.click();
//		 
//		boolean a=driver.findElement(By.cssSelector("#contact_reply > h1")).isDisplayed();
//		if(a) {
//			System.out.println("Test case 1 pass");
//		}
//		else {
//				System.out.println("Test case 1 fail");
//		
//				
//		}
		
		
		//testt case 2----invalid email
             driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		
//		WebElement FirstName = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
//		WebElement LastName = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
//		WebElement Email = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
//		WebElement comments  = driver.findElement(By.cssSelector("#contact_form > textarea"));
//		WebElement Submit  = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)"));
//		
//		
//		
//		 FirstName.sendKeys("Rasmila");
//		 LastName.sendKeys("Khatri Chhetri");
//		 Email.sendKeys("info.rasmilagmail.com");
//		 comments.sendKeys("i am learning black magic");
//		 Submit.click();
//		  
//		 
//		 boolean b=driver.findElement(By.cssSelector("body")).isDisplayed();
//		 if(b) {
//			 System.out.println("Test case 2 pass");
//		 }
//		 else {
//			 System.out.println("Test case 2 fail");
//			 
//			 
//		 }
//		 
		 //test case 3----reset
             driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
             
             WebElement FirstName = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
     		WebElement LastName = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
     		WebElement Email = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
     		WebElement comments  = driver.findElement(By.cssSelector("#contact_form > textarea"));
     		WebElement reset  = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)"));
     		
     		
     		
     		 FirstName.sendKeys("Rasmila");
     		 LastName.sendKeys("Khatri Chhetri");
     		 Email.sendKeys("info.rasmila@gmail.com");
    		 comments.sendKeys("i am learning black magic");
     		 reset.click();
		 String abc=driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)")).getText();
		 
		 if(abc.isEmpty()) {
			 System.out.println("Test 3 pass");
		 }
		 else {
			 System.out.println("test 3 fail");
		 }

	}

}
