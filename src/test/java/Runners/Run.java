package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/firstTest.feature",
        glue = {"StepDefinitions"},
        tags = "@regression"
)
public class Run extends AbstractTestNGCucumberTests {
    //and or not
}
