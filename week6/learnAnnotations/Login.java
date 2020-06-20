package learnAnnotations;

import org.testng.annotations.Test;

public class Login extends MercuryBase{

	@Test
	public void login() {
//		startApp();
		System.out.println("Login");
		driver.findElementByName("userName").sendKeys("ortonikc");
		driver.findElementByName("password").sendKeys("Pass123$");
		driver.findElementByName("login").click();
//		stopApp();

	}

}
