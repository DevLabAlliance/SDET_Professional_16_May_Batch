package week5.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWaitLoader {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElementByCssSelector("#start > button").click();
		WebElement loader = driver.findElementByCssSelector("#loading");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		// invisibilityOf means - until the element disappear or hideif 
		wait.until(ExpectedConditions.invisibilityOf(loader));
		String text = driver.findElementByCssSelector("#finish").getText();
		System.out.println(text);
	}

}







