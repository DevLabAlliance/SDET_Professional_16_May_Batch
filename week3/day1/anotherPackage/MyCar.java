package week3.day1.anotherPackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class MyCar {
	public static void main(String[] args) {
		My m = new  My();
		//		m.na

		ChromeDriver d  = new ChromeDriver();
		d.findElementByXPath("//input[@class='form-control']");
		d.findElementByTagName("h1"); // 1st matching element
	}

}
