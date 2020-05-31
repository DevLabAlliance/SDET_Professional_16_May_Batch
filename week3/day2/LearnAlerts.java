package week3.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlerts {

	public static void main(String[] args) throws NoSuchElementException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://play.letcode.in/alert");
		driver.findElementByName("qawse").click();
		System.out.println(driver.getTitle());
		
		
		
		
		/*
		 * driver.switchTo().alert().accept();
		 * driver.findElementById("zxcvbnm").click(); Thread.sleep(5000); // 3 sec Alert
		 * myalert = driver.switchTo().alert(); String myAlertText = myalert.getText();
		 * System.out.println("My alert text: "+myAlertText); myalert.dismiss();
		 * driver.findElementByXPath("//button[text()='Prompt']").click();
		 * Thread.sleep(3000); myalert.sendKeys("Koushik"); Thread.sleep(3000);
		 */
		

	}

}







