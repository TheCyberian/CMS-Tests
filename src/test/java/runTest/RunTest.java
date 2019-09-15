package runTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"json:target/cucumber-report/cucumber.json"},
		tags= {"@GetItems, @GetItemsWithItemNumber, @GetCustomers, @GetCustomersWithCustomerId"},
		features="src/test/resources/cucumberFeatures/", 
		glue= {"stepDefinition"}
	)
public class RunTest {

}
