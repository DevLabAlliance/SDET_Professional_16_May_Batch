package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // down casting
		driver.findElement(By.linkText(""));
		driver = new FirefoxDriver();



		/*
		 * ChromeDriver d = new ChromeDriver(); d.findElementByLinkText("");
		 * 
		 * RemoteWebDriver d1 = new ChromeDriver(); // driver.fin
		 */

	}

}
