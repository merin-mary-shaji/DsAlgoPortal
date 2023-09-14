Feature: Queue

  Scenario Outline: The user is able to navigate through Queue
    When The user clicks on DataStructure drop down
    And User click on "Queue"
    Then Queue page gets displayed
    When The user clicks on Topics Covered with "<topic>" link
    When The user clicks on Tryhere link
    Then Page title should be "Assessment"
    When The user enters python code in Editor from sheet "<Sheetname>" and "<RowNumber>"
    When The user clicks on Run button
    Then user should be  presented with run result
    When user navigate to home page

    Examples: 
      | topic                                  | Sheetname  | RowNumber |
      | Implementation of Queue in Python      | pythonCode |         5 |
      | Implementation using collections.deque | pythonCode |         5 |
      | Implementation using array             | pythonCode |         5 |
      | Queue Operations                       | pythonCode |         5 |
