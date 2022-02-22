package runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"steps"},
    monochrome = false,
    publish = false,
    plugin = {"html:test-output/HtmlReport/cucumber.html","json:target/cucumber-reports.json","pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
    tags = "@Scenario1"
    //"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
    //"html:test-output/HtmlReport/cucumber.html"
)



public class runner {
    
}
