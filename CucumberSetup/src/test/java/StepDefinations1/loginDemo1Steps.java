package StepDefinations1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class loginDemo1Steps {
	WebDriver driver = null;

	@Given("Browser is open")
	public void browser_is_open() {
		System.out.println("starting browser is opned");

		System.setProperty("webdrive.chrome.driver",
				"/Users/credr/eclipse-workspace/CucumberJava/CucumberSetup/src/test/resources/Drivers1/chromedriver");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@And("user is on login page")
	public void user_is_on_login_page() {

		driver.navigate().to("https://qa-pro.credr.com/");

	}

	// parametarisation values multiple users
	// @When("^user enters (.*) and(.*)$")
	// public void user_enters_username_and_password(String username, String
	// password) {

	// driver.findElement(By.name("mobile")).sendKeys(username.trim());
	// driver.findElement(By.name("password")).sendKeys(password.trim());

	// single user name and password
	@When("user enters username and password")
	public void user_enters_username_and_password() {
		//Relavent Xpath
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("9632261367");

		//driver.findElement(By.name("mobile")).sendKeys("9632261367");
		driver.findElement(By.name("password")).sendKeys("log");

	}

	@And("user clicks on Sign In button")
	public void user_clicks_on_Sign_In_button() {
		driver.findElement(By.className("btn-outline")).click();

	}

	@Then("user is navigated to home screen")
	public void user_is_navigated_to_home_screen() {
		// driver.close();
		// driver.quit();

	}

}
