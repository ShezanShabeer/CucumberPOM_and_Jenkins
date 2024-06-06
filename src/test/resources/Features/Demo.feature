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


  Scenario Outline: Login to NOP Admin website with wrong password
    Given the user launches NOP Admin url
    Then the user verifies the header text
    When the user enters "<username>" in the username webEdit
    And the user enters "<password>" in the password webEdit
    And the user clicks on the login button
    Then the user verifies page is displaying incorrect credentials
    Examples:
      |username|password|
      |admin@yourstore.com|admin123|

  Scenario Outline: Login to NOP Admin website and search for product in catalogue
    Given the user launches NOP Admin url
    Then the user verifies the header text
    When the user enters "<username>" in the username webEdit
    And the user enters "<password>" in the password webEdit
    And the user clicks on the login button
    Then the user verifies the homepage logo
    When the user clicks on products tab under catalogue
    And the user enters "<product>" name on product search
    And the user clicks on Product Search Button
    Then the user verifies the "<product>" is displayed
    Examples:
      | username | password | product |
    | admin@yourstore.com | admin | Lenovo IdeaCentre 600 All-in-One PC |

