package StepDefination;

import java.io.IOException;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import Pages.DriveMode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DriveModeTest
{
	
	DriveMode ct=new DriveMode();
		
	@Given("^User Promt for selecting Driving mode as NORMAL, SAFE , SPORTS$")
	public void user_Promt_for_selecting_Driving_mode_as_NORMAL_SAFE_SPORTS() throws IOException 
	{
	    
	    ct.SelectMode();
	   
	}

	@Then("^User enters driving mode and event numbers$")
	public void user_enters_driving_mode() throws IOException
	{
		
		ct.Sensorvalue();
	}
	
	@Then("^User enters sensor event numbers to output the desired speed$")
	public void user_enters_sensor_event_numbers_to_output_the_desired_speed() throws IOException 
	{
	    // Write code here that turns the phrase above into concrete actions
		ct.TextExit();
	    
	}
		
	
}
