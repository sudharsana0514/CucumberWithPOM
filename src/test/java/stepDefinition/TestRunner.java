package stepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Sudharsana\\Cucumber\\Cucumber01\\src\\test\\java\\stepDefinition\\AddTariffPlan.feature",dryRun=false,strict=true,monochrome=true,glue= {"stepDefinition"},plugin="html:target")

public class TestRunner {

}
