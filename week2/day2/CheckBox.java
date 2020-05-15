package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	     driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.findElementByXPath("(//input[@type='checkbox'][//div[text()='Java']])[1]").click();
	Boolean Confirm = driver.findElementByXPath("(//input[@type='checkbox'])[6]").isSelected();
	System.out.println(Confirm);
	 
			
	driver.findElementByXPath("(//input[@type='checkbox'])[8]").click();

	
	driver.findElementByXPath("(//input[@type='checkbox'])[9]").click();
	driver.findElementByXPath("(//input[@type='checkbox'])[10]").click();
	driver.findElementByXPath("(//input[@type='checkbox'])[11]").click();
	driver.findElementByXPath("(//input[@type='checkbox'])[12]").click();
	driver.findElementByXPath("(//input[@type='checkbox'])[13]").click();
	driver.close();
	
	
	
	
		
	}

}
