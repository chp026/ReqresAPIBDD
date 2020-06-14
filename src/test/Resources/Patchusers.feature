Feature: Patch Method
  Scenario: Post Patch to update user job title
    Given user is on the reqres base uri to update user detail
    When user should get the new user details
    Then user should be able to see the updated user information