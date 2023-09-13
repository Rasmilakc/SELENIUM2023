package seleniumtutorials;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class day8 {

	public static void main(String[] args) {
				// driver.getTitle()
				// driver.navigate()
				// driver.getPageSorce()
				// driver.findElemens()
		 WebDriverWait wait = null;
		System.setProperty("webdriver.chrome.Driver", "C:\\Users\\Rasmila\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url ="https://www.webdriveruniversity.com/Contact-Us/contactus.html";
		driver.get(url);
		  
	
		//working on navigate 
		driver.navigate().refresh();
		
		//getTitle
		System.out.println("page title :\t"+driver.getTitle());
		
		
		//getCurrent url
		System.out.println("Current url:"+url);
		
		
		
		//getPageSorce()
		
		WebElement pageSource = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		String rab = pageSource.getText();
		System.out.println(rab);
		
	}

}
