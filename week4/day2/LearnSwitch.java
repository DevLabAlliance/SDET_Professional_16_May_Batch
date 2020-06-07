package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LearnSwitch {
	
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) { 
			
				if(i == 5) {
//					continue;
					break;
				}
				System.out.println(i);
			}
	}
	
	
	
	public static void main2(String[] args) {
		RemoteWebDriver driver ;
		String browser = "ff";
		switch (browser.toLowerCase()) {
		case "chrome":
			 driver = new ChromeDriver();
			break;
		case "ff":
			 driver = new FirefoxDriver();
			break;
		case "IE":
			 driver = new InternetExplorerDriver();
			 break;
			 
		default:
			System.out.println("No browser found");
//			break;
		}

	}
	public static void main1(String[] args) {
		int day =1 ;

		switch(day ) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			return;
		case 3:
			System.out.println("Wed");
		case 4:
			System.out.println("Thr");
		default:
			System.out.println("Day not matched");
		}

		if(day < 0) {
			// todo
		}
		/*
		 * if(day == 1) { System.out.println("Monday"); } if(day == 2) {
		 * System.out.println("Tuesday"); } else if(day == 3) {
		 * System.out.println("Wed"); } else if(day == 4) { System.out.println("Thr"); }
		 */

	}	

}
