Feature: Tree feature
  I want to use this template for my feature file

  Scenario: The user is able to navigate to Overview of Trees
    Given The user is on the Tree page after logged in
    When The user clicks on the Overview of Trees link
    Then The user should then be directed to Overview of Trees Page

  Scenario: The user is able to navigate to a page having an tryEditor
    When The user clicks Try Here button in Overview of Trees Page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  Scenario Outline: The user is able to run code in tryEditor
    When The user gets input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering valid python code in tryEditor
    Then The user should be presented with Run output

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         2 |

  Scenario Outline: The user is able to get the error message for invalid syntax
    Given The user is in tree page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering invalid python code in tryEditor
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         3 |

  Scenario: The user is able to navigate to Terminologies Page
    When The user clicks on the Terminologies button
    Then The user should then be directed to Terminologies Page

  Scenario: The user is able to navigate to Terminologies page having an tryeditor
    When The user clicks Try Here button in Terminologies page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  Scenario Outline: The user is able to run code in tryEditor
    When The user gets input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering valid python code in tryEditor
    Then The user should be presented with Run output

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         2 |

  Scenario Outline: The user is able to get the error message for invalid syntax
    Given The user is in tree page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering invalid python code in tryEditor
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         3 |

  Scenario: The user is able to navigate to Types of Trees Page
    When The user clicks on the Types of Trees button
    Then The user should then be directed to Types of Trees Page

  Scenario: The user is able to navigate to Types of Trees page having an tryeditor
    When The user clicks Try Here button in Types of Trees page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  Scenario Outline: The user is able to run code in tryEditor
    When The user gets input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering valid python code in tryEditor
    Then The user should be presented with Run output

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         2 |

  Scenario Outline: The user is able to get the error message for invalid syntax
    Given The user is in tree page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering invalid python code in tryEditor
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         3 |

  Scenario: The user is able to navigate to Tree Traversals Page
    When The user clicks on the Tree Traversals button
    Then The user should then be directed to Tree Traversals Page

  Scenario: The user is able to navigate to Tree Traversals page having an tryeditor
    When The user clicks Try Here button in Tree Traversals page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  Scenario Outline: The user is able to run code in tryEditor
    When The user gets input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering valid python code in tryEditor
    Then The user should be presented with Run output

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         2 |

  Scenario Outline: The user is able to get the error message for invalid syntax
    Given The user is in tree page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering invalid python code in tryEditor
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         3 |

  Scenario: The user is able to navigate to Traversals-Illustration Page
    When The user clicks on the Traversals-Illustration button
    Then The user should then be directed to Traversals-Illustration Page

  Scenario: The user is able to navigate to Traversals-Illustration page having an tryeditor
    When The user clicks Try Here button in Traversals-Illustration page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  Scenario Outline: The user is able to run code in tryEditor
    When The user gets input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering valid python code in tryEditor
    Then The user should be presented with Run output

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         2 |

  Scenario Outline: The user is able to get the error message for invalid syntax
    Given The user is in tree page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering invalid python code in tryEditor
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         3 |

  Scenario: The user is able to navigate to Binary Trees Page
    When The user clicks on the Binary Trees button
    Then The user should then be directed to Binary Trees Page

  Scenario: The user is able to navigate to Binary Trees page having an tryeditor
    When The user clicks Try Here button in Binary Trees page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  Scenario Outline: The user is able to run code in tryEditor
    When The user gets input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering valid python code in tryEditor
    Then The user should be presented with Run output

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         2 |

  Scenario Outline: The user is able to get the error message for invalid syntax
    Given The user is in tree page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering invalid python code in tryEditor
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         3 |

  Scenario: The user is able to navigate to Types of Binary Trees Page
    When The user clicks on the Types of Binary Trees button
    Then The user should then be directed to Types of Binary Trees Page

  Scenario: The user is able to navigate to Types of Binary Trees page having an tryeditor
    When The user clicks Try Here button in Types of Binary Trees page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  Scenario Outline: The user is able to run code in tryEditor
    When The user gets input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering valid python code in tryEditor
    Then The user should be presented with Run output

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         2 |

  Scenario Outline: The user is able to get the error message for invalid syntax
    Given The user is in tree page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering invalid python code in tryEditor
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         3 |

  Scenario: The user is able to navigate to Implementation in Python Page
    When The user clicks on the Implementation in Python button
    Then The user should then be directed to Implementation in Python Page

  Scenario: The user is able to navigate to Implementation in Python page having an tryeditor
    When The user clicks Try Here button in Implementation in Python page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  Scenario Outline: The user is able to run code in tryEditor
    When The user gets input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering valid python code in tryEditor
    Then The user should be presented with Run output

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         2 |

  Scenario Outline: The user is able to get the error message for invalid syntax
    Given The user is in tree page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering invalid python code in tryEditor
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         3 |

  Scenario: The user is able to navigate to Binary Tree Traversals Page
    When The user clicks on the Binary Tree Traversals button
    Then The user should then be directed to Binary Tree Traversals Page

  Scenario: The user is able to navigate to Binary Tree Traversals page having an tryeditor
    When The user clicks Try Here button in Binary Tree Traversals page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  Scenario Outline: The user is able to run code in tryEditor
    When The user gets input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering valid python code in tryEditor
    Then The user should be presented with Run output

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         2 |

  Scenario Outline: The user is able to get the error message for invalid syntax
    Given The user is in tree page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering invalid python code in tryEditor
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         3 |

  Scenario: The user is able to navigate to Applications of Binary trees Page
    When The user clicks on the Applications of Binary trees button
    Then The user should then be directed to Applications of Binary trees Page

  Scenario: The user is able to navigate to Applications of Binary trees page having an tryeditor
    When The user clicks Try Here button in Applications of Binary trees page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  Scenario Outline: The user is able to run code in tryEditor
    When The user gets input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering valid python code in tryEditor
    Then The user should be presented with Run output

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         2 |

  Scenario Outline: The user is able to get the error message for invalid syntax
    Given The user is in tree page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering invalid python code in tryEditor
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         3 |

  Scenario: The user is able to navigate to Binary Search Trees Page
    When The user clicks on the Applications of Binary Search Trees button
    Then The user should then be directed to Binary Search Trees Page

  Scenario: The user is able to navigate to Binary Search Trees page having an tryeditor
    When The user clicks Try Here button in Binary Search Trees page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  Scenario Outline: The user is able to run code in tryEditor
    When The user gets input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering valid python code in tryEditor
    Then The user should be presented with Run output

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         2 |

  Scenario Outline: The user is able to get the error message for invalid syntax
    Given The user is in tree page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering invalid python code in tryEditor
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         3 |

  Scenario: The user is able to navigate to Implementation Of BST Page
    When The user clicks on the Applications of Implementation Of BST button
    Then The user should then be directed to Implementation Of BST Page

  Scenario: The user is able to navigate to Implementation Of BST page having an tryeditor
    When The user clicks Try Here button in Implementation Of BST page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  Scenario Outline: The user is able to run code in tryEditor
    When The user gets input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering valid python code in tryEditor
    Then The user should be presented with Run output

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         2 |

  Scenario Outline: The user is able to get the error message for invalid syntax
    Given The user is in tree page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering invalid python code in tryEditor
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         3 |

  Scenario: The user is able to navigate to Practice Questions Page
    When The user clicks on the Applications of Practice Questions button
    Then The user should then be directed to Practice Questions Page
