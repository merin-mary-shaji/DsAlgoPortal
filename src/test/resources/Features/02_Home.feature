Feature: Home
 
  Scenario: Click Register
    Given User opens URL "https://dsportalapp.herokuapp.com/home"
    When User click on Register link
    Then Page Title should be "Registration"
    
      
 Scenario: Click Sign In
    Given User opens URL "https://dsportalapp.herokuapp.com/home"
  	When User click on Sign in link
    Then Page Title should be "Login"
    
 Scenario Outline: Click on DataStructure DropDown without login
    Given User opens URL "https://dsportalapp.herokuapp.com/home"
    When User click on Data Structure DropDown
    And User click on "<option>"
    Then The user get warning message "You are not logged in"
    

    Examples: 
      | option      |
      | Arrays      |
      | Linked List |
      | Stack       |
      | Queue       |
      | Tree        |
      | Graph       |


Scenario Outline: Click on Get Started of Each DataStructure Section without login
    Given User opens URL "https://dsportalapp.herokuapp.com/home"
		When User click on Get Started of "<option>"
    Then The user get warning message "You are not logged in"
    

    Examples: 
      | option      |
      |data-structures-introduction|	
      | array      |
      | linked-list |
      | stack       |
      | queue       |
      | tree        |
      | graph       |
    