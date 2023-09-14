Feature:  As a User I want to validate Data Structures Introduction

Scenario: User Logs into the DSAlgo Website
 Given The user has launched browser of choice  and is on sign in page
 When User enters valid  Username "testusername" and Password "Test@123"
 Then The user is navigates to landing page
 
 Scenario: User in on Data StructureIntroduction Page 
 When the user clicks on the Get Started button on homepage
 Then The user is redirected to page with title "Data Structures-Introduction"
 
 Scenario: The user is on the try editor page of Time complexity 
Given The user is on the DataStructure Introduction page with Time complexity 
Then The user clicks on the Time Complexity link. 
And The user is redirected to landing page with tile "Time Complexity"
Then The user clicks on the Try Here button 
Then The user lands in the page with try editor with Title "Assessment"

Scenario Outline: The user is able run code in tryEditor for Time Complexity page
When The user enter valid python code in tryEditor of Time Complexity page from sheet "arrayCode" and 0
And The user clicks on run button
Then The user should be presented with Run result
Then The user Navigates Back.

    
 
 Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Time Complexity page
Given The user clicks on the Try Here button 
When The user enter python code with invalid syntax in tryEditor of Time Complexity page from sheet "arrayCode" and 1
And The user clicks on run button
Then The user should be presented with error message
And The user navigates to homepage. 

 