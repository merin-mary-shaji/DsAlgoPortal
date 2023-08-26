Feature: Register

Scenario Outline: Check for empty field use case
    Given User Launch Chrome browser
    When User opens URL "https://dsportalapp.herokuapp.com/"
    And Click on Get Started
    Then Page Title should be "NumpyNinja"
    When User click on Register link
    Then Page Title should be "Registration"
    When User enters Username as "<username>" , Password as "<password>" and Password confirmation as "<password confirmation>"
    When The user clicks on Register button
    Then The user should get error message "Please fill out this field." below first empty field "<username>" "<password>" "<password confirmation>".
    Then close browser
       Examples:
      |username   |password|password confirmation|
      |           |        |                     |
      |  srii1234 |        |                     | 
      |  srii1234 | Qweert12|                    | 
      |           | Qweert12|    Qweert12        |
     
     
Scenario Outline: Check for Password mismatch
    Given User Launch Chrome browser
    When User opens URL "https://dsportalapp.herokuapp.com/"
    And Click on Get Started
    Then Page Title should be "NumpyNinja"
    When User click on Register link
    Then Page Title should be "Registration"
    When User enters Username as "<username>" , Password as "<password>" and Password confirmation as "<password confirmation>"
    When The user clicks on Register button
    Then It should display an error message "password_mismatch:The two password fields didn’t match."    
    Then close browser
      
       Examples:
      |username   |password|password confirmation|
      | Numpy@sdet84| testpassword | testpassword1 |  
      
     
Scenario Outline: Check for Password with only numbers
    Given User Launch Chrome browser
    When User opens URL "https://dsportalapp.herokuapp.com/"
    And Click on Get Started
    Then Page Title should be "NumpyNinja"
    When User click on Register link
    Then Page Title should be "Registration"
    When User enters Username as "<username>" , Password as "<password>" and Password confirmation as "<password confirmation>"
    When The user clicks on Register button
    Then It should display an error message "Password can’t be entirely numeric."   
    Then close browser
      
       Examples:
      |username   |password|password confirmation|
      | Numpy@sdet84| 12345678 | 12345678 |  
     
Scenario Outline: Check for Password similar to username
    Given User Launch Chrome browser
    When User opens URL "https://dsportalapp.herokuapp.com/"
    And Click on Get Started
    Then Page Title should be "NumpyNinja"
    When User click on Register link
    Then Page Title should be "Registration"
    When User enters Username as "<username>" , Password as "<password>" and Password confirmation as "<password confirmation>"
    When The user clicks on Register button
    Then It should display an error message "password can’t be too similar to your other personal information."   
    Then close browser
      
       Examples:
      |username   |password|password confirmation|
      | Numpy@sdet84_1| testsdet84 | testsdet84 |    
      
Scenario Outline: Check for error message for commonly used password
    Given User Launch Chrome browser
    When User opens URL "https://dsportalapp.herokuapp.com/"
    And Click on Get Started
    Then Page Title should be "NumpyNinja"
    When User click on Register link
    Then Page Title should be "Registration"
    When User enters Username as "<username>" , Password as "<password>" and Password confirmation as "<password confirmation>"
    When The user clicks on Register button
    Then It should display an error message "Password can’t be commonly used password"      
    Then close browser
       Examples:
      |username   |password|password confirmation|
      | Numpy@sdet84_1| Welcome1 | Welcome1 |  
     
     
Scenario Outline: Check for error message for password with characters less than 8
    Given User Launch Chrome browser
    When User opens URL "https://dsportalapp.herokuapp.com/"
    And Click on Get Started
    Then Page Title should be "NumpyNinja"
    When User click on Register link
    Then Page Title should be "Registration"
    When User enters Username as "<username>" , Password as "<password>" and Password confirmation as "<password confirmation>"
    When The user clicks on Register button
    Then It should display an error message "Password should contain at least 8 characters"
    Then close browser 
       Examples:
      |username   |password|password confirmation|
      | Numpy@sdet84_1| a1b2c3d | a1b2c3d |  
      
Scenario Outline: The user is succesfully able to register
    Given User Launch Chrome browser
    When User opens URL "https://dsportalapp.herokuapp.com/"
    And Click on Get Started
    Then Page Title should be "NumpyNinja"
    When User click on Register link
    Then Page Title should be "Registration"
    When User enters Username as "<username>" , Password as "<password>" and Password confirmation as "<password confirmation>"
    When The user clicks on Register button
    Then The user should be redirected to Homepage with the message "New Account Created. You are logged in as <username>"     
    Then close browser 
       Examples:
      |username   |password|password confirmation|
      | testusername| Test@123 | Test@123 |  
      
      
      