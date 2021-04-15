package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/Login/Login.feature"},
glue= {"stepDefinition"},
tags= "@Login  or @InvalidLogin",
dryRun=false,
monochrome=true,
strict=true,
plugin= {"html:testoutput/usha.html","junit:testoutput/usha.xml","json:testoutput/usha.json"}
)

public class Test_Runner {
	
	
}
