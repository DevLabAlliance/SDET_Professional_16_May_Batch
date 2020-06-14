package learnTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnFrames {

	@Test
	public void tc001LearnFrames() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://play.letcode.in/frame");
		WebElement frameEle = driver.findElementByXPath("//*[@id='myframe']");
		// switching to the iframe
		driver.switchTo().frame(frameEle);
		driver.findElementById("username").sendKeys("admin");
		Thread.sleep(3000);
		// switch to main page
		driver.switchTo().defaultContent();
		
		// parent frame
		
//		driver.switchTo().parentFrame();
		
		
		String text = driver.findElementByTagName("h1").getText();
		System.out.println(text);
		driver.quit();



	}

}







