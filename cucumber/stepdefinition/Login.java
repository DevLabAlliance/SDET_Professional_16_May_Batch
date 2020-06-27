package stepdefinition;

import java.util.concurrent.TimeUnit;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.DriverInstance;

public class Login extends DriverInstance{

	@Given("launch the browser")
	public void openBrowser() {
//		driver = new ChromeDriver();
	}
	@And("maximize the browser")
	public void maximize() {
		driver.manage().window().maximize();
	}
	@Given("load the URL")
	public void loadTheURL() {
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
	}

	@Given("Set timeout")
	public void setTimeout() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("user enter the username as {string}")
	public void userEnterTheUsername(String user) {
		driver.findElementByName("userName").sendKeys(user);
	}

	@When("user enter the as {string}")
	public void userEnterThePassword(String pass) {
		driver.findElementByName("password").sendKeys(pass);
	}

	@When("user click on the login button")
	public void userClickOnTheLoginButton() {
		driver.findElementByName("login").click();
	}

	@Then("loggin should success")
	public void logginShouldSuccess() {
		System.out.println("Login success");
	}






}
