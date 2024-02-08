package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Featurefile", glue= {"StepDefinitions"},monochrome=true,
plugin= {"pretty", "json:target/JSONreports/reports.json"},
tags="@Loginfunctionality"
)
//use pretty to see more inforation of a feature like all scenario steps

//to remove junk information use monochrome -- it will provide more readability of console

//publish =true -- to remove few lines of red color information from console

//plugin ={"usage"} it will how much time taken for each and every scenario -- if you want to improve performace use this
public class TestRunner {

}
