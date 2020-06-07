package learnFindELements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricket {
	/*
	 * 1. Google 
	 * 2. type & enter cricket 
	 * 3. find the no.of words cricket or Cricket
	 * in page
	 */
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.switchTo().activeElement()
		.sendKeys("cricket", Keys.ENTER);
		List<WebElement> crickets = driver.findElementsByXPath("//*[contains(text(),'cricket') or contains(text(),'Cricket')]");
		System.out.println(crickets.size());
		
	}

}
