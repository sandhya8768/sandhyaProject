package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	     driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM')]").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a[1]").click();
		String str=	driver.getTitle();
		System.out.println("your page title is: "+str);
		driver.findElementByXPath("(//div[@class='frameSectionExtra'])/a[3]").click();
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Paypal");
		//driver.findElementByXPath("(//input[@type='submit'])[12]/ancestor::tbody").click();
		driver.findElementByXPath("//td[@colspan='4']/input[@value='Update']").click();
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
	}

}
