package week5.day1;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://erail.in/trains-between-stations/new-delhi-NDLS/mumbai-central-BCT");
		driver.findElementById("chkSelectDateOnly").click();
		Thread.sleep(5000);
		WebElement table = driver.findElementByCssSelector("#divTrainsList > table");
		List<WebElement> allRows = 
				table.findElements(By.tagName("tr"));
		for (int i = 0; i < allRows.size(); i++) {
			WebElement eachRow = allRows.get(i);
			List<WebElement> allData = 
					eachRow.findElements(By.tagName("td"));
			System.out.println(allData.get(0).getText());
		}

	}

}







