package learnFindELements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://play.letcode.in/dropdown");
	WebElement dd = driver.findElementById("Index");
	
	Select sel = new Select(dd);
	List<WebElement> options = sel.getOptions();
	for (WebElement eachOpt : options) {
		System.out.println(eachOpt.getText());
	}
	System.out.println(options.size());
	sel.selectByIndex(1);
	WebElement first = sel.getFirstSelectedOption();
	System.out.println(first);
	System.out.println(first.getText());
	driver.quit();
	
	
	
	
	
	
	}

}
