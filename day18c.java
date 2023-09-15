package seleniumtutorials;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class day18c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rasmila\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/");
		String parentWindow=driver.getWindowHandle();
		//<a href="Contact-Us/contactus.html" target="_blank" id="contact-us">
		//<a href="Login-Portal/index.html" target="_blank" id="login-portal">
       
        
		driver.findElement(By.id("contact-us")).click();
		driver.findElement(By.id("login-portal")).click();
		driver.findElement(By.id("login-portal")).click();
		driver.findElement(By.id("button-clicks")).click();
		driver.findElement(By.id("to-do-list")).click();
		driver.findElement(By.id("page-object-model")).click();
		
		
		Set <String> windows = driver.getWindowHandles();
		System.out.println(windows);
		
		Iterator <String> s = windows.iterator();
		while(s.hasNext()) {
			String windowId = s.next();
			driver.switchTo().window(windowId);
			if(driver.getTitle().equals("WebDriver | Page Object Model")) {
				System.out.println(driver.getTitle());
				System.out.println("Test case  pass");
				break;
			}
			
		}
		
		driver.quit();
		
		

	}

}
