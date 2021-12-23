package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports",
                "json:target/json-report-cucumber.jason",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        // Path of the failedRerun.txt file
        features = "@target/failedRerun.txt",// @ indicates the folder
        glue = "stepdefinitions",
        tags = "@google_search",//if we do not use tags runner will run all of the feature files.
        dryRun= false
       )
public class FailedScenarioRunner {
}
