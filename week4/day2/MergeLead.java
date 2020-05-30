package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM')]").click();
		driver.findElementByXPath("//a[contains(text(),'Contacts')]").click();
		driver.findElementByXPath("//a[contains(text(),'Merge Contacts')]").click();
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[1]").click();
		Set<String> openWindows = driver.getWindowHandles();
		List<String> windowsOpen = new ArrayList<String>(openWindows);
		String secondWindow = windowsOpen.get(1);
		WebDriver window2 = driver.switchTo().window(secondWindow);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		Thread.sleep(1000);
		String firstWindow = windowsOpen.get(0);
		WebDriver window1 = driver.switchTo().window(firstWindow);
		Thread.sleep(1000);
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
		Thread.sleep(2000);
		Set<String> openWindows1 = driver.getWindowHandles();
		List<String> windowsOpen1 = new ArrayList<String>(openWindows1);
		String thirdWindow = windowsOpen1.get(1);
		driver.switchTo().window(thirdWindow);
 driver.findElementByXPath("(//a[@class='linktext'])[6]/parent::div[@class='x-grid3-cell-inner x-grid3-col-partyId']").click();
 String fourthWindow = windowsOpen1.get(0);
 driver.switchTo().window(fourthWindow);
 Thread.sleep(2000);
 driver.findElementByXPath("(//a[contains(text(),'Merge')])[2]").click();
	driver.switchTo().alert().accept();
	String title = driver.getTitle();
	System.out.println("The title of the page is: "+title);
	

	}

}
