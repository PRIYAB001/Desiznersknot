package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/java/featureFile"},

        glue = "stepDefinition",
        dryRun = false,
        monochrome = true,
        publish = true,
        plugin = {
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:failed_scenarios/failed_scenarios.txt",
                "pretty",
                "html:target/cucumber-reports/report.html"
        }
//        , tags = "@Regression"
)

public class cucumberRunner {
}
