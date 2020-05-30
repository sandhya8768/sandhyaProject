package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTextToChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to create the obj for driver
		ChromeDriver driver = new ChromeDriver();
		// to get the url
		driver.get("http://www.leafground.com/pages/TextChange.html");
		// to maximize
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.textToBe(By.id("btn"), "Click ME!"));
		driver.findElementById("btn").click();
		
			
	
		
		
	}

}
