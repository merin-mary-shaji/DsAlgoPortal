
@linkedlistpage
Feature: Testing LinkedList Page

 Background: @linkedlisthomepage
  Scenario: To validate the  "linkedlistpage"
    Given The user opens the "homepage" after logged in 
    And Click "get started"button on the homepage 
    When The user selects "linked list" from the "data structures" dropdown button 
    Then The user navigates to "linked list" page 
    
  @linkedlistintroductinpage
   Scenario: The user validates the "linked list introduction" page
     Given clicks on "introduction" of linkedlist 
     Then user navigates to introduction page 
     When user clicks on try here button in introduction page 
     Then it navigates user into the "Assessment" page
     When user enters the python code on try editor "<Programs>"
     And click on run button
     Then user should present output of programs in "linkedlist-intorduction" 
     Examples:
		         | Programs      |
		         | print ('linkedlist-introduction')|
 @creatinglinkedlistpage 
  Scenario: The user validates "creatinglinkedlist"page
  Given   user clicks on "creatinglinkedlist"of linkedlist
  Then user is directed to the creatinglinkedlist page 
  When user clicks on tryhere button in creating linkedlistpage 
  Then user is directed to the "Assessment" page
  And user enters the python code on try editor "<Programs>"
  When user clicks on run button
  Then user should present output of programs in creatinglinkedlist
   Examples: 
		   |Programs|
		   |print ('welcome')|
  @Typesoflinkedlist
  Scenario: The user validates "typesoflinkedlist" page 
 Given  user clicks on "typesoflinkedlist" of linkedlist
  Then user is directed to the typesoflinkedlist page 
  When user clicks on tryhere button in typesoflinkedlist page
  Then user is directed to the "Assessment" page 
  And user enters the python code on try editor "<Programs>"
   When user clicks on run button
   Then user should be present output of programs
    Examples: 
	   |Programs|
	   |print ('typesoflinkedlist')|
   @Implementlinkedlistinpython
   Scenario: The user validates "Implementlinkedlistinpython"
   Given user clicks on "implementlinkedlistinpython" of linkedlist
   Then user directs to the implementlinkedlistinpython page 
   When user clicks on tryhere button in implementlinkedlistinpython
   Then user is directed to the "assessement" page 
   And user eneters the pythoncode on try editor "<Programs>"
    When user clicks on run button 
   Then user should be present with the output 
   Examples: 
   |Programs|
   |print ('implementlinkedlistinpython')|
    @Transversal
   Scenario: The user validates "Transversal"
   Given  user clicks on "Transversal"of linkedlist
   Then user directs to the transversal page 
   When user clicks on tryhere button in transversal
   Then user is directed to the "assessement" page 
   And user eneters the pythoncode on try editor "<Programs>"
    When user clicks on run button 
   Then user should be present with the output 
   Examples: 
   |Programs|
   |print ('Transversallinkedlist')|
    @Insertion
   Scenario: The user validates "Insertion"
   Given user clicks on "Insertion" of linkedlist
   Then user directs to the Insertion page 
   When user clicks on tryhere button in insertion
   Then user is directed to the "assessement" page 
   And user eneters the pythoncode on try editor "<Programs>"
    When user clicks on run button 
   Then user should be present with the output 
   Examples: 
   |Programs|
   |print ('insertionlinkedlist')|
    @Deletion
   Scenario: The user validates "Deletion"
   Given  user clicks on "Deletion" of linkedlist
   Then user directs to the deletion page 
   When user clicks on tryhere button in deletion
   Then user is directed to the "assessement" page 
   And user eneters the pythoncode on try editor "<Programs>"
    When user clicks on run button 
   Then user should be present with the output 
   Examples: 
   |Programs|
   |print ('Deletionlinkedlist')|
   
   
   
  
  
  
 
         
     