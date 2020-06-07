package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAUI {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElementByXPath("//button[.='✕']").click();
		WebElement electronics = driver.findElementByXPath("//span[.='Electronics']");
//		electronics.
		Actions act = new Actions(driver);
		
		act.moveToElement(electronics)
		.build()
		.perform();
		
		
		WebElement apple = driver.findElementByLinkText("Apple");
		apple.click();
		/*
		 * Point location = electronics.getLocation();
		 * int x = location.getX(); int y = location.getY();
		 */

	}

}

/*
 * Navigation navigate = driver.navigate();
 * navigate.to("https://www.flipkart.com/"); navigate.back();
 * navigate.forward(); navigate.refresh();
 */