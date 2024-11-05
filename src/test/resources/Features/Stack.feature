
Feature: User launch dsalgo application and test Data Structure introduction page
  
  @stack_01
  Scenario: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid username and password "Rockstars_Numpy" and "Numpy@Rock123"
    And The user click on login button
    Then The user redirected to homepage in DS
  @stack_02
  Scenario: The user is able to navigate to "Stack" page
    Given The user is on the "NumpyNinja" after logged in
    When The user clicks the "Getting Started" button in Stack Panel
    Then The user be directed to "Stack" page in DSAlgo portal

 @stack_03
  Scenario: The user is able to navigate to "Operations in Stack" page
    Given The user is on "Stack" page in DSalgo portal
    When  The is clicks on "Operations in Stack     
    Then The user should be redirected to "Operations in Stack" page
    
  @stack_04
  Scenario: The user is able to navigate to a tryEditor from Operations in Stack page 
    Given   The user is on Operations in Stack page
    When    The user clicks on Try here button in Operations in Stack page    
    Then    The user should be redirected tryEditor page with a Run button in stack module
    
  @stack_05
  Scenario Outline: The user is able to run code in tryEditor for Operations in Stack page
    Given The user is in stack page having an tryEditor with a Run button to test
    When  The user gets input from sheet "<Sheetname>" and <RowNumber>
    And  The user clicks on Run button after Entering valid python code in stack tryEditor
    Then The user should be presented with Run output
    
    Examples:
      | Sheetname  | RowNumber |
      | python code |         0 |
   
 
 @stack_06
  Scenario Outline: The user is able to get the error message for invalid syntax for Operations in Stack page
    Given The user is in stack page having an tryEditor with a Run button to test
    When  The user gets input from sheet "<Sheetname>" and <RowNumber>
    And  The user clicks on Run button after Entering invalid python code in stack tryEditor
    Then The user should be presented with error message in operation in stack
    
    Examples:
      | Sheetname  | RowNumber |
      | python code |         1 |
    
    
 @stack_07
  Scenario: The user is able to navigate to "Implementation" page
    Given   The user is on "Stack" page in DSalgo portals 
    When    The user clicks on Implementation button     
    Then    The user should be redirected to "Implementation" page on Dsalso portal
    
@stack_08
  Scenario: The user is able to navigate to a tryEditor from "Implementation" page 
    Given   The user is on Implementation page
    When    The user clicks on "Try here" button in "Implementation" page    
    Then    The user should be redirected tryEditor page with a Run button in implementation module
 
 @stack_09
 Scenario Outline: The user is able to run code in tryEditor for stack Implementation page
    Given The user is in implementation page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering valid python code in implementation tryEditor
    Then The user should be presented with Run output

    Examples: 
      | Sheetname  | RowNumber |
      | python code |         0 |
    
@stack_10
  Scenario Outline: The user is able to get the error message for invalid syntax for Implementation page
    Given The user is in implementation page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering invalid python code in implementation tryEditor
    Then The user should be presented with error message in implementation in stack

    Examples: 
      | Sheetname  | RowNumber |
      | python code |         1 |
         
 @stack_11
  Scenario: The user is able to navigate to  "Applications" page
    Given   The user is on "Stack" page in DSalgo portal for application
    When    The user clicks on Applications button     
    Then    The user should be redirected to "Applications" pages
    
 @stack_12
 Scenario: The user is able to navigate to tryeditor from "Applications" page
    Given   The user is on "Applications" page on Dsalgo portal 
    When    The user clicks on Try here button in "Applications"   
    Then    The user should be redirected tryEditor page with a Run button in Application module
    
  @stack_13
 Scenario Outline: The user is able to run code in tryEditor for stack Applications page
    Given The user is in Applications page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering valid python code in Applications tryEditor
    Then The user should be presented with Run output in Applications

    Examples: 
      | Sheetname  | RowNumber |
      | python code|         0 |  
    
  @stack_14
  Scenario Outline: The user is able to get the error message for invalid syntax for Applications page
    Given The user is in Applications page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering invalid python code in Applications tryEditor
    Then The user should be presented with error message in Applications in stack
    
    Examples: 
      | Sheetname  | RowNumber |
      | python code|         1 |  
      
 @stack_15
  Scenario: The user is able to navigate to "Practice Questions" in stack Page
    Given The user is on "Stack" page in DSalgo portal pracitce question
    When The user clicks on the Practice Questions button in
    Then The user should be directed to Practice Questions  Page    
      
    
    
    