Feature: To validate the Admin module


@AdminCSVExport
Scenario: To validate user is able to download the csv document
Given user launches the application
And user enters the login credentials and click on login button
Then user should be able to login to the app
And user click on the Admin module from the home page
And user is on the admin module page
And user click on the "CSV Export"
  And User select the consept name as "Drug Routes"
  And User click on the "Export button"
  Then check under download folder if file is present or not
