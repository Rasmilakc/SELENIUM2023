package seleniumtutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day17acheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rasmila\\Desktop\\chromedriver\\chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
        // Find all the checkboxes on the page
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

        // Loop through the checkboxes and select them
        for (WebElement checkbox : checkboxes) {
            if (!checkbox.isSelected()) {
                checkbox.click(); // Select the checkbox if it's not already selected
                System.out.println("Selected checkbox: " + checkbox.getAttribute("id"));
            }
        }

        // Loop through the checkboxes again and deselect them
        for (WebElement checkbox : checkboxes) {
            if (checkbox.isSelected()) {
                checkbox.click(); // Deselect the checkbox if it's already selected
                System.out.println("Deselected checkbox: " + checkbox.getAttribute("id"));
            }
        }

        // Close the browser
        driver.quit();
    }


	}


