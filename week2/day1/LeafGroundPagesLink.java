package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundPagesLink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.findElementByLinkText("Go to Home Page").click();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.navigate().back();
WebElement find =driver.findElementByLinkText("Find where am supposed to go without clicking me?");
System.out.println(find.getAttribute("href"));
Thread.sleep(2000);
driver.get("http://www.leafground.com/pages/Link.html");
 WebElement broken = driver.findElementByLinkText("Verify am I broken?");
 System.out.println(broken.getAttribute("href"));
 Thread.sleep(2000);
 driver.findElementByLinkText("Go to Home Page").click();
 System.out.println(driver.getCurrentUrl());
 Thread.sleep(2000);
 driver.findElementByXPath("(//img[@class='wp-categories-icon svg-image'])[3]").click();
 Thread.sleep(2000);
 System.out.println(driver.getCurrentUrl());
 driver.get("http://www.leafground.com/pages/Link.html");
 List<WebElement> allLinks = driver.findElementsByTagName("a");
 System.out.println(allLinks.size());
 driver.close();
 
 
 


	}

}
