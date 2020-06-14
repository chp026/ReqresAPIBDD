Feature: Post User
  Scenario: By using post method user wants to POST new user
    Given user is on the reqres base uri for POST method
    When user uses POST resource and query param
    Then user should see status code 201 and correct responce