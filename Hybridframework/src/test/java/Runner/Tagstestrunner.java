package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


/*
	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/Tagsfeaturefile", glue= {"StepDefinitions"}, 
	tags= "@regressiontest"
	)*/
	public class Tagstestrunner {
}
	//plugin= {"pretty", "html:target/Tagsreports/report.hrml"},