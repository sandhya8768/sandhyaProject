package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to create the obj for driver
		ChromeDriver driver = new ChromeDriver();
		// to get the url
		driver.get("https://www.nykaa.com/");
		// to maximize
		driver.manage().window().maximize();
		WebElement brands=driver.findElementByXPath("//a[contains(text(),'brands')]");
		Actions builder=new Actions(driver);
		builder.moveToElement(brands).perform();
		Thread.sleep(2000);
		WebElement popular=driver.findElementByXPath("//a[contains(text(),'Popular')]");
		Actions builder1=new Actions(driver);
		builder1.moveToElement(popular).perform();
		
		driver.findElementByXPath("(//li[@class='brand-logo menu-links'])[5]").click();
		Thread.sleep(1000);
		
Set<String> openWindows = driver.getWindowHandles();
List<String> windowsOpen = new ArrayList<String>(openWindows);
String secondWindow= windowsOpen.get(1);
WebDriver window2 = driver.switchTo().window(secondWindow);
Thread.sleep(1000);
String title = driver.getTitle();
System.out.println("The title of the second page is: "+title);
String firstWindow= windowsOpen.get(0);
WebDriver window1 = driver.switchTo().window(firstWindow);
driver.close();
Thread.sleep(1000);
String loreal= windowsOpen.get(1);
WebDriver lorealWindow = driver.switchTo().window(loreal);
driver.findElementByXPath("(//span[contains(text(),'popularity')])[1]").click();
Thread.sleep(1000);
driver.findElementByXPath("(//div[@class='control__indicator radio'])[4]").click();
Thread.sleep(1000);
driver.findElementByXPath("(//div[@class='filter-sidebar__filter-title pull-left'])[1]").click();
Thread.sleep(1000);
driver.findElementByXPath("(//label[@class='control control--checkbox'])[36]").click();
Thread.sleep(1000);
driver.findElementByXPath("(//img[@class='listing-img'])[1]").click();
Thread.sleep(3000);
String addbag= windowsOpen.get(1);
WebDriver lorealAddBag = driver.switchTo().window(addbag);
driver.findElementByXPath("(//button[text()='ADD TO BAG'])[1]").click();
driver.findElementByXPath("//div[@class='AddBagIcon']").click();
Thread.sleep(2000);
driver.findElementByXPath("//span[contains(text(),'Proceed')]").click();
String errorMsg= driver.findElementByXPath("//div[text()='We are not accepting orders of subtotal less than 500']").getText();
System.out.println("The error message is :"+errorMsg);
Thread.sleep(2000);
driver.close();

//

 

 




	
		
		

	}

}
