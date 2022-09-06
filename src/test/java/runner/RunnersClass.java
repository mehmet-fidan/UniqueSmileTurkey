package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (

        features = {"src/test/java/features/BookAppointment.feature"},
        glue = {"stepDefinitions","utils"}
)


public class RunnersClass extends AbstractTestNGCucumberTests {

}
