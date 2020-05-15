package week2.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
	  driver.findElementByLinkText("Create Lead").click();
	driver.findElementById("createLeadForm_companyName").sendKeys("Volante");
     driver.findElementById("createLeadForm_firstName").sendKeys("sandhya");
    driver.findElementById("createLeadForm_lastName").sendKeys("murali");
    driver.findElementById("createLeadForm_primaryEmail").sendKeys("sandhya.murali29@gmail.com");
   driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9940037187");
   driver.findElementByName("submitButton").click();
   Thread.sleep(2000);
	driver.findElementByLinkText("Find Leads").click();
	driver.findElementByXPath("(//a[@class='x-tab-strip-close'])[2]/parent::li").click();
	driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99", Keys.ENTER);
Thread.sleep(2000);
String text=driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a[1]").getText();
System.out.println("The First Lead is:"+text);

//System.out.println("The first leadId is:" +driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a[1]").getText());
driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a[1]").click();
	driver.findElementByXPath("(//div[@class='frameSectionExtra'])/a[4]").click();
	driver.findElementByLinkText("Find Leads").click();
driver.findElementByXPath("(//div[@class='x-form-element'])/input[@name='id']").sendKeys(text);
driver.findElementByXPath("//button[text()='Find Leads']").click();
System.out.println("The first deleted leadId is not there :" +driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a[1]").getText());
//		driver.close();
		
		
		
		
		
	}

}
