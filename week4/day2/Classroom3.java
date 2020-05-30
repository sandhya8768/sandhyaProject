package week4.day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Classroom3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to create the obj for driver
		ChromeDriver driver = new ChromeDriver();
		// to get the url
		driver.get("https://www.irctc.co.in/nget/train-search");
		// to maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String WindowHandle = driver.getWindowHandle();
		System.out.println(WindowHandle);
		driver.findElementByXPath("//button[@class='btn btn-primary']").click();
		driver.findElementByXPath("//li[@id='flight']").click();
		Set<String> openWindows = driver.getWindowHandles();
		List<String> windowsOpen = new ArrayList<String>(openWindows);
		String secondWindow= windowsOpen.get(1);
		WebDriver window2 = driver.switchTo().window(secondWindow);
		 WebElement guidline = driver.findElementByXPath("//input[@id='agree']");
		 Actions builder = new Actions(driver);
		 builder.moveToElement(guidline).click().perform();
		 driver.findElementByXPath("//button[contains(text(),'Continue ')]").click();
		 File source=driver.getScreenshotAs(OutputType.FILE);
		 File target = new File("./snaps/flight.png");
		 FileUtils.copyFile(source, target);
		 
		 String firstWindow= windowsOpen.get(0);
		 WebDriver window1 = driver.switchTo().window(firstWindow);
		 driver.close();
		 
		 
		 
		 
		 
		 
		
		
	}

}
