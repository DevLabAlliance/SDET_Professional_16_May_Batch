package week5.day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWaits {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://play.letcode.in/waitforalert");
		WebElement btn = driver.findElement(By.id("mye"));
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("myewrong")));
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20)) // max
				.pollingEvery(Duration.ofSeconds(5)) // min
				.ignoring(NoAlertPresentException.class);



		/* btn.click(); // To handle dynamic content WebDriverWait wait = new
		 * WebDriverWait(driver, 20); wait.until(ExpectedConditions.alertIsPresent());
		 * String text = driver.switchTo().alert().getText();
		 * System.out.println("Alert text "+text); driver.switchTo().alert().accept();
		 * driver.quit();
		 */
	}

}






