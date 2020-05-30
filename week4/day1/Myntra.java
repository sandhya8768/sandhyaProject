package week4.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to create the obj for driver
		ChromeDriver driver = new ChromeDriver();
		// to get the url
		driver.get("https://www.myntra.com/");
		// to maximize
		driver.manage().window().maximize();
		WebElement women = driver.findElementByXPath("(//a[text()='Women'])[1]");
		Actions builder = new Actions(driver);
		builder.moveToElement(women).perform();
		Thread.sleep(3000);
		driver.findElementByXPath("//a[text()='Jackets & Coats']").click();
		//find the total count of item
		Thread.sleep(3000);
		String count = driver.findElementByXPath("//span[@class='title-count']").getText();
		String count1 = count.replaceAll("[!@#$%^&*()a-zA-Z ]","");
		int totalItems = Integer.parseInt(count1);
		System.out.println("totalItems: "+totalItems);
		//validate the sum of categories count matches 
		//count of jackets
		 String jacket = driver.findElementByXPath("(//span[@class='categories-num'])[1]").getText();
		 String jack = jacket.replaceAll("[a-zA-Z!@#$%^&*()]", "");
		 int jacketcount = Integer.parseInt(jack);
		 System.out.println("jacketsCount: "+jacketcount);
		 //count the no of coats
		 String coat = driver.findElementByXPath("(//span[@class='categories-num'])[2]").getText();
		 String coat1= coat.replaceAll("[!@#$%67*()]", "");
		 int coatcount = Integer.parseInt(coat1);
		 System.out.println("count Count :"+coatcount);
		 int total=jacketcount+coatcount;
		 System.out.println("total count: "+total);
		if (total==totalItems) {
			System.out.println("sum of count matches with total items");
				}
		driver.findElementByXPath("(//div[@class='common-checkboxIndicator'])[2]").click();
		driver.findElementByXPath("//div[@class='brand-more']").click();
		driver.findElementByXPath("//input[@type='text' and @placeholder='Search brand']").sendKeys("MANGO");
		driver.findElementByXPath("(//div[@class='common-checkboxIndicator'])[11]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']").click();
		List<WebElement> brand = driver.findElementsByXPath("//div/h3[@class='product-brand']");
		for (WebElement webElement : brand) {
			String brandName = webElement.getText();
			if (brandName.equalsIgnoreCase("MANGO")) {
				System.out.println("caot brand is: "+brandName);
				
				
			}
					
			
		}
		
		
		
		builder.moveToElement(driver.findElementByXPath("//div[@class='sort-sortBy']/span[text()='Recommended']")).perform();
		driver.findElementByXPath("//li/label[text()='Better Discount']").click();
		String price = driver.findElementByXPath("//div[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/a/div[2]/div/span[1]/span[1]").getText();
		System.out.println("first dsiplayed item price: "+price);
		Thread.sleep(2000);
		builder.moveToElement(driver.findElementByXPath("(//h4[@class='product-product'])[1]")).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//div/span[text()='wishlist'][1]").click();
		
		
		
		
		

	}

}
