$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/DrivingMode.feature");
formatter.feature({
  "line": 1,
  "name": "Test Normal Driving Speed Simulator",
  "description": "",
  "id": "test-normal-driving-speed-simulator",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Validate the Drivimg mode for Normal Mode",
  "description": "",
  "id": "test-normal-driving-speed-simulator;validate-the-drivimg-mode-for-normal-mode",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User Promt for selecting Driving mode as NORMAL, SAFE , SPORTS",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters driving mode and event numbers",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User enters sensor event numbers to output the desired speed",
  "keyword": "Then "
});
formatter.match({
  "location": "DriveModeTest.user_Promt_for_selecting_Driving_mode_as_NORMAL_SAFE_SPORTS()"
});
