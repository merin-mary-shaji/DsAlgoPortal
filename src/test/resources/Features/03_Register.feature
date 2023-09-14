Feature: Register

Scenario Outline: Check for empty field use case
    Given User opens URL "https://dsportalapp.herokuapp.com/home"
		When User click on Register link
    Then Page Title should be "Registration"
    When User enters Username as "<username>" , Password as "<password>" and Password confirmation as "<password confirmation>"
    When The user clicks on Register button
    Then The user should get error message "Please fill out this field." below first empty field "<username>" "<password>" "<password confirmation>".
       Examples:
      |username   |password|password confirmation|
      |           |        |                     |
      |  srii1234 |        |                     | 
      |  srii1234 | Qweert12|                    | 
      |           | Qweert12|    Qweert12        |
     
     

      

 Scenario Outline: Check for Password mismatch
    Given User opens URL "https://dsportalapp.herokuapp.com/home"
    When User click on Register link
    Then Page Title should be "Registration"
    When User enters Username as "<username>" , Password as "<password>" and Password confirmation as "<password confirmation>"
    When The user clicks on Register button
    Then It should display an error message "password_mismatch:The two password fields didn’t match."    
      
       Examples:
      |username   |password|password confirmation|
      | Numpy@sdet84| testpassword | testpassword1 |  
      
 
      
      
Scenario Outline: Check for Password with only numbers
    Given User opens URL "https://dsportalapp.herokuapp.com/home"
    When User click on Register link
    Then Page Title should be "Registration"
    When User enters Username as "<username>" , Password as "<password>" and Password confirmation as "<password confirmation>"
    When The user clicks on Register button
    Then It should display an error message "password_mismatch:The two password fields didn’t match."     
    
        Examples:
      |username   |password|password confirmation|
      | Numpy@sdet84| 12345678 | 12345678 |  
     
Scenario Outline: Check for Password similar to username
    Given User opens URL "https://dsportalapp.herokuapp.com/home"
    When User click on Register link
    Then Page Title should be "Registration"
    When User enters Username as "<username>" , Password as "<password>" and Password confirmation as "<password confirmation>"
    When The user clicks on Register button
    Then It should display an error message "password_mismatch:The two password fields didn’t match."    
      
       Examples:
      |username   |password|password confirmation|
      | Numpy@sdet84_1| testsdet84 | testsdet84 |    
      
Scenario Outline: Check for error message for commonly used password
    Given User opens URL "https://dsportalapp.herokuapp.com/home"
    When User click on Register link
    Then Page Title should be "Registration"
    When User enters Username as "<username>" , Password as "<password>" and Password confirmation as "<password confirmation>"
    When The user clicks on Register button
    Then It should display an error message "password_mismatch:The two password fields didn’t match."       
 
       Examples:
      |username   |password|password confirmation|
      | Numpy@sdet84_1| Welcome1 | Welcome1 |  
     
     
Scenario Outline: Check for error message for password with characters less than 8
    Given User opens URL "https://dsportalapp.herokuapp.com/home"
    When User click on Register link
    Then Page Title should be "Registration"
    When User enters Username as "<username>" , Password as "<password>" and Password confirmation as "<password confirmation>"
    When The user clicks on Register button
    Then It should display an error message "password_mismatch:The two password fields didn’t match."    
    
       Examples:
      |username   |password|password confirmation|
      | Numpy@sdet84_1| a1b2c3d | a1b2c3d |  
      

      
           