package StepDefinations1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps1 {

//	WebDriver driver = null;
//
//	@Given("browser is open")
//	public void browser_is_open() {
//
//		System.out.println("starting browser is opned");
//
//		System.setProperty("webdrive.chrome.driver",
//				"/Users/credr/eclipse-workspace/CucumberJava/CucumberSetup/src/test/resources/Drivers1/chromedriver");
//		driver = new ChromeDriver();
//
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		// driver.manage().window().maximize();
//	}
//
//	@And("user is on goolge search page")
//	public void user_is_on_goolge_search_page() {
//
//		driver.navigate().to("https://google.com");
//
//	}
//
//	@When("user enters a text on google search box")
//	public void user_enters_a_text_on_google_search_box() {
//
//		driver.findElement(By.name("q")).sendKeys("Manoj kumar");
//
//	}
//
//	@And("hits enter")
//	public void hits_enter() {
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		driver.getPageSource().contains("manoj kumar |QA engineer");
//		driver.close();
//		driver.quit();
//
//	}
//
//	@Then("user is navigated to the search reasults page")
//	public void user_is_navigated_to_the_search_reasults_page() {
//
//	}

}
