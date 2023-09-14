Feature: Linked List feature
  To validate the linkedlist feature file
 Scenario: user logsin 
     Given The user is on Signin page of DS Algo portal
    When The user enter valid "testusername" and "Test@123"
    Then The user redirected to homepage
 
   Scenario: User navigated to linkedlist page
    When The user selecting linkedlist item from the drop down menu
    Then The user redirected to linkedlist  Page

  Scenario: The user is able to navigate to introduction of linkedlist page
    Given The user is on the linkedlist page after logged in
    When The user clicks on the introduction link
    Then The user should then be directed to introduction page 

  Scenario: The user is able to navigate to a page having an tryEditor 
    When The user clicks Try Here button in introduction of linkedlist page
    Then The user should be redirected to a page having an Editor page with a Run button to test

  Scenario Outline: The user is able to run valid code in tryEditor page of linkedlist
    When The user gets input from spread sheet "<name>" and <Row>
    And The user clicks on Run button after Entering valid python code in introduction of linkedlist  tryEditor
    Then The user should be presented with Run output welcome to linkedlist page

    Examples: 
      | name  | Row |
      |llCode |         0 |

  Scenario Outline: The user is able to get the error message for invalid syntax of linkedlist page 
    Given The user is in introduction of linkedlist  page having an tryEditor with a Run button to test
    When The user gets invalid input from spread sheet "<name>" and <Row>
    And The user clicks on Run button after Entering invalid python code in introduction of linkedlist tryEditor
    Then The user should expect the error message 

    Examples: 
      | name  | Row |
      |llCode |         1 |

  Scenario: The user is able to navigate to creating linkedlist Page
    When The user clicks on the creating linkedlist button
    Then The user should then be directed to creating linkedlist Page

  Scenario: The user is able to navigate to creating linkedlist page having an tryeditor
    When The user clicks Try Here button in creatinglinkedlist page
    Then The user should be redirected to a page having an Editor page with a Run button to test

  
  Scenario Outline: The user is able to run valid code in tryEditor page of linkedlist
    When The user gets input from spread sheet "<name>" and <Row>
    And The user clicks on Run button after Entering valid python code in introduction of linkedlist  tryEditor
    Then The user should be presented with Run output welcome to linkedlist page

    Examples: 
      | name  | Row |
      |llCode |         0 |

 Scenario Outline: The user is able to get the error message for invalid syntax of linkedlist page 
    Given The user is in introduction of linkedlist  page having an tryEditor with a Run button to test
    When The user gets invalid input from spread sheet "<name>" and <Row>
    And The user clicks on Run button after Entering invalid python code in introduction of linkedlist tryEditor
    Then The user should expect the error message 

    Examples: 
      | name  | Row |
      |llCode |         1 |
  Scenario: The user is able to navigate to types of linkedlist Page
    When The user clicks on the types of linkedlist button
    Then The user should be directed to types of linkedlist Page

  Scenario: The user is able to navigate to types of linkedlist page having an tryEditor
    When The user clicks Try Here button in types of linkedlist page
    Then The user should be redirected to a page having an Editor page with a Run button to test

   Scenario Outline: The user is able to run valid code in tryEditor page of linkedlist
    When The user gets input from spread sheet "<name>" and <Row>
    And The user clicks on Run button after Entering valid python code in introduction of linkedlist  tryEditor
    Then The user should be presented with Run output welcome to linkedlist page

    Examples: 
      | name  | Row |
      |llCode |         0 |
  Scenario Outline: The user is able to get the error message for invalid syntax of linkedlist page 
    Given The user is in introduction of linkedlist  page having an tryEditor with a Run button to test
    When The user gets invalid input from spread sheet "<name>" and <Row>
    And The user clicks on Run button after Entering invalid python code in introduction of linkedlist tryEditor
    Then The user should expect the error message 

    Examples: 
      | name  | Row |
      |llCode |         1 |
 Scenario: The user is able to navigate to implement linkedlist in python  Page
    When The user clicks on the implement linkedlist in python button
    Then The user should be directed to implement linkedlist in python Page

  Scenario: The user is able to navigate to implement linkedlist in python page having an tryEditor
    When The user clicks Try Here button in implement linkedlist in python  page
    Then The user should be redirected to a page having an Editor page with a Run button to test

   Scenario Outline: The user is able to run valid code in tryEditor page of linkedlist
    When The user gets input from spread sheet "<name>" and <Row>
    And The user clicks on Run button after Entering valid python code in introduction of linkedlist  tryEditor
    Then The user should be presented with Run output welcome to linkedlist page

    Examples: 
      | name  | Row |
      |llCode |         0 |

  Scenario Outline: The user is able to get the error message for invalid syntax of linkedlist page 
    Given The user is in introduction of linkedlist  page having an tryEditor with a Run button to test
    When The user gets invalid input from spread sheet "<name>" and <Row>
    And The user clicks on Run button after Entering invalid python code in introduction of linkedlist tryEditor
    Then The user should expect the error message 

    Examples: 
      | name  | Row |
      |llCode |         1 |
 Scenario: The user is able to navigate to linkedlist transversal Page
    When The user clicks on the linkedlist transversal button
    Then The user should be directed to linkedlist transversal Page

  Scenario: The user is able to navigate to linkedlist transversal page having an tryEditor
    When The user clicks Try Here button in linkedlist transversal page
    Then The user should be redirected to a page having an Editor page with a Run button to test
 
 Scenario Outline: The user is able to run valid code in tryEditor page of linkedlist
    When The user gets input from spread sheet "<name>" and <Row>
    And The user clicks on Run button after Entering valid python code in introduction of linkedlist  tryEditor
    Then The user should be presented with Run output welcome to linkedlist page

    Examples: 
      | name  | Row |
      |llCode |         0 |
  Scenario Outline: The user is able to get the error message for invalid syntax of linkedlist page 
    Given The user is in introduction of linkedlist  page having an tryEditor with a Run button to test
    When The user gets invalid input from spread sheet "<name>" and <Row>
    And The user clicks on Run button after Entering invalid python code in introduction of linkedlist tryEditor
    Then The user should expect the error message 

    Examples: 
      | name  | Row |
      |llCode |         1 |
  Scenario: The user is able to navigate to linkedlist insertion Page
    When The user clicks on the linkedlist insertion button
    Then The user should be directed to linkedlist insertion Page

  Scenario: The user is able to navigate to linkedlist insertion page having an tryEditor
    When The user clicks Try Here button in linkedlist insertion page
    Then The user should be redirected to a page having an Editor page with a Run button to test

   Scenario Outline: The user is able to run valid code in tryEditor page of linkedlist
    When The user gets input from spread sheet "<name>" and <Row>
    And The user clicks on Run button after Entering valid python code in introduction of linkedlist  tryEditor
    Then The user should be presented with Run output welcome to linkedlist page

    Examples: 
      | name  | Row |
      |llCode |         0 |
 Scenario Outline: The user is able to get the error message for invalid syntax of linkedlist page 
    Given The user is in introduction of linkedlist  page having an tryEditor with a Run button to test
    When The user gets invalid input from spread sheet "<name>" and <Row>
    And The user clicks on Run button after Entering invalid python code in introduction of linkedlist tryEditor
    Then The user should expect the error message 

    Examples: 
      | name  | Row |
      |llCode |         1 |
    Scenario: The user is able to navigate to linkedlist deletion Page
    When The user clicks on the linkedlist deletion button
    Then The user should be directed to linkedlist deletion Page

  Scenario: The user is able to navigate to linkedlist deletion page having an tryEditor
    When The user clicks Try Here button in linkedlist deletion page
    Then The user should be redirected to a page having an Editor page with a Run button to test

   Scenario Outline: The user is able to run valid code in tryEditor page of linkedlist
    When The user gets input from spread sheet "<name>" and <Row>
    And The user clicks on Run button after Entering valid python code in introduction of linkedlist  tryEditor
    Then The user should be presented with Run output welcome to linkedlist page

    Examples: 
      | name  | Row |
      |llCode |         0 |
  Scenario Outline: The user is able to get the error message for invalid syntax of linkedlist page 
    Given The user is in introduction of linkedlist  page having an tryEditor with a Run button to test
    When The user gets invalid input from spread sheet "<name>" and <Row>
    And The user clicks on Run button after Entering invalid python code in introduction of linkedlist tryEditor
    Then The user should expect the error message 

    Examples: 
      | name  | Row |
      |llCode |         1 |
  Scenario: The user is able to navigate to Practice Questions in linkedlist Page
    When The user clicks on the Practice Questions button in linkedlist page
    Then The user should be redirected to Practice Questions page of linkedlist page
