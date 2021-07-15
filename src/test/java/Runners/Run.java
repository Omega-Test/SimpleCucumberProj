package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/firstTest.feature",
        glue = {"StepDefinitions"},
        tags = "@regression"
//        plugin = {"pretty", "json:target/cucumber-report.json" }

)
public class Run extends AbstractTestNGCucumberTests {
    //and or not
}
