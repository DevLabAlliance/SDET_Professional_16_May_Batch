package aui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://play.letcode.in/aui");
		WebElement src = driver.findElementById("draggable");
		WebElement tgt = driver.findElementById("droppable");
		Actions builder = new Actions(driver);
		builder.dragAndDrop(src, tgt).perform();
	}

}

