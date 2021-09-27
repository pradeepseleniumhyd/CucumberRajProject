package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/java/features/facebook.feature"},
		glue= {"stepDefinitions"},
		dryRun=false,
		monochrome = true,publish = true,
		plugin = {"pretty","html:target/fb.html","json:target/fb.json","junit:target/fb.xml"},
		//tags = "~@regressionTest or @smokeTest"
	tags="@regressionTest1234"
		)
public class FbRunnerTest {

}
