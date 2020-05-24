package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// 1 time declaration
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// maxi the browser
		driver.manage().window().maximize();
		// Load the URL
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
		// Enter username
//		driver.findElementById("fullName").sendKeys("admin");
		
		driver.findElementByName("userNam").sendKeys("ortonikc");
		// Enter Password
		/*
		 * driver.findElementByName("password").sendKeys("Pass123$");
		 * 
		 * driver.findElementByName("login").click();
		 */



	}

}
