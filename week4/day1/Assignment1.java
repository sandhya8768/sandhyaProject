package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to create the obj for driver
		ChromeDriver driver = new ChromeDriver();
		// to get the url
		driver.get("https://acme-test.uipath.com/account/login");
		// to maximize
		driver.manage().window().maximize();
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementById("buttonLogin").click();
		Thread.sleep(2000);
		WebElement vendors  = driver.findElementByXPath("//i[@class='fa fa-truck']");
		Actions builder = new Actions(driver);
		builder.moveToElement(vendors).perform();
		driver.findElementByXPath("(//button[@class='btn btn-default btn-lg'])[4]").click();
		
		driver.findElementByLinkText("Search for Vendor").click();
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		driver.findElementById("buttonSearch").click();
		String countryName = driver.findElementByXPath("//td[contains(text(),'France')]").getText();
		System.out.println("The country name based on the vendor is "+countryName);
		driver.findElementByLinkText("Log Out").click();
		driver.close();
		
		
		
		
		
		
		
		
	}
	
}
