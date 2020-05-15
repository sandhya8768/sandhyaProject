package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		driver.findElementByXPath("(//a[@class='x-tab-strip-close'])[3]/parent::li").click();
		//driver.findElementByXPath("//input[@class=' x-form-text x-form-field '][@name='emailAddress']").sendKeys("gopinath@testleaf.com");
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("sandhya.murali29@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
	Thread.sleep(2000);
		String text = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])/a[1]").getText();
		System.out.println("The First name is:" +text);
	driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])/a[1]").click();
//	Thread.sleep(3000);
//	driver.findElementByXPath("(//a[text()='10234'])[1]").click();
//	Thread.sleep(2000);
    driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
    String title2 = driver.getTitle();
     System.out.println("Verify the title is " +title2);
     
driver.findElementByXPath("//input[@value='Create Lead'][@name='submitButton']").click();
   String duplicate =driver.findElementById("viewLead_firstName_sp").getText();
  System.out.println("The duplicate name is " +duplicate);
  Thread.sleep(2000);
     // driver.close();
      
     
     
	}

}
