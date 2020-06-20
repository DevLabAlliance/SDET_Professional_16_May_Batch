package learnAnnotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flights extends MercuryBase {
@Test
	public void flight() {
			
//		startApp();
		
		System.out.println("Flights");
		driver.findElementByName("userName").sendKeys("ortonikc");
		driver.findElementByName("password").sendKeys("Pass123$");
		driver.findElementByName("login").click();
		
//		stopApp();




	}

}
