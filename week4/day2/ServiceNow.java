package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to create the obj for driver
		ChromeDriver driver = new ChromeDriver();
		// to get the url
		driver.get("https://dev60453.service-now.com/");
		// to maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().frame("gsft_main");
		driver.findElementById("user_name").sendKeys("admin");
		driver.findElementById("user_password").sendKeys("India@123");
	driver.findElementById("sysverb_login").click();
	driver.findElementByXPath("//input[@id='filter']").sendKeys("Change");
	Thread.sleep(5000);
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElementByXPath("(//div[text()='Open'])[3]").click();
	driver.switchTo().frame(0);
	Thread.sleep(3000);
	driver.findElementByXPath("//button[@id='sysverb_new'][text()='New']").click();
	driver.findElementByLinkText("Normal: Changes without predefined plans that require approval and CAB authorization.").click();
	 String changeNo = driver.findElementByXPath("//input[@id='change_request.number']").getAttribute("value");
	 System.out.println("changeNumber "+changeNo);
	 Thread.sleep(3000);
	 driver.findElementByXPath("//input[@id='change_request.short_description']").sendKeys("creating change request by sandy");
	 driver.findElementByXPath("//button[@id='sysverb_insert']").click();
	 driver.switchTo().defaultContent();
	 Thread.sleep(3000);
	 driver.findElementByXPath("//div/input[@id='sysparm_search']").sendKeys(changeNo,Keys.ENTER);
	 Thread.sleep(3000);
	 driver.switchTo().frame(0);
	 String displayChangeNo = driver.findElementByXPath("//input[@id='change_request.number']").getAttribute("value");
	 System.out.println("displayed changeNo is :"+displayChangeNo);
	 driver.switchTo().defaultContent();
	 if (changeNo.equalsIgnoreCase(displayChangeNo)) {
		 System.out.println("change ticket sucessfully created");
		 
		
	}
	 
	 
	} 

}
