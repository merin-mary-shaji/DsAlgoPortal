@tag
Feature: SignIn feature

  Background: 
    Given The user is in the Sign in page

  Scenario Outline: The user is able to signin with registered credential
    When The user enters a valid "<username>" and "<password>"
    Then click login button to verify

    Examples: 
      | username     | password |
      | testusername | Test@123 |

  Scenario: Verifying Register link
    When The user clicks on register link on signin page
    Then The user redirected to Registration page from signin page

  Scenario Outline: User on login page and login with invalid inputs
    When The user enter invalid "<username>" and "<password>"
    Then click login button to verify
    And Error message will be displayed

    Examples: 
      | username | password |
      | user     | passowrd |

  Scenario Outline: User invalid and valid inputs from Excel on login page and login with
    When The user enter sheet "<Sheetname>" and <RowNumber>
    Then click login button to verify the message

    Examples: 
      | Sheetname | RowNumber |
      | Sheet1    |         0 |
      | Sheet1    |         1 |
      | Sheet1    |         2 |

  Scenario Outline: Verifying signout link
    When The user enters a valid "<username>" and "<password>"
    Then click login button to verify
    Then The user is in the Home page with valid  log in
    And The user clicks Sign out
    And Logout message should be displayed

    Examples: 
      | username     | password |
      | testusername | Test@123 |
