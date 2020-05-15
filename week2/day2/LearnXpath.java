package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	     driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM')]").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("volante");
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("sandhya");
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("murali");
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		driver.close();
		
		
		
		
			

	}

}
