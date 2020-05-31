package week3.day2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LearnException {

	public static void main(String[] args){
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://play.letcode.in/frame");
		// take screenshot

		File src = driver.getScreenshotAs(OutputType.FILE);
		File dst = new File("./snaps/img.png");
		try {
			FileHandler.copy(src, dst);
		} catch (IOException e1) {
			System.err.println("Folder not avail");
		}
		WebElement frameEle = driver.findElementByXPath("//*[@id='myframe']");

		// switching to the iframe
		driver.switchTo().frame(frameEle);
		try {
			driver.findElementById("user").sendKeys("admin");

		} catch (NoSuchElementException e) {
			System.err.println("No ele");
			throw new RuntimeException();
		}
		// exce
		driver.findElementById("password").sendKeys("admin");
	}

	void eat() throws InterruptedException, Exception{
		Thread.sleep(5000);
	}

	void sleep() throws InterruptedException {
//		eat();
	}

	void code() {
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void repeat() {
		code();
	}
}





