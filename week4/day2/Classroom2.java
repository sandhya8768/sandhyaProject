package week4.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Classroom2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to create the obj for driver
		ChromeDriver driver = new ChromeDriver();
		// to get the url
		driver.get("https://dev60453.service-now.com/");
		// to maximize
		driver.manage().window().maximize();
		driver.switchTo().frame("gsft_main");
		driver.findElementById("user_name").sendKeys("admin");
		driver.findElementById("user_password").sendKeys("India@123");
		driver.findElementById("sysverb_login").click();
		String str = driver.getTitle();
		System.out.println("your page title is: " + str);
		
		
	
	}

}
