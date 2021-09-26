package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/features/login.feature"},
		glue = {"stepDefinitions"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/index.html","json:target/report.json","junit:target/report.xml"},
		publish = true
		)
public class SmokeRunnerTest {

}
