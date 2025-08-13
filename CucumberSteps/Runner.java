package CucumberSteps;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/CucumberAssign/name.feature", glue = {"CucumberSteps"}, monochrome = true, publish = true)
public class Runner extends BaseClass {

}
