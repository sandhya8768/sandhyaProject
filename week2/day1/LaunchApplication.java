package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		
		//to set the key
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//to create the obj for driver
		ChromeDriver driver = new ChromeDriver();
		//to get the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//to maximize
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("demosalesmanager");
	    driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
	     driver.findElementByLinkText("CRM/SFA").click();
      driver.findElementByLinkText("Leads").click();
       driver.findElementByLinkText("Create Lead").click();
      driver.findElementById("createLeadForm_companyName").sendKeys("Volante");
      driver.findElementById("createLeadForm_firstName").sendKeys("sandhya");
      driver .findElementById("createLeadForm_lastName").sendKeys("murali");
    WebElement source=  driver.findElementById("createLeadForm_dataSourceId");
      Select dropDown = new Select(source);
      dropDown.selectByVisibleText("Employee");
      WebElement Marketingcampaign =driver.findElementById("createLeadForm_marketingCampaignId");
      Select dropDown1 = new Select(Marketingcampaign);
        dropDown1.selectByValue("9001");
        
        WebElement ownsership =  driver.findElementById("createLeadForm_ownershipEnumId");
        Select dropDown2 = new Select(ownsership);
        dropDown2.selectByIndex(5);
        
        WebElement country =driver.findElementById("createLeadForm_generalCountryGeoId");
        Select dropDown3 = new Select(country);
          dropDown3.selectByValue("IND");
        
driver.findElementByName("submitButton").click();
        //to wait java thread
		Thread.sleep(2000);
		
	String str=	driver.getTitle();
	System.out.println("your page title is: "+str);


		//to close the app
		driver.close();
		
		
		
	}

}
