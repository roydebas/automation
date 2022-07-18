package cucumberOptions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/* for normal cucumber run, uncomment it
@RunWith(Cucumber.class)
*/

@CucumberOptions(
		features = "src/main/java/features",    //location of feature file
		glue="stepDefination")    //package name of stepDefination


/* for normal cucumber run, uncomment it
public class TestRunner {
	
	}
*/

//for integrating testng and cucumber  

public class TestRunner extends AbstractTestNGCucumberTests {
	
}