Feature: nopcommerce
  Scenario Outline: Login to NOP Admin website
    Given the user launches NOP Admin url
    Then the user verifies the header text
    When the user enters "<username>" in the username webEdit
    And the user enters "<password>" in the password webEdit
    And the user clicks on the login button
    Then the user verifies the homepage logo
    And the user clicks on logout button
    Examples:
      |username|password|
    |admin@yourstore.com|admin|