package learnAnnotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MercuryBase {
	ChromeDriver driver;
	
	// pre-condition
	
	
	@Parameters({"browser"})
	@BeforeMethod
	public void startApp(String browser) {
		System.out.println("From XML: " +browser);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
	}
	
	// post condition
	@AfterMethod
	public void stopApp() {
		driver.quit();
	}


}



