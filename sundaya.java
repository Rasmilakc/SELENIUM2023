package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sundaya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webchrome.chrome.driver", "C:\\Users\\Rasmila\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver(); 
		driver.get("https://www.saucedemo.com/");
		
		
		 WebElement username =driver.findElement(By.cssSelector("#user-name"));
		 WebElement password =driver.findElement(By.cssSelector("#password"));
		 WebElement login =driver.findElement(By.cssSelector("#login-button"));
		 
		 username.sendKeys("standard_user");
		 password.sendKeys("secret_sauce");
		 login.click();
		 
		 boolean a=driver.findElement(By.cssSelector("#header_container > div.header_secondary_container")).isDisplayed();
		 if(a) {
			 System.out.println("Test case pass");
		 }
		 else {
			 System.out.println("test case fail");
		 }
		 

	}

}
