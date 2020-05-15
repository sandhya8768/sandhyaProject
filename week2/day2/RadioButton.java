package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	     driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
	driver.findElementByXPath("//input[@id='yes']").click();
	//System.out.println("the default selected radio button is "+driver.findElementByXPath("//input[@name='news'][@value='1']").getText());
	System.out.println("the default selected radio button is: "+driver.findElementByXPath("//label[@for='Checked']").getText());
	
	
	}

}
