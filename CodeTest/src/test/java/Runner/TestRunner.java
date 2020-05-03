package Runner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features= {"src/test/java/Features/DrivingMode.feature"}, // the path of feature files
//features= {"\\SeleniumPrac\\Competentia\\src\\test\\java\\Features\\Login.feature"}, // the path of feature files
glue= {"StepDefination"}, // Path of the step definition files  
plugin= {"pretty","html:test-output", "junit:junit_xml/cucumber.xml"}, // to generate different type of reports
monochrome= true, //display the console output in a proper readable format
strict=true, // True: will fail the execution if there are any undefined or pending steps.
//tags= {"@Sanity,@smoke,@Regression"}
tags= {"@Sanity"}
)
public class TestRunner
{

	private TestNGCucumberRunner testNGCucumberRunner;
	
	@BeforeClass
	public void setUpClass()
	{
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());	
	}
	@Test(description="Runs Cucumber Feature",dataProvider="features")
	public void feature(CucumberFeatureWrapper cFeature)
	{
		testNGCucumberRunner.runCucumber(cFeature.getCucumberFeature());
	}
	@DataProvider(name="features")
	public Object[][] getFeatures()
	{
		return testNGCucumberRunner.provideFeatures();
	}
	@AfterClass
	public void tearDown()
	{
		testNGCucumberRunner.finish();
	}
	
	
}
