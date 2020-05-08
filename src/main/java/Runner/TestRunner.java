package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/main/java/featureFile/HomePage.feature",
        glue="StepDefinitions",
        tags ="@Test",
        plugin = { "pretty", "html:target/cucumber-reports" }
)

public class TestRunner
{
}
