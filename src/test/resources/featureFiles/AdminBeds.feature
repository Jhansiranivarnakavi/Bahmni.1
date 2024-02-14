Feature: To validate the Admin module


  @AdminBeds
  Scenario: To validate user is able to allocate the bed
    Given user launches the application
    And user enters the login credentials and click on login button
    Then user should be able to login to the app
    And user click on the Admin module from the home page
    And user is on the admin module page
    And user click on the "Beds"
    Then user select the location of the ward "General"
    Then user select the "General ward room1"
    And user select the " Add bed "
    And user select the bed "304-c" and bed "deluxe" and click on the save button
    Then user should able to see the bed allocation



#
#
#  @Admin
#  Scenario: To validate the patient registration with valid data
#    Given user launches the application
#    And user enters the login credentials and click on login button
#    Then user should be able to login to the app
#    And user click on the Admin module from the home page
#    And user is on the admin module page
#    And user click on the "CSV Export"