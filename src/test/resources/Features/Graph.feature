Feature: Graph feature
  To validate the Graph feature file
  Scenario: user login 
     Given The user is on Signin page of DS Algo portal
    When The user enter valid "testusername" and "Test@123"
    Then The user redirected to homepage
  
    
 Scenario: The user is able to navigate to Graph page
    Given The user is on the Graph page after logged in
    When The user clicks on the Graph link on Graph page
    Then The user should then be directed to Graph Graph page 
 
 Scenario: The user is able to navigate to a page having an tryEditor page on Graph page
    When The user clicks Tryhere button in Graph page
    Then The user should be redirected to a page having an tryEditor page  with a Run button to test
    
 Scenario Outline: The user is able to run valid code in tryEditor page
    When The user gets input from Excel sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering valid python code in Graph tryEditor page
    Then The user should be presented with Run output welcome to Graph page 

    Examples: 
      | Sheetname  | RowNumber |
      | GraphCode |         0 |
 Scenario Outline: The user is able to get the error message for invalid syntax of Graph page 
    Given The user is in Graph  page having an tryEditor page with a Run button to test
    When The user gets invalid input from Excel sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering invalid python code in Graph tryEditor page
    Then The user should get the error message of Graph page

    Examples: 
      | Sheetname  | RowNumber |
      |GraphCode |         1 |
    Scenario: The user is able to navigate to Graph Representation Page
    When The user clicks on the Graph Representation button
    Then The user should then be directed to Graph Representation Page

 Scenario: The user is able to navigate to a page having an tryEditor page on Graph page
    When The user clicks Tryhere button in Graph Representation page
    Then The user should be redirected to a page having an tryEditor page  with a Run button to test
    
  Scenario Outline: The user is able to run valid code in tryEditor page
    When The user gets input from Excel sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering valid python code in Graph tryEditor page
    Then The user should be presented with Run output welcome to Graph page 

    Examples: 
      | Sheetname  | RowNumber |
      | GraphCode |         0 |
 Scenario Outline: The user is able to get the error message for invalid syntax of Graph page 
    Given The user is in Graph  page having an tryEditor page with a Run button to test
    When The user gets invalid input from Excel sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering invalid python code in Graph tryEditor page
    Then The user should get the error message of Graph page

    Examples: 
      | Sheetname  | RowNumber |
      |GraphCode |         1 |
    Scenario: The user is able to navigate to Practice Questions in Graph Page
    When The user clicks on the Practice Questions button in Graph page
    Then The user should be redirected to Practice Questions page of Graph page
      