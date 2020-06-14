package learnTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnAlerts {

	@Test
	public void tc001HandleAlert() throws NoSuchElementException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://play.letcode.in/alert");
		driver.findElementById("zxcvbnm").click();
		Alert myalert = driver.switchTo().alert(); 
		String myAlertText = myalert.getText();
		System.out.println("My alert text: "+myAlertText);
		myalert.dismiss();
		driver.findElementByXPath("//button[text()='Prompt']").click();
		myalert.sendKeys("Koushik"); 
		myalert.accept();
		driver.quit();
	}
}