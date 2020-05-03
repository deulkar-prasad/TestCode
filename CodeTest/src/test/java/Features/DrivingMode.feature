Feature: Test Normal Driving Speed Simulator 


@Sanity
Scenario: Validate the Drivimg mode for Normal Mode
Given User Promt for selecting Driving mode as NORMAL, SAFE , SPORTS
Then User enters driving mode and event numbers 
Then User enters sensor event numbers to output the desired speed

