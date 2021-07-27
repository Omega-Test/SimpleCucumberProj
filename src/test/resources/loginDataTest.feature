Feature: Web Login with multiple data
  @datadriven
  Scenario Outline: Attempt login with specific credentials
    Given the user is on login page
    When he enters user id as "<user>"
    And he enters password as "<password>"
    And hits submit
    Then the user should be logged in successfully

    Examples:
      | user | password |
      | u1   | abc123   |
      | u2   | zxy123   |
    @bug1
    Examples:
      | user | password |
      |  u3  | abc123   |
      |  u4  | zxy123   |