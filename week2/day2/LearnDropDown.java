package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// 1 time declaration
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// maxi the browser
		driver.manage().window().maximize();
		
		driver.get("https://play.letcode.in/dropdown");
		
		// Select dropdown
		
		WebElement fruitDD = driver.findElementById("Index");
		Select sel = new Select(fruitDD);	
		sel.selectByVisibleText("Mango");
		
		WebElement life = driver.findElementByName("text");
		Select selLife = new Select(life);
		selLife.selectByIndex(1);
		selLife.selectByValue("okok");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
