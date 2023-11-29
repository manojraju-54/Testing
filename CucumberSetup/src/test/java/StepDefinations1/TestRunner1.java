package StepDefinations1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features1/login1.feature", glue ={"StepDefinations"},
monochrome = true,
plugin = {"pretty","html:target/HtmlReports/reports.Html"}
)

   
	public class TestRunner1{

	} 

