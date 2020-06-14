Feature: Cecking Registration process
  Scenario: Registering a user successfuly
    Given user is on the reqres homepage
    When user is able to register successful
    Then user should be able to see message register successful