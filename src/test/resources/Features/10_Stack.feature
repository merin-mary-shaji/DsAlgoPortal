Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: The user is able to navigate to Operations in Stack page
    Given The user is on the Stack page after logged in
    When The user clicks on the Operations in Stack link
    Then The user should then be directed to Operations in Stack Page

  Scenario: The user is able to navigate to a page having an tryEditor
    When The user clicks Try Here button in stack page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  Scenario Outline: The user is able to run code in tryEditor
    When The user gets input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering valid python code in tryEditor
    Then The user should be presented with Run output

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  Scenario Outline: The user is able to get the error message for invalid syntax
    Given The user is in stack page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering invalid python code in tryEditor
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario: The user is able to navigate to Implementation Page
    When The user clicks on the Implementation button
    Then The user should then be directed to Implementation Page

  Scenario: The user is able to navigate to Implementation page having an tryeditor
    When The user clicks Try Here button in stack Implementation page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  Scenario Outline: The user is able to run code in tryEditor
    When The user gets input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering valid python code in tryEditor
    Then The user should be presented with Run output

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  Scenario Outline: The user is able to get the error message for invalid syntax
    Given The user is in stack page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering invalid python code in tryEditor
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario: The user is able to navigate to Applications in stack Page
    When The user clicks on the Applications button
    Then The user should be directed to Applications Page

  Scenario: The user is able to navigate to Applications page having an tryEditor
    When The user clicks Try Here button in stack Applications page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  Scenario Outline: The user is able to run code in tryEditor
    When The user gets input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering valid python code in tryEditor
    Then The user should be presented with Run output

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  Scenario Outline: The user is able to get the error message for invalid syntax
    Given The user is in stack page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering invalid python code in tryEditor
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario: The user is able to navigate to Practice Questions in stack Page
    When The user clicks on the Practice Questions button
    Then The user should be redirected to Practice Questions pag
