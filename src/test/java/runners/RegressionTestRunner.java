package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "html:target/default-cucumber-reports2",
                "json:target/json-report-cucumber2.jason",
                "junit:target/xml-report/cucumber2.xml",
                "rerun:target/failedRerun.txt"
        },
        features = "./src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@regression",//if we do not use tags runner will run all of the feature files.
        dryRun= false
        // dryRun = true
)

public class RegressionTestRunner {
}
