Feature: Arrays
  As a User I want to launch DSAlgo application 
  So that I can validate the Array Page.

  Scenario: User Logs into the DSAlgo Portal
    Given The user has launched browser and is on sign in page
    When User enters valid credentials Username "testusername" and Password "Test@123"
    Then The user is navigates to homepage

  Scenario: User is on the Array page
    Given the user is signed into the homeopage "NumpyNinja"
    When the user clicks on the get started button of the Array.
    Then the user is redirected to Array page "Array"

  Scenario: User is on the Arrays in Python page.
    When the user clicks on hyperlink Arrays in Python
    Then the user is redirected to Arrays in python page "Arrays in Python"

  Scenario: User is on the tryeditor page of Arrays in python.
    When the user clicks on the try here button.
    Then the user is redirected to the assessment page "Assessment"

  Scenario Outline: The user runs a valid python code in tryeditor.
    When The user is at the Try editor page with Run button.
    Then the user passes valid code from data sheet "arrayCode" and 0
    And clicks on the run button
    Then the user should be presented with valid output.
    Then The user navigates back to  Arrays in python page.

  Scenario Outline: The user runs a invalid code in Editor
    Given The user clicks the Try editor page with Run button.
    When The user is at the Try editor page with Run button.
    Then The user send invalid code from datasheet "arrayCode" and 1
    And clicks on the run button
    Then the user should be presented with an error message.
    Then The user navigates back to  Arrays in python page.

  Scenario: The user needs to navigate to Array Using List page
    When The user clicks Array Using List link.
    Then It should redirect the user to "Arrays Using List"

  Scenario: The user is able to redirect to try Editor for Arrays Using List page
    When the user clicks on the try here button.
    Then the user is redirected to the assessment page "Assessment"

  Scenario Outline: The user runs a valid python code in tryeditor.
    When The user is at the Try editor page with Run button.
    Then the user passes valid code from data sheet "arrayCode" and 0
    And clicks on the run button
    Then the user should be presented with valid output.
    Then The user navigates back to  Arrays in python page.

  Scenario Outline: The user runs a invalid code in Editor
    Given The user clicks the Try editor page with Run button.
    When The user is at the Try editor page with Run button.
    Then The user send invalid code from datasheet "arrayCode" and 1
    And clicks on the run button
    Then the user should be presented with an error message.
    Then The user navigates back to  Arrays in python page.

  Scenario: The user needs to navigate to Basic Operations in List page
    When The user clicks Basic Operations in List link.
    Then It should redirect the user to "Basic Operations in Lists"

  Scenario: The user is able to redirect to try Editor for Basic Operations in List page
    When the user clicks on the try here button.
    Then the user is redirected to the assessment page "Assessment"

  Scenario Outline: The user runs a valid python code in tryeditor.
    When The user is at the Try editor page with Run button.
    Then the user passes valid code from data sheet "arrayCode" and 0
    And clicks on the run button
    Then the user should be presented with valid output.
    Then The user navigates back to  Arrays in python page.

  Scenario Outline: The user runs a invalid code in Editor
    Given The user clicks the Try editor page with Run button.
    When The user is at the Try editor page with Run button.
    Then The user send invalid code from datasheet "arrayCode" and 1
    And clicks on the run button
    Then the user should be presented with an error message.
    Then The user navigates back to  Arrays in python page.

  Scenario: The user needs to navigate to Applications of Array page
    When The user clicks Applications of Array page link.
    Then It should redirect the user to "Applications of Array"

  Scenario: The user is able to redirect to try Editor for Applications of Array page
    When the user clicks on the try here button.
    Then the user is redirected to the assessment page "Assessment"

  Scenario Outline: The user runs a valid python code in tryeditor.
    When The user is at the Try editor page with Run button.
    Then the user passes valid code from data sheet "arrayCode" and 0
    And clicks on the run button
    Then the user should be presented with valid output.
    Then The user navigates back to  Arrays in python page.

  Scenario Outline: The user runs a invalid code in Editor
    Given The user clicks the Try editor page with Run button.
    When The user is at the Try editor page with Run button.
    Then The user send invalid code from datasheet "arrayCode" and 1
    And clicks on the run button
    Then the user should be presented with an error message.
    Then The user navigates back to  Arrays in python page.

  Scenario: The user needs to navigate to Practice questions
    When The user clicks Applications of Practice questions link.
    Then It should redirect the user to Practice Questions

  Scenario: The User is at the Search the Array
    When The user clicks Search the Array link.
    Then It It should redirect the user to search the Array try editor page.

  Scenario Outline: The user is able to run code in tryEditor for Search the array link
    #Given The user clicks Search the Array link.
    When The user enter valid python code for practice questions in tryEditor from sheet "arrayCode" and 0
    And clicks on the run button
    Then the user should be presented with valid output.
    Then The user navigates back to the Practice questions page

  Scenario Outline: The user is able to submit code in tryEditor for Search the array link
    Given The user clicks Search the Array link.
    When The user enter valid python code for practice questions in tryEditor from sheet "arrayCode" and 0
    And The user clicks on submit button
    Then The user should be presented with Run result
    Then The user navigates back to the Practice questions page

  Scenario: The User is at the Max Consecutive Ones
    When The user clicks Max Consecutive Ones.
    Then It It should redirect the user to search the Array try editor page.

  Scenario Outline: The user is able to run code in tryEditor for Max Consecutive Ones
    When The user enter valid python code for practice questions in tryEditor from sheet "arrayCode" and 0
    And clicks on the run button
    Then the user should be presented with valid output.
    Then The user navigates back to the Practice questions page

  Scenario Outline: The user is able to submit code in tryEditor for Max Consecutive Ones
    Given The user clicks Max Consecutive Ones.
    When The user enter valid python code for practice questions in tryEditor from sheet "arrayCode" and 0
    And The user clicks on submit button
    Then The user should be presented with Run result
    Then The user navigates back to the Practice questions page

  Scenario: The User is at the Find Numbers with Even Number of Digits
    When The user clicks Find Numbers with Even Number of Digits link.
    Then It It should redirect the user to search the Array try editor page.

  Scenario Outline: The user is able to run code in tryEditor for Find Numbers with Even Number of Digits
    When The user enter valid python code for practice questions in tryEditor from sheet "arrayCode" and 0
    And clicks on the run button
    Then the user should be presented with valid output.
    Then The user navigates back to the Practice questions page

  Scenario Outline: The user is able to submit code in tryEditor for Find Numbers with Even Number of Digits
    Given The user clicks Find Numbers with Even Number of Digits link.
    When The user enter valid python code for practice questions in tryEditor from sheet "arrayCode" and 0
    And The user clicks on submit button
    Then The user should be presented with Run result
    Then The user navigates back to the Practice questions page

  Scenario: The User is at the Squares of a Sorted Array
    When The user clicks Squares of a Sorted Array link.
    Then It It should redirect the user to search the Array try editor page.

  Scenario Outline: The user is able to run code in tryEditor for Squares of a Sorted Array
    When The user enter valid python code for practice questions in tryEditor from sheet "arrayCode" and 0
    And clicks on the run button
    Then the user should be presented with valid output.
    Then The user navigates back to the Practice questions page

  Scenario Outline: The user is able to submit code in tryEditor for Squares of a Sorted Array
    Given The user clicks Squares of a Sorted Array link.
    When The user enter valid python code for practice questions in tryEditor from sheet "arrayCode" and 0
    And The user clicks on submit button
    Then The user should be presented with Run result
    Then The user navigates back to the Practice questions page
