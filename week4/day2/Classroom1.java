package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classroom1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to create the obj for driver
		ChromeDriver driver = new ChromeDriver();
		// to get the url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		// to maximize
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("sandhya");
		Thread.sleep(2000);
	    alert.accept();
		String txt=	driver.findElementByXPath("//p[@id='demo']").getText();
		System.out.println(txt);
		Boolean yes  =txt.contains("sandhya");
		System.out.println(yes);
		}
		
		

	
		
	
}
