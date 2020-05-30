package week4.day1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to create the obj for driver
		ChromeDriver driver = new ChromeDriver();
		// to get the url
		driver.get("https://jqueryui.com/sortable/");
		// to maximize
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement item1= driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item4= driver.findElementByXPath("//li[text()='Item 4']");
		Point location = item4.getLocation();
	int x=	location.getX();
	int y =	location.getY();
	System.out.println("X="+x+"Y="+y);
	Actions builder = new Actions(driver);
	builder.dragAndDropBy(item1, x,y).perform();
	Point locationNew= item1.getLocation();
	System.out.println("The newly dropped  location is "+item1.getText()+locationNew);
	
Thread.sleep(2000);
	
		
		
		
		
	}

}
