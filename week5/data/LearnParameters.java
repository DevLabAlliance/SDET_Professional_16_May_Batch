package data;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnParameters {



	RemoteWebDriver driver;

	@Parameters({"url", "username", "browser"})

	@Test public void tc001LearnFrames(String url, String un, String b) throws InterruptedException {
		
		switch (b) {
		case "chrome":
//			sys
			 driver = new ChromeDriver();
			break;
		case "ff":
			//sys
			 driver = new FirefoxDriver();
		default:
			break;
		}
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url); WebElement frameEle =
				driver.findElementByXPath("//*[@id='myframe']");
		driver.switchTo().frame(frameEle);
		driver.findElementById("username").sendKeys(un);
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		String text =
				driver.findElementByTagName("h1").getText();
		System.out.println(text);
		driver.quit(); }



	/*
	 * @Parameters({"url", "username"})
	 * 
	 * @Test public void tc001LearnFrames(String url, String un) throws
	 * InterruptedException { ChromeDriver driver = new ChromeDriver();
	 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 * driver.get(url); WebElement frameEle =
	 * driver.findElementByXPath("//*[@id='myframe']");
	 * driver.switchTo().frame(frameEle);
	 * driver.findElementById("username").sendKeys(un); Thread.sleep(3000);
	 * driver.switchTo().defaultContent(); String text =
	 * driver.findElementByTagName("h1").getText(); System.out.println(text);
	 * driver.quit(); }
	 */
}
