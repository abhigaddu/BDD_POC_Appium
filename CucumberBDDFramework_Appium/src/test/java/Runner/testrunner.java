package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/Feature", glue = { "stepDefinitions" }, plugin = {
		"html:target/cucumber-html-report", "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
		"junit:target/cucumber-results.xml" })

public class testrunner {

}
