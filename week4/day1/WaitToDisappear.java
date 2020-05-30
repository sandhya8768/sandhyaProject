package week4.day1;

import java.time.Duration;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitToDisappear {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to create the obj for driver
		ChromeDriver driver = new ChromeDriver();
		// to get the url
		driver.get("http://www.leafground.com/pages/disapper.html");
		// to maximize
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.invisibilityOf(driver.findElementById("btn")));
		String text = driver.findElementByXPath("//strong[contains(text(),'disappear')]").getText();
		System.out.println(text);
		
		
		
		
		
		
	}

}
