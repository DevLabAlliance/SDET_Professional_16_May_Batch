package learnFindELements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindButtons {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://play.letcode.in/button");
		
		List<WebElement> buttons = driver.findElements(By.xpath("//button"));
		int size = buttons.size();
		if(size == 7) {
			System.out.println("Pass");
		}else {System.out.println("Fail");}
		
		
		// second button text
		WebElement secEle = buttons.get(1);
//		System.out.println(secEle.submit());
//		secEle.getScreenshotAs(target)
		
		// print all the buttons names
		
		/*
		 * for (WebElement btn : buttons) { System.out.println(btn.getText());
		 * System.out.println(btn.getLocation());
		 * System.out.println(btn.getCssValue("background-color")); }
		 */
		driver.quit();
		
		
		
		
		
		
		
		
		

	}

}
