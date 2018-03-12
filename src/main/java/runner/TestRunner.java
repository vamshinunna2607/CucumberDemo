package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\vamsh\\eclipse-workspace\\FreeCRNBDDfreamework\\src\\main\\java\\features\\login.feature"
		,glue = {"C:\\Users\\vamsh\\eclipse-workspace\\FreeCRNBDDfreamework\\src\\main\\java\\stepDefination"},
		dryRun= false,
		monochrome=true, //display the console output in readable format
		format = {"pretty","html:test-output"}
		)


public class TestRunner {

}
