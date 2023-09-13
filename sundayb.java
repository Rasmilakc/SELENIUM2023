package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sundayb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Rasmila\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		//<h2 name="contactme" class="section_header">CONTACT US</h2>
		//tagName
		WebElement headtwo = driver.findElement(By.cssSelector("h2"));
		String a = headtwo.getText();
		System.out.println(a);
		
		
		//class
		WebElement headtwob= driver.findElement(By.cssSelector(".section_header"));
		String b=headtwob.getText();
		System.out.println(b);
		
		
		//id
		
		WebElement headtwoc= driver.findElement(By.cssSelector("#contact_form"));
		boolean c=headtwoc.isDisplayed();
		System.out.println(c);
		
	}

}
