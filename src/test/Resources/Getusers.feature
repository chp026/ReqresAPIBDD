Feature:
  Scenario: By using GET method user wants to get list of users
    Given user is on the reqres base uri
    When user selects GET method and selects resource and query parameter
    Then user should be able to get the correct status code and body with JSON containt type