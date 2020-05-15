package week2.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundPagesEdit {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		// to maximize
		driver.manage().window().maximize();
		driver.findElementById("email").sendKeys("sandhy.murali29@gmail.com");
		System.out.println(driver.findElementByName("username").getAttribute("value"));
		driver.findElementByXPath("//input[@value='Clear me!!']").clear();
		driver.findElementByXPath("//input[@value='Append ']").sendKeys("text", Keys.TAB);
		System.out.println(driver.findElementByXPath("(//input[@type='text'])[5]").isDisplayed());
         Thread.sleep(2000);
         driver.close();

	}

	

}
