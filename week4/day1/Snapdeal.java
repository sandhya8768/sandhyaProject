package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notification-");
		ChromeDriver driver = new ChromeDriver(options);
		// to get the url
		driver.get("https://www.snapdeal.com/");
		// to maximize
		driver.manage().window().maximize();
	
WebElement men = driver.findElementByXPath("(//a[@class='menuLinks leftCategoriesProduct '])[6]");
Actions builder = new Actions(driver);
builder.moveToElement(men).perform();
Thread.sleep(3000);
driver.findElementByXPath("(//span[@class='linkTest'][contains(text(),'Shirts')])[3]").click();

WebElement picture = driver.findElementByXPath("(//picture[@class='picture-elem'])[1]");
Actions builder1 = new Actions(driver);
builder.moveToElement(picture).perform();
Thread.sleep(3000);
driver.findElementByXPath("(//div[contains(text(),'Quick View')])[1]").click();
driver.close();




	}

}
