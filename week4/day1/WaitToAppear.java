package week4.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitToAppear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to create the obj for driver
		ChromeDriver driver = new ChromeDriver();
		// to get the url
		driver.get("http://www.leafground.com/pages/appear.html");
		// to maximize
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElementById("btn")));
		String text = driver.findElementByXPath("//b[contains(text(),'Voila!')]").getText();
		System.out.println(text);

	}

}
