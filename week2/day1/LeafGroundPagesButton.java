package week2.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundPagesButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.findElementById("home").click();
		driver.get("http://www.leafground.com/pages/Button.html");
		System.out.println(driver.findElementById("position").getLocation());
		System.out.println(driver.findElementById("color").getCssValue("background"));
		System.out.println(driver.findElementById("size").getSize());
	}

}
